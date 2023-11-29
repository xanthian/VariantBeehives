package net.xanthian.variantbeehives.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.xanthian.variantbeehives.block.Vanilla;
import net.xanthian.variantbeehives.block.compatability.*;

import java.util.Map;

public class LangFileGenerator extends FabricLanguageProvider {
    public LangFileGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    public static String generateBlockDisplayName(Block block) {
        Identifier name = Registries.BLOCK.getId(block);
        String blockName = name.getPath();
        int underscoreIndex = blockName.indexOf('_');
        if (underscoreIndex != -1 && underscoreIndex < blockName.length() - 1) {
            blockName = blockName.substring(underscoreIndex + 1);
        }
        String[] parts = blockName.split("_");
        StringBuilder displayName = new StringBuilder();
        for (String part : parts) {
            displayName.append(Character.toUpperCase(part.charAt(0))).append(part.substring(1)).append(" ");
        }
        return displayName.toString().trim();
    }

    private static void registerTranslations(TranslationBuilder translationBuilder, Map<Identifier, Block> blockMap) {
        for (Block block : blockMap.values()) {
            translationBuilder.add(block, generateBlockDisplayName(block));
        }
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {

        translationBuilder.add(Vanilla.ACACIA_BEEHIVE, "Acacia Beehive");
        translationBuilder.add(Vanilla.BAMBOO_BEEHIVE, "Bamboo Beehive");
        translationBuilder.add(Vanilla.BIRCH_BEEHIVE, "Birch Beehive");
        translationBuilder.add(Vanilla.CHERRY_BEEHIVE, "Cherry Beehive");
        translationBuilder.add(Vanilla.CRIMSON_BEEHIVE, "Crimson Beehive");
        translationBuilder.add(Vanilla.DARK_OAK_BEEHIVE, "Dark Oak Beehive");
        translationBuilder.add(Vanilla.JUNGLE_BEEHIVE, "Jungle Beehive");
        translationBuilder.add(Vanilla.MANGROVE_BEEHIVE, "Mangrove Beehive");
        translationBuilder.add(Blocks.BEEHIVE, "Oak Beehive");
        translationBuilder.add(Vanilla.SPRUCE_BEEHIVE, "Spruce Beehive");
        translationBuilder.add(Vanilla.WARPED_BEEHIVE, "Warped Beehive");

        registerTranslations(translationBuilder, AdAstra.AA_HIVES);
        registerTranslations(translationBuilder, BeachParty.LDBP_HIVES);
        registerTranslations(translationBuilder, BetterArcheology.BA_HIVES);
        registerTranslations(translationBuilder, Bewitchment.BW_HIVES);
        registerTranslations(translationBuilder, BiomeMakeover.BM_HIVES);
        registerTranslations(translationBuilder, Blockus.BLS_HIVES);
        registerTranslations(translationBuilder, DeeperAndDarker.DAD_HIVES);
        registerTranslations(translationBuilder, EldritchEnd.EE_HIVES);
        registerTranslations(translationBuilder, MineCells.MC_HIVES);
        registerTranslations(translationBuilder, NaturesSpirit.NS_HIVES);
        registerTranslations(translationBuilder, Promenade.PROM_HIVES);
        registerTranslations(translationBuilder, RegionsUnexplored.RU_HIVES);
        registerTranslations(translationBuilder, SnifferPlus.SP_HIVES);
        registerTranslations(translationBuilder, TechReborn.TR_HIVES);
        registerTranslations(translationBuilder, Vinery.LDV_HIVES);
    }
}
