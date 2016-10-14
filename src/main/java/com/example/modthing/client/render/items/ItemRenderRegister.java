package com.example.modthing.client.render.items;

import com.example.modthing.Main;
import com.example.modthing.items.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

/**
 * Created by Lumindia on 10/12/2016.
 */


public final class ItemRenderRegister
{
    public static void registerItemRenderer()
    {
        reg(ModItems.tutorialItem);
    }

    public static String modid = Main.MODID;

    public static void reg(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher();
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));

    }

}