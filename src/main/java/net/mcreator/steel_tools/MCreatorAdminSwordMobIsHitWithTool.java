package net.mcreator.steel_tools;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

@Elementssteel_tools.ModElement.Tag
public class MCreatorAdminSwordMobIsHitWithTool extends Elementssteel_tools.ModElement {
	public MCreatorAdminSwordMobIsHitWithTool(Elementssteel_tools instance) {
		super(instance, 33);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorAdminSwordMobIsHitWithTool!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.GENERIC, (float) 9999);
	}
}
