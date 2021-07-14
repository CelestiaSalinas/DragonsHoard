package com.celestiasalinas.dragonshoard.core.registry.blocks;

import com.celestiasalinas.dragonshoard.core.DragonsHoard;
import com.celestiasalinas.dragonshoard.core.objects.HeatedBlock;
import com.celestiasalinas.dragonshoard.core.objects.Shell;
import com.celestiasalinas.dragonshoard.core.objects.ShinyBlock;
//import com.celestiasalinas.dragonshoard.core.registry.particles.ParticleRegistry;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = DragonsHoard.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DHBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, DragonsHoard.MOD_ID);

    private static boolean always(BlockState p_235426_0_, IBlockReader p_235426_1_, BlockPos p_235426_2_) {
        return true;
    }

    // metals
    public static final RegistryObject<Block> ROSE_GOLD_BLOCK = BLOCKS.register("rose_gold_block", () -> new Block(Block.Properties.of(Material.METAL, MaterialColor.COLOR_PINK).strength(5).sound(SoundType.METAL).harvestLevel(1).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<Block> WHITE_GOLD_BLOCK = BLOCKS.register("white_gold_block", () -> new Block(Block.Properties.of(Material.METAL, MaterialColor.COLOR_YELLOW).strength(5).sound(SoundType.METAL).harvestLevel(1).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<Block> BLUE_GOLD_BLOCK = BLOCKS.register("blue_gold_block", () -> new Block(Block.Properties.of(Material.METAL, MaterialColor.COLOR_BLUE).strength(5).sound(SoundType.METAL).harvestLevel(1).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<Block> STAR_BLUE_GOLD_BLOCK = BLOCKS.register("star_blue_gold_block", () -> new ShinyBlock(Block.Properties.of(Material.METAL, MaterialColor.COLOR_PURPLE).strength(5).sound(SoundType.METAL).lightLevel((p_235469_0_) -> { return 15; }).harvestLevel(1).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<Block> SILVER_BLOCK = BLOCKS.register("silver_block", () -> new Block(Block.Properties.of(Material.METAL, MaterialColor.COLOR_BLUE).strength(5).sound(SoundType.METAL).harvestLevel(1).harvestTool(ToolType.PICKAXE)));
    // gem blocks
    public static final RegistryObject<Block> ROSE_QUARTZ_BLOCK = BLOCKS.register("rose_quartz_block", () -> new Block(Block.Properties.of(Material.STONE, MaterialColor.COLOR_PINK).strength(5).sound(SoundType.STONE).harvestLevel(1).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<Block> IOLITE_BLOCK = BLOCKS.register("iolite_block", () -> new Block(Block.Properties.of(Material.STONE, MaterialColor.COLOR_PINK).strength(5).sound(SoundType.STONE).harvestLevel(1).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<Block> DIAMOND_BLOCK = BLOCKS.register("diamond_block", () -> new Block(Block.Properties.of(Material.STONE, MaterialColor.COLOR_GRAY).strength(5).sound(SoundType.STONE).harvestLevel(1).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<Block> SAPPHIRE_BLOCK = BLOCKS.register("sapphire_block", () -> new Block(Block.Properties.of(Material.STONE, MaterialColor.COLOR_BLUE).strength(5).sound(SoundType.STONE).harvestLevel(1).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", () -> new Block(Block.Properties.of(Material.STONE, MaterialColor.COLOR_RED).strength(5).sound(SoundType.STONE).harvestLevel(1).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<Block> OPAL_BLOCK = BLOCKS.register("opal_block", () -> new Block(Block.Properties.of(Material.STONE, MaterialColor.COLOR_GRAY).strength(5).sound(SoundType.STONE).harvestLevel(1).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<Block> EMERALD_BLOCK = BLOCKS.register("emerald_block", () -> new Block(Block.Properties.of(Material.STONE, MaterialColor.COLOR_GREEN).strength(5).sound(SoundType.STONE).harvestLevel(1).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<Block> TOPAZ_BLOCK = BLOCKS.register("topaz_block", () -> new Block(Block.Properties.of(Material.STONE, MaterialColor.COLOR_YELLOW).strength(5).sound(SoundType.STONE).harvestLevel(1).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<Block> CITRINE_BLOCK = BLOCKS.register("citrine_block", () -> new Block(Block.Properties.of(Material.STONE, MaterialColor.COLOR_ORANGE).strength(5).sound(SoundType.STONE).harvestLevel(1).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<Block> ALEXANDRITE_BLOCK = BLOCKS.register("alexandrite_block", () -> new Block(Block.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_BLUE).strength(5).sound(SoundType.STONE).harvestLevel(1).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<Block> TANZANITE_BLOCK = BLOCKS.register("tanzanite_block", () -> new Block(Block.Properties.of(Material.STONE, MaterialColor.COLOR_PURPLE).strength(5).sound(SoundType.STONE).harvestLevel(1).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<Block> SODALITE_BLOCK = BLOCKS.register("sodalite_block", () -> new Block(Block.Properties.of(Material.STONE, MaterialColor.COLOR_BLUE).strength(5).sound(SoundType.STONE).harvestLevel(1).harvestTool(ToolType.PICKAXE)));
    // silver gem blocks
    public static final RegistryObject<Block> ROSE_QUARTZ_BLOCK_SILVER = BLOCKS.register("rose_quartz_block_silver", () -> new Block(Block.Properties.of(Material.STONE, MaterialColor.COLOR_PINK).strength(5).sound(SoundType.STONE).harvestLevel(1).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<Block> IOLITE_BLOCK_SILVER = BLOCKS.register("iolite_block_silver", () -> new Block(Block.Properties.of(Material.STONE, MaterialColor.COLOR_PINK).strength(5).sound(SoundType.STONE).harvestLevel(1).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<Block> DIAMOND_BLOCK_SILVER = BLOCKS.register("diamond_block_silver", () -> new Block(Block.Properties.of(Material.STONE, MaterialColor.COLOR_GRAY).strength(5).sound(SoundType.STONE).harvestLevel(1).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<Block> SAPPHIRE_BLOCK_SILVER = BLOCKS.register("sapphire_block_silver", () -> new Block(Block.Properties.of(Material.STONE, MaterialColor.COLOR_BLUE).strength(5).sound(SoundType.STONE).harvestLevel(1).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<Block> RUBY_BLOCK_SILVER = BLOCKS.register("ruby_block_silver", () -> new Block(Block.Properties.of(Material.STONE, MaterialColor.COLOR_RED).strength(5).sound(SoundType.STONE).harvestLevel(1).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<Block> OPAL_BLOCK_SILVER = BLOCKS.register("opal_block_silver", () -> new Block(Block.Properties.of(Material.STONE, MaterialColor.COLOR_GRAY).strength(5).sound(SoundType.STONE).harvestLevel(1).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<Block> EMERALD_BLOCK_SILVER = BLOCKS.register("emerald_block_silver", () -> new Block(Block.Properties.of(Material.STONE, MaterialColor.COLOR_GREEN).strength(5).sound(SoundType.STONE).harvestLevel(1).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<Block> TOPAZ_BLOCK_SILVER = BLOCKS.register("topaz_block_silver", () -> new Block(Block.Properties.of(Material.STONE, MaterialColor.COLOR_YELLOW).strength(5).sound(SoundType.STONE).harvestLevel(1).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<Block> CITRINE_BLOCK_SILVER = BLOCKS.register("citrine_block_silver", () -> new Block(Block.Properties.of(Material.STONE, MaterialColor.COLOR_ORANGE).strength(5).sound(SoundType.STONE).harvestLevel(1).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<Block> ALEXANDRITE_BLOCK_SILVER = BLOCKS.register("alexandrite_block_silver", () -> new Block(Block.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_BLUE).strength(5).sound(SoundType.STONE).harvestLevel(1).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<Block> TANZANITE_BLOCK_SILVER = BLOCKS.register("tanzanite_block_silver", () -> new Block(Block.Properties.of(Material.STONE, MaterialColor.COLOR_PURPLE).strength(5).sound(SoundType.STONE).harvestLevel(1).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<Block> SODALITE_BLOCK_SILVER = BLOCKS.register("sodalite_block_silver", () -> new Block(Block.Properties.of(Material.STONE, MaterialColor.COLOR_BLUE).strength(5).sound(SoundType.STONE).harvestLevel(1).harvestTool(ToolType.PICKAXE)));


    //Alectrona
    public static final RegistryObject<Block> SAPPHIRE_ICE = BLOCKS.register("sapphire_ice", () -> new IceBlock(AbstractBlock.Properties.of(Material.ICE, MaterialColor.COLOR_CYAN).strength(1).harvestLevel(1).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops().sound(SoundType.GLASS)));
    public static final RegistryObject<Block> PACKED_SAPPHIRE_ICE = BLOCKS.register("packed_sapphire_ice", () -> new IceBlock(AbstractBlock.Properties.of(Material.ICE, MaterialColor.COLOR_CYAN).strength(1).harvestLevel(1).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops().sound(SoundType.GLASS)));
    public static final RegistryObject<Block> DIAMOND_ICE = BLOCKS.register("diamond_ice", () -> new IceBlock(AbstractBlock.Properties.of(Material.ICE, MaterialColor.COLOR_CYAN).strength(50).harvestLevel(4).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    //Asteria

    //Camellius

    //Ascelia

    //Shenryu

    //Mira

    public static final RegistryObject<Block> BLUE_MAGMA_BLOCK = BLOCKS.register("blue_magma_block", () -> new HeatedBlock(Block.Properties.of(Material.STONE, MaterialColor.COLOR_BLUE).strength(4).sound(SoundType.STONE).lightLevel((p_235469_0_) -> { return 5; }).harvestLevel(1).harvestTool(ToolType.PICKAXE).hasPostProcess(DHBlocks::always).emissiveRendering(DHBlocks::always)));
    //Aurelius

    //Leviathan
    public static final RegistryObject<Shell> PINK_SHELL = BLOCKS.register("pink_shell", () -> new Shell(AbstractBlock.Properties.of(Material.DECORATION).sound(SoundType.SAND)));
    public static final RegistryObject<Shell> PURPLE_SHELL = BLOCKS.register("purple_shell", () -> new Shell(AbstractBlock.Properties.of(Material.DECORATION).sound(SoundType.SAND)));
    public static final RegistryObject<Shell> BLUE_SHELL = BLOCKS.register("blue_shell", () -> new Shell(AbstractBlock.Properties.of(Material.DECORATION).sound(SoundType.SAND)));

    //Maure

    //Nehsk Eil'Nais

    //Atlas

    //Fomalhaut

    //tests
//    public static final RegistryObject<CustomBlock> CUSTOM_BLOCK = BLOCKS.register("custom_block",
//            () -> new CustomBlock(AbstractBlock.Properties.of(Material.WOOD).harvestTool(ToolType.AXE)
//                    .harvestLevel(1).sound(SoundType.WOOD).requiresCorrectToolForDrops()));







    // public static final RegistryObject<Block> TEMPLATE_BLOCK = HELPER.createBlock("template_block", () -> new Block(Block.Properties.from(Blocks.STONE))), ItemGroup.BUILDING_BLOCKS);

}
