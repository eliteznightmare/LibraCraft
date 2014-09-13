package libraCraft.blocks.tileEntity;

import net.minecraft.tileentity.TileEntity;

public class TEEnergyCube extends LCBlockEnergyTE {
	public TEEnergyCube() {
			this.maxEnergy = 3000;
			this.packetAmount = 1;
			this.canReceive = true;
			this.canSend = true;
		}
}
