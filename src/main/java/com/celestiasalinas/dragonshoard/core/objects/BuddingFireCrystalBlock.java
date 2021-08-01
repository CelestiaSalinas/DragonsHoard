package com.celestiasalinas.dragonshoard.core.objects;

import com.celestiasalinas.dragonshoard.core.registry.blocks.DHBlocks;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.PushReaction;
import net.minecraft.fluid.Fluids;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.fml.RegistryObject;

import java.util.Random;

public class BuddingFireCrystalBlock extends CrystalBlock {

    public static final int GROWTH_CHANCE = 5;
    private static final Direction[] DIRECTIONS = Direction.values();




    public BuddingFireCrystalBlock(AbstractBlock.Properties p_152726_) {
        super(p_152726_);
    }

    public PushReaction getPistonPushReaction(BlockState p_152733_) {
        return PushReaction.DESTROY;
    }

    public void randomTick(BlockState p_152728_, ServerWorld p_152729_, BlockPos p_152730_, Random p_152731_) {
        if (p_152731_.nextInt(5) == 0) {
            Direction direction = DIRECTIONS[p_152731_.nextInt(DIRECTIONS.length)];
            BlockPos blockpos = p_152730_.relative(direction);
            BlockState blockstate = p_152729_.getBlockState(blockpos);
            Block block = null;
            if (canClusterGrowAtState(blockstate)) {
                block = DHBlocks.SMALL_FIRE_CLUSTER.get();
            } else if (blockstate.is(DHBlocks.SMALL_FIRE_CLUSTER.get()) && blockstate.getValue(FireCrystalClusterBlock.FACING) == direction) {
                block = DHBlocks.MEDIUM_FIRE_CLUSTER.get();
            } else if (blockstate.is(DHBlocks.MEDIUM_FIRE_CLUSTER.get()) && blockstate.getValue(FireCrystalClusterBlock.FACING) == direction) {
                block = DHBlocks.LARGE_FIRE_CLUSTER.get();
            } else if (blockstate.is(DHBlocks.LARGE_FIRE_CLUSTER.get()) && blockstate.getValue(FireCrystalClusterBlock.FACING) == direction) {
                block = DHBlocks.CHARGED_FIRE_CRYSTAL.get();
            }

            if (block != null) {
                BlockState blockstate1 = block.defaultBlockState().setValue(FireCrystalClusterBlock.FACING, direction).setValue(FireCrystalClusterBlock.WATERLOGGED, Boolean.valueOf(blockstate.getFluidState().getType() == Fluids.WATER));
                p_152729_.setBlockAndUpdate(blockpos, blockstate1);
            }

        }
    }

    public static boolean canClusterGrowAtState(BlockState p_152735_) {
        return p_152735_.isAir() || p_152735_.is(Blocks.WATER) && p_152735_.getFluidState().getAmount() == 8;
    }
}
