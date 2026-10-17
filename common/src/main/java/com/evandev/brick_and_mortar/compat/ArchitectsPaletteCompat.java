package com.evandev.brick_and_mortar.compat;

import com.evandev.brick_and_mortar.platform.registry.RegistryObject;
import com.evandev.brick_and_mortar.registry.ModBlocks;
import com.evandev.brick_and_mortar.registry.ModItems;
import net.minecraft.world.item.Item;

public class ArchitectsPaletteCompat {

    public static final RegistryObject<Item> RAW_ALGAL_BRICK = ModItems.registerBrickItem("raw_algal_brick");
    public static final RegistryObject<Item> LIGHT_ALGAL_BRICK = ModItems.registerBrickItem("light_algal_brick");
    public static final RegistryObject<Item> BURNT_ALGAL_BRICK = ModItems.registerBrickItem("burnt_algal_brick");

    public static final RegistryObject<Item> SOUL_ALGAL_BRICK = ModItems.registerBrickItem("soul_algal_brick");
    public static final RegistryObject<Item> RAW_SOUL_ALGAL_BRICK = ModItems.registerBrickItem("raw_soul_algal_brick");
    public static final RegistryObject<Item> LIGHT_SOUL_ALGAL_BRICK = ModItems.registerBrickItem("light_soul_algal_brick");
    public static final RegistryObject<Item> BURNT_SOUL_ALGAL_BRICK = ModItems.registerBrickItem("burnt_soul_algal_brick");

    public static final ModBlocks.DecorativeFamily RAW_ALGAL_BRICKS = ModBlocks.registerFamily("raw_algal_bricks");
    public static final ModBlocks.DecorativeFamily LIGHT_ALGAL_BRICKS = ModBlocks.registerFamily("light_algal_bricks");
    public static final ModBlocks.DecorativeFamily BURNT_ALGAL_BRICKS = ModBlocks.registerFamily("burnt_algal_bricks");

    public static final ModBlocks.DecorativeFamily SOUL_ALGAL_BRICKS = ModBlocks.registerFamily("soul_algal_bricks");
    public static final ModBlocks.DecorativeFamily RAW_SOUL_ALGAL_BRICKS = ModBlocks.registerFamily("raw_soul_algal_bricks");
    public static final ModBlocks.DecorativeFamily LIGHT_SOUL_ALGAL_BRICKS = ModBlocks.registerFamily("light_soul_algal_bricks");
    public static final ModBlocks.DecorativeFamily BURNT_SOUL_ALGAL_BRICKS = ModBlocks.registerFamily("burnt_soul_algal_bricks");

    public static final ModBlocks.DecorativeFamily ALGAL_TILES = ModBlocks.registerFamily("algal_tiles");
    public static final ModBlocks.DecorativeFamily RAW_ALGAL_TILES = ModBlocks.registerFamily("raw_algal_tiles");
    public static final ModBlocks.DecorativeFamily LIGHT_ALGAL_TILES = ModBlocks.registerFamily("light_algal_tiles");
    public static final ModBlocks.DecorativeFamily BURNT_ALGAL_TILES = ModBlocks.registerFamily("burnt_algal_tiles");

    public static final ModBlocks.DecorativeFamily SOUL_ALGAL_TILES = ModBlocks.registerFamily("soul_algal_tiles");
    public static final ModBlocks.DecorativeFamily RAW_SOUL_ALGAL_TILES = ModBlocks.registerFamily("raw_soul_algal_tiles");
    public static final ModBlocks.DecorativeFamily LIGHT_SOUL_ALGAL_TILES = ModBlocks.registerFamily("light_soul_algal_tiles");
    public static final ModBlocks.DecorativeFamily BURNT_SOUL_ALGAL_TILES = ModBlocks.registerFamily("burnt_soul_algal_tiles");

    public static void init() {
        if (System.getProperty("fabric-api.datagen") != null) {
            CompatHandler.registerDummyItemIfMissing(CompatMods.ARCHITECTS_PALETTE, "algal_blend");
            CompatHandler.registerDummyItemIfMissing(CompatMods.ARCHITECTS_PALETTE, "algal_brick");
            CompatHandler.registerDummyBlockIfMissing(CompatMods.ARCHITECTS_PALETTE, "algal_bricks");
            CompatHandler.registerDummyBlockIfMissing(CompatMods.ARCHITECTS_PALETTE, "algal_brick_stairs");
            CompatHandler.registerDummyBlockIfMissing(CompatMods.ARCHITECTS_PALETTE, "algal_brick_slab");
            CompatHandler.registerDummyBlockIfMissing(CompatMods.ARCHITECTS_PALETTE, "algal_brick_wall");
        }
    }
}
