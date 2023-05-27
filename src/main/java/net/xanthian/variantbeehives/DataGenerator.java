package net.xanthian.variantbeehives;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.xanthian.variantbeehives.datagen.LootTableGenerator;
import net.xanthian.variantbeehives.datagen.ModelGenerator;
import net.xanthian.variantbeehives.datagen.RecipeGenerator;

public class DataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(LootTableGenerator::new);
        pack.addProvider(RecipeGenerator::new);
        pack.addProvider(ModelGenerator::new);

    }
}
