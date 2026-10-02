package com.evandev.brick_and_mortar.datagen.provider;

import com.evandev.brick_and_mortar.Constants;
import com.evandev.brick_and_mortar.compat.CompatMods;
import com.evandev.brick_and_mortar.compat.SupplementariesCompat;
import com.evandev.brick_and_mortar.compat.VanillaBackportCompat;
import com.evandev.brick_and_mortar.registry.ModBlocks;
import com.evandev.brick_and_mortar.registry.ModItems;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class FarmersDelightRecipeProvider implements DataProvider {
    private final PackOutput.PathProvider pathProvider;

    public FarmersDelightRecipeProvider(FabricDataOutput output) {
        this.pathProvider = output.createPathProvider(PackOutput.Target.DATA_PACK, "recipe/cutting");
    }

    @Override
    public @NotNull CompletableFuture<?> run(CachedOutput cache) {
        List<CompletableFuture<?>> futures = new ArrayList<>();

        addSalvaging(futures, cache, ModBlocks.BLACK_BRICKS, ModItems.CLINKER_BRICK.get());
        addSalvaging(futures, cache, ModBlocks.BLUE_BRICKS, ModItems.BLUE_BRICK.get());
        addSalvaging(futures, cache, ModBlocks.BROWN_BRICKS, ModItems.BROWN_BRICK.get());
        addSalvaging(futures, cache, ModBlocks.CREAM_BRICKS, ModItems.CREAM_BRICK.get());
        addSalvaging(futures, cache, ModBlocks.GRAY_BRICKS, ModItems.GRAY_BRICK.get());
        addSalvaging(futures, cache, ModBlocks.ORANGE_BRICKS, ModItems.ORANGE_BRICK.get());
        addSalvaging(futures, cache, ModBlocks.TAN_BRICKS, ModItems.TAN_BRICK.get());

        addSalvaging(futures, cache, ModBlocks.BLACK_TILES, ModItems.CLINKER_BRICK.get());
        addSalvaging(futures, cache, ModBlocks.BLUE_TILES, ModItems.BLUE_BRICK.get());
        addSalvaging(futures, cache, ModBlocks.BROWN_TILES, ModItems.BROWN_BRICK.get());
        addSalvaging(futures, cache, ModBlocks.CREAM_TILES, ModItems.CREAM_BRICK.get());
        addSalvaging(futures, cache, ModBlocks.GRAY_TILES, ModItems.GRAY_BRICK.get());
        addSalvaging(futures, cache, ModBlocks.ORANGE_TILES, ModItems.ORANGE_BRICK.get());
        addSalvaging(futures, cache, ModBlocks.TAN_TILES, ModItems.TAN_BRICK.get());
        addSalvaging(futures, cache, ModBlocks.BRICK_TILES, Items.BRICK);
        addSalvaging(futures, cache, ModBlocks.NETHER_TILES, Items.NETHER_BRICK);

        addSalvaging(futures, cache, ModBlocks.RAW_NETHER_BRICKS, ModItems.RAW_NETHER_BRICK.get());
        addSalvaging(futures, cache, ModBlocks.RAW_SOUL_NETHER_BRICKS, ModItems.RAW_SOUL_NETHER_BRICK.get());
        addSalvaging(futures, cache, ModBlocks.LIGHT_NETHER_BRICKS, ModItems.LIGHT_NETHER_BRICK.get());
        addSalvaging(futures, cache, ModBlocks.LIGHT_SOUL_NETHER_BRICKS, ModItems.LIGHT_SOUL_NETHER_BRICK.get());
        addSalvaging(futures, cache, ModBlocks.SOUL_NETHER_BRICKS, ModItems.SOUL_NETHER_BRICK.get());
        addSalvaging(futures, cache, ModBlocks.CHARRED_NETHER_BRICKS, ModItems.CHARRED_NETHER_BRICK.get());
        addSalvaging(futures, cache, ModBlocks.CHARRED_SOUL_NETHER_BRICKS, ModItems.CHARRED_SOUL_NETHER_BRICK.get());

        addSalvaging(futures, cache, ModBlocks.RAW_NETHER_TILES, ModItems.RAW_NETHER_BRICK.get());
        addSalvaging(futures, cache, ModBlocks.RAW_SOUL_NETHER_TILES, ModItems.RAW_SOUL_NETHER_BRICK.get());
        addSalvaging(futures, cache, ModBlocks.LIGHT_NETHER_TILES, ModItems.LIGHT_NETHER_BRICK.get());
        addSalvaging(futures, cache, ModBlocks.LIGHT_SOUL_NETHER_TILES, ModItems.LIGHT_SOUL_NETHER_BRICK.get());
        addSalvaging(futures, cache, ModBlocks.SOUL_NETHER_TILES, ModItems.SOUL_NETHER_BRICK.get());
        addSalvaging(futures, cache, ModBlocks.CHARRED_NETHER_TILES, ModItems.CHARRED_NETHER_BRICK.get());
        addSalvaging(futures, cache, ModBlocks.CHARRED_SOUL_NETHER_TILES, ModItems.CHARRED_SOUL_NETHER_BRICK.get());

        Item suppAshBrick = BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(CompatMods.SUPPLEMENTARIES, "ash_brick"));

        addSalvaging(futures, cache, SupplementariesCompat.WHITE_ASH_BRICKS, SupplementariesCompat.WHITE_ASH_BRICK.get(), CompatMods.SUPPLEMENTARIES);
        addSalvaging(futures, cache, SupplementariesCompat.GRAY_ASH_BRICKS, SupplementariesCompat.GRAY_ASH_BRICK.get(), CompatMods.SUPPLEMENTARIES);
        addSalvaging(futures, cache, SupplementariesCompat.BLACK_ASH_BRICKS, SupplementariesCompat.BLACK_ASH_BRICK.get(), CompatMods.SUPPLEMENTARIES);
        addSalvaging(futures, cache, SupplementariesCompat.SOUL_ASH_BRICKS, SupplementariesCompat.SOUL_ASH_BRICK.get(), CompatMods.SUPPLEMENTARIES);
        addSalvaging(futures, cache, SupplementariesCompat.WHITE_SOUL_ASH_BRICKS, SupplementariesCompat.WHITE_SOUL_ASH_BRICK.get(), CompatMods.SUPPLEMENTARIES);
        addSalvaging(futures, cache, SupplementariesCompat.GRAY_SOUL_ASH_BRICKS, SupplementariesCompat.GRAY_SOUL_ASH_BRICK.get(), CompatMods.SUPPLEMENTARIES);
        addSalvaging(futures, cache, SupplementariesCompat.BLACK_SOUL_ASH_BRICKS, SupplementariesCompat.BLACK_SOUL_ASH_BRICK.get(), CompatMods.SUPPLEMENTARIES);

        addSalvaging(futures, cache, SupplementariesCompat.ASH_TILES, suppAshBrick, CompatMods.SUPPLEMENTARIES);
        addSalvaging(futures, cache, SupplementariesCompat.WHITE_ASH_TILES, SupplementariesCompat.WHITE_ASH_BRICK.get(), CompatMods.SUPPLEMENTARIES);
        addSalvaging(futures, cache, SupplementariesCompat.GRAY_ASH_TILES, SupplementariesCompat.GRAY_ASH_BRICK.get(), CompatMods.SUPPLEMENTARIES);
        addSalvaging(futures, cache, SupplementariesCompat.BLACK_ASH_TILES, SupplementariesCompat.BLACK_ASH_BRICK.get(), CompatMods.SUPPLEMENTARIES);
        addSalvaging(futures, cache, SupplementariesCompat.SOUL_ASH_TILES, SupplementariesCompat.SOUL_ASH_BRICK.get(), CompatMods.SUPPLEMENTARIES);
        addSalvaging(futures, cache, SupplementariesCompat.WHITE_SOUL_ASH_TILES, SupplementariesCompat.WHITE_SOUL_ASH_BRICK.get(), CompatMods.SUPPLEMENTARIES);
        addSalvaging(futures, cache, SupplementariesCompat.GRAY_SOUL_ASH_TILES, SupplementariesCompat.GRAY_SOUL_ASH_BRICK.get(), CompatMods.SUPPLEMENTARIES);
        addSalvaging(futures, cache, SupplementariesCompat.BLACK_SOUL_ASH_TILES, SupplementariesCompat.BLACK_SOUL_ASH_BRICK.get(), CompatMods.SUPPLEMENTARIES);

        addSalvaging(futures, cache, VanillaBackportCompat.MELTED_RESIN_BRICKS, VanillaBackportCompat.MELTED_RESIN_BRICK.get(), CompatMods.VANILLA_BACKPORT);
        addSalvaging(futures, cache, VanillaBackportCompat.BRIGHT_RESIN_BRICKS, VanillaBackportCompat.BRIGHT_RESIN_BRICK.get(), CompatMods.VANILLA_BACKPORT);
        addSalvaging(futures, cache, VanillaBackportCompat.SMOKED_RESIN_BRICKS, VanillaBackportCompat.SMOKED_RESIN_BRICK.get(), CompatMods.VANILLA_BACKPORT);
        addSalvaging(futures, cache, VanillaBackportCompat.SOUL_RESIN_BRICKS, VanillaBackportCompat.SOUL_RESIN_BRICK.get(), CompatMods.VANILLA_BACKPORT);
        addSalvaging(futures, cache, VanillaBackportCompat.MELTED_SOUL_RESIN_BRICKS, VanillaBackportCompat.MELTED_SOUL_RESIN_BRICK.get(), CompatMods.VANILLA_BACKPORT);
        addSalvaging(futures, cache, VanillaBackportCompat.BRIGHT_SOUL_RESIN_BRICKS, VanillaBackportCompat.BRIGHT_SOUL_RESIN_BRICK.get(), CompatMods.VANILLA_BACKPORT);
        addSalvaging(futures, cache, VanillaBackportCompat.SMOKED_SOUL_RESIN_BRICKS, VanillaBackportCompat.SMOKED_SOUL_RESIN_BRICK.get(), CompatMods.VANILLA_BACKPORT);

        return CompletableFuture.allOf(futures.toArray(new CompletableFuture[0]));
    }

    private void addSalvaging(List<CompletableFuture<?>> futures, CachedOutput cache, ModBlocks.DecorativeFamily input, ItemLike output) {
        addSalvaging(futures, cache, input, output, null);
    }

    private void addSalvaging(List<CompletableFuture<?>> futures, CachedOutput cache, ModBlocks.DecorativeFamily input, ItemLike output, String requiredMod) {
        JsonObject json = new JsonObject();
        json.addProperty("type", "farmersdelight:cutting");

        JsonArray ingredients = new JsonArray();
        JsonObject ingredient = new JsonObject();
        ingredient.addProperty("item", input.base().getId().toString());
        ingredients.add(ingredient);
        json.add("ingredients", ingredients);

        JsonArray results = new JsonArray();
        JsonObject result = new JsonObject();
        JsonObject resultItem = new JsonObject();
        resultItem.addProperty("count", 4);
        resultItem.addProperty("id", BuiltInRegistries.ITEM.getKey(output.asItem()).toString());
        result.add("item", resultItem);
        results.add(result);
        json.add("result", results);

        JsonArray tool = new JsonArray();
        JsonObject ability = new JsonObject();
        ability.addProperty("type", "farmersdelight:item_ability");
        ability.addProperty("action", "pickaxe_dig");
        tool.add(ability);
        JsonObject pickaxes = new JsonObject();
        pickaxes.addProperty("tag", "minecraft:pickaxes");
        tool.add(pickaxes);
        json.add("tool", tool);

        JsonArray conditions = new JsonArray();
        JsonObject modCondition = new JsonObject();
        modCondition.addProperty("condition", "fabric:all_mods_loaded");
        JsonArray values = new JsonArray();
        values.add(CompatMods.FARMERS_DELIGHT);
        if (requiredMod != null) values.add(requiredMod);
        modCondition.add("values", values);
        conditions.add(modCondition);

        json.add("fabric:load_conditions", conditions);

        ResourceLocation loc = ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, input.base().getId().getPath());
        futures.add(DataProvider.saveStable(cache, json, this.pathProvider.json(loc)));
    }

    @Override
    public @NotNull String getName() {
        return "Farmer's Delight Brick Salvaging Recipes";
    }
}
