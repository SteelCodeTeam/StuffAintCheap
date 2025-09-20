
package net.f4rck.stuffaintcheap.utils;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.f4rck.stuffaintcheap.enums.EnchantedBookEnum;
import net.f4rck.stuffaintcheap.enums.EnchantedItemEnum;
import net.f4rck.stuffaintcheap.enums.SimpleItemEnum;
import net.f4rck.stuffaintcheap.event.registry.GetRegistryEnchantmentUtil;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
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

    public static VillagerTrades.ItemListing createSimpleTrade(ItemCost cost,
                                                               net.minecraft.world.item.ItemStack result,
                                                               int maxUses,
                                                               int xp,
                                                               float priceMultiplier) {
        return (pTrader, pRandom) -> new MerchantOffer(cost, result, maxUses, xp, priceMultiplier);
    }

    public static VillagerTrades.ItemListing createDualCostTrade(ItemCost primaryCost,
                                                                 ItemCost secondaryCost,
                                                                 net.minecraft.world.item.ItemStack result,
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
                    new ItemCost(Items.EMERALD, element.getEmeraldsCost()),
                    Optional.of(new ItemCost(Items.DIAMOND, element.getDiamondCost())),
                    GetRegistryEnchantmentUtil.makeItemStack(
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
                    new ItemCost(Items.EMERALD, element.getEmeraldsCost()),
                    Optional.of(new ItemCost(Items.DIAMOND, element.getDiamondCost())),
                    GetRegistryEnchantmentUtil.makeItemStack(
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
                    itemTrade.getItemResult(),
                    itemTrade.getMaxUses(),
                    itemTrade.getXp(),
                    priceMultiplier));
        }
    }

}