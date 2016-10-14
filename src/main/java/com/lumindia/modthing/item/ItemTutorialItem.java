package com.lumindia.modthing.item;

import com.lumindia.modthing.ModThing;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;

/**
 * Created by Lumindia on 10/14/2016.
 */
public class ItemTutorialItem extends Item {

    public ItemTutorialItem(String name) {

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
    public boolean hasEffect(ItemStack stack) {
        return super.hasEffect(stack);
    }

}
