package libraCraft.blocks.tileEntity;

import net.minecraft.tileentity.TileEntity;

public class TEEnergyCube extends LCBlockEnergyTE {
	public TEEnergyCube() {
		//LCBlockEnergyTE tile1 = (LCBlockEnergyTE) worldObj.getTileEntity(xCoord, yCoord, zCoord);
		//tile1.canSend = true;
		//tile1.canReceive = true;
		//tile1.maxEnergy = 3000;
		//tile1.packetAmount = 20;
	}
	@Override
	public void updateEntity() {
		BalanceEnergy();
		LCBlockEnergyTE tile1 = (LCBlockEnergyTE) worldObj.getTileEntity(xCoord, yCoord, zCoord);
		if (tile1.A == false){
			tile1.maxEnergy = 3000;
			tile1.packetAmount = 1;
			tile1.canReceive = true;
			tile1.canSend = true;
		}
	}
}
