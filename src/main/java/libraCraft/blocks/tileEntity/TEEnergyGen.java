package libraCraft.blocks.tileEntity;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.tileentity.TileEntityFurnace;

public class TEEnergyGen extends LCBlockEnergyTE {

	@Override
	public void updateEntity() {
		BalanceEnergy();
		if (worldObj.isRemote) {
			LCBlockEnergyTE tile1 = (LCBlockEnergyTE) worldObj.getTileEntity(
					xCoord, yCoord, zCoord);
			if (tile1.fuel >= 50) {
				if (tile1.energy < tile1.maxEnergy) {
					tile1.fuel -= 50;
					tile1.energy += 50;
				}
			}
			if (tile1.fuel == 0) {
				if (worldObj.getBlock(xCoord, yCoord + 1, zCoord) == Blocks.coal_block) {
					worldObj.setBlock(xCoord, yCoord + 1, zCoord, Blocks.air);
					tile1.fuel = 15000;
				}
			}
		}
	}

	public TEEnergyGen() {
		this.maxEnergy = 2000;
		this.packetAmount = 50;
		this.canReceive = false;
		this.canSend = true;
	}
}
