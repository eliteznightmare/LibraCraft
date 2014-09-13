package libraCraft.blocks;

import libraCraft.blocks.tileEntity.LCBlockEnergyTE;
import libraCraft.blocks.tileEntity.TEEnergyCube;
import libraCraft.blocks.tileEntity.TEEnergyGen;
import libraCraft.blocks.tileEntity.TEEnergyGrowth;
import cpw.mods.fml.common.registry.GameRegistry;

public class BlockInit {
	public static final LCBlockEnergy BlockEnergyCube = new BlockEnergyCube();
	public static final LCBlockEnergy BlockEnergyGen = new BlockEnergyGen();
	public static final LCBlockEnergy BlockEnergyGrowth = new BlockEnergyGrowth();

	public static void init() {
		GameRegistry.registerBlock(BlockEnergyCube, "EnergyCube");
		GameRegistry.registerBlock(BlockEnergyGen, "EnergyGen");
		GameRegistry.registerBlock(BlockEnergyGrowth, "EnergyGrowth");
		
	}

}
