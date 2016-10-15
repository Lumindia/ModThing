package com.lumindia.modthing.block;

import com.lumindia.modthing.ModThing;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;


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
    }

    @Override
    public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
        spread = rand.nextInt(10000);
        if (spread <= 5) {
            if (worldIn.getBlockState(pos).getMaterial() != blockMaterial.AIR) {

            }
        }


        super.updateTick(worldIn, pos, state, rand);
    }
}

