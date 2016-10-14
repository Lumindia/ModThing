package com.lumindia.modthing.tab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

/**
 * Created by Lumindia on 10/14/2016.
 */
public class CreativeTabMT extends CreativeTabs {

    public CreativeTabMT(int index, String label) {
        super(index, label);
    }

    @Override
    public Item getTabIconItem() {
        return Items.APPLE;
    }
}
