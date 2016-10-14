package com.example.modthing.block;

import com.example.modthing.items.BasicItem;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;


import static net.minecraft.item.Item.registerItems;

/**
 * Created by Lumindia on 10/12/2016.
 */

public final class ModBlocks
{

    public static Block tutorialBlock;

    public static void preInit() {

        tutorialBlock = new Block(Material.ROCK);

        registerItems();
    }

    public static void registerBlock(Block block, String name) {
        GameRegistry.register(block, new ResourceLocation(modthing.MODID, name));
    }

    public static void createBlocks()
    {
        tutorialBlock = new BasicItem("tutorialBlock");
        tutorialBlock.setRegistryName("tutorialBlock");
        GameRegistry.register(tutorialBlock);
    }
}