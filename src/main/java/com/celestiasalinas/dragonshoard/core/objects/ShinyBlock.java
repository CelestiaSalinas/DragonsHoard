package com.celestiasalinas.dragonshoard.core.objects;

import com.celestiasalinas.dragonshoard.core.registry.particles.ParticleRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.Random;

public class ShinyBlock extends Block {

    public ShinyBlock(Properties properties) {
        super(properties);
    }


    public void animateTick(BlockState stateIn, World worldIn, BlockPos pos, Random rand) {
        if (rand.nextInt(5) == 0) {
            Direction direction = Direction.getRandom(rand);
            if (direction != Direction.UP) {
                BlockPos blockpos = pos.relative(direction);
                BlockState blockstate = worldIn.getBlockState(blockpos);
                if (!stateIn.canOcclude() || !blockstate.isFaceSturdy(worldIn, blockpos, direction.getOpposite())) {
                    double d0 = direction.getStepX() == 0 ? rand.nextDouble() : 0.5D + (double) direction.getStepX() * 0.6D;
                    double d1 = direction.getStepY() == 0 ? rand.nextDouble() : 0.5D + (double) direction.getStepY() * 0.6D;
                    double d2 = direction.getStepZ() == 0 ? rand.nextDouble() : 0.5D + (double) direction.getStepZ() * 0.6D;
                    worldIn.addParticle(ParticleRegistry.GLITTER.get(), (double) pos.getX() + d0, (double) pos.getY() + d1, (double) pos.getZ() + d2, 0.0D, 0.0D, 0.0D);
                }
            }
        }
        if (rand.nextInt(5) == 0) {
            Direction direction = Direction.getRandom(rand);
            if (direction != Direction.UP) {
                BlockPos blockpos = pos.relative(direction);
                BlockState blockstate = worldIn.getBlockState(blockpos);
                if (!stateIn.canOcclude() || !blockstate.isFaceSturdy(worldIn, blockpos, direction.getOpposite())) {
                    double d0 = direction.getStepX() == 0 ? rand.nextDouble() : 0.5D + (double) direction.getStepX() * 0.6D;
                    double d1 = direction.getStepY() == 0 ? rand.nextDouble() : 0.5D + (double) direction.getStepY() * 0.6D;
                    double d2 = direction.getStepZ() == 0 ? rand.nextDouble() : 0.5D + (double) direction.getStepZ() * 0.6D;
                    worldIn.addParticle(ParticleRegistry.GLITTER.get(), (double) pos.getX() + d0, (double) pos.getY() + d1, (double) pos.getZ() + d2, 0.0D, 0.0D, 0.0D);
                }
            }
        }
        if (rand.nextInt(5) == 0) {
            Direction direction = Direction.getRandom(rand);
            if (direction != Direction.UP) {
                BlockPos blockpos = pos.relative(direction);
                BlockState blockstate = worldIn.getBlockState(blockpos);
                if (!stateIn.canOcclude() || !blockstate.isFaceSturdy(worldIn, blockpos, direction.getOpposite())) {
                    double d0 = direction.getStepX() == 0 ? rand.nextDouble() : 0.5D + (double) direction.getStepX() * 0.6D;
                    double d1 = direction.getStepY() == 0 ? rand.nextDouble() : 0.5D + (double) direction.getStepY() * 0.6D;
                    double d2 = direction.getStepZ() == 0 ? rand.nextDouble() : 0.5D + (double) direction.getStepZ() * 0.6D;
                    worldIn.addParticle(ParticleRegistry.GLITTER.get(), (double) pos.getX() + d0, (double) pos.getY() + d1, (double) pos.getZ() + d2, 0.0D, 0.0D, 0.0D);
                }
            }
        }
//    }public void animateTick(BlockState stateIn, World worldIn, BlockPos pos, Random rand) {
//        double d0 = (double)pos.getX() + 0.5D;
//        double d1 = (double)pos.getY() + 1.5D;
//        double d2 = (double)pos.getZ() + 0.5D;
//        worldIn.addParticle(ParticleRegistry.GLITTER.get(), d0, d1, d2, 0.0D, 0.0D, 0.0D);
//    }
    }
}
