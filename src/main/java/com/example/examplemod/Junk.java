package com.example.examplemod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Junk  extends Item 
{
	protected String name;

	public Junk(String name) 
	{
		this.name = name;

		setUnlocalizedName(name);
		setRegistryName(name);

 		setCreativeTab(CreativeTabs.DECORATIONS);  		
 		
 		 System.out.println("Junk!");
	}

	public String getName() {
		return this.name ;
	}
	
	
	
	

}
