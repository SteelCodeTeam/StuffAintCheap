package net.f4rck.stuffaintcheap.event;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.f4rck.stuffaintcheap.StuffAintCheap;
import net.f4rck.stuffaintcheap.enums.books.BookTier2Enum;
import net.f4rck.stuffaintcheap.enums.books.BookTier4Enum;
import net.f4rck.stuffaintcheap.enums.books.BookTier5Enum;
import net.f4rck.stuffaintcheap.enums.items.ItemsTier1;
import net.f4rck.stuffaintcheap.enums.items.ItemsTier3;
import net.f4rck.stuffaintcheap.utils.TradeUtils;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.village.VillagerTradesEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

@EventBusSubscriber(modid = StuffAintCheap.MOD_ID, bus = EventBusSubscriber.Bus.GAME)
public class LibrarianEvents {

    private static final Logger LOGGER = LoggerFactory.getLogger(LibrarianEvents.class);

    @SubscribeEvent
    public static void addCustomTrades(VillagerTradesEvent event) {
        if (event.getType() != VillagerProfession.LIBRARIAN) {
            return;
        }

        LOGGER.info("Starting LIBRARIAN trades modification process...");

        Map<VillagerProfession, Int2ObjectMap<VillagerTrades.ItemListing[]>> vanillaTradesMap = VillagerTrades.TRADES;
        Int2ObjectMap<VillagerTrades.ItemListing[]> vanillaTrades = vanillaTradesMap.get(VillagerProfession.LIBRARIAN);
        Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

        LOGGER.info("Processing Level 1 trades...");
        TradeUtils.clearVanillaTrades(trades, vanillaTrades, 1);
        TradeUtils.addSimpleItemTrades(trades, 1, ItemsTier1.values(), 0.05f);
        LOGGER.info("Added {} simple item trades to Level 1", ItemsTier1.values().length);

        LOGGER.info("Processing Level 2 trades...");
        TradeUtils.clearVanillaTrades(trades, vanillaTrades, 2);
        TradeUtils.addEnchantedBookTrades(trades, 2, BookTier2Enum.values(), 3, 50, 0.4f);
        LOGGER.info("Added {} enchanted book trades to Level 2", BookTier2Enum.values().length);

        LOGGER.info("Processing Level 3 trades...");
        TradeUtils.clearVanillaTrades(trades, vanillaTrades, 3);
        TradeUtils.addSimpleItemTrades(trades, 3, ItemsTier3.values(), 0.05f);
        LOGGER.info("Added {} simple item trades to Level 3", ItemsTier3.values().length);

        LOGGER.info("Processing Level 4 trades...");
        TradeUtils.clearVanillaTrades(trades, vanillaTrades, 4);
        TradeUtils.addEnchantedBookTrades(trades, 4, BookTier4Enum.values(), 3, 50, 0.4f);
        LOGGER.info("Added {} enchanted book trades to Level 4", BookTier4Enum.values().length);

        LOGGER.info("Processing Level 5 trades...");
        TradeUtils.clearVanillaTrades(trades, vanillaTrades, 5);
        TradeUtils.addEnchantedBookTrades(trades, 5, BookTier5Enum.values(), 3, 50, 0.4f);
        LOGGER.info("Added {} enchanted book trades to Level 5", BookTier5Enum.values().length);

        int itemTrades = ItemsTier1.values().length + ItemsTier3.values().length;
        int bookTrades = BookTier2Enum.values().length + BookTier4Enum.values().length + BookTier5Enum.values().length;
        int totalTrades = itemTrades + bookTrades;

        LOGGER.info("=== LIBRARIAN TRADES MODIFICATION COMPLETED ===");
        LOGGER.info("Total custom trades added: {}", totalTrades);
        LOGGER.info("  - Simple items: {} trades (levels 1 & 3)", itemTrades);
        LOGGER.info("  - Enchanted books: {} trades (levels 2, 4 & 5)", bookTrades);
        LOGGER.info("Vanilla trades cleared for all levels (1-5)");
        LOGGER.info("===============================================");
    }
}