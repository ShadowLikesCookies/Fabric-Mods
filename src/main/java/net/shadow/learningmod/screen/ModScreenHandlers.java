package net.shadow.learningmod.screen;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.shadow.learningmod.LearningMod;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;

public class ModScreenHandlers {
    public static final ScreenHandlerType<GemPolishingScreenHandler> GEM_POLISHING_SCREEN_HANDLER = Registry.register(Registries.SCREEN_HANDLER, new Identifier(LearningMod.MOD_ID, "gem_polishing"),
            new ExtendedScreenHandlerType<>(GemPolishingScreenHandler::new));


    public static void registerScreenHandlers() {
        LearningMod.LOGGER.info("Registering Screen Handlers for " + LearningMod.MOD_ID);
    }
}
