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
                        pOutput.accept(AJBItems.ENGINEERBADGE);
                        pOutput.accept(AJBItems.ARCANISTBADGE);
                        pOutput.accept(AJBItems.ARTIFICERBADGE);
                        pOutput.accept(AJBItems.OFFICERBADGE);
                        pOutput.accept(AJBItems.SOLDIERBADGE);
                        pOutput.accept(AJBItems.ALCHEMISTBADGE);
                        pOutput.accept(AJBItems.OCCULTISTBADGE);
                        pOutput.accept(AJBItems.MAGEBADGE);
                        pOutput.accept(AJBItems.CHEFBADGE);
                        pOutput.accept(AJBItems.RANCHERBADGE);
                        pOutput.accept(AJBItems.FARMERBADGE);
                        pOutput.accept(AJBItems.BUREAUCRATBADGE);
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
