package libraCraft.blocks;

import libraCraft.blocks.tileEntity.TEEnergyCube;
import cpw.mods.fml.common.registry.GameRegistry;

public class BlockInit {
	public static final LCBlockEnergy BlockEnergyCube = new BlockEnergyCube();

	public static void init() {
		GameRegistry.registerBlock(BlockEnergyCube, "EnergyCube");
		GameRegistry.registerTileEntity(TEEnergyCube.class, "EnergyCube");
	}

}
