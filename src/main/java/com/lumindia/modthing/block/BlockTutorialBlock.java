package com.lumindia.modthing.block;

import com.lumindia.modthing.ModThing;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;


/**
 * Created by Lumindia on 10/15/2016.
 */
public class BlockTutorialBlock extends Block {

    public BlockTutorialBlock(Material materialIn, String name) {
        super(materialIn);
        this.setUnlocalizedName(name);
        this.setCreativeTab(ModThing.tabTutorial);
        this.setHardness(50F);
        this.setResistance(1000F);
        this.setSoundType(SoundType.SLIME);
    }
}
