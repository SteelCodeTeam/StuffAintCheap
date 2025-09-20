package net.f4rck.stuffaintcheap.event;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.f4rck.stuffaintcheap.StuffAintCheap;
import net.f4rck.stuffaintcheap.enums.armor.EnchantedBootsEnum;
import net.f4rck.stuffaintcheap.enums.armor.EnchantedChestplateEnum;
import net.f4rck.stuffaintcheap.enums.armor.EnchantedHelmetEnum;
import net.f4rck.stuffaintcheap.enums.armor.EnchantedLeggingsEnum;
import net.f4rck.stuffaintcheap.utils.TradeUtils;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.village.VillagerTradesEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

@EventBusSubscriber(modid = StuffAintCheap.MOD_ID, bus = EventBusSubscriber.Bus.GAME)
public class ArmorerEvents {

    private static final Logger LOGGER = LoggerFactory.getLogger(ArmorerEvents.class);

    @SubscribeEvent
    public static void addCustomTrades(VillagerTradesEvent event) {
        if (event.getType() != VillagerProfession.ARMORER) {
            return;
        }

        LOGGER.info("Starting ARMORER trades modification process...");

        Map<VillagerProfession, Int2ObjectMap<VillagerTrades.ItemListing[]>> vanillaTradesMap = VillagerTrades.TRADES;
        Int2ObjectMap<VillagerTrades.ItemListing[]> vanillaTrades = vanillaTradesMap.get(VillagerProfession.ARMORER);
        Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

        LOGGER.info("Processing Level 4 trades...");
        TradeUtils.clearVanillaTrades(trades, vanillaTrades, 4);

        TradeUtils.addEnchantedItemTrades(trades, 4, EnchantedBootsEnum.values(), Items.DIAMOND_BOOTS, 3, 50, 0.4f);
        TradeUtils.addEnchantedItemTrades(trades, 4, EnchantedLeggingsEnum.values(), Items.DIAMOND_LEGGINGS, 3, 50, 0.4f);

        int level4Trades = EnchantedBootsEnum.values().length + EnchantedLeggingsEnum.values().length;
        LOGGER.info("Added {} enchanted armor trades to Level 4 ({} boots, {} leggings)",
                level4Trades, EnchantedBootsEnum.values().length, EnchantedLeggingsEnum.values().length);

        LOGGER.info("Processing Level 5 trades...");
        TradeUtils.clearVanillaTrades(trades, vanillaTrades, 5);

        TradeUtils.addEnchantedItemTrades(trades, 5, EnchantedHelmetEnum.values(), Items.DIAMOND_HELMET, 3, 50, 0.4f);
        TradeUtils.addEnchantedItemTrades(trades, 5, EnchantedChestplateEnum.values(), Items.DIAMOND_CHESTPLATE, 3, 50, 0.4f);

        int level5Trades = EnchantedHelmetEnum.values().length + EnchantedChestplateEnum.values().length;
        LOGGER.info("Added {} enchanted armor trades to Level 5 ({} helmets, {} chestplates)",
                level5Trades, EnchantedHelmetEnum.values().length, EnchantedChestplateEnum.values().length);

        // Final summary
        int totalTrades = level4Trades + level5Trades;
        LOGGER.info("=== ARMORER TRADES MODIFICATION COMPLETED ===");
        LOGGER.info("Total custom trades added: {}", totalTrades);
        LOGGER.info("  - Level 4: {} armor pieces (boots & leggings)", level4Trades);
        LOGGER.info("  - Level 5: {} armor pieces (helmets & chestplates)", level5Trades);
        LOGGER.info("Vanilla trades cleared for levels 4 and 5");
        LOGGER.info("==============================================");
    }
}