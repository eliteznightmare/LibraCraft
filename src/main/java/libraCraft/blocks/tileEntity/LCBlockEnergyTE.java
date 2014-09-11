package libraCraft.blocks.tileEntity;

import java.util.Random;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class LCBlockEnergyTE extends TileEntity {

	public int energy;
	public int packetAmount;
	public int maxEnergy;
	public boolean canSend = true;
	public boolean canReceive = true;
	public boolean A = false;

	public void writeToNBT(NBTTagCompound nbt) {
		nbt.setInteger("energy", energy);
		nbt.setInteger("packetAmount", packetAmount);
		nbt.setInteger("maxEnergy", maxEnergy);
		nbt.setBoolean("canSend", canSend);
		nbt.setBoolean("canReceive", canReceive);
		nbt.setBoolean("A", A);
	}

	@Override
	public void readFromNBT(NBTTagCompound nbt) {
		energy = nbt.getInteger("energy");
		packetAmount = nbt.getInteger("packetAmount");
		maxEnergy = nbt.getInteger("maxEnergy");
		canSend = nbt.getBoolean("canSend");
		canReceive = nbt.getBoolean("canReceive");
		A = nbt.getBoolean("A");
	}

	@Override
	public void updateEntity() {
		 BalanceEnergy();
	}

	public void BalanceEnergy() {
		int x = xCoord;
		int y = yCoord;
		int z = zCoord;
		Random random = new Random();
		World world = worldObj;
		int range = 5;
			for (int xD = -range; xD <= range; xD++) {
				for (int yD = -range; yD <= range; yD++) {
					for (int zD = -range; zD <= range; zD++) {
						if (xD != 0 || yD != 0 || zD != 0) {
							if ((LCBlockEnergyTE) world.getTileEntity(x + xD, y
									+ yD, z + zD) instanceof LCBlockEnergyTE) {
								LCBlockEnergyTE tile2 = (LCBlockEnergyTE) world
										.getTileEntity(x + xD, y + yD, z + zD);
								LCBlockEnergyTE tile1 = (LCBlockEnergyTE) world
										.getTileEntity(x, y, z);
								if (tile1.canSend == true
										&& tile2.canReceive == true) {
									if (tile1.energy >= tile1.packetAmount && tile2.energy <= tile2.maxEnergy
											&& tile1.energy > tile2.energy 
											&& tile1.energy - tile2.energy > tile1.packetAmount) {
										tile1.energy = tile1.energy - tile1.packetAmount;
										tile2.energy = tile2.energy + tile1.packetAmount;
										SpawnParticles(world, tile2.xCoord, tile2.yCoord, tile2.zCoord, xD, yD,
												zD);
									}
								}
							}
						}
					}
				}
			}
		}

	private void SpawnParticles(World world, int xCoord, int yCoord,
			int zCoord, int xD, int yD, int zD) {
		Random random = new Random();
		for (int lk = 0; lk < 20; lk++) {
			world.spawnParticle("portal", (double) xCoord + 0.5D,
					(double) yCoord + 1.0D, (double) zCoord + 0.5D,
					(double) ((float) (-xD) + random.nextFloat()) - 0.5D,
					(double) ((float) (-yD) - random.nextFloat() - 0.5F),
					(double) ((float) (-zD) + random.nextFloat()) - 0.5D);
			world.spawnParticle("portal", (double) xCoord + 0.5D,
					(double) yCoord + 1.0D, (double) zCoord + 0.5D,
					(double) ((float) (-xD) + random.nextFloat()) - 0.5D,
					(double) ((float) (-yD) - random.nextFloat() - 0.5F),
					(double) ((float) (-zD) + random.nextFloat()) - 0.5D);
		}
	}
}
