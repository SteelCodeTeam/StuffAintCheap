
package net.f4rck.stuffaintcheap.event;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.f4rck.stuffaintcheap.StuffAintCheap;
import net.f4rck.stuffaintcheap.enums.tools.EnchantedAxeEnum;
import net.f4rck.stuffaintcheap.enums.tools.EnchantedPickaxeEnum;
import net.f4rck.stuffaintcheap.enums.tools.EnchantedShovelEnum;
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
public class ToolSmithEvents {

    private static final Logger LOGGER = LoggerFactory.getLogger(ToolSmithEvents.class);

    @SubscribeEvent
    public static void addCustomTrades(VillagerTradesEvent event) {
        if (event.getType() != VillagerProfession.TOOLSMITH) {
            return;
        }

        LOGGER.info("Starting TOOLSMITH trades modification process...");

        Map<VillagerProfession, Int2ObjectMap<VillagerTrades.ItemListing[]>> vanillaTradesMap = VillagerTrades.TRADES;
        Int2ObjectMap<VillagerTrades.ItemListing[]> vanillaTrades = vanillaTradesMap.get(VillagerProfession.TOOLSMITH);
        Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

        LOGGER.info("Processing Level 4 trades...");
        TradeUtils.clearVanillaTrades(trades, vanillaTrades, 4);

        TradeUtils.addEnchantedItemTrades(trades, 4, EnchantedShovelEnum.values(), Items.DIAMOND_SHOVEL, 3, 50, 0.4f);
        TradeUtils.addEnchantedItemTrades(trades, 4, EnchantedAxeEnum.values(), Items.DIAMOND_AXE, 3, 50, 0.4f);

        int level4Trades = EnchantedShovelEnum.values().length + EnchantedAxeEnum.values().length;
        LOGGER.info("Added {} enchanted tool trades to Level 4 ({} shovels, {} axes)",
                level4Trades, EnchantedShovelEnum.values().length, EnchantedAxeEnum.values().length);

        LOGGER.info("Processing Level 5 trades...");
        TradeUtils.clearVanillaTrades(trades, vanillaTrades, 5);
        TradeUtils.addEnchantedItemTrades(trades, 5, EnchantedPickaxeEnum.values(), Items.DIAMOND_PICKAXE, 3, 50, 0.4f);
        LOGGER.info("Added {} enchanted diamond pickaxe trades to Level 5", EnchantedPickaxeEnum.values().length);

        int totalTrades = level4Trades + EnchantedPickaxeEnum.values().length;
        LOGGER.info("=== TOOLSMITH TRADES MODIFICATION COMPLETED ===");
        LOGGER.info("Total custom trades added: {}", totalTrades);
        LOGGER.info("  - Level 4: {} tools (shovels & axes)", level4Trades);
        LOGGER.info("  - Level 5: {} pickaxes", EnchantedPickaxeEnum.values().length);
        LOGGER.info("Vanilla trades cleared for levels 4 and 5");
        LOGGER.info("============================================");
    }
}