package net.xanthian.variantbeehives.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import net.xanthian.variantbeehives.block.Beehives;

import java.util.concurrent.CompletableFuture;

import static net.xanthian.variantbeehives.utils.ModItemTags.BEEHIVES;

public class ItemTagGenerator extends FabricTagProvider.ItemTagProvider {
    public ItemTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    private static final TagKey<Item> NON_FLAMMABLE_WOOD = TagKey.of(Registries.ITEM.getKey(), new Identifier("minecraft:non_flammable_wood"));

        @Override
        protected void configure (RegistryWrapper.WrapperLookup arg){

            getOrCreateTagBuilder(BEEHIVES)
                    .add(Beehives.ACACIA_BEEHIVE.asItem())
                    .add(Beehives.BAMBOO_BEEHIVE.asItem())
                    .add(Beehives.BIRCH_BEEHIVE.asItem())
                    .add(Beehives.CHERRY_BEEHIVE.asItem())
                    .add(Beehives.CRIMSON_BEEHIVE.asItem())
                    .add(Beehives.DARK_OAK_BEEHIVE.asItem())
                    .add(Beehives.JUNGLE_BEEHIVE.asItem())
                    .add(Beehives.MANGROVE_BEEHIVE.asItem())
                    .add(Beehives.SPRUCE_BEEHIVE.asItem())
                    .add(Beehives.WARPED_BEEHIVE.asItem());

            getOrCreateTagBuilder(NON_FLAMMABLE_WOOD)
                    .add(Beehives.CRIMSON_BEEHIVE.asItem())
                    .add(Beehives.WARPED_BEEHIVE.asItem());
        }
    }