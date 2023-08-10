package com.lazrproductions.tanfluids.init;

import com.lazrproductions.tanfluids.TanFluidsMod;

import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import toughasnails.util.inventory.ItemGroupTAN;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
            TanFluidsMod.MODID);

    public static final RegistryObject<Item> DIRTY_WATER_BUCKET = ITEMS.register("dirty_water_fluid_bucket",
            () -> new BucketItem(ModFluids.DIRTY_WATER_FLUID,
                    new Item.Properties().tab(ItemGroupTAN.INSTANCE).stacksTo(1)));

    public static final RegistryObject<Item> PURIFIED_WATER_BUCKET = ITEMS.register("purified_water_fluid_bucket",
            () -> new BucketItem(ModFluids.PURIFIED_WATER_FLUID,
                    new Item.Properties().tab(ItemGroupTAN.INSTANCE).stacksTo(1)));

    public static final RegistryObject<Item> APPLE_JUICE_BUCKET = ITEMS.register("apple_juice_fluid_bucket",
            () -> new BucketItem(ModFluids.APPLE_JUICE_FLUID,
                    new Item.Properties().tab(ItemGroupTAN.INSTANCE).stacksTo(1)));

    public static final RegistryObject<Item> CACTUS_JUICE_BUCKET = ITEMS.register("cactus_juice_fluid_bucket",
            () -> new BucketItem(ModFluids.CACTUS_JUICE_FLUID,
                    new Item.Properties().tab(ItemGroupTAN.INSTANCE).stacksTo(1)));

    public static final RegistryObject<Item> CHORUS_FRUIT_JUICE_BUCKET = ITEMS.register("chorus_fruit_juice_fluid_bucket",
            () -> new BucketItem(ModFluids.CHORUS_FRUIT_JUICE_FLUID,
                    new Item.Properties().tab(ItemGroupTAN.INSTANCE).stacksTo(1)));

    public static final RegistryObject<Item> GLOW_BERRY_JUICE_BUCKET = ITEMS.register("glow_berry_juice_fluid_bucket",
            () -> new BucketItem(ModFluids.GLOW_BERRY_JUICE_FLUID,
                    new Item.Properties().tab(ItemGroupTAN.INSTANCE).stacksTo(1)));

    public static final RegistryObject<Item> MELON_JUICE_BUCKET = ITEMS.register("melon_juice_fluid_bucket",
            () -> new BucketItem(ModFluids.MELON_JUICE_FLUID,
                    new Item.Properties().tab(ItemGroupTAN.INSTANCE).stacksTo(1)));

    public static final RegistryObject<Item> PUMPKIN_JUICE_BUCKET = ITEMS.register("pumpkin_juice_fluid_bucket",
            () -> new BucketItem(ModFluids.PUMPKIN_JUICE_FLUID,
                    new Item.Properties().tab(ItemGroupTAN.INSTANCE).stacksTo(1)));

    public static final RegistryObject<Item> SWEET_BERRY_JUICE_BUCKET = ITEMS.register("sweet_berry_juice_fluid_bucket",
            () -> new BucketItem(ModFluids.SWEET_BERRY_JUICE_FLUID,
                    new Item.Properties().tab(ItemGroupTAN.INSTANCE).stacksTo(1)));

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }
}
