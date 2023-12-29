package net.shadow.learningmod;

import net.fabricmc.api.ModInitializer;

import net.shadow.learningmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LearningMod implements ModInitializer {
	public static final String MOD_ID = "learningmod";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();


	}
}