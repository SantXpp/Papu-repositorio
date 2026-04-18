
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cbdecor.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.cbdecor.CbdecorMod;

public class CbdecorModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CbdecorMod.MODID);
	public static final RegistryObject<Item> BQ_SUELO_1 = block(CbdecorModBlocks.BQ_SUELO_1);
	public static final RegistryObject<Item> BQ_SUELO_2 = block(CbdecorModBlocks.BQ_SUELO_2);
	public static final RegistryObject<Item> BQ_SUELO_3 = block(CbdecorModBlocks.BQ_SUELO_3);
	public static final RegistryObject<Item> BQ_PARED_1 = block(CbdecorModBlocks.BQ_PARED_1);
	public static final RegistryObject<Item> BQ_PARED_2 = block(CbdecorModBlocks.BQ_PARED_2);
	public static final RegistryObject<Item> BQ_PARED_3 = block(CbdecorModBlocks.BQ_PARED_3);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
