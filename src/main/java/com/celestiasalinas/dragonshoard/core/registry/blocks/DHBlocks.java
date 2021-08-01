package com.celestiasalinas.dragonshoard.core.registry.blocks;

import com.celestiasalinas.dragonshoard.core.DragonsHoard;
import com.celestiasalinas.dragonshoard.core.objects.*;
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

import java.rmi.registry.Registry;

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

    //placeables

    public static final RegistryObject<Block> DIAMOND_BUTTON = BLOCKS.register("diamond_button", () -> new SquareGemButtonBlock(AbstractBlock.Properties.of(Material.DECORATION).sound(SoundType.STONE)));
    public static final RegistryObject<Block> IOLITE_BUTTON = BLOCKS.register("iolite_button", () -> new GemButtonBlock(AbstractBlock.Properties.of(Material.DECORATION).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SODALITE_BUTTON = BLOCKS.register("sodalite_button", () -> new SquareGemButtonBlock(AbstractBlock.Properties.of(Material.DECORATION).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ROSE_QUARTZ_BUTTON = BLOCKS.register("rose_quartz_button", () -> new SquareGemButtonBlock(AbstractBlock.Properties.of(Material.DECORATION).sound(SoundType.STONE)));
    public static final RegistryObject<Block> EMERALD_BUTTON = BLOCKS.register("emerald_button", () -> new GemButtonBlock(AbstractBlock.Properties.of(Material.DECORATION).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SAPPHIRE_BUTTON = BLOCKS.register("sapphire_button", () -> new GemButtonBlock(AbstractBlock.Properties.of(Material.DECORATION).sound(SoundType.STONE)));
    public static final RegistryObject<Block> RUBY_BUTTON = BLOCKS.register("ruby_button", () -> new SquareGemButtonBlock(AbstractBlock.Properties.of(Material.DECORATION).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ALEXANDRITE_BUTTON = BLOCKS.register("alexandrite_button", () -> new SquareGemButtonBlock(AbstractBlock.Properties.of(Material.DECORATION).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CITRINE_BUTTON = BLOCKS.register("citrine_button", () -> new GemButtonBlock(AbstractBlock.Properties.of(Material.DECORATION).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TANZANITE_BUTTON = BLOCKS.register("tanzanite_button", () -> new SquareGemButtonBlock(AbstractBlock.Properties.of(Material.DECORATION).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TOPAZ_BUTTON = BLOCKS.register("topaz_button", () -> new SquareGemButtonBlock(AbstractBlock.Properties.of(Material.DECORATION).sound(SoundType.STONE)));
    public static final RegistryObject<Block> OPAL_BUTTON = BLOCKS.register("opal_button", () -> new SquareGemButtonBlock(AbstractBlock.Properties.of(Material.DECORATION).sound(SoundType.STONE)));

    //crystals

    //charged crystals
    public static final RegistryObject<Block> CHARGED_LIGHTNING_CRYSTAL = BLOCKS.register("charged_lightning_crystal", () -> new LightningCrystalClusterBlock(7, 3, AbstractBlock.Properties.of(Material.DECORATION).sound(SoundType.GLASS).noOcclusion().randomTicks().strength(1.5F).lightLevel((p_152651_) -> { return 15; })));
    public static final RegistryObject<Block> CHARGED_WATER_CRYSTAL = BLOCKS.register("charged_water_crystal", () -> new WaterCrystalClusterBlock(7, 3, AbstractBlock.Properties.of(Material.DECORATION).sound(SoundType.GLASS).noOcclusion().randomTicks().strength(1.5F).lightLevel((p_152651_) -> { return 15; })));
    public static final RegistryObject<Block> CHARGED_ICE_CRYSTAL = BLOCKS.register("charged_ice_crystal", () -> new IceCrystalClusterBlock(7, 3, AbstractBlock.Properties.of(Material.DECORATION).sound(SoundType.GLASS).noOcclusion().randomTicks().strength(1.5F).lightLevel((p_152651_) -> { return 15; })));
    public static final RegistryObject<Block> CHARGED_FIRE_CRYSTAL = BLOCKS.register("charged_fire_crystal", () -> new FireCrystalClusterBlock(7, 3, AbstractBlock.Properties.of(Material.DECORATION).sound(SoundType.GLASS).noOcclusion().randomTicks().strength(1.5F).lightLevel((p_152651_) -> { return 15; })));
    public static final RegistryObject<Block> CHARGED_WIND_CRYSTAL = BLOCKS.register("charged_wind_crystal", () -> new WindCrystalClusterBlock(7, 3, AbstractBlock.Properties.of(Material.DECORATION).sound(SoundType.GLASS).noOcclusion().randomTicks().strength(1.5F).lightLevel((p_152651_) -> { return 15; })));
    public static final RegistryObject<Block> CHARGED_EARTH_CRYSTAL = BLOCKS.register("charged_earth_crystal", () -> new EarthCrystalClusterBlock(7, 3, AbstractBlock.Properties.of(Material.DECORATION).sound(SoundType.GLASS).noOcclusion().randomTicks().strength(1.5F).lightLevel((p_152651_) -> { return 15; })));

    //dead crystals
    public static final RegistryObject<Block> DEAD_LIGHTNING_CRYSTAL = BLOCKS.register("dead_lightning_crystal", () -> new LightningCrystalClusterBlock(7, 3, AbstractBlock.Properties.of(Material.DECORATION).sound(SoundType.GLASS).noOcclusion().randomTicks().strength(1.5F)));
    public static final RegistryObject<Block> DEAD_WATER_CRYSTAL = BLOCKS.register("dead_water_crystal", () -> new WaterCrystalClusterBlock(7, 3, AbstractBlock.Properties.of(Material.DECORATION).sound(SoundType.GLASS).noOcclusion().randomTicks().strength(1.5F)));
    public static final RegistryObject<Block> DEAD_ICE_CRYSTAL = BLOCKS.register("dead_ice_crystal", () -> new IceCrystalClusterBlock(7, 3, AbstractBlock.Properties.of(Material.DECORATION).sound(SoundType.GLASS).noOcclusion().randomTicks().strength(1.5F)));
    public static final RegistryObject<Block> DEAD_FIRE_CRYSTAL = BLOCKS.register("dead_fire_crystal", () -> new FireCrystalClusterBlock(7, 3, AbstractBlock.Properties.of(Material.DECORATION).sound(SoundType.GLASS).noOcclusion().randomTicks().strength(1.5F)));
    public static final RegistryObject<Block> DEAD_WIND_CRYSTAL = BLOCKS.register("dead_wind_crystal", () -> new WindCrystalClusterBlock(7, 3, AbstractBlock.Properties.of(Material.DECORATION).sound(SoundType.GLASS).noOcclusion().randomTicks().strength(1.5F)));
    public static final RegistryObject<Block> DEAD_EARTH_CRYSTAL = BLOCKS.register("dead_earth_crystal", () -> new EarthCrystalClusterBlock(7, 3, AbstractBlock.Properties.of(Material.DECORATION).sound(SoundType.GLASS).noOcclusion().randomTicks().strength(1.5F)));

    //large clusters
    public static final RegistryObject<Block> LARGE_LIGHTNING_CLUSTER = BLOCKS.register("large_lightning_cluster", () -> new LightningCrystalClusterBlock(5, 3, AbstractBlock.Properties.of(Material.DECORATION).sound(SoundType.GLASS).randomTicks().strength(1.5F).lightLevel((p_152639_) -> { return 4; })));
    public static final RegistryObject<Block> LARGE_WATER_CLUSTER = BLOCKS.register("large_water_cluster", () -> new WaterCrystalClusterBlock(5, 3, AbstractBlock.Properties.of(Material.DECORATION).sound(SoundType.GLASS).randomTicks().strength(1.5F).lightLevel((p_152639_) -> { return 4; })));
    public static final RegistryObject<Block> LARGE_ICE_CLUSTER = BLOCKS.register("large_ice_cluster", () -> new IceCrystalClusterBlock(5, 3, AbstractBlock.Properties.of(Material.DECORATION).sound(SoundType.GLASS).randomTicks().strength(1.5F).lightLevel((p_152639_) -> { return 4; })));
    public static final RegistryObject<Block> LARGE_FIRE_CLUSTER = BLOCKS.register("large_fire_cluster", () -> new FireCrystalClusterBlock(5, 3, AbstractBlock.Properties.of(Material.DECORATION).sound(SoundType.GLASS).randomTicks().strength(1.5F).lightLevel((p_152639_) -> { return 4; })));
    public static final RegistryObject<Block> LARGE_WIND_CLUSTER = BLOCKS.register("large_wind_cluster", () -> new WindCrystalClusterBlock(5, 3, AbstractBlock.Properties.of(Material.DECORATION).sound(SoundType.GLASS).randomTicks().strength(1.5F).lightLevel((p_152639_) -> { return 4; })));
    public static final RegistryObject<Block> LARGE_EARTH_CLUSTER = BLOCKS.register("large_earth_cluster", () -> new EarthCrystalClusterBlock(5, 3, AbstractBlock.Properties.of(Material.DECORATION).sound(SoundType.GLASS).randomTicks().strength(1.5F).lightLevel((p_152639_) -> { return 4; })));

    //medium clusters
    public static final RegistryObject<Block> MEDIUM_LIGHTNING_CLUSTER = BLOCKS.register("medium_lightning_cluster", () -> new LightningCrystalClusterBlock(4, 3, AbstractBlock.Properties.of(Material.DECORATION).sound(SoundType.GLASS).randomTicks().strength(1.5F).lightLevel((p_152639_) -> { return 4; })));
    public static final RegistryObject<Block> MEDIUM_WATER_CLUSTER = BLOCKS.register("medium_water_cluster", () -> new WaterCrystalClusterBlock(4, 3, AbstractBlock.Properties.of(Material.DECORATION).sound(SoundType.GLASS).randomTicks().strength(1.5F).lightLevel((p_152639_) -> { return 2; })));
    public static final RegistryObject<Block> MEDIUM_ICE_CLUSTER = BLOCKS.register("medium_ice_cluster", () -> new IceCrystalClusterBlock(4, 3, AbstractBlock.Properties.of(Material.DECORATION).sound(SoundType.GLASS).randomTicks().strength(1.5F).lightLevel((p_152639_) -> { return 2; })));
    public static final RegistryObject<Block> MEDIUM_FIRE_CLUSTER = BLOCKS.register("medium_fire_cluster", () -> new FireCrystalClusterBlock(4, 3, AbstractBlock.Properties.of(Material.DECORATION).sound(SoundType.GLASS).randomTicks().strength(1.5F).lightLevel((p_152639_) -> { return 2; })));
    public static final RegistryObject<Block> MEDIUM_WIND_CLUSTER = BLOCKS.register("medium_wind_cluster", () -> new WindCrystalClusterBlock(4, 3, AbstractBlock.Properties.of(Material.DECORATION).sound(SoundType.GLASS).randomTicks().strength(1.5F).lightLevel((p_152639_) -> { return 2; })));
    public static final RegistryObject<Block> MEDIUM_EARTH_CLUSTER = BLOCKS.register("medium_earth_cluster", () -> new EarthCrystalClusterBlock(4, 3, AbstractBlock.Properties.of(Material.DECORATION).sound(SoundType.GLASS).randomTicks().strength(1.5F).lightLevel((p_152639_) -> { return 2; })));

    //small clusters
    public static final RegistryObject<Block> SMALL_LIGHTNING_CLUSTER = BLOCKS.register("small_lightning_cluster", () -> new LightningCrystalClusterBlock(3, 4, AbstractBlock.Properties.of(Material.DECORATION).sound(SoundType.GLASS).randomTicks().strength(1.5F).lightLevel((p_152639_) -> { return 1; })));
    public static final RegistryObject<Block> SMALL_WATER_CLUSTER = BLOCKS.register("small_water_cluster", () -> new WaterCrystalClusterBlock(3, 4, AbstractBlock.Properties.of(Material.DECORATION).sound(SoundType.GLASS).randomTicks().strength(1.5F).lightLevel((p_152639_) -> { return 1; })));
    public static final RegistryObject<Block> SMALL_ICE_CLUSTER = BLOCKS.register("small_ice_cluster", () -> new IceCrystalClusterBlock(3, 4, AbstractBlock.Properties.of(Material.DECORATION).sound(SoundType.GLASS).randomTicks().strength(1.5F).lightLevel((p_152639_) -> { return 1; })));
    public static final RegistryObject<Block> SMALL_FIRE_CLUSTER = BLOCKS.register("small_fire_cluster", () -> new FireCrystalClusterBlock(3, 4, AbstractBlock.Properties.of(Material.DECORATION).sound(SoundType.GLASS).randomTicks().strength(1.5F).lightLevel((p_152639_) -> { return 1; })));
    public static final RegistryObject<Block> SMALL_WIND_CLUSTER = BLOCKS.register("small_wind_cluster", () -> new WindCrystalClusterBlock(3, 4, AbstractBlock.Properties.of(Material.DECORATION).sound(SoundType.GLASS).randomTicks().strength(1.5F).lightLevel((p_152639_) -> { return 1; })));
    public static final RegistryObject<Block> SMALL_EARTH_CLUSTER = BLOCKS.register("small_earth_cluster", () -> new EarthCrystalClusterBlock(3, 4, AbstractBlock.Properties.of(Material.DECORATION).sound(SoundType.GLASS).randomTicks().strength(1.5F).lightLevel((p_152639_) -> { return 1; })));

    //budding blocks
    public static final RegistryObject<Block> BUDDING_LIGHTNING_CLUSTER = BLOCKS.register("budding_lightning_cluster", () -> new BuddingLightningCrystalBlock(AbstractBlock.Properties.of(Material.DECORATION).randomTicks().strength(1.5F).lightLevel((p_152651_) -> { return 8; }).sound(SoundType.GLASS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BUDDING_WATER_CLUSTER = BLOCKS.register("budding_water_cluster", () -> new BuddingWaterCrystalBlock(AbstractBlock.Properties.of(Material.DECORATION).randomTicks().strength(1.5F).lightLevel((p_152651_) -> { return 8; }).sound(SoundType.GLASS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BUDDING_ICE_CLUSTER = BLOCKS.register("budding_ice_cluster", () -> new BuddingIceCrystalBlock(AbstractBlock.Properties.of(Material.DECORATION).randomTicks().strength(1.5F).lightLevel((p_152651_) -> { return 8; }).sound(SoundType.GLASS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BUDDING_FIRE_CLUSTER = BLOCKS.register("budding_fire_cluster", () -> new BuddingFireCrystalBlock(AbstractBlock.Properties.of(Material.DECORATION).randomTicks().strength(1.5F).lightLevel((p_152651_) -> { return 8; }).sound(SoundType.GLASS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BUDDING_WIND_CLUSTER = BLOCKS.register("budding_wind_cluster", () -> new BuddingWindCrystalBlock(AbstractBlock.Properties.of(Material.DECORATION).randomTicks().strength(1.5F).lightLevel((p_152651_) -> { return 8; }).sound(SoundType.GLASS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BUDDING_EARTH_CLUSTER = BLOCKS.register("budding_earth_cluster", () -> new BuddingEarthCrystalBlock(AbstractBlock.Properties.of(Material.DECORATION).randomTicks().strength(1.5F).lightLevel((p_152651_) -> { return 8; }).sound(SoundType.GLASS).requiresCorrectToolForDrops()));

    //metal piles
    public static final RegistryObject<Block> GOLD_TREASURE_PILE = BLOCKS.register("gold_treasure_pile", () -> new MetalPileBlock(AbstractBlock.Properties.of(Material.METAL)));
    //public static final RegistryObject<Block> GOLD_TREASURE_PILE_BLOCK = BLOCKS.register("gold_treasure_pile_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL)));

    //gem piles

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
    public static final RegistryObject<Block> PINK_SHELL_FLOOR = BLOCKS.register("pink_shell", () -> new Shell(AbstractBlock.Properties.of(Material.DECORATION).sound(SoundType.SAND)));

//    public static final RegistryObject<WallShell> WALL_PINK_SHELL = BLOCKS.register("pink_wall_shell", () -> new WallShell(AbstractBlock.Properties.of(Material.DECORATION).sound(SoundType.SAND)));

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
