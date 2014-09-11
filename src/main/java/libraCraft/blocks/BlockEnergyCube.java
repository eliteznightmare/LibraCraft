package libraCraft.blocks;

import libraCraft.blocks.tileEntity.LCBlockEnergyTE;
import libraCraft.blocks.tileEntity.TEEnergyCube;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockEnergyCube extends LCBlockEnergy {
	public BlockEnergyCube() {
		this.setBlockName("EnergyCube");
	}

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		return new TEEnergyCube();
	}
	@Override
	public int getRenderType() {
		return -1;
	}
	@Override
	public boolean isOpaqueCube() {
		return false;
	}
	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}
	@Override
	public boolean canBlockStay(World world, int x,
			int y, int z) {
		
		return false;
	}
	
}
