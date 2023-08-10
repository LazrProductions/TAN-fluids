package com.lazrproductions.tanfluids;

import com.lazrproductions.tanfluids.init.ModFluids;
import com.lazrproductions.tanfluids.init.ModItems;
import com.mojang.logging.LogUtils;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import org.slf4j.Logger;

@Mod(TanFluidsMod.MODID)
public class TanFluidsMod
{
    public static final String MODID = "tanfluids";
    public static final String VERSION = "1.1.1";
    private static final Logger LOGGER = LogUtils.getLogger();

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, TanFluidsMod.MODID);

    public TanFluidsMod()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::commonSetup);

        BLOCKS.register(modEventBus);
        ModItems.register(modEventBus);

        ModFluids.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        LOGGER.info("Setting up Tough as Nails Fluids ("+MODID+") v"+VERSION);
    }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            ItemBlockRenderTypes.setRenderLayer(ModFluids.DIRTY_WATER_FLUID.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.DIRTY_WATER_FLUID_FLOWING.get(), RenderType.translucent());

            ItemBlockRenderTypes.setRenderLayer(ModFluids.PURIFIED_WATER_FLUID.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.PURIFIED_WATER_FLUID.get(), RenderType.translucent());

            ItemBlockRenderTypes.setRenderLayer(ModFluids.APPLE_JUICE_FLUID.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.APPLE_JUICE_FLUID.get(), RenderType.translucent());

            ItemBlockRenderTypes.setRenderLayer(ModFluids.CACTUS_JUICE_FLUID.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.CACTUS_JUICE_FLUID.get(), RenderType.translucent());

            ItemBlockRenderTypes.setRenderLayer(ModFluids.CHORUS_FRUIT_JUICE_FLUID.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.CHORUS_FRUIT_JUICE_FLUID.get(), RenderType.translucent());

            ItemBlockRenderTypes.setRenderLayer(ModFluids.GLOW_BERRY_JUICE_FLUID.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.GLOW_BERRY_JUICE_FLUID.get(), RenderType.translucent());

            ItemBlockRenderTypes.setRenderLayer(ModFluids.MELON_JUICE_FLUID.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.MELON_JUICE_FLUID.get(), RenderType.translucent());

            ItemBlockRenderTypes.setRenderLayer(ModFluids.PUMPKIN_JUICE_FLUID.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.PUMPKIN_JUICE_FLUID.get(), RenderType.translucent());

            ItemBlockRenderTypes.setRenderLayer(ModFluids.SWEET_BERRY_JUICE_FLUID.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.SWEET_BERRY_JUICE_FLUID.get(), RenderType.translucent());
        }
    }
}
