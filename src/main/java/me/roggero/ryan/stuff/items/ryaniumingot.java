package me.roggero.ryan.stuff.items;

import cpw.mods.fml.common.registry.GameRegistry;
import me.roggero.ryan.Ryansmod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ryaniumingot extends Item{

    public final String name = "ryanium_ingot";

    public ryaniumingot(){
        setUnlocalizedName(Ryansmod.MODID+"_"+name);
        setCreativeTab(CreativeTabs.tabMaterials);
        GameRegistry.registerItem(this,name);
        setTextureName(Ryansmod.MODID+":"+name);
        setMaxStackSize(64);
    }
}
