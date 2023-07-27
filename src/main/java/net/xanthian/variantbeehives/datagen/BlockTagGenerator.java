package net.xanthian.variantbeehives.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;

import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import net.xanthian.variantbeehives.block.Beehives;

import java.util.concurrent.CompletableFuture;

import static net.xanthian.variantbeehives.Initialise.MOD_ID;

public class BlockTagGenerator extends FabricTagProvider.BlockTagProvider {
    public BlockTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    private static final TagKey<Block> BEEHIVES = TagKey.of(Registries.BLOCK.getKey(), new Identifier(MOD_ID,"beehives"));
    private static final TagKey<Block> MINEABLE_AXE = TagKey.of(Registries.BLOCK.getKey(), new Identifier("minecraft:mineable/axe"));
    private static final TagKey<Block> MC_BEEHIVES = TagKey.of(Registries.BLOCK.getKey(), new Identifier("minecraft:beehives"));

    @Override
    protected void configure (RegistryWrapper.WrapperLookup arg){

        getOrCreateTagBuilder(BEEHIVES)
                .add(Beehives.ACACIA_BEEHIVE)
                .add(Beehives.BAMBOO_BEEHIVE)
                .add(Beehives.BIRCH_BEEHIVE)
                .add(Beehives.CHERRY_BEEHIVE)
                .add(Beehives.CRIMSON_BEEHIVE)
                .add(Beehives.DARK_OAK_BEEHIVE)
                .add(Beehives.JUNGLE_BEEHIVE)
                .add(Beehives.MANGROVE_BEEHIVE)
                .add(Beehives.SPRUCE_BEEHIVE)
                .add(Beehives.WARPED_BEEHIVE);

        getOrCreateTagBuilder(MINEABLE_AXE)
                .addTag(BEEHIVES);

        getOrCreateTagBuilder(MC_BEEHIVES)
                .addTag(BEEHIVES);
    }
}