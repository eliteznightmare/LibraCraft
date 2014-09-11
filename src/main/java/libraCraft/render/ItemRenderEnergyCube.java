package libraCraft.render;

import libraCraft.blocks.tileEntity.TEEnergyCube;
import libraCraft.models.EnergyCubeModel;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

public class ItemRenderEnergyCube implements IItemRenderer{

	private EnergyCubeModel model;
	
	public ItemRenderEnergyCube() {
		model = new EnergyCubeModel();
	}
	
	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
		return true;
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item,
			ItemRendererHelper helper) {
		return true;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
		TileEntityRendererDispatcher.instance.renderTileEntityAt(new TEEnergyCube(), 0.0D, 0.0D, 0.0D, 0.0F);
	}

}
