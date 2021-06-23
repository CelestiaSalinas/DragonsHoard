package com.celestiasalinas.dragonshoard.core;

import com.celestiasalinas.dragonshoard.core.objects.Banners;
import com.celestiasalinas.dragonshoard.core.registry.blocks.DHBanners;
import com.celestiasalinas.dragonshoard.core.registry.blocks.DHBlocks;
import com.celestiasalinas.dragonshoard.core.registry.items.DHItems;
//import com.celestiasalinas.dragonshoard.core.registry.particles.ParticleRegistry;
import com.celestiasalinas.dragonshoard.core.registry.particles.ParticleRegistry;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ParticleFactoryRegisterEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import net.minecraftforge.eventbus.api.IEventBus;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(value = DragonsHoard.MOD_ID)
@Mod.EventBusSubscriber(modid = DragonsHoard.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DragonsHoard
{
    public static DragonsHoard INSTANCE;
    public static final String MOD_ID = "dragonshoard";
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger(MOD_ID.toUpperCase());
    // public static final ItemGroup DRAGONS_HOARD = new DragonsHoard.DragonsHoardItemGroup("tutorial_group");


    public DragonsHoard() {
        INSTANCE = this;

        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, Configuration.server_config);
        // ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, Configuration.client_config);


        DHItems.ITEMS.register(modEventBus);
        DHBlocks.BLOCKS.register(modEventBus);

        ParticleRegistry.PARTICLES.register(modEventBus);
        DHBanners.PAINTINGS.register(modEventBus);


    }
        @SubscribeEvent
        public static void createBlockItems(final RegistryEvent.Register<Item> event) {
            final IForgeRegistry<Item> registry = event.getRegistry();

            DHBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
                final Item.Properties properties = new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS);
                final BlockItem blockItem = new BlockItem(block, properties);
                blockItem.setRegistryName(block.getRegistryName());
                registry.register(blockItem);
            });

        }
//    public static class DragonsHoardItemGroup extends ItemGroup {
//
//        public DragonsHoardItemGroup(String name) {
//            super(name);
//        }
//
//        //@Override
//        public ItemStack createIcon() {
//            return new ItemStack(DHItems.PEPPERS.get());
//        }
//
//    }

}


