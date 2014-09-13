package libraCraft.render;

import libraCraft.blocks.tileEntity.TEEnergyCube;
import libraCraft.blocks.tileEntity.TEEnergyGen;
import libraCraft.models.EnergyCubeModel;
import libraCraft.models.EnergyGenModel;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

public class ItemRenderEnergyGen implements IItemRenderer {
	private EnergyGenModel model;

	public ItemRenderEnergyGen() {
		model = new EnergyGenModel();
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
		TileEntityRendererDispatcher.instance.renderTileEntityAt(new TEEnergyGen(), 0.0D, 0.0D, 0.0D, 0.0F);
	}

}
