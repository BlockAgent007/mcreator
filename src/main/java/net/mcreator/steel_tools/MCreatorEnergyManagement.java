package net.mcreator.steel_tools;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

@Elementssteel_tools.ModElement.Tag
public class MCreatorEnergyManagement extends Elementssteel_tools.ModElement {
	public MCreatorEnergyManagement(Elementssteel_tools instance) {
		super(instance, 51);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabenergymanagement") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(MCreatorCopperIngot.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
