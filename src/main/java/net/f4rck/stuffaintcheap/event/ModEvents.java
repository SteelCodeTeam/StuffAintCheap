package net.f4rck.stuffaintcheap.event;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.f4rck.stuffaintcheap.StuffAintCheap;
import net.f4rck.stuffaintcheap.enums.BookTradesEnum;
import net.f4rck.stuffaintcheap.enums.ItemsTradesEnum;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.*;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraft.world.item.ItemStack;


import java.util.List;

@Mod.EventBusSubscriber(modid = StuffAintCheap.MOD_ID)
public class ModEvents {
    @SubscribeEvent

    public static void addCustomTrades(VillagerTradesEvent event) {
        /**
         * LIBRARIAN
         */
        if (event.getType() == VillagerProfession.LIBRARIAN) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            //level 1 clear -----------------------------------------------------------------------
            int villagerLevel = 1;
            trades.get(villagerLevel).clear();
            //level 1 trades ----------------------------------------------------------------------
            for (ItemsTradesEnum.ItemsTier1 itemsTrades : ItemsTradesEnum.ItemsTier1.values()) {
                trades.get(villagerLevel).add((pTrader, pRandom) -> new MerchantOffer(
                        itemsTrades.getItemCost(),
                        itemsTrades.getItemResult(),
                        itemsTrades.getMaxUses(),
                        itemsTrades.getXp(),
                        0.05f));
            }
            //level 2 clear -----------------------------------------------------------------------
            villagerLevel = 2;
            trades.get(villagerLevel).clear();
            //level 2 trades ----------------------------------------------------------------------
            for (BookTradesEnum.EnchantedBooksListTier2 element : BookTradesEnum.EnchantedBooksListTier2.values()) {
                trades.get(villagerLevel).add((pTrader, pRandom) -> new MerchantOffer(
                        new ItemStack(Items.EMERALD, element.getEmeraldsCost()),
                        new ItemStack(Items.DIAMOND, element.getDiamondCost()),
                        element.getItem(), 3, 50, 0.4f));
            }
            //level 3 clear -----------------------------------------------------------------------
            villagerLevel = 3;
            trades.get(villagerLevel).clear();
            //level 3 trades ----------------------------------------------------------------------
            for (ItemsTradesEnum.ItemsTier3 itemsTrades : ItemsTradesEnum.ItemsTier3.values()) {
                trades.get(villagerLevel).add((pTrader, pRandom) -> new MerchantOffer(
                        itemsTrades.getItemCost(),
                        itemsTrades.getItemResult(),
                        itemsTrades.getMaxUses(),
                        itemsTrades.getXp(),
                        0.05f));
            }
            //level 4 clear -----------------------------------------------------------------------
            villagerLevel = 4;
            trades.get(villagerLevel).clear();
            //level 4 trades ----------------------------------------------------------------------
            for (BookTradesEnum.EnchantedBooksListTier4 element : BookTradesEnum.EnchantedBooksListTier4.values()) {
                trades.get(villagerLevel).add((pTrader, pRandom) -> new MerchantOffer(
                        new ItemStack(Items.EMERALD, element.getEmeraldsCost()),
                        new ItemStack(Items.DIAMOND, element.getDiamondCost()),
                        element.getItem(), 3, 50, 0.4f));
            }
            //level 5 clear -----------------------------------------------------------------------
            villagerLevel = 5;
            trades.get(villagerLevel).clear();
            //level 5 trades ----------------------------------------------------------------------
            for (BookTradesEnum.EnchantedBooksListTier5 element : BookTradesEnum.EnchantedBooksListTier5.values()) {
                trades.get(villagerLevel).add((pTrader, pRandom) -> new MerchantOffer(
                        new ItemStack(Items.EMERALD, element.getEmeraldsCost()),
                        new ItemStack(Items.DIAMOND, element.getDiamondCost()),
                        element.getItem(), 3, 50, 0.4f));
            }
        }

        /**
         * ARMORER
         */
        if (event.getType() == VillagerProfession.ARMORER) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            //level 4 clear -----------------------------------------------------------------------
            int villagerLevel = 4;
            trades.get(villagerLevel).clear();
            //level 4 trades ----------------------------------------------------------------------
            for (BookTradesEnum.EnchantedListBoots element : BookTradesEnum.EnchantedListBoots.values()) {
                trades.get(villagerLevel).add((pTrader, pRandom) -> new MerchantOffer(
                        new ItemStack(Items.EMERALD, element.getEmeraldsCost()),
                        new ItemStack(Items.DIAMOND, element.getDiamondCost()),
                        element.getItem(), 3, 50, 0.4f));

            }
            for (BookTradesEnum.EnchantedListLeggings element : BookTradesEnum.EnchantedListLeggings.values()) {
                trades.get(villagerLevel).add((pTrader, pRandom) -> new MerchantOffer(
                        new ItemStack(Items.EMERALD, element.getEmeraldsCost()),
                        new ItemStack(Items.DIAMOND, element.getDiamondCost()),
                        element.getItem(), 3, 50, 0.4f));

            }
            //level 5 clear -----------------------------------------------------------------------
            villagerLevel = 5;
            trades.get(villagerLevel).clear();
            //level 5 trades ----------------------------------------------------------------------
            for (BookTradesEnum.EnchantedListHelmet element : BookTradesEnum.EnchantedListHelmet.values()) {
                trades.get(villagerLevel).add((pTrader, pRandom) -> new MerchantOffer(
                        new ItemStack(Items.EMERALD, element.getEmeraldsCost()),
                        new ItemStack(Items.DIAMOND, element.getDiamondCost()),
                        element.getItem(), 3, 50, 0.4f));
            }
            for (BookTradesEnum.EnchantedListChestplate element : BookTradesEnum.EnchantedListChestplate.values()) {
                trades.get(villagerLevel).add((pTrader, pRandom) -> new MerchantOffer(
                        new ItemStack(Items.EMERALD, element.getEmeraldsCost()),
                        new ItemStack(Items.DIAMOND, element.getDiamondCost()),
                        element.getItem(), 3, 50, 0.4f));
            }
        }

        /**
         * TOOLSMITH
         */
        if (event.getType() == VillagerProfession.TOOLSMITH) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            //level 4 clear -----------------------------------------------------------------------
            int villagerLevel = 4;
            trades.get(villagerLevel).clear();
            //level 4 trades ----------------------------------------------------------------------
            for (BookTradesEnum.EnchantedListShovel element : BookTradesEnum.EnchantedListShovel.values()) {
                trades.get(villagerLevel).add((pTrader, pRandom) -> new MerchantOffer(
                        new ItemStack(Items.EMERALD, element.getEmeraldsCost()),
                        new ItemStack(Items.DIAMOND, element.getDiamondCost()),
                        element.getItem(), 3, 50, 0.4f));

            }
            for (BookTradesEnum.EnchantedListAxe element : BookTradesEnum.EnchantedListAxe.values()) {
                trades.get(villagerLevel).add((pTrader, pRandom) -> new MerchantOffer(
                        new ItemStack(Items.EMERALD, element.getEmeraldsCost()),
                        new ItemStack(Items.DIAMOND, element.getDiamondCost()),
                        element.getItem(), 3, 50, 0.4f));
            }
            //level 5 clear -----------------------------------------------------------------------
            villagerLevel = 5;
            trades.get(villagerLevel).clear();
            //level 5 trades ----------------------------------------------------------------------
            for (BookTradesEnum.EnchantedListPickaxe element : BookTradesEnum.EnchantedListPickaxe.values()) {
                trades.get(villagerLevel).add((pTrader, pRandom) -> new MerchantOffer(
                        new ItemStack(Items.EMERALD, element.getEmeraldsCost()),
                        new ItemStack(Items.DIAMOND, element.getDiamondCost()),
                        element.getItem(), 3, 50, 0.4f));
            }
        }

        /**
         * WEAPONSMITH
         */
        if (event.getType() == VillagerProfession.WEAPONSMITH) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            int villagerLevel = 3;
            //level 3 trades ----------------------------------------------------------------------
            trades.get(villagerLevel).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.DIAMOND, 1),
                    new ItemStack(Items.EMERALD, 1), 3, 25, 0.4f));
            //level 4 clear -----------------------------------------------------------------------
            villagerLevel = 4;
            trades.get(villagerLevel).clear();
            //level 4 trades ----------------------------------------------------------------------
            for (BookTradesEnum.EnchantedListCaxe element : BookTradesEnum.EnchantedListCaxe.values()) {
                trades.get(villagerLevel).add((pTrader, pRandom) -> new MerchantOffer(
                        new ItemStack(Items.EMERALD, element.getEmeraldsCost()),
                        new ItemStack(Items.DIAMOND, element.getDiamondCost()),
                        element.getItem(), 3, 50, 0.4f));
            }
            //level 5 clear -----------------------------------------------------------------------
            villagerLevel = 5;
            trades.get(villagerLevel).clear();
            //level 5 trades ----------------------------------------------------------------------
            for (BookTradesEnum.EnchantedListSword element : BookTradesEnum.EnchantedListSword.values()) {
                trades.get(villagerLevel).add((pTrader, pRandom) -> new MerchantOffer(
                        new ItemStack(Items.EMERALD, element.getEmeraldsCost()),
                        new ItemStack(Items.DIAMOND, element.getDiamondCost()),
                        element.getItem(), 3, 50, 0.4f));

            }
        }
    }
}
