package net.mcreator.steel_tools;

import net.minecraft.entity.Entity;

@Elementssteel_tools.ModElement.Tag
public class MCreatorSteelHammerMobIsHitWithTool extends Elementssteel_tools.ModElement {
	public MCreatorSteelHammerMobIsHitWithTool(Elementssteel_tools instance) {
		super(instance, 41);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorSteelHammerMobIsHitWithTool!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.fallDistance = (float) (6);
	}
}
