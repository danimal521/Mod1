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
        
        
        GameRegistry.addRecipe(new ItemStack(Blocks.FARMLAND, 100), new Object[] { "DDD", "DHD", "DDD", 'D', Blocks.DIRT, 'H', Items.WOODEN_HOE});
        
	    GameRegistry.addRecipe(new ItemStack(Items.STONE_AXE, 1), new Object[] { "AAA", "A A", "AAA", 'A', Items.WOODEN_AXE});
	    
	    GameRegistry.addRecipe(new ItemStack(Blocks.SPONGE, 8), new Object[] { "OOO", "OWO", "OOO", 'O', Blocks.WOOL, 'W', Items.WATER_BUCKET});
	    
	    GameRegistry.addRecipe(new ItemStack(Items.IRON_AXE, 1), new Object[] { "AAA", "A A", "AAA", 'A', Items.STONE_AXE});
	    
	    GameRegistry.addRecipe(new ItemStack(Items.GOLDEN_AXE, 1), new Object[] { "AAA", "A A", "AAA", 'A', Items.IRON_AXE});
	    
	    GameRegistry.addRecipe(new ItemStack(Items.DIAMOND_AXE, 1), new Object[] { "AAA", "A A", "AAA", 'A', Items.GOLDEN_AXE});
	    
	    GameRegistry.addRecipe(new ItemStack(Blocks.MOSSY_COBBLESTONE, 1), new Object[] { " V ", "VCV", " V ", 'C', Blocks.COBBLESTONE, 'V', Blocks.VINE});

	    float xp = 500;
	    GameRegistry.addSmelting(Blocks.BONE_BLOCK, new ItemStack(Items.DIAMOND, 9),  xp);
	    
	    
	    Junk j = new Junk("junk");
	    GameRegistry.register(j);
	    
	    
	    
	    
        System.out.println("Loaded!");
        
    }
    
   
}


