package net.mcreator.steel_tools;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.IProperty;

@Elementssteel_tools.ModElement.Tag
public class MCreatorExchangerUpdateTick extends Elementssteel_tools.ModElement {
	public MCreatorExchangerUpdateTick(Elementssteel_tools instance) {
		super(instance, 72);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MCreatorExchangerUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MCreatorExchangerUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MCreatorExchangerUpdateTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorExchangerUpdateTick!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		boolean needs_input = false;
		boolean needs_output = false;
		boolean can_be_active = false;
		boolean charger_enabled = false;
		if (((new Object() {
			public ItemStack getItemStack(BlockPos pos, int sltid) {
				TileEntity inv = world.getTileEntity(pos);
				if (inv instanceof TileEntityLockableLoot)
					return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
				return ItemStack.EMPTY;
			}
		}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(MCreatorExchangerBatteryCharger.block,
				(int) (1)).getItem())) {
			charger_enabled = (boolean) (true);
		} else {
			charger_enabled = (boolean) (false);
		}
		if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == MCreatorBlockofCopper.block.getDefaultState()
				.getBlock()) || ((((new Object() {
			public EnumFacing getEnumFacing(BlockPos pos) {
				try {
					IBlockState _bs = world.getBlockState(pos);
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing"))
							return _bs.getValue((PropertyDirection) prop);
					}
					return EnumFacing.NORTH;
				} catch (Exception e) {
					return EnumFacing.NORTH;
				}
			}
		}.getEnumFacing(new BlockPos((int) x, (int) y, (int) z))) == EnumFacing.EAST) && ((world.getBlockState(new BlockPos((int) x, (int) y,
				(int) (z + 1)))).getBlock() == MCreatorBlockofCopper.block.getDefaultState().getBlock())) || ((((new Object() {
			public EnumFacing getEnumFacing(BlockPos pos) {
				try {
					IBlockState _bs = world.getBlockState(pos);
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing"))
							return _bs.getValue((PropertyDirection) prop);
					}
					return EnumFacing.NORTH;
				} catch (Exception e) {
					return EnumFacing.NORTH;
				}
			}
		}.getEnumFacing(new BlockPos((int) x, (int) y, (int) z))) == EnumFacing.WEST) && ((world.getBlockState(new BlockPos((int) x, (int) y,
				(int) (z - 1)))).getBlock() == MCreatorBlockofCopper.block.getDefaultState().getBlock())) || ((((new Object() {
			public EnumFacing getEnumFacing(BlockPos pos) {
				try {
					IBlockState _bs = world.getBlockState(pos);
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing"))
							return _bs.getValue((PropertyDirection) prop);
					}
					return EnumFacing.NORTH;
				} catch (Exception e) {
					return EnumFacing.NORTH;
				}
			}
		}.getEnumFacing(new BlockPos((int) x, (int) y, (int) z))) == EnumFacing.NORTH) && ((world.getBlockState(new BlockPos((int) (x + 1), (int) y,
				(int) z))).getBlock() == MCreatorBlockofCopper.block.getDefaultState().getBlock())) || (((new Object() {
			public EnumFacing getEnumFacing(BlockPos pos) {
				try {
					IBlockState _bs = world.getBlockState(pos);
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing"))
							return _bs.getValue((PropertyDirection) prop);
					}
					return EnumFacing.NORTH;
				} catch (Exception e) {
					return EnumFacing.NORTH;
				}
			}
		}.getEnumFacing(new BlockPos((int) x, (int) y, (int) z))) == EnumFacing.SOUTH) && ((world.getBlockState(new BlockPos((int) (x - 1), (int) y,
				(int) z))).getBlock() == MCreatorBlockofCopper.block.getDefaultState().getBlock()))))))) {
			needs_input = (boolean) (false);
		} else {
			needs_input = (boolean) (true);
		}
		if ((((((new Object() {
			public EnumFacing getEnumFacing(BlockPos pos) {
				try {
					IBlockState _bs = world.getBlockState(pos);
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing"))
							return _bs.getValue((PropertyDirection) prop);
					}
					return EnumFacing.NORTH;
				} catch (Exception e) {
					return EnumFacing.NORTH;
				}
			}
		}.getEnumFacing(new BlockPos((int) x, (int) y, (int) z))) == EnumFacing.EAST) && ((world.getBlockState(new BlockPos((int) x, (int) y,
				(int) (z - 1)))).getBlock() == MCreatorBlockofCopper.block.getDefaultState().getBlock())) || ((((new Object() {
			public EnumFacing getEnumFacing(BlockPos pos) {
				try {
					IBlockState _bs = world.getBlockState(pos);
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing"))
							return _bs.getValue((PropertyDirection) prop);
					}
					return EnumFacing.NORTH;
				} catch (Exception e) {
					return EnumFacing.NORTH;
				}
			}
		}.getEnumFacing(new BlockPos((int) x, (int) y, (int) z))) == EnumFacing.WEST) && ((world.getBlockState(new BlockPos((int) x, (int) y,
				(int) (z + 1)))).getBlock() == MCreatorBlockofCopper.block.getDefaultState().getBlock())) || ((((new Object() {
			public EnumFacing getEnumFacing(BlockPos pos) {
				try {
					IBlockState _bs = world.getBlockState(pos);
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing"))
							return _bs.getValue((PropertyDirection) prop);
					}
					return EnumFacing.NORTH;
				} catch (Exception e) {
					return EnumFacing.NORTH;
				}
			}
		}.getEnumFacing(new BlockPos((int) x, (int) y, (int) z))) == EnumFacing.NORTH) && ((world.getBlockState(new BlockPos((int) (x - 1), (int) y,
				(int) z))).getBlock() == MCreatorBlockofCopper.block.getDefaultState().getBlock())) || (((new Object() {
			public EnumFacing getEnumFacing(BlockPos pos) {
				try {
					IBlockState _bs = world.getBlockState(pos);
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing"))
							return _bs.getValue((PropertyDirection) prop);
					}
					return EnumFacing.NORTH;
				} catch (Exception e) {
					return EnumFacing.NORTH;
				}
			}
		}.getEnumFacing(new BlockPos((int) x, (int) y, (int) z))) == EnumFacing.SOUTH) && ((world.getBlockState(new BlockPos((int) (x + 1), (int) y,
				(int) z))).getBlock() == MCreatorBlockofCopper.block.getDefaultState().getBlock()))))) || ((charger_enabled) && (((new Object() {
			public ItemStack getItemStack(BlockPos pos, int sltid) {
				TileEntity inv = world.getTileEntity(pos);
				if (inv instanceof TileEntityLockableLoot)
					return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
				return ItemStack.EMPTY;
			}
		}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem() == new ItemStack(MCreatorBattery.block, (int) (1)).getItem()) && (((new Object() {
			public ItemStack getItemStack(BlockPos pos, int sltid) {
				TileEntity inv = world.getTileEntity(pos);
				if (inv instanceof TileEntityLockableLoot)
					return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
				return ItemStack.EMPTY;
			}
		}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).hasTagCompound() ? (new Object() {
			public ItemStack getItemStack(BlockPos pos, int sltid) {
				TileEntity inv = world.getTileEntity(pos);
				if (inv instanceof TileEntityLockableLoot)
					return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
				return ItemStack.EMPTY;
			}
		}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getTagCompound().getDouble("power") : -1) < 10000))))) {
			needs_output = (boolean) (false);
		} else {
			needs_output = (boolean) (true);
		}
		if (((((new Object() {
			public EnumFacing getEnumFacing(BlockPos pos) {
				try {
					IBlockState _bs = world.getBlockState(pos);
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing"))
							return _bs.getValue((PropertyDirection) prop);
					}
					return EnumFacing.NORTH;
				} catch (Exception e) {
					return EnumFacing.NORTH;
				}
			}
		}.getEnumFacing(new BlockPos((int) x, (int) y, (int) z))) == EnumFacing.EAST) && ((world.getBlockState(new BlockPos((int) (x + 1), (int) y,
				(int) z))).getBlock() == Blocks.WOODEN_PRESSURE_PLATE.getDefaultState().getBlock())) || ((((new Object() {
			public EnumFacing getEnumFacing(BlockPos pos) {
				try {
					IBlockState _bs = world.getBlockState(pos);
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing"))
							return _bs.getValue((PropertyDirection) prop);
					}
					return EnumFacing.NORTH;
				} catch (Exception e) {
					return EnumFacing.NORTH;
				}
			}
		}.getEnumFacing(new BlockPos((int) x, (int) y, (int) z))) == EnumFacing.WEST) && ((world.getBlockState(new BlockPos((int) (x - 1), (int) y,
				(int) z))).getBlock() == Blocks.WOODEN_PRESSURE_PLATE.getDefaultState().getBlock())) || ((((new Object() {
			public EnumFacing getEnumFacing(BlockPos pos) {
				try {
					IBlockState _bs = world.getBlockState(pos);
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing"))
							return _bs.getValue((PropertyDirection) prop);
					}
					return EnumFacing.NORTH;
				} catch (Exception e) {
					return EnumFacing.NORTH;
				}
			}
		}.getEnumFacing(new BlockPos((int) x, (int) y, (int) z))) == EnumFacing.NORTH) && ((world.getBlockState(new BlockPos((int) x, (int) y,
				(int) (z - 1)))).getBlock() == Blocks.WOODEN_PRESSURE_PLATE.getDefaultState().getBlock())) || (((new Object() {
			public EnumFacing getEnumFacing(BlockPos pos) {
				try {
					IBlockState _bs = world.getBlockState(pos);
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing"))
							return _bs.getValue((PropertyDirection) prop);
					}
					return EnumFacing.NORTH;
				} catch (Exception e) {
					return EnumFacing.NORTH;
				}
			}
		}.getEnumFacing(new BlockPos((int) x, (int) y, (int) z))) == EnumFacing.SOUTH) && ((world.getBlockState(new BlockPos((int) x, (int) y,
				(int) (z + 1)))).getBlock() == Blocks.WOODEN_PRESSURE_PLATE.getDefaultState().getBlock())))))) {
			can_be_active = (boolean) (true);
		} else {
			can_be_active = (boolean) (false);
		}
		if (((!(needs_input)) && ((!(needs_output)) && (can_be_active)))) {
			{
				TileEntity tileEntity = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (tileEntity != null)
					tileEntity.getTileData().setDouble("status", 3);
			}
		} else if ((needs_input)) {
			{
				TileEntity tileEntity = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (tileEntity != null)
					tileEntity.getTileData().setDouble("status", 0);
			}
		} else if ((needs_output)) {
			{
				TileEntity tileEntity = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (tileEntity != null)
					tileEntity.getTileData().setDouble("status", 1);
			}
		} else {
			{
				TileEntity tileEntity = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (tileEntity != null)
					tileEntity.getTileData().setDouble("status", 2);
			}
		}
	}
}
