package net.f4rck.stuffaintcheap.event;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.f4rck.stuffaintcheap.StuffAintCheap;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;
import java.util.Random;

@Mod.EventBusSubscriber(modid = StuffAintCheap.MOD_ID)
public class ModEvents {
    @SubscribeEvent

    public  static void addCustomTrades(VillagerTradesEvent event){

        //level 1 clear -----------------------------------------------------------------------
        if (event.getType() == VillagerProfession.LIBRARIAN){
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            int villagerLevel = 1;
            trades.get(villagerLevel).clear();
        }


        //level 1 trades ----------------------------------------------------------------------
        if (event.getType() == VillagerProfession.LIBRARIAN){
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.DIAMOND_LEGGINGS, 1);
            int villagerLevel = 1;

            trades.get(villagerLevel).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 19),
                    new ItemStack(Items.DIAMOND, 5),
                    stack, 0,3,25,0.4f));
        }

        //level 4 clear -----------------------------------------------------------------------
        if (event.getType() == VillagerProfession.ARMORER){
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            int villagerLevel = 4;
            trades.get(villagerLevel).clear();
        }


        //level 4 trades ----------------------------------------------------------------------
        if (event.getType() == VillagerProfession.ARMORER){
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.DIAMOND_LEGGINGS, 1);
            int villagerLevel = 4;
            
            trades.get(villagerLevel).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 19),
                    new ItemStack(Items.DIAMOND, 5),
                    stack, 0,3,25,0.4f));
        }
        if (event.getType() == VillagerProfession.ARMORER){
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.DIAMOND_BOOTS, 1);
            int villagerLevel = 4;

            trades.get(villagerLevel).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 13),
                    new ItemStack(Items.DIAMOND, 2),
                    stack, 0,3,25,0.4f));
        }

        //level 5 clear -----------------------------------------------------------------------
        if (event.getType() == VillagerProfession.ARMORER){
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            int villagerLevel = 5;
            trades.get(villagerLevel).clear();
        }
        //level 4 trades ----------------------------------------------------------------------
        if (event.getType() == VillagerProfession.ARMORER){
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.DIAMOND_HELMET, 1);
            int villagerLevel = 5;

            trades.get(villagerLevel).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 15),
                    new ItemStack(Items.DIAMOND, 3),
                    stack, 0,3,25,0.4f));
        }
        if (event.getType() == VillagerProfession.ARMORER){
            Random r = new Random();
            int n = r.nextInt(35-21)+21;
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.DIAMOND_CHESTPLATE, 1);
            int villagerLevel = 5;

            trades.get(villagerLevel).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, n),
                    new ItemStack(Items.DIAMOND, 6),
                    stack, 0,3,25,0.4f));
        }
    }
    //#######################################################################################################
    //                    ---- Trade Methods ----
    //#######################################################################################################


}
