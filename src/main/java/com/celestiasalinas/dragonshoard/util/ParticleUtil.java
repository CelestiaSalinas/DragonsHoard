package com.celestiasalinas.dragonshoard.util;


import com.celestiasalinas.dragonshoard.core.DragonsHoard;
import com.celestiasalinas.dragonshoard.core.registry.particles.ParticleRegistry;
import com.celestiasalinas.dragonshoard.core.particles.GlitterParticle;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.particles.IParticleData;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;


import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.ParticleFactoryRegisterEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@EventBusSubscriber(modid = DragonsHoard.MOD_ID, bus = Bus.MOD)
@OnlyIn(Dist.CLIENT)
public class ParticleUtil {

    /*
     * this is just a like any other RegistryEvent, however, we are binding the particle to the Particle Factory.
     * This also is similar to binding TileEntityRenderers to TileEntites.
     */

    @SubscribeEvent(priority = EventPriority.LOWEST)
    public static void registerParticles(ParticleFactoryRegisterEvent event) {
        Minecraft.getInstance().particleEngine.register(ParticleRegistry.GLITTER.get(), GlitterParticle.Factory::new);
    }


}
