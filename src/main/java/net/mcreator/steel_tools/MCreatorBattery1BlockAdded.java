package net.mcreator.steel_tools;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.tileentity.TileEntity;

@Elementssteel_tools.ModElement.Tag
public class MCreatorBattery1BlockAdded extends Elementssteel_tools.ModElement {
	public MCreatorBattery1BlockAdded(Elementssteel_tools instance) {
		super(instance, 82);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MCreatorBattery1BlockAdded!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MCreatorBattery1BlockAdded!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MCreatorBattery1BlockAdded!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorBattery1BlockAdded!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		{
			TileEntity tileEntity = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
			if (tileEntity != null)
				tileEntity.getTileData().setDouble("maxPower", 30000);
		}
		{
			TileEntity tileEntity = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
			if (tileEntity != null)
				tileEntity.getTileData().setDouble("Power", 0);
		}
	}
}
