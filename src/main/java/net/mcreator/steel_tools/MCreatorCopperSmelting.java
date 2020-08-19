package net.mcreator.steel_tools;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementssteel_tools.ModElement.Tag
public class MCreatorCopperSmelting extends Elementssteel_tools.ModElement {
	public MCreatorCopperSmelting(Elementssteel_tools instance) {
		super(instance, 47);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(MCreatorCopperOre.block, (int) (1)), new ItemStack(MCreatorCopperIngot.block, (int) (1)), 1F);
	}
}
