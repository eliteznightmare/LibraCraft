package libraCraft.proxy;

import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;
import libraCraft.blocks.BlockInit;
import libraCraft.blocks.tileEntity.TEEnergyCube;
import libraCraft.handler.RenderTickHandler;
import libraCraft.render.ItemRenderEnergyCube;
import libraCraft.render.RenderEnergyCube;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.FMLCommonHandler;

public class ClientProxy extends CommonProxy{
	 public void registerRenderThings() {
         ClientRegistry.bindTileEntitySpecialRenderer(TEEnergyCube.class, new RenderEnergyCube());
         MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockInit.BlockEnergyCube), new ItemRenderEnergyCube());
     	FMLCommonHandler.instance().bus().register(new RenderTickHandler(Minecraft.getMinecraft()));

 }
}
