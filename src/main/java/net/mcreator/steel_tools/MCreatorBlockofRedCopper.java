package net.mcreator.steel_tools;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.world.IBlockAccess;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;

import java.util.List;

@Elementssteel_tools.ModElement.Tag
public class MCreatorBlockofRedCopper extends Elementssteel_tools.ModElement {
	@GameRegistry.ObjectHolder("steel_tools:blockofredcopper")
	public static final Block block = null;

	public MCreatorBlockofRedCopper(Elementssteel_tools instance) {
		super(instance, 58);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom());
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation("steel_tools:blockofredcopper",
				"inventory"));
	}

	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.IRON);
			setRegistryName("blockofredcopper");
			setUnlocalizedName("blockofredcopper");
			setSoundType(SoundType.METAL);
			setHarvestLevel("pickaxe", 1);
			setHardness(5F);
			setResistance(6F);
			setLightLevel(0.5F);
			setLightOpacity(255);
			setCreativeTab(MCreatorEnergyManagement.tab);
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<String> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add("Extremely conductive material.");
		}

		@Override
		public boolean isBeaconBase(IBlockAccess worldObj, BlockPos pos, BlockPos beacon) {
			return true;
		}

		@Override
		public MapColor getMapColor(IBlockState state, IBlockAccess blockAccess, BlockPos pos) {
			return MapColor.GOLD;
		}
	}
}
