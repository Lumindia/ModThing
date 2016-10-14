package com.lumindia.modthing.proxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Lumindia on 10/14/2016.
 */
public class ClientProxy extends CommonProxy {

    @SidedProxy(clientSide = "com.lumindia.modthing.ClientProxy", serverSide = "com.lumindia.modthing.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance

    public void preInit(FMLPreInitializationEvent event) {

        proxy.preInit(event);
    }

    @Override
    public void init(FMLInitializationEvent event) {

        proxy.init(event);
    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {

        proxy.postInit(event);
    }
}
