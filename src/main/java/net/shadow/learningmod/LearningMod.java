package net.shadow.learningmod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.shadow.learningmod.block.ModBlocks;
import net.shadow.learningmod.block.entity.ModBlockEntities;
import net.shadow.learningmod.item.ModItemGroups;
import net.shadow.learningmod.item.ModItems;
import net.shadow.learningmod.screen.ModScreenHandlers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LearningMod implements ModInitializer {
	public static final String MOD_ID = "learningmod";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModBlockEntities.registerBlockEntities();
		ModItems.registerModItems();
		ModScreenHandlers.registerScreenHandlers();
		ModBlocks.registerModBlocks();
		FuelRegistry.INSTANCE.add(ModItems.COAL_REUSABLE, 30);


	}
}