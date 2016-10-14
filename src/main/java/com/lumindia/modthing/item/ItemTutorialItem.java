package com.lumindia.modthing.item;

import com.lumindia.modthing.ModThing;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;


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
        return true;
    }

}
