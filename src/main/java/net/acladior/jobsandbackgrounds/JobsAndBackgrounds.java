package net.acladior.jobsandbackgrounds;

import com.mojang.logging.LogUtils;
import net.acladior.jobsandbackgrounds.items.AJBItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(JobsAndBackgrounds.MOD_ID)
public class JobsAndBackgrounds {
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "jobs_and_backgrounds";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    public JobsAndBackgrounds() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        AJBItems.register(modEventBus);

        modEventBus.addListener(this::commonSetup); // Register the commonSetup method for modloading

        MinecraftForge.EVENT_BUS.register(this); // Register ourselves for server and other game events we are interested in
        modEventBus.addListener(this::addCreative); // Register the item to a creative tab

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC); // Register our mod's ForgeConfigSpec so that Forge can create and load the config file for us
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS){
            event.accept(AJBItems.ENGINEERBADGE);
            event.accept(AJBItems.ARCANISTBADGE);
            event.accept(AJBItems.ARTIFICERBADGE);
            event.accept(AJBItems.OFFICERBADGE);
            event.accept(AJBItems.SOLDIERBADGE);
            event.accept(AJBItems.ALCHEMISTBADGE);
            event.accept(AJBItems.OCCULTISTBADGE);
            event.accept(AJBItems.MAGEBADGE);
            event.accept(AJBItems.CHEFBADGE);
            event.accept(AJBItems.RANCHERBADGE);
            event.accept(AJBItems.FARMERBADGE);
            event.accept(AJBItems.BUREAUCRATBADGE);

        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
        }
    }
}
