package com.lumindia.modthing.item;

import com.lumindia.modthing.ModThing;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Lumindia on 10/14/2016.
 */
public class ModItems {

    public static Item tutorialItem;

    public static void preInit() {

        tutorialItem = new ItemTutorialItem(EnumHelper.addToolMaterial("TUTORIAL", 3, 100, 8, 10, 30), "tutorial_item").setUnlocalizedName("modthing.tutorial_item").setCreativeTab(ModThing.tabTutorial);

        registerItems();
    }

    public static void registerItems() {
        GameRegistry.register(tutorialItem, new ResourceLocation(ModThing.MODID, "tutorial_item"));
    }

    public static void registerRenders() {
        registerRender(tutorialItem);
    }

    public static void registerRender(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }

}
