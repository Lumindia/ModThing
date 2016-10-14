package com.example.modthing.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Lumindia on 10/12/2016.
 */

public final class ModItems
{

    public static Item tutorialItem;

    public static void createItems()
    {
        tutorialItem = new BasicItem("tutorialItem");
        tutorialItem.setRegistryName("tutorialItem");
        GameRegistry.register(tutorialItem);
    }
}