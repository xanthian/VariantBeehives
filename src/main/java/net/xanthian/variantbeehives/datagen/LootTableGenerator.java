package net.xanthian.variantbeehives.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.xanthian.variantbeehives.block.Beehives;


public class LootTableGenerator extends FabricBlockLootTableProvider {
    public LootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(Beehives.ACACIA_BEEHIVE, block -> beehiveDrops(block));
        addDrop(Beehives.BAMBOO_BEEHIVE, block -> beehiveDrops(block));
        addDrop(Beehives.BIRCH_BEEHIVE, block -> beehiveDrops(block));
        addDrop(Beehives.CHERRY_BEEHIVE, block -> beehiveDrops(block));
        addDrop(Beehives.CRIMSON_BEEHIVE, block -> beehiveDrops(block));
        addDrop(Beehives.DARK_OAK_BEEHIVE, block -> beehiveDrops(block));
        addDrop(Beehives.JUNGLE_BEEHIVE, block -> beehiveDrops(block));
        addDrop(Beehives.MANGROVE_BEEHIVE, block -> beehiveDrops(block));
        addDrop(Beehives.SPRUCE_BEEHIVE, block -> beehiveDrops(block));
        addDrop(Beehives.WARPED_BEEHIVE, block -> beehiveDrops(block));
    }
}
