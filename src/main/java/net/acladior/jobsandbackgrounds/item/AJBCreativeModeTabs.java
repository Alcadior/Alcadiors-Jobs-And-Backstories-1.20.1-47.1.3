package net.acladior.jobsandbackgrounds.item;

import net.acladior.jobsandbackgrounds.JobsAndBackgrounds;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class AJBCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, JobsAndBackgrounds.MOD_ID);

    public static final RegistryObject<CreativeModeTab> JOBS_AND_BACKGROUNDS_TAB = CREATIVE_MODE_TABS.register("jobs_and_backgrounds_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(AJBItems.ENGINEERBADGE.get()))
                    .title(Component.translatable("creativetab.jobs_and_backgrounds_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(AJBItems.ENGINEERBADGE.get());
                        pOutput.accept(AJBItems.ARCANISTBADGE.get());
                        pOutput.accept(AJBItems.ARTIFICERBADGE.get());
                        pOutput.accept(AJBItems.OFFICERBADGE.get());
                        pOutput.accept(AJBItems.SOLDIERBADGE.get());
                        pOutput.accept(AJBItems.ALCHEMISTBADGE.get());
                        pOutput.accept(AJBItems.OCCULTISTBADGE.get());
                        pOutput.accept(AJBItems.MAGEBADGE.get());
                        pOutput.accept(AJBItems.CHEFBADGE.get());
                        pOutput.accept(AJBItems.RANCHERBADGE.get());
                        pOutput.accept(AJBItems.FARMERBADGE.get());
                        pOutput.accept(AJBItems.BUREAUCRATBADGE.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
