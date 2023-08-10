package com.lazrproductions.tanfluids.init;

import com.lazrproductions.tanfluids.TanFluidsMod;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluids {
        public static final ResourceLocation WATER_STILL_RL = new ResourceLocation("block/water_still");
        public static final ResourceLocation WATER_FLOWING_RL = new ResourceLocation("block/water_flow");
        public static final ResourceLocation WATER_OVERLAY_RL = new ResourceLocation("block/water_overlay");

        public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS,
                        TanFluidsMod.MODID);

        ///// DIRTY_WATER
        public static final RegistryObject<FlowingFluid> DIRTY_WATER_FLUID = FLUIDS.register("dirty_water_fluid",
                        () -> new ForgeFlowingFluid.Source(ModFluids.DIRTY_WATER_PROPERTIES));
        public static final RegistryObject<FlowingFluid> DIRTY_WATER_FLUID_FLOWING = FLUIDS.register(
                        "dirty_water_fluid_flowing",
                        () -> new ForgeFlowingFluid.Flowing(ModFluids.DIRTY_WATER_PROPERTIES));

        public static final ForgeFlowingFluid.Properties DIRTY_WATER_PROPERTIES = new ForgeFlowingFluid.Properties(
                        () -> DIRTY_WATER_FLUID.get(), () -> DIRTY_WATER_FLUID_FLOWING.get(),
                        FluidAttributes.builder(WATER_STILL_RL, WATER_FLOWING_RL).density(1).luminosity(2).viscosity(10)
                                        .sound(SoundEvents.BUCKET_FILL, SoundEvents.BUCKET_EMPTY).color(0xD9415343)
                                        .overlay(WATER_OVERLAY_RL))
                        .levelDecreasePerBlock(1)
                        .slopeFindDistance(4)
                        .block(() -> ModFluids.DIRTY_WATER_BLOCK.get());

        public static final RegistryObject<LiquidBlock> DIRTY_WATER_BLOCK = TanFluidsMod.BLOCKS.register(
                        "dirty_water_fluid",
                        () -> new LiquidBlock(() -> ModFluids.DIRTY_WATER_FLUID.get(),
                                        BlockBehaviour.Properties.of(Material.WATER).noCollission().strength(100f)
                                                        .noDrops().noOcclusion()));
        /////

        ///// PURIFIED_WATER
        public static final RegistryObject<FlowingFluid> PURIFIED_WATER_FLUID = FLUIDS.register("purified_water_fluid",
                        () -> new ForgeFlowingFluid.Source(ModFluids.PURIFIED_WATER_PROPERTIES));
        public static final RegistryObject<FlowingFluid> PURIFIED_WATER_FLUID_FLOWING = FLUIDS.register(
                        "purified_water_fluid_flowing",
                        () -> new ForgeFlowingFluid.Flowing(ModFluids.PURIFIED_WATER_PROPERTIES));

        public static final ForgeFlowingFluid.Properties PURIFIED_WATER_PROPERTIES = new ForgeFlowingFluid.Properties(
                        () -> PURIFIED_WATER_FLUID.get(), () -> PURIFIED_WATER_FLUID_FLOWING.get(),
                        FluidAttributes.builder(WATER_STILL_RL, WATER_FLOWING_RL).density(1).luminosity(2).viscosity(10)
                                        .sound(SoundEvents.BUCKET_FILL, SoundEvents.BUCKET_EMPTY).color(0xD92f91ab)
                                        .overlay(WATER_OVERLAY_RL))
                        .levelDecreasePerBlock(1)
                        .slopeFindDistance(4)
                        .block(() -> ModFluids.PURIFIED_WATER_BLOCK.get());

        public static final RegistryObject<LiquidBlock> PURIFIED_WATER_BLOCK = TanFluidsMod.BLOCKS.register(
                        "purified_water_fluid",
                        () -> new LiquidBlock(() -> ModFluids.PURIFIED_WATER_FLUID.get(),
                                        BlockBehaviour.Properties.of(Material.WATER).noCollission().strength(100f)
                                                        .noDrops().noOcclusion()));
        /////

        ///// APPLE_JUICE
        public static final RegistryObject<FlowingFluid> APPLE_JUICE_FLUID = FLUIDS.register("apple_juice_fluid",
                        () -> new ForgeFlowingFluid.Source(ModFluids.APPLE_JUICE_PROPERTIES));
        public static final RegistryObject<FlowingFluid> APPLE_JUICE_FLUID_FLOWING = FLUIDS.register(
                        "apple_juice_fluid_flowing",
                        () -> new ForgeFlowingFluid.Flowing(ModFluids.APPLE_JUICE_PROPERTIES));

        public static final ForgeFlowingFluid.Properties APPLE_JUICE_PROPERTIES = new ForgeFlowingFluid.Properties(
                        () -> APPLE_JUICE_FLUID.get(), () -> APPLE_JUICE_FLUID_FLOWING.get(),
                        FluidAttributes.builder(WATER_STILL_RL, WATER_FLOWING_RL).density(1).luminosity(2).viscosity(10)
                                        .sound(SoundEvents.BUCKET_FILL, SoundEvents.BUCKET_EMPTY).color(0xD99c9e52)
                                        .overlay(WATER_OVERLAY_RL))
                        .levelDecreasePerBlock(1)
                        .slopeFindDistance(4)
                        .block(() -> ModFluids.APPLE_JUICE_BLOCK.get());

        public static final RegistryObject<LiquidBlock> APPLE_JUICE_BLOCK = TanFluidsMod.BLOCKS.register(
                        "apple_juice_fluid",
                        () -> new LiquidBlock(() -> ModFluids.APPLE_JUICE_FLUID.get(),
                                        BlockBehaviour.Properties.of(Material.WATER).noCollission().strength(100f)
                                                        .noDrops().noOcclusion()));
        /////

        ///// CACTUS_JUICE
        public static final RegistryObject<FlowingFluid> CACTUS_JUICE_FLUID = FLUIDS.register("cactus_juice_fluid",
                        () -> new ForgeFlowingFluid.Source(ModFluids.CACTUS_JUICE_PROPERTIES));
        public static final RegistryObject<FlowingFluid> CACTUS_JUICE_FLUID_FLOWING = FLUIDS.register(
                        "cactus_juice_fluid_flowing",
                        () -> new ForgeFlowingFluid.Flowing(ModFluids.CACTUS_JUICE_PROPERTIES));

        public static final ForgeFlowingFluid.Properties CACTUS_JUICE_PROPERTIES = new ForgeFlowingFluid.Properties(
                        () -> CACTUS_JUICE_FLUID.get(), () -> CACTUS_JUICE_FLUID_FLOWING.get(),
                        FluidAttributes.builder(WATER_STILL_RL, WATER_FLOWING_RL).density(1).luminosity(2).viscosity(10)
                                        .sound(SoundEvents.BUCKET_FILL, SoundEvents.BUCKET_EMPTY).color(0xD94b8038)
                                        .overlay(WATER_OVERLAY_RL))
                        .levelDecreasePerBlock(1)
                        .slopeFindDistance(4)
                        .block(() -> ModFluids.CACTUS_JUICE_BLOCK.get());

        public static final RegistryObject<LiquidBlock> CACTUS_JUICE_BLOCK = TanFluidsMod.BLOCKS.register(
                        "cactus_juice_fluid",
                        () -> new LiquidBlock(() -> ModFluids.CACTUS_JUICE_FLUID.get(),
                                        BlockBehaviour.Properties.of(Material.WATER).noCollission().strength(100f)
                                                        .noDrops().noOcclusion()));
        /////

        ///// CHORUS_FRUIT_JUICE
        public static final RegistryObject<FlowingFluid> CHORUS_FRUIT_JUICE_FLUID = FLUIDS.register(
                        "chorus_fruit_juice_fluid",
                        () -> new ForgeFlowingFluid.Source(ModFluids.CHORUS_FRUIT_JUICE_PROPERTIES));
        public static final RegistryObject<FlowingFluid> CHORUS_FRUIT_JUICE_FLUID_FLOWING = FLUIDS.register(
                        "chorus_fruit_juice_fluid_flowing",
                        () -> new ForgeFlowingFluid.Flowing(ModFluids.CHORUS_FRUIT_JUICE_PROPERTIES));

        public static final ForgeFlowingFluid.Properties CHORUS_FRUIT_JUICE_PROPERTIES = new ForgeFlowingFluid.Properties(
                        () -> CHORUS_FRUIT_JUICE_FLUID.get(), () -> CHORUS_FRUIT_JUICE_FLUID_FLOWING.get(),
                        FluidAttributes.builder(WATER_STILL_RL, WATER_FLOWING_RL).density(1).luminosity(2).viscosity(10)
                                        .sound(SoundEvents.BUCKET_FILL, SoundEvents.BUCKET_EMPTY).color(0xD985578e)
                                        .overlay(WATER_OVERLAY_RL))
                        .levelDecreasePerBlock(1)
                        .slopeFindDistance(4)
                        .block(() -> ModFluids.CHORUS_FRUIT_JUICE_BLOCK.get());

        public static final RegistryObject<LiquidBlock> CHORUS_FRUIT_JUICE_BLOCK = TanFluidsMod.BLOCKS.register(
                        "chorus_fruit_juice_fluid",
                        () -> new LiquidBlock(() -> ModFluids.CHORUS_FRUIT_JUICE_FLUID.get(),
                                        BlockBehaviour.Properties.of(Material.WATER).noCollission().strength(100f)
                                                        .noDrops().noOcclusion()));
        /////

        ///// GLOW_BERRY_JUICE
        public static final RegistryObject<FlowingFluid> GLOW_BERRY_JUICE_FLUID = FLUIDS.register(
                        "glow_berry_juice_fluid",
                        () -> new ForgeFlowingFluid.Source(ModFluids.GLOW_BERRY_JUICE_PROPERTIES));
        public static final RegistryObject<FlowingFluid> GLOW_BERRY_JUICE_FLUID_FLOWING = FLUIDS.register(
                        "glow_berry_juice_fluid_flowing",
                        () -> new ForgeFlowingFluid.Flowing(ModFluids.GLOW_BERRY_JUICE_PROPERTIES));

        public static final ForgeFlowingFluid.Properties GLOW_BERRY_JUICE_PROPERTIES = new ForgeFlowingFluid.Properties(
                        () -> GLOW_BERRY_JUICE_FLUID.get(), () -> GLOW_BERRY_JUICE_FLUID_FLOWING.get(),
                        FluidAttributes.builder(WATER_STILL_RL, WATER_FLOWING_RL).density(1).luminosity(2).viscosity(10)
                                        .sound(SoundEvents.BUCKET_FILL, SoundEvents.BUCKET_EMPTY).color(0xD9ab9f0f)
                                        .overlay(WATER_OVERLAY_RL))
                        .levelDecreasePerBlock(1)
                        .slopeFindDistance(4)
                        .block(() -> ModFluids.GLOW_BERRY_JUICE_BLOCK.get());

        public static final RegistryObject<LiquidBlock> GLOW_BERRY_JUICE_BLOCK = TanFluidsMod.BLOCKS.register(
                        "glow_berry_juice_fluid",
                        () -> new LiquidBlock(() -> ModFluids.GLOW_BERRY_JUICE_FLUID.get(),
                                        BlockBehaviour.Properties.of(Material.WATER).noCollission().strength(100f)
                                                        .noDrops().noOcclusion()));
        /////

        ///// MELON_JUICE
        public static final RegistryObject<FlowingFluid> MELON_JUICE_FLUID = FLUIDS.register(
                        "melon_juice_fluid",
                        () -> new ForgeFlowingFluid.Source(ModFluids.MELON_JUICE_PROPERTIES));
        public static final RegistryObject<FlowingFluid> MELON_JUICE_FLUID_FLOWING = FLUIDS.register(
                        "melon_juice_fluid_flowing",
                        () -> new ForgeFlowingFluid.Flowing(ModFluids.MELON_JUICE_PROPERTIES));

        public static final ForgeFlowingFluid.Properties MELON_JUICE_PROPERTIES = new ForgeFlowingFluid.Properties(
                        () -> MELON_JUICE_FLUID.get(), () -> MELON_JUICE_FLUID_FLOWING.get(),
                        FluidAttributes.builder(WATER_STILL_RL, WATER_FLOWING_RL).density(1).luminosity(2).viscosity(10)
                                        .sound(SoundEvents.BUCKET_FILL, SoundEvents.BUCKET_EMPTY).color(0xD9992b31)
                                        .overlay(WATER_OVERLAY_RL))
                        .levelDecreasePerBlock(1)
                        .slopeFindDistance(4)
                        .block(() -> ModFluids.MELON_JUICE_BLOCK.get());

        public static final RegistryObject<LiquidBlock> MELON_JUICE_BLOCK = TanFluidsMod.BLOCKS.register(
                        "melon_juice_fluid",
                        () -> new LiquidBlock(() -> ModFluids.MELON_JUICE_FLUID.get(),
                                        BlockBehaviour.Properties.of(Material.WATER).noCollission().strength(100f)
                                                        .noDrops().noOcclusion()));
        /////

        ///// PUMPKIN_JUICE
        public static final RegistryObject<FlowingFluid> PUMPKIN_JUICE_FLUID = FLUIDS.register(
                        "pumpkin_juice_fluid",
                        () -> new ForgeFlowingFluid.Source(ModFluids.PUMPKIN_JUICE_PROPERTIES));
        public static final RegistryObject<FlowingFluid> PUMPKIN_JUICE_FLUID_FLOWING = FLUIDS.register(
                        "pumpkin_juice_fluid_flowing",
                        () -> new ForgeFlowingFluid.Flowing(ModFluids.PUMPKIN_JUICE_PROPERTIES));

        public static final ForgeFlowingFluid.Properties PUMPKIN_JUICE_PROPERTIES = new ForgeFlowingFluid.Properties(
                        () -> PUMPKIN_JUICE_FLUID.get(), () -> PUMPKIN_JUICE_FLUID_FLOWING.get(),
                        FluidAttributes.builder(WATER_STILL_RL, WATER_FLOWING_RL).density(1).luminosity(2).viscosity(10)
                                        .sound(SoundEvents.BUCKET_FILL, SoundEvents.BUCKET_EMPTY).color(0xD9925633)
                                        .overlay(WATER_OVERLAY_RL))
                        .levelDecreasePerBlock(1)
                        .slopeFindDistance(4)
                        .block(() -> ModFluids.PUMPKIN_JUICE_BLOCK.get());

        public static final RegistryObject<LiquidBlock> PUMPKIN_JUICE_BLOCK = TanFluidsMod.BLOCKS.register(
                        "pumpkin_juice_fluid",
                        () -> new LiquidBlock(() -> ModFluids.PUMPKIN_JUICE_FLUID.get(),
                                        BlockBehaviour.Properties.of(Material.WATER).noCollission().strength(100f)
                                                        .noDrops().noOcclusion()));
        /////

        ///// SWEET_BERRY_JUCIE
        public static final RegistryObject<FlowingFluid> SWEET_BERRY_JUICE_FLUID = FLUIDS.register(
                        "sweet_berry_juice_fluid",
                        () -> new ForgeFlowingFluid.Source(ModFluids.SWEET_BERRY_JUICE_PROPERTIES));
        public static final RegistryObject<FlowingFluid> SWEET_BERRY_JUICE_FLUID_FLOWING = FLUIDS.register(
                        "sweet_berry_juice_fluid_flowing",
                        () -> new ForgeFlowingFluid.Flowing(ModFluids.SWEET_BERRY_JUICE_PROPERTIES));

        public static final ForgeFlowingFluid.Properties SWEET_BERRY_JUICE_PROPERTIES = new ForgeFlowingFluid.Properties(
                        () -> SWEET_BERRY_JUICE_FLUID.get(), () -> SWEET_BERRY_JUICE_FLUID_FLOWING.get(),
                        FluidAttributes.builder(WATER_STILL_RL, WATER_FLOWING_RL).density(1).luminosity(2).viscosity(10)
                                        .sound(SoundEvents.BUCKET_FILL, SoundEvents.BUCKET_EMPTY).color(0xD95b0809)
                                        .overlay(WATER_OVERLAY_RL))
                        .levelDecreasePerBlock(1)
                        .slopeFindDistance(4)
                        .block(() -> ModFluids.SWEET_BERRY_JUICE_BLOCK.get());

        public static final RegistryObject<LiquidBlock> SWEET_BERRY_JUICE_BLOCK = TanFluidsMod.BLOCKS.register(
                        "sweet_berry_juice_fluid",
                        () -> new LiquidBlock(() -> ModFluids.SWEET_BERRY_JUICE_FLUID.get(),
                                        BlockBehaviour.Properties.of(Material.WATER).noCollission().strength(100f)
                                                        .noDrops().noOcclusion()));
        /////

        public static void register(IEventBus bus) {
                FLUIDS.register(bus);
        }
}
