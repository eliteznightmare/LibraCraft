package libraCraft.handler;

import net.minecraft.client.Minecraft;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent.RenderTickEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderTickHandler {

	public static float e = 0;
	public static float a = 0;
	public static float b = 0;
	private Minecraft mc;

	public RenderTickHandler(Minecraft minecraft) {
		mc = minecraft;
	}

	@SubscribeEvent
	public void onRenderTick(RenderTickEvent event) {
		b = b + 0.01F;
		e = e + 0.07F;
		a = a + 0.01F;
	//	System.out.println(b + " / " + e + " / " + a);
		if (b >= 180F) {
			b = -180F;
		}
		if (e >= 180F) {
			e = -180F;
		}
		if (a >= 180F) {
			a = -180F;
		}
	}
}
/*
 * 
 */