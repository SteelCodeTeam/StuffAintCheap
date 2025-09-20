
package net.f4rck.stuffaintcheap.event;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.f4rck.stuffaintcheap.StuffAintCheap;
import net.f4rck.stuffaintcheap.enums.weapons.EnchantedAxeAttackEnum;
import net.f4rck.stuffaintcheap.enums.weapons.EnchantedSwordEnum;
import net.f4rck.stuffaintcheap.event.registry.GetRegistryEnchantmentUtil;
import net.f4rck.stuffaintcheap.utils.TradeUtils;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.ItemCost;
import net.minecraft.world.item.trading.MerchantOffer;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.village.VillagerTradesEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@EventBusSubscriber(modid = StuffAintCheap.MOD_ID, bus = EventBusSubscriber.Bus.GAME)
public class WeaponSmithEvents {

    private static final Logger LOGGER = LoggerFactory.getLogger(WeaponSmithEvents.class);

    @SubscribeEvent
    public static void addCustomTrades(VillagerTradesEvent event) {
        if (event.getType() != VillagerProfession.WEAPONSMITH) {
            return;
        }

        LOGGER.info("Starting WEAPONSMITH trades modification process...");

        Map<VillagerProfession, Int2ObjectMap<VillagerTrades.ItemListing[]>> vanillaTradesMap = VillagerTrades.TRADES;
        Int2ObjectMap<VillagerTrades.ItemListing[]> vanillaTrades = vanillaTradesMap.get(VillagerProfession.WEAPONSMITH);
        Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

        // Level 3: Custom Diamond -> Emerald trade
        LOGGER.info("Processing Level 3 trades...");
        TradeUtils.clearVanillaTrades(trades, vanillaTrades, 3);
        trades.get(3).add(TradeUtils.createSimpleTrade(
                new ItemCost(Items.DIAMOND, 1),
                new ItemStack(Items.EMERALD, 1),
                3, 25, 0.4f));
        LOGGER.info("Added 1 custom trade to Level 3: Diamond -> Emerald");

        // Level 4: Enchanted Axes
        LOGGER.info("Processing Level 4 trades...");
        TradeUtils.clearVanillaTrades(trades, vanillaTrades, 4);
        TradeUtils.addEnchantedItemTrades(trades, 4, EnchantedAxeAttackEnum.values(), Items.DIAMOND_AXE, 3, 50, 0.4f);
        LOGGER.info("Added {} enchanted diamond axe trades to Level 4", EnchantedAxeAttackEnum.values().length);

        // Level 5: Enchanted Swords
        LOGGER.info("Processing Level 5 trades...");
        TradeUtils.clearVanillaTrades(trades, vanillaTrades, 5);
        TradeUtils.addEnchantedItemTrades(trades, 5, EnchantedSwordEnum.values(), Items.DIAMOND_SWORD, 3, 50, 0.4f);
        LOGGER.info("Added {} enchanted diamond sword trades to Level 5", EnchantedSwordEnum.values().length);

        // Final summary
        int totalTrades = 1 + EnchantedAxeAttackEnum.values().length + EnchantedSwordEnum.values().length;
        LOGGER.info("=== WEAPONSMITH TRADES MODIFICATION COMPLETED ===");
        LOGGER.info("Total custom trades added: {}", totalTrades);
        LOGGER.info("================================================");
    }

}