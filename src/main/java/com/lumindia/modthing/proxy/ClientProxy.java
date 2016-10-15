package com.lumindia.modthing.proxy;

import com.lumindia.modthing.block.ModBlocks;
import com.lumindia.modthing.item.ModItems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Lumindia on 10/14/2016.
 */
public class ClientProxy extends CommonProxy {


    @Override
    public void preInit(FMLPreInitializationEvent event) {

        ModItems.registerRenders();
        ModBlocks.registerRenders();

    }

    @Override
    public void init(FMLInitializationEvent event) {


    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {


    }
}
