package libraCraft.handler;

import java.io.File;

import libraCraft.Ref;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

public class ConfigHandler {
	public static Configuration config;
	public static boolean testValue = false;

	public static void init(File configFile) {
		if (config == null) {
			config = new Configuration(configFile);
			loadConfiguration();
		}
	}

	private static void loadConfiguration() {
		testValue = config.getBoolean("Cake",
				Configuration.CATEGORY_GENERAL, true,
				"Cake");

		if (config.hasChanged()) {
			config.save();
		}
	}

	@SubscribeEvent
	public void onConfigurationChangedEvent(
			ConfigChangedEvent.OnConfigChangedEvent event) {
		if (event.modID.equalsIgnoreCase(Ref.MOD_ID)) {
			loadConfiguration();
		}
	}
}