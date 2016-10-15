package com.lumindia.modthing.block;

import com.lumindia.modthing.ModThing;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

import static java.lang.System.out;


/**
 * Created by Lumindia on 10/15/2016.
 */
public class BlockTutorialBlock extends Block {

    public static Integer spread;
    public static Boolean hasSpread;

    public BlockTutorialBlock(Material materialIn, String name) {
        super(materialIn);
        this.setUnlocalizedName(name);
        this.setCreativeTab(ModThing.tabTutorial);
        this.setHardness(5F);
        this.setResistance(10F);
        this.setSoundType(SoundType.SLIME);
        this.setLightLevel(1F);
        this.setTickRandomly(true);
    }

    @Override
    public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
        spread = rand.nextInt(8);
        if (spread <= 5) {
            for (int i = 0; i < 5; ++i){
                BlockPos blockpos = pos.add(rand.nextInt(2) - 1, rand.nextInt(2) - 1, rand.nextInt(2) - 1);

                if (blockpos.getY() >= 0 && blockpos.getY() < 256 && !worldIn.isBlockLoaded(blockpos)){
                    return;
                }

                IBlockState iBlockState = worldIn.getBlockState(blockpos);

                if (iBlockState.getMaterial() != blockMaterial.AIR) {

                    worldIn.setBlockState(blockpos, Blocks.GRASS.getDefaultState());
                    System.out.println("Block Converted!");

                }
            }
        }


        super.updateTick(worldIn, pos, state, rand);
    }
}

