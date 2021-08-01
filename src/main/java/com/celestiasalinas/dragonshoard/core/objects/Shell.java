package com.celestiasalinas.dragonshoard.core.objects;

import com.celestiasalinas.dragonshoard.util.BaseHorizontalBlock;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.AttachFace;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Shell extends HorizontalFaceBlock implements IWaterLoggable {
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;


//    private static final VoxelShape SHAPE = Stream.of(
//            Block.box(8, 1, 4, 9, 2, 5),
//            Block.box(6, 0, 6, 11, 1, 10),
//            Block.box(6, 1, 6, 11, 2, 10),
//            Block.box(11, 0, 6, 12, 1, 10),
//            Block.box(5, 0, 10, 12, 1, 11),
//            Block.box(6, 0, 11, 11, 1, 12),
//            Block.box(6, 0, 4, 11, 1, 6),
//            Block.box(5, 0, 6, 6, 1, 10),
//            Block.box(4, 0, 7, 5, 1, 10),
//            Block.box(12, 0, 7, 13, 1, 10),
//            Block.box(7, 1, 10, 10, 2, 11),
//            Block.box(7, 1, 5, 10, 2, 6)
//    ).reduce((v1, v2) -> {return VoxelShapes.join(v1, v2, IBooleanFunction.OR);}).get();


    protected static final VoxelShape CEILING_AABB_X = Block.box(4, 15, 4, 13, 16, 13);
    protected static final VoxelShape CEILING_AABB_Z = Block.box(4, 15, 4, 13, 16, 13);
    protected static final VoxelShape FLOOR_AABB_X = Block.box(4, 0, 4, 13, 1, 13);
    protected static final VoxelShape FLOOR_AABB_Z = Block.box(4, 0, 4, 13, 1, 13);
    protected static final VoxelShape NORTH_AABB = Block.box(4, 4, 15, 13, 12, 16);
    protected static final VoxelShape SOUTH_AABB = Block.box(3, 4, 0, 12, 12, 1);
    protected static final VoxelShape WEST_AABB = Block.box(15, 4, 3, 16, 12, 12);
    protected static final VoxelShape EAST_AABB = Block.box(0, 4, 4, 1, 12, 13);

    public Shell (AbstractBlock.Properties p_i48436_2_) {
        super(p_i48436_2_);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(FACE, AttachFace.WALL).setValue(WATERLOGGED, Boolean.valueOf(false)));

    }


    public BlockState updateShape(BlockState p_196271_1_, Direction p_196271_2_, BlockState p_196271_3_, IWorld p_196271_4_, BlockPos p_196271_5_, BlockPos p_196271_6_) {
        if (p_196271_2_.getOpposite() == p_196271_1_.getValue(FACING) && !p_196271_1_.canSurvive(p_196271_4_, p_196271_5_)) {
            return Blocks.AIR.defaultBlockState();
        } else {
            if (p_196271_1_.getValue(WATERLOGGED)) {
                p_196271_4_.getLiquidTicks().scheduleTick(p_196271_5_, Fluids.WATER, Fluids.WATER.getTickDelay(p_196271_4_));
            }

            return super.updateShape(p_196271_1_, p_196271_2_, p_196271_3_, p_196271_4_, p_196271_5_, p_196271_6_);
        }
    }

    @Nullable
    public BlockState getStateForPlacement(BlockItemUseContext p_196258_1_) {

        BlockState blockstate;
        IWorldReader iworldreader = p_196258_1_.getLevel();
        BlockPos blockpos = p_196258_1_.getClickedPos();
        FluidState fluidstate = p_196258_1_.getLevel().getFluidState(p_196258_1_.getClickedPos());
        for(Direction direction : p_196258_1_.getNearestLookingDirections()) {

            if (direction.getAxis() == Direction.Axis.Y) {
                blockstate = this.defaultBlockState().setValue(FACE, direction == Direction.UP ? AttachFace.CEILING : AttachFace.FLOOR).setValue(FACING, p_196258_1_.getHorizontalDirection());
            } else {
                blockstate = this.defaultBlockState().setValue(FACE, AttachFace.WALL).setValue(FACING, direction.getOpposite());
            }

            if (blockstate.canSurvive(iworldreader, blockpos)) {
                return blockstate.setValue(WATERLOGGED, Boolean.valueOf(fluidstate.getType() == Fluids.WATER));
            }
//                if (blockstate1.canSurvive(iworldreader, blockpos)) {
//                    return blockstate1.setValue(WATERLOGGED, Boolean.valueOf(fluidstate.getType() == Fluids.WATER));
        }


        return null;
    }

    public VoxelShape getShape(BlockState p_220053_1_, IBlockReader p_220053_2_, BlockPos p_220053_3_, ISelectionContext p_220053_4_) {
        Direction direction = p_220053_1_.getValue(FACING);
        switch((AttachFace)p_220053_1_.getValue(FACE)) {
            case FLOOR:
                if (direction.getAxis() == Direction.Axis.X) {
                    return FLOOR_AABB_X;
                }

                return FLOOR_AABB_Z;
            case WALL:
                switch(direction) {
                    case EAST:
                        return EAST_AABB;
                    case WEST:
                        return WEST_AABB;
                    case SOUTH:
                        return SOUTH_AABB;
                    case NORTH:
                    default:
                        return NORTH_AABB;
                }
            case CEILING:
            default:
                if (direction.getAxis() == Direction.Axis.X) {
                    return CEILING_AABB_X;
                } else {
                    return CEILING_AABB_Z;
                }
        }
    }


    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> p_206840_1_) {
        p_206840_1_.add(FACING, FACE, WATERLOGGED);
    }

    public FluidState getFluidState(BlockState p_204507_1_) {
        return p_204507_1_.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(p_204507_1_);
    }
}
