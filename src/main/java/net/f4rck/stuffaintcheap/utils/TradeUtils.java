
package net.f4rck.stuffaintcheap.utils;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.f4rck.stuffaintcheap.enums.EnchantedBookEnum;
import net.f4rck.stuffaintcheap.enums.EnchantedItemEnum;
import net.f4rck.stuffaintcheap.enums.SimpleItemEnum;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.trading.ItemCost;
import net.minecraft.world.item.trading.MerchantOffer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class TradeUtils {

    private static final Logger LOGGER = LoggerFactory.getLogger(TradeUtils.class);

    public static void clearVanillaTrades(Int2ObjectMap<List<VillagerTrades.ItemListing>> trades,
                                          Int2ObjectMap<VillagerTrades.ItemListing[]> vanillaTrades, int level) {

        VillagerTrades.ItemListing[] vanillaLevelTrades = vanillaTrades.get(level);

        if (vanillaLevelTrades == null || !trades.containsKey(level)) {
            return;
        }

        Set<Class<?>> vanillaTradeClasses = new HashSet<>();
        for (VillagerTrades.ItemListing vanillaTrade : vanillaLevelTrades) {
            if (vanillaTrade != null) {
                vanillaTradeClasses.add(vanillaTrade.getClass());
            }
        }

        int removedCount = 0;
        var iterator = trades.get(level).iterator();
        while (iterator.hasNext()) {
            VillagerTrades.ItemListing trade = iterator.next();
            if (trade != null) {
                Class<?> tradeClass = trade.getClass();
                boolean isVanillaTrade = vanillaTradeClasses.contains(tradeClass);

                if (isVanillaTrade) {
                    iterator.remove();
                    removedCount++;
                    LOGGER.debug("Removing vanilla trade of class {} from level {}", tradeClass.getSimpleName(), level);
                }
            }
        }

        if (removedCount > 0) {
            LOGGER.info("Removed {} vanilla trades from level {}", removedCount, level);
        }
    }

    public static VillagerTrades.ItemListing createSimpleTrade(Item itemCost,
                                                               int cost,
                                                               Item itemResult,
                                                               int result,
                                                               int maxUses,
                                                               int xp,
                                                               float priceMultiplier) {
        return (pTrader, pRandom) -> new MerchantOffer(new ItemCost(itemCost, cost), new ItemStack(itemResult, result), maxUses, xp, priceMultiplier);
    }

    public static VillagerTrades.ItemListing createDualCostTrade(ItemCost primaryCost,
                                                                 ItemCost secondaryCost,
                                                                 ItemStack result,
                                                                 int maxUses,
                                                                 int xp,
                                                                 float priceMultiplier) {
        return (pTrader, pRandom) -> new MerchantOffer(
                primaryCost,
                Optional.of(secondaryCost),
                result,
                maxUses,
                xp,
                priceMultiplier);
    }

    public static <T extends EnchantedItemEnum> void addEnchantedItemTrades(
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades,
            int level,
            T[] enumValues,
            Item item,
            int maxUses,
            int xp,
            float priceMultiplier) {

        for (T element : enumValues) {
            trades.get(level).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, element.getEmeraldsCost().get()),
                    Optional.of(new ItemCost(Items.DIAMOND, element.getDiamondCost().get())),
                    makeItemStack(
                            item,
                            pTrader.level().registryAccess(),
                            element.getFirstEnchantment(),
                            element.getSecondEnchantment(),
                            element.getLevelOfFirstEnchantment(),
                            element.getLevelOfSecondEnchantment()),
                    maxUses,
                    xp,
                    priceMultiplier));
        }
    }

    public static <T extends EnchantedBookEnum> void addEnchantedBookTrades(
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades,
            int level,
            T[] enumValues,
            int maxUses,
            int xp,
            float priceMultiplier) {

        for (T element : enumValues) {
            trades.get(level).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, element.getEmeraldsCost().get()),
                    Optional.of(new ItemCost(Items.DIAMOND, element.getDiamondCost().get())),
                    makeItemStack(
                            Items.ENCHANTED_BOOK,
                            pTrader.level().registryAccess(),
                            element.getEnchantment(),
                            null,
                            element.getLevel(),
                            0),
                    maxUses,
                    xp,
                    priceMultiplier));
        }
    }

    public static <T extends SimpleItemEnum> void addSimpleItemTrades(
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades,
            int level,
            T[] enumValues,
            float priceMultiplier) {

        for (T itemTrade : enumValues) {
            trades.get(level).add(createSimpleTrade(
                    itemTrade.getItemCost(),
                    itemTrade.getCost().get() != null ? itemTrade.getCost().get().getDefault() : itemTrade.getCost().get().get(),
                    itemTrade.getItemResult(),
                    itemTrade.getResult().get() != null ? itemTrade.getResult().get().getDefault() : itemTrade.getResult().get().get(),
                    itemTrade.getMaxUses().get() != null ? itemTrade.getMaxUses().get().getDefault() : itemTrade.getMaxUses().get().get(),
                    itemTrade.getXp().get() != null ? itemTrade.getXp().get().getDefault() : itemTrade.getXp().get().get(),
                    priceMultiplier));
        }
    }

    public static ItemStack makeItemStack(Item item, HolderLookup.Provider registryAccess, ResourceKey<Enchantment> enchKey1, ResourceKey<Enchantment> enchKey2, int levelOfFirstEnch, int levelOfSecondEnch) {
        HolderLookup.RegistryLookup<Enchantment> enchRegistry = registryAccess.lookupOrThrow(Registries.ENCHANTMENT);
        Optional<? extends Holder<Enchantment>> get1 = enchRegistry.get(enchKey1);
        Optional<? extends Holder<Enchantment>> get2 = Optional.empty();
        if (enchKey2 != null) {
            get2 = enchRegistry.get(enchKey2);
        }
        ItemStack itemStack = new ItemStack(item, 1);
        get1.ifPresent(holder -> itemStack.enchant(holder, levelOfFirstEnch));
        get2.ifPresent(holder -> itemStack.enchant(holder, levelOfSecondEnch));
        return itemStack;
    }

}