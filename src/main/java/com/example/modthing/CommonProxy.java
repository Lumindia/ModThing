package com.example.modthing;

/**
 * Created by Lumindia on 10/12/2016.
 */

import com.example.modthing.block.ModBlocks;
import com.example.modthing.items.ModItems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e) {
        ModItems.createItems();
        ModBlocks.createBlocks();
    }

    public void init(FMLInitializationEvent e) {

    }

    public void postInit(FMLPostInitializationEvent e) {

    }
}