package libraCraft.items;

import cpw.mods.fml.common.registry.GameRegistry;

public class ItemInit {
	
	public static final LCItem ItemWrench = new ItemWrench(); 
	
	public static void init() {
	GameRegistry.registerItem(ItemWrench, "Wrench");
	}

}
