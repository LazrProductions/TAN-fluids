package com.lazrproductions.tanfluids.fluid;

import com.lazrproductions.tanfluids.TanFluidsMod;
import org.joml.Vector3f;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.common.SoundActions;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TanFluidsRegistry {
    public static final DeferredRegister<FluidType> FLUID_TYPES = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, TanFluidsMod.MODID);
    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, TanFluidsMod.MODID);

    // default water-like fluid properties for easier editing
    public static final WaterLikeFluidType.Properties defaultFluidProperties = WaterLikeFluidType.Properties.create()
        .fallDistanceModifier(0F)
        .canExtinguish(true)
        .canConvertToSource(false)
        .supportsBoating(true)
        .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
        .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY)
        .sound(SoundActions.FLUID_VAPORIZE, SoundEvents.FIRE_EXTINGUISH)
        .motionScale(0.008f)
        .canHydrate(false)
        .canPushEntity(true)
        .canSwim(true);
    // the default additional properties for a water-like fluid
    public static final FluidRegistryContainer.AdditionalProperties defaultAdditionalProperties = new FluidRegistryContainer.AdditionalProperties(){};
    // default Item Properties for bucket items
    public static final Item.Properties defaultBucketProperties = new Item.Properties()
    .stacksTo(1)
    .craftRemainder(Items.BUCKET);

    /// REGISTER FLUIDS
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static final FluidRegistryContainer DIRTY_WATER_FLUID = new FluidRegistryContainer(    
        "dirty_water_fluid",
        defaultFluidProperties,
        0xD9FFFFFF,
        new Vector3f(14f / 255f, 14f / 255f, 9f / 255f),
        defaultAdditionalProperties,
        BlockBehaviour.Properties.copy(Blocks.WATER),
        defaultBucketProperties
    );
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static final FluidRegistryContainer PURIFIED_WATER_FLUID = new FluidRegistryContainer(
        "purified_water_fluid",
        defaultFluidProperties,
        0xD9FFFFFF,
        new Vector3f(14f / 255f, 14f / 255f, 9f / 255f),
        defaultAdditionalProperties,
        BlockBehaviour.Properties.copy(Blocks.WATER),
        defaultBucketProperties
    );
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static final FluidRegistryContainer APPLE_JUICE_FLUID = new FluidRegistryContainer(
        "apple_juice_fluid",
        defaultFluidProperties,
        0xD9FFFFFF,
        new Vector3f(14f / 255f, 14f / 255f, 9f / 255f),
        defaultAdditionalProperties,
        BlockBehaviour.Properties.copy(Blocks.WATER),
        defaultBucketProperties
    );
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static final FluidRegistryContainer CACTUS_JUICE_FLUID = new FluidRegistryContainer(
        "cactus_juice_fluid",
        defaultFluidProperties,
        0xD9FFFFFF,
        new Vector3f(14f / 255f, 14f / 255f, 9f / 255f),
        defaultAdditionalProperties,
        BlockBehaviour.Properties.copy(Blocks.WATER),
        defaultBucketProperties
    );
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static final FluidRegistryContainer CHORUS_FRUIT_JUICE_FLUID = new FluidRegistryContainer(
        "chorus_fruit_juice_fluid",
        defaultFluidProperties,
        0xD9FFFFFF,
        new Vector3f(14f / 255f, 14f / 255f, 9f / 255f),
        defaultAdditionalProperties,
        BlockBehaviour.Properties.copy(Blocks.WATER),
        defaultBucketProperties
    );
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static final FluidRegistryContainer GLOW_BERRY_JUICE_FLUID = new FluidRegistryContainer(
        "glow_berry_juice_fluid",
        defaultFluidProperties,
        0xD9FFFFFF,
        new Vector3f(14f / 255f, 14f / 255f, 9f / 255f),
        defaultAdditionalProperties,
        BlockBehaviour.Properties.copy(Blocks.WATER),
        defaultBucketProperties
    );
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static final FluidRegistryContainer MELON_JUICE_FLUID = new FluidRegistryContainer(
        "melon_juice_fluid",
        defaultFluidProperties,
        0xD9FFFFFF,
        new Vector3f(14f / 255f, 14f / 255f, 9f / 255f),
        defaultAdditionalProperties,
        BlockBehaviour.Properties.copy(Blocks.WATER),
        defaultBucketProperties
    );
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static final FluidRegistryContainer PUMPKIN_JUICE_FLUID = new FluidRegistryContainer(
        "pumpkin_juice_fluid",
        defaultFluidProperties,
        0xD9FFFFFF,
        new Vector3f(14f / 255f, 14f / 255f, 9f / 255f),
        defaultAdditionalProperties,
        BlockBehaviour.Properties.copy(Blocks.WATER),
        defaultBucketProperties
    );
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static final FluidRegistryContainer SWEET_BERRY_JUICE_FLUID = new FluidRegistryContainer(
        "sweet_berry_juice_fluid",
        defaultFluidProperties,
        0xD9FFFFFF,
        new Vector3f(14f / 255f, 14f / 255f, 9f / 255f),
        defaultAdditionalProperties,
        BlockBehaviour.Properties.copy(Blocks.WATER),
        defaultBucketProperties
    );

    public static void register(IEventBus bus) {
        FLUID_TYPES.register(bus);
        FLUIDS.register(bus);
    }
}
