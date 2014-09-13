package libraCraft.blocks;

import libraCraft.blocks.tileEntity.LCBlockEnergyTE;
import libraCraft.blocks.tileEntity.TEEnergyGen;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockEnergyGen extends LCBlockEnergy {

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		return new TEEnergyGen();
	}
	public BlockEnergyGen() {
		setBlockName("EnergyGen");
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
}
