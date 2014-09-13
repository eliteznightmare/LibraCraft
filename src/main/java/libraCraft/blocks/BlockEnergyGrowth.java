package libraCraft.blocks;

import libraCraft.blocks.tileEntity.TEEnergyGrowth;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockEnergyGrowth extends LCBlockEnergy {

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		return new TEEnergyGrowth();
	}

}
