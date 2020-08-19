package net.mcreator.steel_tools;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementssteel_tools.ModElement.Tag
public class MCreatorSteelSmelting extends Elementssteel_tools.ModElement {
	public MCreatorSteelSmelting(Elementssteel_tools instance) {
		super(instance, 3);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(MCreatorSteelOre.block, (int) (1)), new ItemStack(MCreatorSteelIngot.block, (int) (1)), 10F);
	}
}
