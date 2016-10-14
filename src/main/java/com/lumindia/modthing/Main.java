package com.lumindia.modthing;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Main.MODID, name = Main.NAME, version = Main.VERSION)

public class Main
{
    public static final String MODID = "modthing";
    public static final String NAME = "A Modded Thing";
    public static final String VERSION = "1.0";

    @SidedProxy(clientSide = "ClientProxy", serverSide = "ServerProxy")
    public static CommonProxy proxy;

    @Instance
    public static Main instance = new Main();

    @EventHandler
    public void preInit(FMLPreInitializationEvent e)
    {


    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        System.out.println("Hello there! I'm a test line!");
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent e)
    {

    }
}
