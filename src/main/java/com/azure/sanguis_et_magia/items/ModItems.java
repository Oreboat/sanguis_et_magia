package com.azure.sanguis_et_magia.items;
import com.azure.sanguis_et_magia.items.weapons.SilverDagger;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
public class ModItems {
	public static final Item SILVER_DAGGER = new SilverDagger(ToolMaterials.DIAMOND, 1, 0.8f);

	public static void registerItems() {
		Registry.register(Registries.ITEM, new Identifier("sanguis_et_magia", "silver_dagger"), SILVER_DAGGER);
	}
}
