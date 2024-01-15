package net.xanthian.variantbeehives.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fabricmc.fabric.api.resource.conditions.v1.DefaultResourceConditions;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.xanthian.variantbeehives.block.Vanilla;
import net.xanthian.variantbeehives.block.compatability.*;
import net.xanthian.variantbeehives.utils.ModItemTags;

import java.util.Map;
import java.util.function.Consumer;

public class RecipeGenerator extends FabricRecipeProvider {
    public RecipeGenerator(FabricDataOutput output) {
        super(output);
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

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {

        offerBeehiveRecipe(exporter, Vanilla.ACACIA_BEEHIVE, Blocks.ACACIA_PLANKS);
        offerBeehiveRecipe(exporter, Vanilla.BAMBOO_BEEHIVE, Blocks.BAMBOO_PLANKS);
        offerBeehiveRecipe(exporter, Vanilla.BIRCH_BEEHIVE, Blocks.BIRCH_PLANKS);
        offerBeehiveRecipe(exporter, Vanilla.CHERRY_BEEHIVE, Blocks.CHERRY_PLANKS);
        offerBeehiveRecipe(exporter, Vanilla.CRIMSON_BEEHIVE, Blocks.CRIMSON_PLANKS);
        offerBeehiveRecipe(exporter, Vanilla.DARK_OAK_BEEHIVE, Blocks.DARK_OAK_PLANKS);
        offerBeehiveRecipe(exporter, Vanilla.JUNGLE_BEEHIVE, Blocks.JUNGLE_PLANKS);
        offerBeehiveRecipe(exporter, Vanilla.MANGROVE_BEEHIVE, Blocks.MANGROVE_PLANKS);
        offerBeehiveRecipe(exporter, Vanilla.SPRUCE_BEEHIVE, Blocks.SPRUCE_PLANKS);
        offerBeehiveRecipe(exporter, Vanilla.WARPED_BEEHIVE, Blocks.WARPED_PLANKS);

        registerBeehiveRecipe(exporter, AdAstra.AA_HIVES, "ad_astra");
        registerBeehiveRecipe(exporter, BeachParty.LDBP_HIVES, "beachparty");
        registerBeehiveRecipe(exporter, BetterArcheology.BA_HIVES, "betterarcheology");
        registerBeehiveRecipe(exporter, Bewitchment.BW_HIVES, "bewitchment");
        registerBeehiveRecipe(exporter, BiomeMakeover.BM_HIVES, "biomemakeover");
        registerBeehiveRecipe(exporter, Blockus.BLS_HIVES, "blockus");
        //registerBeehiveRecipe(exporter, Botania.BOT_HIVES, "botania");
        registerBeehiveRecipe(exporter, Cinderscapes.CS_HIVES, "cinderscapes");
        registerBeehiveRecipe(exporter, DeeperAndDarker.DAD_HIVES, "deeperdarker");
        registerBeehiveRecipe(exporter, Desolation.DS_HIVES, "desolation");
        registerBeehiveRecipe(exporter, Ecologics.ECO_HIVES, "ecologics");
        registerBeehiveRecipe(exporter, EldritchEnd.EE_HIVES, "eldritch_end");
        registerBeehiveRecipe(exporter, Meadow.LDM_HIVES, "meadow");
        registerBeehiveRecipe(exporter, MineCells.MC_HIVES, "minecells");
        registerBeehiveRecipe(exporter, NaturesSpirit.NS_HIVES, "natures_spirit");
        registerBeehiveRecipe(exporter, Promenade.PROM_HIVES, "promenade");
        registerBeehiveRecipe(exporter, RegionsUnexplored.RU_HIVES, "regions_unexplored");
        //registerBeehiveRecipe(exporter, SnifferPlus.SP_HIVES, "snifferplus");
        registerBeehiveRecipe(exporter, TechReborn.TR_HIVES, "techreborn");
        registerBeehiveRecipe(exporter, Vinery.LDV_HIVES, "vinery");

        // Uncrafting recipe
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.BEEHIVE, 1)
                .input(ModItemTags.BEEHIVES)
                .criterion("has_beehive", InventoryChangedCriterion.Conditions.items(Items.BEEHIVE))
                .offerTo(exporter, new Identifier("variantbeehives", "beehive"));

    }

    public void registerBeehiveRecipe(Consumer<RecipeJsonProvider> exporter, Map<Identifier, Block> beehives, String modId) {
        registerBeehiveRecipe(exporter, beehives, modId, "_planks");
    }

    public void registerBeehiveRecipe(Consumer<RecipeJsonProvider> exporter, Map<Identifier, Block> beehives, String modId, String plankSuffix) {
        for (Map.Entry<Identifier, Block> entry : beehives.entrySet()) {
            Identifier beehiveId = entry.getKey();
            Block beehive = entry.getValue();
            String path = beehiveId.getPath();
            int firstUnderscoreIndex = path.indexOf('_');
            int lastUnderscoreIndex = path.lastIndexOf('_');
            if (firstUnderscoreIndex != -1 && lastUnderscoreIndex != -1 && lastUnderscoreIndex > firstUnderscoreIndex) {
                String plankName = path.substring(firstUnderscoreIndex + 1, lastUnderscoreIndex);
                String plankPath = modId + ":" + plankName + plankSuffix;
                offerBeehiveRecipe(withConditions(exporter, DefaultResourceConditions.and(DefaultResourceConditions.allModsLoaded(modId), DefaultResourceConditions.registryContains(RegistryKey.of(RegistryKeys.BLOCK, new Identifier(plankPath))))), beehive, Registries.ITEM.get(new Identifier(plankPath)));
            } else {
                System.out.println("Invalid block name format: " + path);
            }
        }
    }
}