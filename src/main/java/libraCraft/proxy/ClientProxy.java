package libraCraft.proxy;

import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;
import libraCraft.blocks.BlockInit;
import libraCraft.blocks.tileEntity.TEEnergyCube;
import libraCraft.blocks.tileEntity.TEEnergyGen;
import libraCraft.handler.RenderTickHandler;
import libraCraft.render.ItemRenderEnergyCube;
import libraCraft.render.ItemRenderEnergyGen;
import libraCraft.render.RenderEnergyCube;
import libraCraft.render.RenderEnergyGen;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.FMLCommonHandler;

public class ClientProxy extends CommonProxy{
	 public void registerRenderThings() {
         ClientRegistry.bindTileEntitySpecialRenderer(TEEnergyCube.class, new RenderEnergyCube());
         ClientRegistry.bindTileEntitySpecialRenderer(TEEnergyGen.class, new RenderEnergyGen());
         MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockInit.BlockEnergyCube), new ItemRenderEnergyCube());
         MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockInit.BlockEnergyGen), new ItemRenderEnergyGen());
     	FMLCommonHandler.instance().bus().register(new RenderTickHandler(Minecraft.getMinecraft()));

 }
}
