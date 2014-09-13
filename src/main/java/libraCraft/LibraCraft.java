package libraCraft;

import libraCraft.blocks.BlockInit;
import libraCraft.blocks.tileEntity.LCBlockEnergyTE;
import libraCraft.blocks.tileEntity.TEEnergyCube;
import libraCraft.blocks.tileEntity.TEEnergyGen;
import libraCraft.blocks.tileEntity.TEEnergyGrowth;
import libraCraft.handler.ConfigHandler;
import libraCraft.items.ItemInit;
import libraCraft.proxy.IProxy;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Ref.MOD_ID, name = Ref.MOD_NAME, version= Ref.MOD_VERSION, guiFactory = Ref.GUI_FACTORY_CLASS)
public class LibraCraft {
	@Instance("CulinaryCraft")
	public static LibraCraft instance;
	 
	@SidedProxy(clientSide = Ref.CLIENT_PROXY, serverSide = Ref.SERVER_PROXY)
	public static IProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event){
		ConfigHandler.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigHandler());
		ItemInit.init();
		BlockInit.init();
		
	}
	@Mod.EventHandler
	public void Init(FMLInitializationEvent event){
        proxy.registerRenderThings();
        GameRegistry.registerTileEntity(TEEnergyCube.class, "EnergyCube");
		GameRegistry.registerTileEntity(LCBlockEnergyTE.class, "Energybase");
		GameRegistry.registerTileEntity(TEEnergyGen.class, "EnergyGen");
		GameRegistry.registerTileEntity(TEEnergyGrowth.class, "EnergyGrowth");

	}
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	}
}
