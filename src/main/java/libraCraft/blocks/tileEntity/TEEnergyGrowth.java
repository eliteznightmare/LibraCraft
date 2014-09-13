package libraCraft.blocks.tileEntity;

import net.minecraft.block.Block;
import net.minecraftforge.common.IPlantable;

public class TEEnergyGrowth extends LCBlockEnergyTE {
	@Override
	public void updateEntity() {
		if (worldObj.isRemote) {
			BalanceEnergy();
			int range = 1;
			for (int i = -range; i <= range; i++) {
				for (int j = -range; j <= range; j++) {
					Block block = worldObj.getBlock(xCoord + i, yCoord, zCoord
							+ j);
					if (this.energy >= 1) {
						if (block instanceof IPlantable) {
							{
								this.energy -= 1;
								block.updateTick(worldObj, xCoord + i, yCoord,
										zCoord + j, worldObj.rand);
							}
						}
					}
				}
			}
		}
	}

	public TEEnergyGrowth() {
		this.maxEnergy = 1500;
		this.packetAmount = 1;
		this.canReceive = true;
		this.canSend = false;
	}
}
