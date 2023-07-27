package net.xanthian.variantbeehives.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.xanthian.variantbeehives.block.Beehives;


public class LootTableGenerator extends FabricBlockLootTableProvider {
    public LootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(Beehives.ACACIA_BEEHIVE, BlockLootTableGenerator::beehiveDrops);
        addDrop(Beehives.BAMBOO_BEEHIVE, BlockLootTableGenerator::beehiveDrops);
        addDrop(Beehives.BIRCH_BEEHIVE, BlockLootTableGenerator::beehiveDrops);
        addDrop(Beehives.CHERRY_BEEHIVE, BlockLootTableGenerator::beehiveDrops);
        addDrop(Beehives.CRIMSON_BEEHIVE, BlockLootTableGenerator::beehiveDrops);
        addDrop(Beehives.DARK_OAK_BEEHIVE, BlockLootTableGenerator::beehiveDrops);
        addDrop(Beehives.JUNGLE_BEEHIVE, BlockLootTableGenerator::beehiveDrops);
        addDrop(Beehives.MANGROVE_BEEHIVE, BlockLootTableGenerator::beehiveDrops);
        addDrop(Beehives.SPRUCE_BEEHIVE, BlockLootTableGenerator::beehiveDrops);
        addDrop(Beehives.WARPED_BEEHIVE, BlockLootTableGenerator::beehiveDrops);
    }
}
