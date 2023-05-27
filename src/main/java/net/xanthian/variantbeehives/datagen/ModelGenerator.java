package net.xanthian.variantbeehives.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.TextureMap;
import net.xanthian.variantbeehives.block.Beehives;

public class ModelGenerator extends FabricModelProvider {
    public ModelGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerBeehive(Beehives.ACACIA_BEEHIVE, TextureMap::sideFrontEnd);
        blockStateModelGenerator.registerBeehive(Beehives.BAMBOO_BEEHIVE, TextureMap::sideFrontEnd);
        blockStateModelGenerator.registerBeehive(Beehives.CHERRY_BEEHIVE, TextureMap::sideFrontEnd);
        blockStateModelGenerator.registerBeehive(Beehives.DARK_OAK_BEEHIVE, TextureMap::sideFrontEnd);
        blockStateModelGenerator.registerBeehive(Beehives.JUNGLE_BEEHIVE, TextureMap::sideFrontEnd);
        blockStateModelGenerator.registerBeehive(Beehives.MANGROVE_BEEHIVE, TextureMap::sideFrontEnd);
        blockStateModelGenerator.registerBeehive(Beehives.BIRCH_BEEHIVE, TextureMap::sideFrontEnd);
        blockStateModelGenerator.registerBeehive(Beehives.SPRUCE_BEEHIVE, TextureMap::sideFrontEnd);
        blockStateModelGenerator.registerBeehive(Beehives.CRIMSON_BEEHIVE, TextureMap::sideFrontEnd);
        blockStateModelGenerator.registerBeehive(Beehives.WARPED_BEEHIVE, TextureMap::sideFrontEnd);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }
}
