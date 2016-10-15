package com.lumindia.modthing.item;

import com.lumindia.modthing.ModThing;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;


import java.util.List;

/**
 * Created by Lumindia on 10/14/2016.
 */
public class ItemTutorialItem extends ItemSword {

    public ItemTutorialItem(ToolMaterial material, String name) {
        super(material);
        setUnlocalizedName(name);
        setCreativeTab(ModThing.tabTutorial);
    }

    @Override
    public EnumRarity getRarity(ItemStack stack) {
        return EnumRarity.EPIC;
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
        tooltip.add("A magical rainbow wand! Endless Possibilities~!");
        super.addInformation(stack, playerIn, tooltip, advanced);
    }

    @Override
    public EnumActionResult onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        if (worldIn.getBlockState(pos).getBlock() == Blocks.GRASS) {
            worldIn.setBlockState(pos.up(), Blocks.DIAMOND_ORE.getDefaultState());
            return EnumActionResult.SUCCESS;
        }
        return EnumActionResult.PASS;
    }

    @Override
    public boolean hasEffect(ItemStack stack) {
        return true;
    }

}
