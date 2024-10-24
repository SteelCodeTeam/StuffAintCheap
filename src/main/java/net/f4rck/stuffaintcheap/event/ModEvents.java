package net.f4rck.stuffaintcheap.event;

import net.f4rck.stuffaintcheap.StuffAintCheap;
import net.f4rck.stuffaintcheap.enums.armor.EnchantedBootsEnum;
import net.f4rck.stuffaintcheap.enums.armor.EnchantedChestplateEnum;
import net.f4rck.stuffaintcheap.enums.armor.EnchantedHelmetEnum;
import net.f4rck.stuffaintcheap.enums.armor.EnchantedLeggingsEnum;
import net.f4rck.stuffaintcheap.enums.books.BookTier2Enum;
import net.f4rck.stuffaintcheap.enums.books.BookTier4Enum;
import net.f4rck.stuffaintcheap.enums.books.BookTier5Enum;
import net.f4rck.stuffaintcheap.enums.items.ItemsTier1;
import net.f4rck.stuffaintcheap.enums.items.ItemsTier3;
import net.f4rck.stuffaintcheap.enums.tools.EnchantedAxeEnum;
import net.f4rck.stuffaintcheap.enums.tools.EnchantedPickaxeEnum;
import net.f4rck.stuffaintcheap.enums.tools.EnchantedShovelEnum;
import net.f4rck.stuffaintcheap.enums.weapons.EnchantedAxeAttackEnum;
import net.f4rck.stuffaintcheap.enums.weapons.EnchantedSwordEnum;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.ItemCost;
import net.minecraft.world.item.trading.MerchantOffer;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.village.VillagerTradesEvent;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@EventBusSubscriber(modid = StuffAintCheap.MOD_ID, bus = EventBusSubscriber.Bus.GAME)
public class ModEvents {

    @SubscribeEvent
    public static void addCustomTrades(VillagerTradesEvent event) {
        /**
         * LIBRARIAN
         */

        Map<VillagerProfession, Int2ObjectMap<VillagerTrades.ItemListing[]>> vanillaTradesMap = VillagerTrades.TRADES;
        Int2ObjectMap<VillagerTrades.ItemListing[]> vanillaTrades ;



        if (event.getType() == VillagerProfession.LIBRARIAN) {

            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            vanillaTrades = vanillaTradesMap.get(VillagerProfession.LIBRARIAN);


            //level 1 clear -----------------------------------------------------------------------
            int villagerLevel = 1;
            trades.get(villagerLevel).removeIf(vanillaTrades::containsValue);
            //level 1 trades ----------------------------------------------------------------------
            for (ItemsTier1 itemsTrades : ItemsTier1.values()) {
                trades.get(villagerLevel).add((pTrader, pRandom) -> new MerchantOffer(
                        itemsTrades.getItemCost(),
                        itemsTrades.getItemResult(),
                        itemsTrades.getMaxUses(),
                        itemsTrades.getXp(),
                        0.05f));
            }


            //level 2 clear -----------------------------------------------------------------------
            villagerLevel = 2;
            trades.get(villagerLevel).removeIf(vanillaTrades::containsValue);
            //level 2 trades ----------------------------------------------------------------------
            for (BookTier2Enum element : BookTier2Enum.values()) {
                trades.get(villagerLevel)
                        .add((pTrader, pRandom) -> new MerchantOffer(
                                new ItemCost(Items.EMERALD, element.getEmeraldsCost()),
                                Optional.of(new ItemCost(Items.DIAMOND, element.getDiamondCost())),
                                GetRegistryEnchantmentUtil.makeItemStack(
                                        Items.ENCHANTED_BOOK.asItem(),
                                        pTrader.level().registryAccess(), // I dont know how to obtain this.
                                        element.getEnchantment(),
                                        null,
                                        element.getLevel(),
                                        0),
                                3,
                                    50,
                                0.4f));
            }


           //level 3 clear -----------------------------------------------------------------------
            villagerLevel = 3;
            trades.get(villagerLevel).removeIf(vanillaTrades::containsValue);
            //level 3 trades ----------------------------------------------------------------------
            for (ItemsTier3 itemsTrades : ItemsTier3.values()) {
                trades.get(villagerLevel).add((pTrader, pRandom) -> new MerchantOffer(
                        itemsTrades.getItemCost(),
                        itemsTrades.getItemResult(),
                        itemsTrades.getMaxUses(),
                        itemsTrades.getXp(),
                        0.05f));
            }


            //level 4 clear -----------------------------------------------------------------------
            villagerLevel = 4;
            trades.get(villagerLevel).removeIf(vanillaTrades::containsValue);
            //level 4 trades ----------------------------------------------------------------------
            for (BookTier4Enum element : BookTier4Enum.values()) {
                trades.get(villagerLevel)
                        .add((pTrader, pRandom) -> new MerchantOffer(
                                new ItemCost(Items.EMERALD, element.getEmeraldsCost()),
                                Optional.of(new ItemCost(Items.DIAMOND, element.getDiamondCost())),
                                GetRegistryEnchantmentUtil.makeItemStack(
                                        Items.ENCHANTED_BOOK.asItem(),
                                        pTrader.level().registryAccess(), // I dont know how to obtain this.
                                        element.getEnchantment(),
                                        null,
                                        element.getLevel(),
                                        0),
                                3,
                                50,
                                0.4f));
            }


            //level 5 clear -----------------------------------------------------------------------
            villagerLevel = 5;
            trades.get(villagerLevel).removeIf(vanillaTrades::containsValue);
            //level 5 trades ----------------------------------------------------------------------
            for (BookTier5Enum element : BookTier5Enum.values()) {
                trades.get(villagerLevel)
                        .add((pTrader, pRandom) -> new MerchantOffer(
                                new ItemCost(Items.EMERALD, element.getEmeraldsCost()),
                                Optional.of(new ItemCost(Items.DIAMOND, element.getDiamondCost())),
                                GetRegistryEnchantmentUtil.makeItemStack(
                                        Items.ENCHANTED_BOOK.asItem(),
                                        pTrader.level().registryAccess(), // I dont know how to obtain this.
                                        element.getEnchantment(),
                                        null,
                                        element.getLevel(),
                                        0),
                                3,
                                50,
                                0.4f));
            }
        }

        /**
         * ARMORER
         */
        if (event.getType() == VillagerProfession.ARMORER) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            vanillaTrades = vanillaTradesMap.get(VillagerProfession.ARMORER);

            //level 4 clear -----------------------------------------------------------------------
            int villagerLevel = 4;
            trades.get(villagerLevel).removeIf(vanillaTrades::containsValue);
            //level 4 trades ----------------------------------------------------------------------
            for (EnchantedBootsEnum element : EnchantedBootsEnum.values()) {
                trades.get(villagerLevel)
                        .add((pTrader, pRandom) -> new MerchantOffer(
                                new ItemCost(Items.EMERALD, element.getEmeraldsCost()),
                                Optional.of(new ItemCost(Items.DIAMOND, element.getDiamondCost())),
                                GetRegistryEnchantmentUtil.makeItemStack(
                                        Items.DIAMOND_BOOTS.asItem(),
                                        pTrader.level().registryAccess(), // I dont know how to obtain this.
                                        element.getFirstEnchantment(),
                                        element.getSecondEnchantment(),
                                        element.getLevelOfFirstEnchantment(),
                                        element.getLevelOfSecondEnchantment()),
                                3,
                                50,
                                0.4f));
            }

            for (EnchantedLeggingsEnum element : EnchantedLeggingsEnum.values()) {
                trades.get(villagerLevel)
                        .add((pTrader, pRandom) -> new MerchantOffer(
                                new ItemCost(Items.EMERALD, element.getEmeraldsCost()),
                                Optional.of(new ItemCost(Items.DIAMOND, element.getDiamondCost())),
                                GetRegistryEnchantmentUtil.makeItemStack(
                                        Items.DIAMOND_LEGGINGS.asItem(),
                                        pTrader.level().registryAccess(), // I dont know how to obtain this.
                                        element.getFirstEnchantment(),
                                        element.getSecondEnchantment(),
                                        element.getLevelOfFirstEnchantment(),
                                        element.getLevelOfSecondEnchantment()),
                                3,
                                50,
                                0.4f));

            }
            //level 5 clear -----------------------------------------------------------------------
            villagerLevel = 5;
            trades.get(villagerLevel).removeIf(vanillaTrades::containsValue);
            //level 5 trades ----------------------------------------------------------------------
            for (EnchantedHelmetEnum element : EnchantedHelmetEnum.values()) {
                trades.get(villagerLevel)
                        .add((pTrader, pRandom) -> new MerchantOffer(
                                new ItemCost(Items.EMERALD, element.getEmeraldsCost()),
                                Optional.of(new ItemCost(Items.DIAMOND, element.getDiamondCost())),
                                GetRegistryEnchantmentUtil.makeItemStack(
                                        Items.DIAMOND_HELMET.asItem(),
                                        pTrader.level().registryAccess(), // I dont know how to obtain this.
                                        element.getFirstEnchantment(),
                                        element.getSecondEnchantment(),
                                        element.getLevelOfFirstEnchantment(),
                                        element.getLevelOfSecondEnchantment()),
                                3,
                                50,
                                0.4f));
            }
            for (EnchantedChestplateEnum element : EnchantedChestplateEnum.values()) {
                trades.get(villagerLevel)
                        .add((pTrader, pRandom) -> new MerchantOffer(
                                new ItemCost(Items.EMERALD, element.getEmeraldsCost()),
                                Optional.of(new ItemCost(Items.DIAMOND, element.getDiamondCost())),
                                GetRegistryEnchantmentUtil.makeItemStack(
                                        Items.DIAMOND_CHESTPLATE.asItem(),
                                        pTrader.level().registryAccess(), // I dont know how to obtain this.
                                        element.getFirstEnchantment(),
                                        element.getSecondEnchantment(),
                                        element.getLevelOfFirstEnchantment(),
                                        element.getLevelOfSecondEnchantment()),
                                3,
                                50,
                                0.4f));
            }
        }

        /**
         * TOOLSMITH
         */
        if (event.getType() == VillagerProfession.TOOLSMITH) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            vanillaTrades = vanillaTradesMap.get(VillagerProfession.TOOLSMITH);

            //level 4 clear -----------------------------------------------------------------------
            int villagerLevel = 4;
            trades.get(villagerLevel).removeIf(vanillaTrades::containsValue);
            //level 4 trades ----------------------------------------------------------------------
            for (EnchantedShovelEnum element : EnchantedShovelEnum.values()) {
                trades.get(villagerLevel)
                        .add((pTrader, pRandom) -> new MerchantOffer(
                                new ItemCost(Items.EMERALD, element.getEmeraldsCost()),
                                Optional.of(new ItemCost(Items.DIAMOND, element.getDiamondCost())),
                                GetRegistryEnchantmentUtil.makeItemStack(
                                        Items.DIAMOND_SHOVEL.asItem(),
                                        pTrader.level().registryAccess(), // I dont know how to obtain this.
                                        element.getFirstEnchantment(),
                                        element.getSecondEnchantment(),
                                        element.getLevelOfFirstEnchantment(),
                                        element.getLevelOfSecondEnchantment()),
                                3,
                                50,
                                0.4f));

            }
            for (EnchantedAxeEnum element : EnchantedAxeEnum.values()) {
                trades.get(villagerLevel)
                        .add((pTrader, pRandom) -> new MerchantOffer(
                                new ItemCost(Items.EMERALD, element.getEmeraldsCost()),
                                Optional.of(new ItemCost(Items.DIAMOND, element.getDiamondCost())),
                                GetRegistryEnchantmentUtil.makeItemStack(
                                        Items.DIAMOND_AXE.asItem(),
                                        pTrader.level().registryAccess(), // I dont know how to obtain this.
                                        element.getFirstEnchantment(),
                                        element.getSecondEnchantment(),
                                        element.getLevelOfFirstEnchantment(),
                                        element.getLevelOfSecondEnchantment()),
                                3,
                                50,
                                0.4f));
            }
            //level 5 clear -----------------------------------------------------------------------
            villagerLevel = 5;
            trades.get(villagerLevel).removeIf(vanillaTrades::containsValue);
            //level 5 trades ----------------------------------------------------------------------
            for (EnchantedPickaxeEnum element : EnchantedPickaxeEnum.values()) {
                trades.get(villagerLevel)
                        .add((pTrader, pRandom) -> new MerchantOffer(
                                new ItemCost(Items.EMERALD, element.getEmeraldsCost()),
                                Optional.of(new ItemCost(Items.DIAMOND, element.getDiamondCost())),
                                GetRegistryEnchantmentUtil.makeItemStack(
                                        Items.DIAMOND_PICKAXE.asItem(),
                                        pTrader.level().registryAccess(), // I dont know how to obtain this.
                                        element.getFirstEnchantment(),
                                        element.getSecondEnchantment(),
                                        element.getLevelOfFirstEnchantment(),
                                        element.getLevelOfSecondEnchantment()),
                                3,
                                50,
                                0.4f));
            }
        }

        /**
         * WEAPONSMITH
         */
        if (event.getType() == VillagerProfession.WEAPONSMITH) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            vanillaTrades = vanillaTradesMap.get(VillagerProfession.WEAPONSMITH);

            int villagerLevel = 3;
            //level 3 trades ----------------------------------------------------------------------
            trades.get(villagerLevel).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.DIAMOND, 1),
                    new ItemStack(Items.EMERALD, 1), 3, 25, 0.4f));
            //level 4 clear -----------------------------------------------------------------------
            villagerLevel = 4;
            trades.get(villagerLevel).removeIf(vanillaTrades::containsValue);
            //level 4 trades ----------------------------------------------------------------------
            for (EnchantedAxeAttackEnum element : EnchantedAxeAttackEnum.values()) {
                trades.get(villagerLevel)
                        .add((pTrader, pRandom) -> new MerchantOffer(
                                new ItemCost(Items.EMERALD, element.getEmeraldsCost()),
                                Optional.of(new ItemCost(Items.DIAMOND, element.getDiamondCost())),
                                GetRegistryEnchantmentUtil.makeItemStack(
                                        Items.DIAMOND_AXE.asItem(),
                                        pTrader.level().registryAccess(), // I dont know how to obtain this.
                                        element.getFirstEnchantment(),
                                        element.getSecondEnchantment(),
                                        element.getLevelOfFirstEnchantment(),
                                        element.getLevelOfSecondEnchantment()),
                                3,
                                50,
                                0.4f));
            }
            //level 5 clear -----------------------------------------------------------------------
            villagerLevel = 5;
            trades.get(villagerLevel).removeIf(vanillaTrades::containsValue);
            //level 5 trades ----------------------------------------------------------------------
            for (EnchantedSwordEnum element : EnchantedSwordEnum.values()) {
                trades.get(villagerLevel)
                        .add((pTrader, pRandom) -> new MerchantOffer(
                                new ItemCost(Items.EMERALD, element.getEmeraldsCost()),
                                Optional.of(new ItemCost(Items.DIAMOND, element.getDiamondCost())),
                                GetRegistryEnchantmentUtil.makeItemStack(
                                        Items.DIAMOND_SWORD.asItem(),
                                        pTrader.level().registryAccess(), // I dont know how to obtain this.
                                        element.getFirstEnchantment(),
                                        element.getSecondEnchantment(),
                                        element.getLevelOfFirstEnchantment(),
                                        element.getLevelOfSecondEnchantment()),
                                3,
                                50,
                                0.4f));

            }
        }
    }
}
