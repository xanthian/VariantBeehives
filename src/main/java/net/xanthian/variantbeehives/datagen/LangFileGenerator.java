package net.xanthian.variantbeehives.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.block.Blocks;
import net.xanthian.variantbeehives.Initialise;
import net.xanthian.variantbeehives.block.Beehives;

public class LangFileGenerator extends FabricLanguageProvider {
    public LangFileGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

        @Override
        public void generateTranslations(TranslationBuilder translationBuilder) {

            translationBuilder.add(Initialise.ITEM_GROUP, "Variant Beehives");

            translationBuilder.add(Beehives.ACACIA_BEEHIVE, "Acacia Beehive");
            translationBuilder.add(Beehives.BAMBOO_BEEHIVE, "Bamboo Beehive");
            translationBuilder.add(Beehives.BIRCH_BEEHIVE, "Birch Beehive");
            translationBuilder.add(Beehives.CHERRY_BEEHIVE, "Cherry Beehive");
            translationBuilder.add(Beehives.CRIMSON_BEEHIVE, "Crimson Beehive");
            translationBuilder.add(Beehives.DARK_OAK_BEEHIVE, "Dark Oak Beehive");
            translationBuilder.add(Beehives.JUNGLE_BEEHIVE, "Jungle Beehive");
            translationBuilder.add(Beehives.MANGROVE_BEEHIVE, "Mangrove Beehive");
            translationBuilder.add(Blocks.BEEHIVE, "Oak Beehive");
            translationBuilder.add(Beehives.SPRUCE_BEEHIVE, "Spruce Beehive");
            translationBuilder.add(Beehives.WARPED_BEEHIVE, "Warped Beehive");
        }
}
