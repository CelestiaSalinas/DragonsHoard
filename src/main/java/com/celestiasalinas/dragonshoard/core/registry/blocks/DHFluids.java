package com.celestiasalinas.dragonshoard.core.registry.blocks;

import com.celestiasalinas.dragonshoard.core.DragonsHoard;
import com.celestiasalinas.dragonshoard.core.registry.items.DHItems;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.block.material.Material;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.Rarity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.ToIntFunction;

public class DHFluids {

    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, DragonsHoard.MOD_ID);
    //public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, DragonsHoard.MOD_ID);

    public static ToIntFunction<BlockState> lightLevel = BlockState -> 15;

    public static final ResourceLocation BLUE_LAVA_STILL_RL = new ResourceLocation(DragonsHoard.MOD_ID, "block/blue_lava_still");
    public static final ResourceLocation BLUE_LAVA_FLOWING_RL = new ResourceLocation(DragonsHoard.MOD_ID, "block/blue_lava_flow");
    public static final ResourceLocation BLUE_LAVA_OVERLAY_RL = new ResourceLocation(DragonsHoard.MOD_ID, "block/blue_lava_overlay");



    public static final RegistryObject<FlowingFluid> BLUE_LAVA_FLUID = FLUIDS.register("blue_lava_fluid", () -> new ForgeFlowingFluid.Source(DHFluids.BLUE_LAVA_PROPERTIES));
    public static final RegistryObject<FlowingFluid> BLUE_LAVA_FLOWING = FLUIDS.register("blue_lava_flow", () -> new ForgeFlowingFluid.Flowing(DHFluids.BLUE_LAVA_PROPERTIES));

    public static final ForgeFlowingFluid.Properties BLUE_LAVA_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> BLUE_LAVA_FLUID.get(), () -> BLUE_LAVA_FLOWING.get(), FluidAttributes.builder(BLUE_LAVA_STILL_RL, BLUE_LAVA_FLOWING_RL)
            .density(15).luminosity(2).rarity(Rarity.RARE).sound(SoundEvents.LAVA_AMBIENT).overlay(BLUE_LAVA_OVERLAY_RL)
            .viscosity(5)).slopeFindDistance(3).levelDecreasePerBlock(3)
            .block(() -> DHFluids.BLUE_LAVA_BLOCK.get()).bucket(() -> DHItems.BLUE_LAVA_BUCKET.get());


    public static final RegistryObject<FlowingFluidBlock> BLUE_LAVA_BLOCK = DHBlocks.BLOCKS.register("blue_lava",
            () -> new FlowingFluidBlock(() -> DHFluids.BLUE_LAVA_FLUID.get(), AbstractBlock.Properties.of(Material.LAVA).lightLevel(lightLevel).noDrops()));





}
