package net.mcreator.steel_tools;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

@Elementssteel_tools.ModElement.Tag
public class MCreatorSteelArmor extends Elementssteel_tools.ModElement {
	@GameRegistry.ObjectHolder("steel_tools:steelarmorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("steel_tools:steelarmorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("steel_tools:steelarmorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("steel_tools:steelarmorboots")
	public static final Item boots = null;

	public MCreatorSteelArmor(Elementssteel_tools instance) {
		super(instance, 66);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("STEELARMOR", "steel_tools:steel", 25, new int[]{2, 5, 7, 2}, 9,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("item.armor.equip_iron")), 1f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("steelarmorhelmet")
				.setRegistryName("steelarmorhelmet").setCreativeTab(MCreatorSteelItems.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("steelarmorbody")
				.setRegistryName("steelarmorbody").setCreativeTab(MCreatorSteelItems.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("steelarmorlegs")
				.setRegistryName("steelarmorlegs").setCreativeTab(MCreatorSteelItems.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("steelarmorboots")
				.setRegistryName("steelarmorboots").setCreativeTab(MCreatorSteelItems.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("steel_tools:steelarmorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("steel_tools:steelarmorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("steel_tools:steelarmorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("steel_tools:steelarmorboots", "inventory"));
	}
}
