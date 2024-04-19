package ch.noseryoung;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreMaterials implements ModInitializer {
	// This is a Logger
	public static final Logger LOGGER = LoggerFactory.getLogger("more-materials");

	@Override
	public void onInitialize() {
		// Loads on Startup
		LOGGER.info("Hello Fabric world!");
	}
}