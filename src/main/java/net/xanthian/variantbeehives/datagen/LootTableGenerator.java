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
        beehiveDrops(Beehives.ACACIA_BEEHIVE);
        beehiveDrops(Beehives.BAMBOO_BEEHIVE);
        beehiveDrops(Beehives.CHERRY_BEEHIVE);
        beehiveDrops(Beehives.DARK_OAK_BEEHIVE);
        beehiveDrops(Beehives.JUNGLE_BEEHIVE);
        beehiveDrops(Beehives.MANGROVE_BEEHIVE);
        beehiveDrops(Beehives.BIRCH_BEEHIVE);
        beehiveDrops(Beehives.SPRUCE_BEEHIVE);
        beehiveDrops(Beehives.CRIMSON_BEEHIVE);
        beehiveDrops(Beehives.WARPED_BEEHIVE);
        beehiveDrops(Beehives.MANGROVE_BEEHIVE);
    }
}
