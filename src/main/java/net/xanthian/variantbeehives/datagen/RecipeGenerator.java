package net.xanthian.variantbeehives.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;

import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import net.xanthian.variantbeehives.block.Beehives;
import net.xanthian.variantbeehives.utils.ModItemTags;

import java.util.function.Consumer;

public class RecipeGenerator extends FabricRecipeProvider {
    public RecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {

        RecipeGenerator.offerBeehiveRecipe(exporter,Beehives.ACACIA_BEEHIVE, Blocks.ACACIA_PLANKS);
        RecipeGenerator.offerBeehiveRecipe(exporter,Beehives.BAMBOO_BEEHIVE, Blocks.BAMBOO_PLANKS);
        RecipeGenerator.offerBeehiveRecipe(exporter,Beehives.BIRCH_BEEHIVE, Blocks.BIRCH_PLANKS);
        RecipeGenerator.offerBeehiveRecipe(exporter,Beehives.CHERRY_BEEHIVE, Blocks.CHERRY_PLANKS);
        RecipeGenerator.offerBeehiveRecipe(exporter,Beehives.CRIMSON_BEEHIVE, Blocks.CRIMSON_PLANKS);
        RecipeGenerator.offerBeehiveRecipe(exporter,Beehives.DARK_OAK_BEEHIVE, Blocks.DARK_OAK_PLANKS);
        RecipeGenerator.offerBeehiveRecipe(exporter,Beehives.JUNGLE_BEEHIVE, Blocks.JUNGLE_PLANKS);
        RecipeGenerator.offerBeehiveRecipe(exporter,Beehives.MANGROVE_BEEHIVE, Blocks.MANGROVE_PLANKS);
        RecipeGenerator.offerBeehiveRecipe(exporter,Beehives.SPRUCE_BEEHIVE, Blocks.SPRUCE_PLANKS);
        RecipeGenerator.offerBeehiveRecipe(exporter,Beehives.WARPED_BEEHIVE, Blocks.WARPED_PLANKS);

        // Uncrafting recipe
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.BEEHIVE,1)
                .input(ModItemTags.BEEHIVES)
                .criterion("has_beehive", InventoryChangedCriterion.Conditions.items(Items.BEEHIVE))
                .offerTo(exporter,new Identifier("variantbeehives", "beehive"));

    }

    public static void offerBeehiveRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, output)
                .input('H', Items.HONEYCOMB)
                .input('P', input)
                .pattern("PPP")
                .pattern("HHH")
                .pattern("PPP")
                .criterion(FabricRecipeProvider.hasItem(Items.HONEYCOMB), FabricRecipeProvider.conditionsFromItem(Items.HONEYCOMB))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(output)));
    }
}