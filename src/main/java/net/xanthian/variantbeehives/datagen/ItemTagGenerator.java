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

import static net.xanthian.variantbeehives.Initialise.MOD_ID;

public class ItemTagGenerator extends FabricTagProvider.ItemTagProvider {
    public ItemTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

        private static final TagKey<Item> BEEHIVES = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID,"beehives"));
        private static final TagKey<Item> NON_FLAMMABLE_WOOD = TagKey.of(Registries.ITEM.getKey(), new Identifier("minecraft:non_flammable_wood"));

        @Override
        protected void configure (RegistryWrapper.WrapperLookup arg){

            getOrCreateTagBuilder(BEEHIVES)
                    .add(Item.fromBlock(Beehives.ACACIA_BEEHIVE))
                    .add(Item.fromBlock(Beehives.BAMBOO_BEEHIVE))
                    .add(Item.fromBlock(Beehives.BIRCH_BEEHIVE))
                    .add(Item.fromBlock(Beehives.CHERRY_BEEHIVE))
                    .add(Item.fromBlock(Beehives.CRIMSON_BEEHIVE))
                    .add(Item.fromBlock(Beehives.DARK_OAK_BEEHIVE))
                    .add(Item.fromBlock(Beehives.JUNGLE_BEEHIVE))
                    .add(Item.fromBlock(Beehives.MANGROVE_BEEHIVE))
                    .add(Item.fromBlock(Beehives.SPRUCE_BEEHIVE))
                    .add(Item.fromBlock(Beehives.WARPED_BEEHIVE));

            getOrCreateTagBuilder(NON_FLAMMABLE_WOOD)
                    .add(Item.fromBlock(Beehives.CRIMSON_BEEHIVE))
                    .add(Item.fromBlock(Beehives.WARPED_BEEHIVE));
        }
    }