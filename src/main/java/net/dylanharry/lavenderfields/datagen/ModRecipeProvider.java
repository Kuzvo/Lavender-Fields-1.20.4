package net.dylanharry.lavenderfields.datagen;

import net.dylanharry.lavenderfields.block.ModBlocks;
import net.dylanharry.lavenderfields.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.advancement.AdvancementCriterion;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> LAVENDER_SMELTABLES = List.of(ModBlocks.LAVENDER_TERRACOTTA);
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerSmelting(exporter, LAVENDER_SMELTABLES, RecipeCategory.DECORATIONS, ModBlocks.LAVENDER_GLAZED_TERRACOTTA,
                0.1f, 200, "lavender_glazed_terracotta");

        offerTerracottaDyeingRecipe(exporter, ModBlocks.LAVENDER_TERRACOTTA, ModItems.LAVENDER_DYE);
        offerStainedGlassDyeingRecipe(exporter, ModBlocks.LAVENDER_STAINED_GLASS, ModItems.LAVENDER_DYE);
        offerStainedGlassPaneDyeingRecipe(exporter, ModBlocks.LAVENDER_STAINED_GLASS_PANE, ModItems.LAVENDER_DYE);
        offerConcretePowderDyeingRecipe(exporter, ModBlocks.LAVENDER_CONCRETE_POWDER, ModItems.LAVENDER_DYE);

    }
}
