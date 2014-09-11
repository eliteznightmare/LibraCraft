package libraCraft.items;

import libraCraft.Ref;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class LCItem extends Item{
	public LCItem(){
		super();
	}
	@Override
	public String getUnlocalizedName() {
		return String.format("item.%s%s", Ref.MOD_ID.toLowerCase() + ":", unwrappname(super.getUnlocalizedName()));
	}
	@Override
	public String getUnlocalizedName(ItemStack itemstack) {
		return String.format("item.%s%s", Ref.MOD_ID.toLowerCase() + ":", unwrappname(super.getUnlocalizedName()));
	}
	protected String unwrappname(String unlocalizedName){
		return unlocalizedName.substring(unlocalizedName.indexOf(".")+ 1);
	}
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
	}
}