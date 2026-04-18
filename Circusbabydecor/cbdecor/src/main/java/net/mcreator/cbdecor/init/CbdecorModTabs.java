
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cbdecor.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.cbdecor.CbdecorMod;

public class CbdecorModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CbdecorMod.MODID);
	public static final RegistryObject<CreativeModeTab> CBDECOR_TAB_BQ = REGISTRY.register("cbdecor_tab_bq",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.cbdecor_.cbdecor_tab_bq")).icon(() -> new ItemStack(CbdecorModBlocks.BQ_SUELO_1.get())).displayItems((parameters, tabData) -> {
				tabData.accept(CbdecorModBlocks.BQ_SUELO_1.get().asItem());
				tabData.accept(CbdecorModBlocks.BQ_SUELO_2.get().asItem());
				tabData.accept(CbdecorModBlocks.BQ_SUELO_3.get().asItem());
				tabData.accept(CbdecorModBlocks.BQ_PARED_1.get().asItem());
				tabData.accept(CbdecorModBlocks.BQ_PARED_2.get().asItem());
				tabData.accept(CbdecorModBlocks.BQ_PARED_3.get().asItem());
			})

					.build());
}
