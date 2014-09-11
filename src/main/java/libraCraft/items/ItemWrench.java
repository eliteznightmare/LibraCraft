package libraCraft.items;

import libraCraft.blocks.tileEntity.LCBlockEnergyTE;
import libraCraft.blocks.tileEntity.TEEnergyCube;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemWrench extends LCItem {

	public ItemWrench() {
		this.maxStackSize = 1;
		this.bFull3D = true;
		this.setUnlocalizedName("Wrench");
	}

	@Override
	public boolean onItemUse(ItemStack itemstack, EntityPlayer player,
			World world, int x, int y, int z, int side, float f1, float f2,
			float f3) {
		if (world.isRemote){
			if ((LCBlockEnergyTE) world.getTileEntity(x, y, z) instanceof LCBlockEnergyTE){
				LCBlockEnergyTE tile1 = (LCBlockEnergyTE) world.getTileEntity(x, y, z);
				if(!player.isSneaking()){
				tile1.energy = tile1.energy + 100;
				}
				else
				{
					System.out.println("Energy: " + tile1.energy);
					System.out.println("Max Enegry: " + tile1.maxEnergy);
					System.out.println("Packet Size: " + tile1.packetAmount);
				}
			}
		}
		return true;
	}
}
