package net.f4rck.stuffaintcheap.event;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.f4rck.stuffaintcheap.StuffAintCheap;
import net.f4rck.stuffaintcheap.StuffThatAintCheap;
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

        //------------------------------------------------------------------------------------------------
        //                     LIBRARIAN
        //_______________________________________________________________________________________________

        //level 1 clear -----------------------------------------------------------------------
        if (event.getType() == VillagerProfession.LIBRARIAN) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            int villagerLevel = 1;
            trades.get(villagerLevel).clear();
        }


        //level 1 trades ----------------------------------------------------------------------
        if (event.getType() == VillagerProfession.LIBRARIAN) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.EMERALD, 1);
            int villagerLevel = 1;

            trades.get(villagerLevel).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.BOOK, 4),
                    stack, 12, 5, 0.05f));
        }
        if (event.getType() == VillagerProfession.LIBRARIAN) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.EMERALD, 1);
            int villagerLevel = 1;

            trades.get(villagerLevel).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.PAPER, 24),
                    stack, 16, 5, 0.05f));
        }
        if (event.getType() == VillagerProfession.LIBRARIAN) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.BOOKSHELF, 1);
            int villagerLevel = 1;

            trades.get(villagerLevel).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 9),
                    stack, 12, 5, 0.05f));
        }
        if (event.getType() == VillagerProfession.LIBRARIAN) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.LANTERN, 1);
            int villagerLevel = 1;

            trades.get(villagerLevel).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 1),
                    stack, 12, 5, 0.05f));
        }
        if (event.getType() == VillagerProfession.LIBRARIAN) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.EMERALD, 1);
            int villagerLevel = 1;

            trades.get(villagerLevel).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.INK_SAC, 5),
                    stack, 12, 5, 0.05f));
        }
        if (event.getType() == VillagerProfession.LIBRARIAN) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.EMERALD, 1);
            int villagerLevel = 1;

            trades.get(villagerLevel).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.WRITABLE_BOOK, 1),
                    stack, 12, 5, 0.05f));
        }

        //level 2 clear -----------------------------------------------------------------------
        if (event.getType() == VillagerProfession.LIBRARIAN) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            int villagerLevel = 2;
            trades.get(villagerLevel).clear();
        }

        //level 2 trades ----------------------------------------------------------------------

        for (StuffThatAintCheap.EnchantedBooksListTier1 element : StuffThatAintCheap.EnchantedBooksListTier1.values()) {
            if (event.getType() == VillagerProfession.LIBRARIAN) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
                int villagerLevel = 2;

                trades.get(villagerLevel).add((pTrader, pRandom) -> new MerchantOffer(
                        new ItemStack(Items.EMERALD, element.getEmeraldsCost()),
                        new ItemStack(Items.DIAMOND, element.getDiamondCost()),
                        element.getItem(), 3, 50, 0.4f));
            }
        }

        //level 3 clear -----------------------------------------------------------------------
        if (event.getType() == VillagerProfession.LIBRARIAN) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            int villagerLevel = 3;
            trades.get(villagerLevel).clear();
        }


        //level 3 trades ----------------------------------------------------------------------
        if (event.getType() == VillagerProfession.LIBRARIAN) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.NAME_TAG, 1);
            int villagerLevel = 3;

            trades.get(villagerLevel).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 20),
                    stack, 12, 30, 0.05f));
        }
        if (event.getType() == VillagerProfession.LIBRARIAN) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.GLASS, 4);
            int villagerLevel = 3;

            trades.get(villagerLevel).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 1),
                    stack, 16, 10, 0.05f));
        }
        if (event.getType() == VillagerProfession.LIBRARIAN) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.CLOCK, 1);
            int villagerLevel = 3;

            trades.get(villagerLevel).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 1),
                    stack, 12, 20, 0.05f));
        }
        if (event.getType() == VillagerProfession.LIBRARIAN) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.COMPASS, 1);
            int villagerLevel = 3;

            trades.get(villagerLevel).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 1),
                    stack, 12, 20, 0.05f));
        }

        //level 4 clear -----------------------------------------------------------------------
        if (event.getType() == VillagerProfession.LIBRARIAN) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            int villagerLevel = 4;
            trades.get(villagerLevel).clear();
        }
        //level 4 trades ----------------------------------------------------------------------

        for (StuffThatAintCheap.EnchantedBooksListTier2 element : StuffThatAintCheap.EnchantedBooksListTier2.values()) {
            if (event.getType() == VillagerProfession.LIBRARIAN) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
                int villagerLevel = 4;

                trades.get(villagerLevel).add((pTrader, pRandom) -> new MerchantOffer(
                        new ItemStack(Items.EMERALD, element.getEmeraldsCost()),
                        new ItemStack(Items.DIAMOND, element.getDiamondCost()),
                        element.getItem(), 3, 50, 0.4f));
            }
        }


        //level 5 clear -----------------------------------------------------------------------
        if (event.getType() == VillagerProfession.LIBRARIAN) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            int villagerLevel = 5;
            trades.get(villagerLevel).clear();
        }
        //level 5 trades ----------------------------------------------------------------------

        for (StuffThatAintCheap.EnchantedBooksListTier3 element : StuffThatAintCheap.EnchantedBooksListTier3.values()) {
            if (event.getType() == VillagerProfession.LIBRARIAN) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
                int villagerLevel = 5;

                trades.get(villagerLevel).add((pTrader, pRandom) -> new MerchantOffer(
                        new ItemStack(Items.EMERALD, element.getEmeraldsCost()),
                        new ItemStack(Items.DIAMOND, element.getDiamondCost()),
                        element.getItem(), 3, 50, 0.4f));
            }
        }



            //------------------------------------------------------------------------------------------------
            //                     ARMORER
            //_______________________________________________________________________________________________


            //level 4 clear -----------------------------------------------------------------------
            if (event.getType() == VillagerProfession.ARMORER) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

                int villagerLevel = 4;
                trades.get(villagerLevel).clear();
            }


            //level 4 trades ----------------------------------------------------------------------
        for (StuffThatAintCheap.EnchantedListBoots element : StuffThatAintCheap.EnchantedListBoots.values()) {
            if (event.getType() == VillagerProfession.ARMORER) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
                int villagerLevel = 4;

                trades.get(villagerLevel).add((pTrader, pRandom) -> new MerchantOffer(
                        new ItemStack(Items.EMERALD, element.getEmeraldsCost()),
                        new ItemStack(Items.DIAMOND, element.getDiamondCost()),
                        element.getItem(), 3, 50, 0.4f));
            }
        }
        for (StuffThatAintCheap.EnchantedListLeggings element : StuffThatAintCheap.EnchantedListLeggings.values()) {
            if (event.getType() == VillagerProfession.ARMORER) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
                int villagerLevel = 4;

                trades.get(villagerLevel).add((pTrader, pRandom) -> new MerchantOffer(
                        new ItemStack(Items.EMERALD, element.getEmeraldsCost()),
                        new ItemStack(Items.DIAMOND, element.getDiamondCost()),
                        element.getItem(), 3, 50, 0.4f));
            }
        }

            //level 5 clear -----------------------------------------------------------------------
            if (event.getType() == VillagerProfession.ARMORER) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

                int villagerLevel = 5;
                trades.get(villagerLevel).clear();
            }
            //level 5 trades ----------------------------------------------------------------------
        for (StuffThatAintCheap.EnchantedListHelmet element : StuffThatAintCheap.EnchantedListHelmet.values()) {
            if (event.getType() == VillagerProfession.ARMORER) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
                int villagerLevel = 5;

                trades.get(villagerLevel).add((pTrader, pRandom) -> new MerchantOffer(
                        new ItemStack(Items.EMERALD, element.getEmeraldsCost()),
                        new ItemStack(Items.DIAMOND, element.getDiamondCost()),
                        element.getItem(), 3, 50, 0.4f));
            }
        }
        for (StuffThatAintCheap.EnchantedListChestplate element : StuffThatAintCheap.EnchantedListChestplate.values()) {
            if (event.getType() == VillagerProfession.ARMORER) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
                int villagerLevel = 5;

                trades.get(villagerLevel).add((pTrader, pRandom) -> new MerchantOffer(
                        new ItemStack(Items.EMERALD, element.getEmeraldsCost()),
                        new ItemStack(Items.DIAMOND, element.getDiamondCost()),
                        element.getItem(), 3, 50, 0.4f));
            }
        }

        //------------------------------------------------------------------------------------------------
        //                     TOOLSMITH
        //_______________________________________________________________________________________________


        //level 4 clear -----------------------------------------------------------------------
            if (event.getType() == VillagerProfession.TOOLSMITH) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

                int villagerLevel = 4;
                trades.get(villagerLevel).clear();
            }


            //level 4 trades ----------------------------------------------------------------------
        for (StuffThatAintCheap.EnchantedListShovel element : StuffThatAintCheap.EnchantedListShovel.values()) {
            if (event.getType() == VillagerProfession.TOOLSMITH) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
                int villagerLevel = 4;

                trades.get(villagerLevel).add((pTrader, pRandom) -> new MerchantOffer(
                        new ItemStack(Items.EMERALD, element.getEmeraldsCost()),
                        new ItemStack(Items.DIAMOND, element.getDiamondCost()),
                        element.getItem(), 3, 50, 0.4f));
            }
        }
        for (StuffThatAintCheap.EnchantedListAxe element: StuffThatAintCheap.EnchantedListAxe.values()) {
            if (event.getType() == VillagerProfession.TOOLSMITH) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
                int villagerLevel = 4;

                trades.get(villagerLevel).add((pTrader, pRandom) -> new MerchantOffer(
                        new ItemStack(Items.EMERALD, element.getEmeraldsCost()),
                        new ItemStack(Items.DIAMOND, element.getDiamondCost()),
                        element.getItem(), 3, 50, 0.4f));
            }
        }

            //level 5 clear -----------------------------------------------------------------------

            if (event.getType() == VillagerProfession.TOOLSMITH) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

                int villagerLevel = 5;
                trades.get(villagerLevel).clear();
            }


            //level 5 trades ----------------------------------------------------------------------
        for (StuffThatAintCheap.EnchantedListPickaxe element: StuffThatAintCheap.EnchantedListPickaxe.values()) {
            if (event.getType() == VillagerProfession.TOOLSMITH) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
                int villagerLevel = 5;

                trades.get(villagerLevel).add((pTrader, pRandom) -> new MerchantOffer(
                        new ItemStack(Items.EMERALD, element.getEmeraldsCost()),
                        new ItemStack(Items.DIAMOND, element.getDiamondCost()),
                        element.getItem(), 3, 50, 0.4f));
            }
        }
        //------------------------------------------------------------------------------------------------
        //                     WEAPONSMITH
        //_______________________________________________________________________________________________

            //level 4 clear -----------------------------------------------------------------------
            if (event.getType() == VillagerProfession.WEAPONSMITH) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

                int villagerLevel = 4;
                trades.get(villagerLevel).clear();
            }

            //level 3 trades ----------------------------------------------------------------------

            if (event.getType() == VillagerProfession.WEAPONSMITH) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
                ItemStack stack = new ItemStack(Items.EMERALD, 1);
                int villagerLevel = 3;

                trades.get(villagerLevel).add((pTrader, pRandom) -> new MerchantOffer(
                        new ItemStack(Items.DIAMOND, 1),
                        stack, 3, 25, 0.4f));
            }

            //level 4 trades ----------------------------------------------------------------------
        for (StuffThatAintCheap.EnchantedListCaxe element: StuffThatAintCheap.EnchantedListCaxe.values()) {
            if (event.getType() == VillagerProfession.WEAPONSMITH) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
                int villagerLevel = 4;

                trades.get(villagerLevel).add((pTrader, pRandom) -> new MerchantOffer(
                        new ItemStack(Items.EMERALD, element.getEmeraldsCost()),
                        new ItemStack(Items.DIAMOND, element.getDiamondCost()),
                        element.getItem(), 3, 50, 0.4f));
            }
        }

            //level 5 clear -----------------------------------------------------------------------

            if (event.getType() == VillagerProfession.WEAPONSMITH) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

                int villagerLevel = 5;
                trades.get(villagerLevel).clear();
            }


            //level 5 trades ----------------------------------------------------------------------
        for (StuffThatAintCheap.EnchantedListSword element: StuffThatAintCheap.EnchantedListSword.values()) {
            if (event.getType() == VillagerProfession.WEAPONSMITH) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
                int villagerLevel = 5;

                trades.get(villagerLevel).add((pTrader, pRandom) -> new MerchantOffer(
                        new ItemStack(Items.EMERALD, element.getEmeraldsCost()),
                        new ItemStack(Items.DIAMOND, element.getDiamondCost()),
                        element.getItem(), 3, 50, 0.4f));
            }
        }

        }


}
