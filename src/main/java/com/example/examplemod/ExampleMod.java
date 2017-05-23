package com.example.examplemod;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Items; 
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = ExampleMod.MODID, version = ExampleMod.VERSION)
public class ExampleMod //extends BaseMod
{
    public static final String MODID = "examplemod";
    public static final String VERSION = "1.0";
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        System.out.println("DIRT BLOCK >> "+Blocks.DIRT.getUnlocalizedName());
        System.out.println("Dude!");
        //GameRegistry.addRecipe(new ItemStack(Items.DIAMOND, 2), new Object[] { "DDD", "DDD", "DDD", 'D', Blocks.DIRT});
        
        
        GameRegistry.addRecipe(new ItemStack(Blocks.FARMLAND, 9), new Object[] { "DDD", "DHD", "DDD", 'D', Blocks.DIRT, 'H', Items.WOODEN_HOE});
        
        System.out.println("Loaded!");
        
    }
    
   
}


