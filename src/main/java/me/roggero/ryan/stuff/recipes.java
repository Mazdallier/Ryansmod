package me.roggero.ryan.stuff;

import cpw.mods.fml.common.registry.GameRegistry;
import me.roggero.ryan.stuff.blocks.modblocks;
import net.minecraft.item.ItemStack;
import me.roggero.ryan.stuff.items.moditems;

public final class recipes{
    public static void recipes(){
        ItemStack ryan=new ItemStack(moditems.testingot);
        GameRegistry.addSmelting(modblocks.Test,ryan,0.1f);
        GameRegistry.addShapedRecipe(new ItemStack(modblocks.TestBlock),new Object [] {"aaa","aaa","aaa",'a',ryan});
    }
}
