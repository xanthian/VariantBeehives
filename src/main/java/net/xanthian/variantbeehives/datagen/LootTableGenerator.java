package net.xanthian.variantbeehives.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.fabricmc.fabric.api.resource.conditions.v1.DefaultResourceConditions;
import net.minecraft.block.Block;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.xanthian.variantbeehives.block.Vanilla;
import net.xanthian.variantbeehives.block.compatability.*;

import java.util.Map;

public class LootTableGenerator extends FabricBlockLootTableProvider {
    public LootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {

        for (Block block : Vanilla.VANILLA_HIVES.values()) {
            addDrop(block, BlockLootTableGenerator::beehiveDrops);
        }
        registerLootTables(AdAstra.AA_HIVES, "ad_astra");
        registerLootTables(BeachParty.LDBP_HIVES, "beachparty");
        registerLootTables(BetterArcheology.BA_HIVES, "betterarcheology");
        registerLootTables(Bewitchment.BW_HIVES, "bewitchment");
        registerLootTables(BiomeMakeover.BM_HIVES, "biomemakeover");
        registerLootTables(Blockus.BLS_HIVES, "blockus");
        registerLootTables(DeeperAndDarker.DAD_HIVES, "deeperdarker");
        registerLootTables(EldritchEnd.EE_HIVES, "eldritch_end");
        registerLootTables(MineCells.MC_HIVES, "minecells");
        registerSpecialLootTable(NaturesSpirit.NS_HIVES, "natures_spirit");
        registerLootTables(Promenade.PROM_HIVES, "promenade");
        registerSpecialLootTable(RegionsUnexplored.RU_HIVES, "regions_unexplored");
        registerLootTables(SnifferPlus.SP_HIVES, "snifferplus");
        registerLootTables(TechReborn.TR_HIVES, "techreborn");
        registerLootTables(Vinery.LDV_HIVES, "vinery");
    }

    private void registerLootTables(Map<Identifier, Block> blockMap, String modId) {
        for (Block block : blockMap.values()) {
            withConditions(DefaultResourceConditions.allModsLoaded(modId)).addDrop(block, BlockLootTableGenerator::beehiveDrops);
        }
    }

    public void registerSpecialLootTable(Map<Identifier, Block> beehives, String modId) {
        for (Map.Entry<Identifier, Block> entry : beehives.entrySet()) {
            Identifier beehiveId = entry.getKey();
            Block beehive = entry.getValue();
            String path = beehiveId.getPath();
            int firstUnderscoreIndex = path.indexOf('_');
            int lastUnderscoreIndex = path.lastIndexOf('_');
            if (firstUnderscoreIndex != -1 && lastUnderscoreIndex != -1 && lastUnderscoreIndex > firstUnderscoreIndex) {
                String plankName = path.substring(firstUnderscoreIndex + 1, lastUnderscoreIndex);
                String plankPath = modId + ":" + plankName + "_planks";
                withConditions(DefaultResourceConditions.and(DefaultResourceConditions.allModsLoaded(modId),
                        DefaultResourceConditions.registryContains(RegistryKey.of(RegistryKeys.BLOCK, new Identifier(plankPath)))))
                        .addDrop(beehive, BlockLootTableGenerator::beehiveDrops);

            } else {
                System.out.println("Invalid block name format: " + path);
            }
        }
    }
}