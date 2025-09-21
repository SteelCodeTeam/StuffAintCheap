package net.f4rck.stuffaintcheap;

import com.mojang.logging.LogUtils;
import net.f4rck.stuffaintcheap.config.ModServerConfig;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import org.slf4j.Logger;

@Mod(StuffAintCheap.MOD_ID)
public class StuffAintCheap {

    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "stuff_aint_cheap";

    private static final Logger LOGGER = LogUtils.getLogger();

    public StuffAintCheap(IEventBus modEventBus, ModContainer modContainer) {
        LOGGER.info("Starting Stuff Ain't Cheap mod.");
        NeoForge.EVENT_BUS.register(this);
        LOGGER.info("Registering Event");

        LOGGER.info("Registering Config");
        ModServerConfig.register(modContainer);
        LOGGER.info("Registering Config Complete");
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        LOGGER.info("Starting Stuff Ain't Cheap mod for server.");

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @EventBusSubscriber(modid = MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            LOGGER.info("Starting Stuff Ain't Cheap mod for client.");
        }
    }

}
