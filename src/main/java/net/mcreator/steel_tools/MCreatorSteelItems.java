package net.mcreator.steel_tools;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

@Elementssteel_tools.ModElement.Tag
public class MCreatorSteelItems extends Elementssteel_tools.ModElement {
	public MCreatorSteelItems(Elementssteel_tools instance) {
		super(instance, 36);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabsteelitems") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(MCreatorSteelIngot.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static CreativeTabs tab;
}
