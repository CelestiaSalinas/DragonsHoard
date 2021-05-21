package com.celestiasalinas.dragonshoard.util;


import com.celestiasalinas.dragonshoard.core.DragonsHoard;
import com.celestiasalinas.dragonshoard.core.registry.particles.ParticleRegistry;
import com.celestiasalinas.dragonshoard.core.particles.GlitterParticle;

import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.ParticleFactoryRegisterEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@EventBusSubscriber(modid = DragonsHoard.MOD_ID, bus = Bus.MOD)
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













//
//import com.celestiasalinas.dragonshoard.core.registry.particles.ParticleRegistry;
//import net.minecraft.block.Block;
//import net.minecraft.block.BlockState;
//import net.minecraft.particles.IParticleData;
//import net.minecraft.util.Direction;
//import net.minecraft.util.math.BlockPos;
//import net.minecraft.util.math.shapes.VoxelShape;
//import net.minecraft.util.math.shapes.VoxelShapes;
//import net.minecraft.world.World;
//import net.minecraftforge.api.distmarker.Dist;
//import net.minecraftforge.api.distmarker.OnlyIn;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.concurrent.ThreadLocalRandom;
//
//@OnlyIn(Dist.CLIENT)
//public class ParticleUtil {
//
//    @OnlyIn(Dist.CLIENT)
//    public static void makeBlockParticles(IParticleData particleData, World world, BlockPos pos, double velX, double velY, double velZ) {
//
//        ThreadLocalRandom rand = ThreadLocalRandom.current();
//        Direction[] dirList = Direction.values();
//        BlockState state = world.getBlockState(pos);
//        VoxelShape shape = state.getShape(world, pos).simplify();
//
//        int j = (shape == VoxelShapes.fullCube() ? 3 : 2);
//        for (int i = 0; i < rand.nextInt(3) + 5 * j; i++) {
//
//            Direction randomDir = dirList[rand.nextInt(dirList.length)];
//            double x = rand.nextDouble(shape.getBoundingBox().minX - 0.2D, shape.getBoundingBox().maxX + 0.2D);
//            if (randomDir.getAxis() == Direction.Axis.X) {
//                x = randomDir == Direction.WEST ? shape.getBoundingBox().minX - 0.2D : shape.getBoundingBox().maxX + 0.2D;
//            }
//            double y = rand.nextDouble(shape.getBoundingBox().minY - 0.2D, shape.getBoundingBox().maxY + 0.2D);
//            if (randomDir.getAxis() == Direction.Axis.Y) {
//                y = randomDir == Direction.DOWN ? shape.getBoundingBox().minY - 0.2D : shape.getBoundingBox().maxY + 0.2D;
//            }
//            double z = rand.nextDouble(shape.getBoundingBox().minZ - 0.2D, shape.getBoundingBox().maxZ + 0.2D);
//            if (randomDir.getAxis() == Direction.Axis.Z) {
//                z = randomDir == Direction.NORTH ? shape.getBoundingBox().minZ - 0.2D : shape.getBoundingBox().maxZ + 0.2D;
//            }
//
//            world.addParticle(particleData, (double) pos.getX() + x, (double) pos.getY() + y, (double) pos.getZ() + z, rand.nextGaussian() * 0.005D, rand.nextGaussian() * 0.005D, rand.nextGaussian() * 0.005D);
//        }
//
//    }
