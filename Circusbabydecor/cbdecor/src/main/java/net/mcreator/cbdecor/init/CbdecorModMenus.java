
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cbdecor.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.cbdecor.world.inventory.Gui1Menu;
import net.mcreator.cbdecor.CbdecorMod;

public class CbdecorModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, CbdecorMod.MODID);
	public static final RegistryObject<MenuType<Gui1Menu>> GUI_1 = REGISTRY.register("gui_1", () -> IForgeMenuType.create(Gui1Menu::new));
}
