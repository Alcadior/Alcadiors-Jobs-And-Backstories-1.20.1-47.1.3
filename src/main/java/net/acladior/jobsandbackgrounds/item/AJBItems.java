package net.acladior.jobsandbackgrounds.item;

import net.acladior.jobsandbackgrounds.JobsAndBackgrounds;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class AJBItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, JobsAndBackgrounds.MOD_ID);

    public static final RegistryObject<Item>  ENGINEERBADGE = ITEMS.register("engineer_badge",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item>  ARCANISTBADGE = ITEMS.register("arcanist_badge",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item>  ARTIFICERBADGE = ITEMS.register("artificer_badge",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item>  OFFICERBADGE = ITEMS.register("officer_badge",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item>  SOLDIERBADGE = ITEMS.register("soldier_badge",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item>  ALCHEMISTBADGE = ITEMS.register("alchemist_badge",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item>  OCCULTISTBADGE = ITEMS.register("occultist_badge",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item>  MAGEBADGE = ITEMS.register("mage_badge",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item>  CHEFBADGE = ITEMS.register("chef_badge",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item>  RANCHERBADGE = ITEMS.register("rancher_badge",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item>  FARMERBADGE = ITEMS.register("farmer_badge",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item>  BUREAUCRATBADGE = ITEMS.register("bureaucrat_badge",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
