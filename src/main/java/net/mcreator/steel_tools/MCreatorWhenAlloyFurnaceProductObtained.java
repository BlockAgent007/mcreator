package net.mcreator.steel_tools;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

@Elementssteel_tools.ModElement.Tag
public class MCreatorWhenAlloyFurnaceProductObtained extends Elementssteel_tools.ModElement {
	public MCreatorWhenAlloyFurnaceProductObtained(Elementssteel_tools instance) {
		super(instance, 38);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorWhenAlloyFurnaceProductObtained!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).addExperience((int) 5);
	}
}
