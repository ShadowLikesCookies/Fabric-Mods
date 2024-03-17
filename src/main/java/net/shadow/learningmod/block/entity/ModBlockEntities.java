package net.shadow.learningmod.block.entity;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.shadow.learningmod.LearningMod;
import net.shadow.learningmod.block.ModBlocks;
import net.shadow.learningmod.block.custom.GemPolishingStationBlock;

public class ModBlockEntities {
    public static final BlockEntityType<GemPolishingStationBlockEntity>
            GEM_POLISHING_STATION_BLOCK_ENTITY = Registry.register
            (Registries.BLOCK_ENTITY_TYPE, new Identifier(LearningMod.MOD_ID, "gem_polishing_be"),
            FabricBlockEntityTypeBuilder.create
                    (GemPolishingStationBlockEntity::new,
                            ModBlocks.GEM_POLISHING_STATION).build());

    public static void registerBlockEntities() {
        LearningMod.LOGGER.info("Registering Block Entities for " + LearningMod.MOD_ID);
    }
}
