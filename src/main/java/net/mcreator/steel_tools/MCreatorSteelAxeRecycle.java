package net.mcreator.steel_tools;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementssteel_tools.ModElement.Tag
public class MCreatorSteelAxeRecycle extends Elementssteel_tools.ModElement {
	public MCreatorSteelAxeRecycle(Elementssteel_tools instance) {
		super(instance, 15);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(MCreatorSteelAxe.block, (int) (1)), new ItemStack(MCreatorSteelNugget.block, (int) (1)), 1F);
	}
}
