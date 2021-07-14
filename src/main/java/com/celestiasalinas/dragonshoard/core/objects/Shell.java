package com.celestiasalinas.dragonshoard.core.objects;

import com.celestiasalinas.dragonshoard.util.BaseHorizontalBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

import java.util.stream.Stream;

public class Shell extends BaseHorizontalBlock {


    private static final VoxelShape SHAPE = Stream.of(
            Block.box(11, 1, 8, 12, 2, 9),
            Block.box(6, 0, 6, 10, 1, 11),
            Block.box(6, 1, 6, 10, 2, 11),
            Block.box(6, 0, 11, 10, 1, 12),
            Block.box(5, 0, 5, 6, 1, 12),
            Block.box(4, 0, 6, 5, 1, 11),
            Block.box(10, 0, 6, 12, 1, 11),
            Block.box(6, 0, 5, 10, 1, 6),
            Block.box(6, 0, 4, 9, 1, 5),
            Block.box(6, 0, 12, 9, 1, 13),
            Block.box(5, 1, 7, 6, 2, 10),
            Block.box(10, 1, 7, 11, 2, 10)
    ).reduce((v1, v2) -> {return VoxelShapes.join(v1, v2, IBooleanFunction.OR);}).get();




    public Shell(Properties properties) {
        super(properties);
        runCalculation(SHAPE);
    }



    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return SHAPES.get(this).get(state.getValue(HORIZONTAL_FACING));
    }
}


//public static final DirectionProperty FACING = HorizontalBlock.FACING;
//public static final EnumProperty<ShellAttachment> ATTACHMENT = BlockStateProperties.BELL_ATTACHMENT;

//    private static final Vector3d SHAPE1_1 = new Vector3d(7, 0, 4);
//    private static final Vector3d SHAPE1_2 = new Vector3d(11, 1, 9);
//    //
//    private static final Vector3d SHAPE2_1 = new Vector3d(7, 1, 4);
//    private static final Vector3d SHAPE2_2 = new Vector3d(11, 2, 9);
//    //
//    private static final Vector3d SHAPE3_1 = new Vector3d(7, 0, 9);
//    private static final Vector3d SHAPE3_2 = new Vector3d(11, 1, 10);
//    //
//    private static final Vector3d SHAPE4_1 = new Vector3d(6, 0, 3);
//    private static final Vector3d SHAPE4_2 = new Vector3d(7, 1, 10);
//    //
//    private static final Vector3d SHAPE5_1 = new Vector3d(5, 0, 4);
//    private static final Vector3d SHAPE5_2 = new Vector3d(6, 1, 9);
//    //
//    private static final Vector3d SHAPE6_1 = new Vector3d(11, 0, 4);
//    private static final Vector3d SHAPE6_2 = new Vector3d(13, 1, 9);
//    //
//    private static final Vector3d SHAPE7_1 = new Vector3d(7, 0, 3);
//    private static final Vector3d SHAPE7_2 = new Vector3d(11, 1, 4);
//    //
//    private static final Vector3d SHAPE8_1 = new Vector3d(9, 0, 2);
//    private static final Vector3d SHAPE8_2 = new Vector3d(10, 1, 3);
//    //
//    private static final Vector3d SHAPE9_1 = new Vector3d(7, 0, 10);
//    private static final Vector3d SHAPE9_2 = new Vector3d(10, 1, 11);
//    //
//    private static final Vector3d SHAPE10_1 = new Vector3d(6, 1, 5);
//    private static final Vector3d SHAPE10_2 = new Vector3d(7, 2, 8);
//    //
//    private static final Vector3d SHAPE11_1 = new Vector3d(11, 1, 5);
//    private static final Vector3d SHAPE11_2 = new Vector3d(12, 2, 8);
//    //
//    private static final Vector3d SHAPE12_1 = new Vector3d(12, 1, 6);
//    private static final Vector3d SHAPE12_2 = new Vector3d(13, 2, 7);
//
//    private static final VoxelShape SHAPE1 = Block.box(SHAPE1_1.x, SHAPE1_1.y, SHAPE1_1.z(), SHAPE1_2.x(), SHAPE1_2.y(), SHAPE1_2.z());
//    private static final VoxelShape SHAPE2 = Block.box(SHAPE2_1.x, SHAPE2_1.y, SHAPE2_1.z(), SHAPE2_2.x(), SHAPE2_2.y(), SHAPE2_2.z());
//    private static final VoxelShape SHAPE3 = Block.box(SHAPE3_1.x, SHAPE3_1.y, SHAPE3_1.z(), SHAPE3_2.x(), SHAPE3_2.y(), SHAPE3_2.z());
//    private static final VoxelShape SHAPE4 = Block.box(SHAPE4_1.x, SHAPE4_1.y, SHAPE4_1.z(), SHAPE4_2.x(), SHAPE4_2.y(), SHAPE4_2.z());
//    private static final VoxelShape SHAPE5 = Block.box(SHAPE5_1.x, SHAPE5_1.y, SHAPE5_1.z(), SHAPE5_2.x(), SHAPE5_2.y(), SHAPE5_2.z());
//    private static final VoxelShape SHAPE6 = Block.box(SHAPE6_1.x, SHAPE6_1.y, SHAPE6_1.z(), SHAPE6_2.x(), SHAPE6_2.y(), SHAPE6_2.z());
//    private static final VoxelShape SHAPE7 = Block.box(SHAPE7_1.x, SHAPE7_1.y, SHAPE7_1.z(), SHAPE7_2.x(), SHAPE7_2.y(), SHAPE7_2.z());
//    private static final VoxelShape SHAPE8 = Block.box(SHAPE8_1.x, SHAPE8_1.y, SHAPE8_1.z(), SHAPE8_2.x(), SHAPE8_2.y(), SHAPE8_2.z());
//    private static final VoxelShape SHAPE9 = Block.box(SHAPE9_1.x, SHAPE9_1.y, SHAPE9_1.z(), SHAPE9_2.x(), SHAPE9_2.y(), SHAPE9_2.z());
//    private static final VoxelShape SHAPE10 = Block.box(SHAPE10_1.x, SHAPE10_1.y, SHAPE10_1.z(), SHAPE10_2.x(), SHAPE10_2.y(), SHAPE10_2.z());
//    private static final VoxelShape SHAPE11 = Block.box(SHAPE11_1.x, SHAPE11_1.y, SHAPE11_1.z(), SHAPE11_2.x(), SHAPE11_2.y(), SHAPE11_2.z());
//    private static final VoxelShape SHAPE12 = Block.box(SHAPE12_1.x, SHAPE12_1.y, SHAPE12_1.z(), SHAPE12_2.x(), SHAPE12_2.y(), SHAPE12_2.z());
//private static VoxelShape COMBINED_SHAPE = VoxelShapes.or(SHAPE1, SHAPE2, SHAPE3, SHAPE4, SHAPE5, SHAPE6, SHAPE7, SHAPE8, SHAPE9, SHAPE10, SHAPE11, SHAPE12);

//private static VoxelShape EMPTY_SPACE = VoxelShapes.join(VoxelShapes.block(), COMBINED_SHAPE, IBooleanFunction.ONLY_FIRST);