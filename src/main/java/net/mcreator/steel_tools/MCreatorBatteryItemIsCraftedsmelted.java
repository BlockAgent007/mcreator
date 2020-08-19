package net.mcreator.steel_tools;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.item.ItemStack;

@Elementssteel_tools.ModElement.Tag
public class MCreatorBatteryItemIsCraftedsmelted extends Elementssteel_tools.ModElement {
	public MCreatorBatteryItemIsCraftedsmelted(Elementssteel_tools instance) {
		super(instance, 79);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			System.err.println("Failed to load dependency itemstack for procedure MCreatorBatteryItemIsCraftedsmelted!");
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		{
			ItemStack _stack = (itemstack);
			if (!_stack.hasTagCompound())
				_stack.setTagCompound(new NBTTagCompound());
			_stack.getTagCompound().setDouble("maxPower", 10000);
		}
	}
}
