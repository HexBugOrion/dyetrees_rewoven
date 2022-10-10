package net.timeworndevs.dyetrees;

import net.fabricmc.api.ModInitializer;
import net.timeworndevs.dyetrees.core.Blocks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DyeTrees implements ModInitializer {
	public static final String MOD_ID = "dye_trees";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		Blocks.registerWoodFamilies();
	}
}
