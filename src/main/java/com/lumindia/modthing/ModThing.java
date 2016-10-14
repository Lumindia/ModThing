package com.lumindia.modthing;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ModThing.MODID, version = ModThing.VERSION, name = ModThing.NAME)
public class ModThing {
    public static final String MODID = "modthing";
    public static final String VERSION = "1.0";
    public static final String NAME = "My First Mod";

    @EventHandler
    public void init(FMLPreInitializationEvent event) {
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
    }

    @EventHandler
    public void init(FMLPostInitializationEvent event) {

    }
}
