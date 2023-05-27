package net.xanthian.variantbeehives.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.xanthian.variantbeehives.block.Beehives;

import java.util.function.Consumer;

public class RecipeGenerator extends FabricRecipeProvider {
    public RecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Beehives.ACACIA_BEEHIVE)
                .input('H', Items.HONEYCOMB)
                .input('P', Blocks.ACACIA_PLANKS)
                .pattern("PPP")
                .pattern("HHH")
                .pattern("PPP")
                .criterion(FabricRecipeProvider.hasItem(Items.HONEYCOMB), FabricRecipeProvider.conditionsFromItem(Items.HONEYCOMB))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Beehives.ACACIA_BEEHIVE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Beehives.BAMBOO_BEEHIVE)
                .input('H', Items.HONEYCOMB)
                .input('P', Blocks.BAMBOO_PLANKS)
                .pattern("PPP")
                .pattern("HHH")
                .pattern("PPP")
                .criterion(FabricRecipeProvider.hasItem(Items.HONEYCOMB), FabricRecipeProvider.conditionsFromItem(Items.HONEYCOMB))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Beehives.BAMBOO_BEEHIVE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Beehives.CHERRY_BEEHIVE)
                .input('H', Items.HONEYCOMB)
                .input('P', Blocks.CHERRY_PLANKS)
                .pattern("PPP")
                .pattern("HHH")
                .pattern("PPP")
                .criterion(FabricRecipeProvider.hasItem(Items.HONEYCOMB), FabricRecipeProvider.conditionsFromItem(Items.HONEYCOMB))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Beehives.CHERRY_BEEHIVE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Beehives.DARK_OAK_BEEHIVE)
                .input('H', Items.HONEYCOMB)
                .input('P', Blocks.DARK_OAK_PLANKS)
                .pattern("PPP")
                .pattern("HHH")
                .pattern("PPP")
                .criterion(FabricRecipeProvider.hasItem(Items.HONEYCOMB), FabricRecipeProvider.conditionsFromItem(Items.HONEYCOMB))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Beehives.DARK_OAK_BEEHIVE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Beehives.JUNGLE_BEEHIVE)
                .input('H', Items.HONEYCOMB)
                .input('P', Blocks.JUNGLE_PLANKS)
                .pattern("PPP")
                .pattern("HHH")
                .pattern("PPP")
                .criterion(FabricRecipeProvider.hasItem(Items.HONEYCOMB), FabricRecipeProvider.conditionsFromItem(Items.HONEYCOMB))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Beehives.JUNGLE_BEEHIVE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Beehives.MANGROVE_BEEHIVE)
                .input('H', Items.HONEYCOMB)
                .input('P', Blocks.MANGROVE_PLANKS)
                .pattern("PPP")
                .pattern("HHH")
                .pattern("PPP")
                .criterion(FabricRecipeProvider.hasItem(Items.HONEYCOMB), FabricRecipeProvider.conditionsFromItem(Items.HONEYCOMB))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Beehives.MANGROVE_BEEHIVE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Beehives.BIRCH_BEEHIVE)
                .input('H', Items.HONEYCOMB)
                .input('P', Blocks.BIRCH_PLANKS)
                .pattern("PPP")
                .pattern("HHH")
                .pattern("PPP")
                .criterion(FabricRecipeProvider.hasItem(Items.HONEYCOMB), FabricRecipeProvider.conditionsFromItem(Items.HONEYCOMB))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Beehives.BIRCH_BEEHIVE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Beehives.SPRUCE_BEEHIVE)
                .input('H', Items.HONEYCOMB)
                .input('P', Blocks.SPRUCE_PLANKS)
                .pattern("PPP")
                .pattern("HHH")
                .pattern("PPP")
                .criterion(FabricRecipeProvider.hasItem(Items.HONEYCOMB), FabricRecipeProvider.conditionsFromItem(Items.HONEYCOMB))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Beehives.SPRUCE_BEEHIVE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Beehives.CRIMSON_BEEHIVE)
                .input('H', Items.HONEYCOMB)
                .input('P', Blocks.CRIMSON_PLANKS)
                .pattern("PPP")
                .pattern("HHH")
                .pattern("PPP")
                .criterion(FabricRecipeProvider.hasItem(Items.HONEYCOMB), FabricRecipeProvider.conditionsFromItem(Items.HONEYCOMB))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Beehives.CRIMSON_BEEHIVE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Beehives.WARPED_BEEHIVE)
                .input('H', Items.HONEYCOMB)
                .input('P', Blocks.WARPED_PLANKS)
                .pattern("PPP")
                .pattern("HHH")
                .pattern("PPP")
                .criterion(FabricRecipeProvider.hasItem(Items.HONEYCOMB), FabricRecipeProvider.conditionsFromItem(Items.HONEYCOMB))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Beehives.WARPED_BEEHIVE)));
    }
}
