package com.example.modthing.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by Lumindia on 10/14/2016.
 */
public class BlockTutorialBlock extends Block {


    public BlockTutorialBlock(Material materialIn, String name) {
        super(materialIn);
        this.setUnlocalizedName(name);
        this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        this.setHardness(4F);
        this.setSoundType(SoundType.CLOTH);
        this.setLightLevel(3F);
        this.setResistance(250F);

    }
}
