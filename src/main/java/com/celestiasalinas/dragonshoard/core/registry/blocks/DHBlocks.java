package com.celestiasalinas.dragonshoard.core.registry.blocks;

import com.celestiasalinas.dragonshoard.core.DragonsHoard;
import com.celestiasalinas.dragonshoard.core.objects.ShinyBlock;
import com.celestiasalinas.dragonshoard.core.registry.particles.ParticleRegistry;
import net.minecraft.block.*;
import net.minecraft.block.AbstractBlock.Properties;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.DyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Rarity;
import net.minecraft.potion.Effects;
import net.minecraft.state.properties.BedPart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Util;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.lighting.LightEngine;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Random;
import java.util.function.ToIntFunction;

@Mod.EventBusSubscriber(modid = DragonsHoard.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DHBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, DragonsHoard.MOD_ID);
    public static ToIntFunction<BlockState> lightLevel = BlockState -> 15;

    public static final RegistryObject<Block> ROSE_GOLD_BLOCK = BLOCKS.register("rose_gold_block", () -> new Block(Block.Properties.of(Material.METAL, MaterialColor.COLOR_PINK).strength(5).sound(SoundType.METAL).harvestLevel(1).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<Block> WHITE_GOLD_BLOCK = BLOCKS.register("white_gold_block", () -> new Block(Block.Properties.of(Material.METAL, MaterialColor.COLOR_YELLOW).strength(5).sound(SoundType.METAL).harvestLevel(1).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<Block> BLUE_GOLD_BLOCK = BLOCKS.register("blue_gold_block", () -> new Block(Block.Properties.of(Material.METAL, MaterialColor.COLOR_BLUE).strength(5).sound(SoundType.METAL).harvestLevel(1).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<Block> STAR_BLUE_GOLD_BLOCK = BLOCKS.register("star_blue_gold_block", () -> new ShinyBlock(Block.Properties.of(Material.METAL, MaterialColor.COLOR_PURPLE).strength(5).sound(SoundType.METAL).lightLevel(lightLevel).harvestLevel(1).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<Block> SILVER_BLOCK = BLOCKS.register("silver_block", () -> new Block(Block.Properties.of(Material.METAL, MaterialColor.COLOR_BLUE).strength(5).sound(SoundType.METAL).harvestLevel(1).harvestTool(ToolType.PICKAXE)));





    // public static final RegistryObject<Block> TEMPLATE_BLOCK = HELPER.createBlock("template_block", () -> new Block(Block.Properties.from(Blocks.STONE))), ItemGroup.BUILDING_BLOCKS);

}
