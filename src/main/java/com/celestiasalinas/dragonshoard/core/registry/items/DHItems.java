package com.celestiasalinas.dragonshoard.core.registry.items;

import com.celestiasalinas.dragonshoard.core.DragonsHoard;
import com.celestiasalinas.dragonshoard.core.registry.blocks.DHBlocks;
import com.celestiasalinas.dragonshoard.core.registry.blocks.DHFluids;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.WallOrFloorItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class DHItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DragonsHoard.MOD_ID);

    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> ROSE_GOLD_INGOT = ITEMS.register("rose_gold_ingot", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> WHITE_GOLD_INGOT = ITEMS.register("white_gold_ingot", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> BLUE_GOLD_INGOT = ITEMS.register("blue_gold_ingot", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> STAR_BLUE_GOLD_INGOT = ITEMS.register("star_blue_gold_ingot", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    // Gems
    public static final RegistryObject<Item> DIAMOND = ITEMS.register("diamond", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
//    public static final RegistryObject<WallOrFloorItem> IOLITE = ITEMS.register("iolite", () -> new WallOrFloorItem(DHBlocks.IOLITE_GROUND.get(), DHBlocks.IOLITE_WALL.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
    public static final RegistryObject<Item> IOLITE = ITEMS.register("iolite", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> SODALITE = ITEMS.register("sodalite", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> ROSE_QUARTZ = ITEMS.register("rose_quartz", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> EMERALD = ITEMS.register("emerald", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> ALEXANDRITE = ITEMS.register("alexandrite", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> CITRINE = ITEMS.register("citrine", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> TANZANITE = ITEMS.register("tanzanite", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> TOPAZ = ITEMS.register("topaz", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> OPAL = ITEMS.register("opal", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));

    //placeables
//    public static final RegistryObject<WallOrFloorItem> IOLITE_PLACEABLE = ITEMS.register("iolite_placeable",
//            () -> new WallOrFloorItem(DHBlocks.IOLITE_GROUND.get(), DHBlocks.IOLITE_WALL.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));


    //Leviathan
//    public static final RegistryObject<WallOrFloorItem> PINK_SHELL_ALL = ITEMS.register("pink_shell_all",
//            () -> new WallOrFloorItem(DHBlocks.PINK_SHELL_FLOOR.get(), DHBlocks.WALL_PINK_SHELL.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
    //fluids
    public static final RegistryObject<Item> BLUE_LAVA_BUCKET =
            ITEMS.register("blue_lava_bucket",
                    () -> new BucketItem(DHFluids.BLUE_LAVA_FLUID::get,
                            new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_MATERIALS)));
}
