package net.xanthian.variantbeehives.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.TextureMap;
import net.minecraft.util.Identifier;
import net.xanthian.variantbeehives.block.Vanilla;
import net.xanthian.variantbeehives.block.compatability.*;

import java.util.Map;

public class ModelGenerator extends FabricModelProvider {
    public ModelGenerator(FabricDataOutput output) {
        super(output);
    }

    public static void registerModel(BlockStateModelGenerator blockStateModelGenerator, Map<Identifier, Block> blockMap) {
        for (Block block : blockMap.values()) {
            blockStateModelGenerator.registerBeehive(block, TextureMap::sideFrontEnd);
        }
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        registerModel(blockStateModelGenerator, Vanilla.VANILLA_HIVES);
        registerModel(blockStateModelGenerator, AdAstra.AA_HIVES);
        registerModel(blockStateModelGenerator, BeachParty.LDBP_HIVES);
        registerModel(blockStateModelGenerator, BetterArcheology.BA_HIVES);
        registerModel(blockStateModelGenerator, Bewitchment.BW_HIVES);
        registerModel(blockStateModelGenerator, BiomeMakeover.BM_HIVES);
        registerModel(blockStateModelGenerator, Blockus.BLS_HIVES);
        registerModel(blockStateModelGenerator, DeeperAndDarker.DAD_HIVES);
        registerModel(blockStateModelGenerator, EldritchEnd.EE_HIVES);
        registerModel(blockStateModelGenerator, MineCells.MC_HIVES);
        registerModel(blockStateModelGenerator, NaturesSpirit.NS_HIVES);
        registerModel(blockStateModelGenerator, Promenade.PROM_HIVES);
        registerModel(blockStateModelGenerator, RegionsUnexplored.RU_HIVES);
        registerModel(blockStateModelGenerator, SnifferPlus.SP_HIVES);
        registerModel(blockStateModelGenerator, TechReborn.TR_HIVES);
        registerModel(blockStateModelGenerator, Vinery.LDV_HIVES);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }
}