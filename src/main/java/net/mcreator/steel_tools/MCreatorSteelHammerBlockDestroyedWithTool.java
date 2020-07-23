package net.mcreator.steel_tools;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;

@Elementssteel_tools.ModElement.Tag
public class MCreatorSteelHammerBlockDestroyedWithTool extends Elementssteel_tools.ModElement {
	public MCreatorSteelHammerBlockDestroyedWithTool(Elementssteel_tools instance) {
		super(instance, 34);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MCreatorSteelHammerBlockDestroyedWithTool!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MCreatorSteelHammerBlockDestroyedWithTool!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MCreatorSteelHammerBlockDestroyedWithTool!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorSteelHammerBlockDestroyedWithTool!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z - 1)))
				.getBlock()
				.dropBlockAsItem(world, new BlockPos((int) x, (int) y, (int) z),
						world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z - 1))), 1);
		world.setBlockToAir(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z - 1)));
		world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z - 1)))
				.getBlock()
				.dropBlockAsItem(world, new BlockPos((int) x, (int) y, (int) z),
						world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z - 1))), 1);
		world.setBlockToAir(new BlockPos((int) (x - 1), (int) y, (int) (z - 1)));
		world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z - 1)))
				.getBlock()
				.dropBlockAsItem(world, new BlockPos((int) x, (int) y, (int) z),
						world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z - 1))), 1);
		world.setBlockToAir(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z - 1)));
		world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z))
				.getBlock()
				.dropBlockAsItem(world, new BlockPos((int) x, (int) y, (int) z),
						world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)), 1);
		world.setBlockToAir(new BlockPos((int) (x - 1), (int) (y - 1), (int) z));
		world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))
				.getBlock()
				.dropBlockAsItem(world, new BlockPos((int) x, (int) y, (int) z), world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)),
						1);
		world.setBlockToAir(new BlockPos((int) (x - 1), (int) y, (int) z));
		world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z))
				.getBlock()
				.dropBlockAsItem(world, new BlockPos((int) x, (int) y, (int) z),
						world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z)), 1);
		world.setBlockToAir(new BlockPos((int) (x - 1), (int) (y + 1), (int) z));
		world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z + 1)))
				.getBlock()
				.dropBlockAsItem(world, new BlockPos((int) x, (int) y, (int) z),
						world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z + 1))), 1);
		world.setBlockToAir(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z + 1)));
		world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z + 1)))
				.getBlock()
				.dropBlockAsItem(world, new BlockPos((int) x, (int) y, (int) z),
						world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z + 1))), 1);
		world.setBlockToAir(new BlockPos((int) (x - 1), (int) y, (int) (z + 1)));
		world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z + 1)))
				.getBlock()
				.dropBlockAsItem(world, new BlockPos((int) x, (int) y, (int) z),
						world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z + 1))), 1);
		world.setBlockToAir(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z + 1)));
		world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1)))
				.getBlock()
				.dropBlockAsItem(world, new BlockPos((int) x, (int) y, (int) z),
						world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))), 1);
		world.setBlockToAir(new BlockPos((int) x, (int) (y - 1), (int) (z - 1)));
		world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))
				.getBlock()
				.dropBlockAsItem(world, new BlockPos((int) x, (int) y, (int) z), world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))),
						1);
		world.setBlockToAir(new BlockPos((int) x, (int) y, (int) (z - 1)));
		world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1)))
				.getBlock()
				.dropBlockAsItem(world, new BlockPos((int) x, (int) y, (int) z),
						world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))), 1);
		world.setBlockToAir(new BlockPos((int) x, (int) (y + 1), (int) (z - 1)));
		world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))
				.getBlock()
				.dropBlockAsItem(world, new BlockPos((int) x, (int) y, (int) z), world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)),
						1);
		world.setBlockToAir(new BlockPos((int) x, (int) (y - 1), (int) z));
		world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock()
				.dropBlockAsItem(world, new BlockPos((int) x, (int) y, (int) z), world.getBlockState(new BlockPos((int) x, (int) y, (int) z)), 1);
		world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
		world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))
				.getBlock()
				.dropBlockAsItem(world, new BlockPos((int) x, (int) y, (int) z), world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)),
						1);
		world.setBlockToAir(new BlockPos((int) x, (int) (y + 1), (int) z));
		world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1)))
				.getBlock()
				.dropBlockAsItem(world, new BlockPos((int) x, (int) y, (int) z),
						world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))), 1);
		world.setBlockToAir(new BlockPos((int) x, (int) (y - 1), (int) (z + 1)));
		world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))
				.getBlock()
				.dropBlockAsItem(world, new BlockPos((int) x, (int) y, (int) z), world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))),
						1);
		world.setBlockToAir(new BlockPos((int) x, (int) y, (int) (z + 1)));
		world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1)))
				.getBlock()
				.dropBlockAsItem(world, new BlockPos((int) x, (int) y, (int) z),
						world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))), 1);
		world.setBlockToAir(new BlockPos((int) x, (int) (y + 1), (int) (z + 1)));
		world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 1)))
				.getBlock()
				.dropBlockAsItem(world, new BlockPos((int) x, (int) y, (int) z),
						world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 1))), 1);
		world.setBlockToAir(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 1)));
		world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 1)))
				.getBlock()
				.dropBlockAsItem(world, new BlockPos((int) x, (int) y, (int) z),
						world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 1))), 1);
		world.setBlockToAir(new BlockPos((int) (x + 1), (int) y, (int) (z - 1)));
		world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z - 1)))
				.getBlock()
				.dropBlockAsItem(world, new BlockPos((int) x, (int) y, (int) z),
						world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z - 1))), 1);
		world.setBlockToAir(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z - 1)));
		world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z))
				.getBlock()
				.dropBlockAsItem(world, new BlockPos((int) x, (int) y, (int) z),
						world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)), 1);
		world.setBlockToAir(new BlockPos((int) (x + 1), (int) (y - 1), (int) z));
		world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))
				.getBlock()
				.dropBlockAsItem(world, new BlockPos((int) x, (int) y, (int) z), world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)),
						1);
		world.setBlockToAir(new BlockPos((int) (x + 1), (int) y, (int) z));
		world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z))
				.getBlock()
				.dropBlockAsItem(world, new BlockPos((int) x, (int) y, (int) z),
						world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)), 1);
		world.setBlockToAir(new BlockPos((int) (x + 1), (int) (y + 1), (int) z));
		world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z + 1)))
				.getBlock()
				.dropBlockAsItem(world, new BlockPos((int) x, (int) y, (int) z),
						world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z + 1))), 1);
		world.setBlockToAir(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z + 1)));
		world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z + 1)))
				.getBlock()
				.dropBlockAsItem(world, new BlockPos((int) x, (int) y, (int) z),
						world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z + 1))), 1);
		world.setBlockToAir(new BlockPos((int) (x + 1), (int) y, (int) (z + 1)));
		world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z + 1)))
				.getBlock()
				.dropBlockAsItem(world, new BlockPos((int) x, (int) y, (int) z),
						world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z + 1))), 1);
		world.setBlockToAir(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z + 1)));
	}
}
