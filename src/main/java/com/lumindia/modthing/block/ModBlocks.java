package com.lumindia.modthing.block;

import com.lumindia.modthing.ModThing;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Lumindia on 10/14/2016.
 */
public class ModBlocks {

    public static Block tutorialBlock;

    public static void preInit() {

        tutorialBlock = new BlockTutorialBlock(Material.ROCK, "tutorial_block");

        registerBlocks();
    }

    public static void registerBlock(Block block, String name) {
        GameRegistry.register(tutorialBlock, new ResourceLocation(ModThing.MODID, name));
        GameRegistry.register(new ItemBlock(block), new ResourceLocation(ModThing.MODID, name));
    }

    public static void registerBlocks() {
        registerBlock(tutorialBlock, "tutorial_block");
    }

    public static void registerRenders() {
        registerRender(tutorialBlock);
    }

    public static void registerRender(Block block) {
        Item item = Item.getItemFromBlock(block);
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }

}
