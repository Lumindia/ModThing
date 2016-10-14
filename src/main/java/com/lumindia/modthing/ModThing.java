package com.lumindia.modthing;

import com.lumindia.modthing.item.ModItems;
import com.lumindia.modthing.proxy.CommonProxy;
import com.lumindia.modthing.tab.CreativeTabMT;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ModThing.MODID, version = ModThing.VERSION, name = ModThing.NAME)
public class ModThing {
    public static final String MODID = "modthing";
    public static final String VERSION = "1.0";
    public static final String NAME = "My First Mod";

    @SidedProxy(clientSide = "com.lumindia.modthing.proxy.ClientProxy", serverSide = "com.lumindia.modthing.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static ModThing instance;

    public static CreativeTabMT tabTutorial;

    @EventHandler
    public void init(FMLPreInitializationEvent event) {
        proxy.preInit(event);
        ModItems.preInit();
        tabTutorial = new CreativeTabMT(CreativeTabs.getNextID(), "tab_tutorial");
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @EventHandler
    public void init(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}
