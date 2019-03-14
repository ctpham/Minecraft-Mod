package com.ohlookawall.TutorialMod.items;

import com.ohlookawall.TutorialMod.main;
import com.ohlookawall.TutorialMod.init.ModItems;
import com.ohlookawall.TutorialMod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel{

	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.TOOLS); //choose which tab material is going in
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}

	
}
