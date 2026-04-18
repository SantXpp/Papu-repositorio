
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cbdecor.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.cbdecor.block.BQSuelo3Block;
import net.mcreator.cbdecor.block.BQSuelo2Block;
import net.mcreator.cbdecor.block.BQSuelo1Block;
import net.mcreator.cbdecor.block.BQPared3Block;
import net.mcreator.cbdecor.block.BQPared2Block;
import net.mcreator.cbdecor.block.BQPared1Block;
import net.mcreator.cbdecor.CbdecorMod;

public class CbdecorModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CbdecorMod.MODID);
	public static final RegistryObject<Block> BQ_SUELO_1 = REGISTRY.register("bq_suelo_1", () -> new BQSuelo1Block());
	public static final RegistryObject<Block> BQ_SUELO_2 = REGISTRY.register("bq_suelo_2", () -> new BQSuelo2Block());
	public static final RegistryObject<Block> BQ_SUELO_3 = REGISTRY.register("bq_suelo_3", () -> new BQSuelo3Block());
	public static final RegistryObject<Block> BQ_PARED_1 = REGISTRY.register("bq_pared_1", () -> new BQPared1Block());
	public static final RegistryObject<Block> BQ_PARED_2 = REGISTRY.register("bq_pared_2", () -> new BQPared2Block());
	public static final RegistryObject<Block> BQ_PARED_3 = REGISTRY.register("bq_pared_3", () -> new BQPared3Block());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
