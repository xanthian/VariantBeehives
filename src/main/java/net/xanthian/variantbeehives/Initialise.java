package net.xanthian.variantbeehives;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import net.xanthian.variantbeehives.block.Beehives;
import net.xanthian.variantbeehives.utils.ModPOITypes;
import net.xanthian.variantbeehives.utils.ModRegistries;

public class Initialise implements ModInitializer {

    public static final String MOD_ID = "variantbeehives";

    public static final RegistryKey<ItemGroup> ITEM_GROUP = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(MOD_ID, "variantbeehives"));

    @Override
    public void onInitialize() {

        Registry.register(Registries.ITEM_GROUP, ITEM_GROUP, FabricItemGroup.builder()
                .displayName(Text.translatable("variantbeehives.group.variantbeehives"))
                .icon(() -> new ItemStack(Beehives.MANGROVE_BEEHIVE))
                .entries((context, entries) -> {
                    entries.add(Beehives.ACACIA_BEEHIVE);
                    entries.add(Beehives.BAMBOO_BEEHIVE);
                    entries.add(Beehives.BIRCH_BEEHIVE);
                    entries.add(Beehives.CHERRY_BEEHIVE);
                    entries.add(Beehives.CRIMSON_BEEHIVE);
                    entries.add(Beehives.DARK_OAK_BEEHIVE);
                    entries.add(Beehives.JUNGLE_BEEHIVE);
                    entries.add(Beehives.MANGROVE_BEEHIVE);
                    entries.add(Blocks.BEEHIVE); // Oak
                    entries.add(Beehives.SPRUCE_BEEHIVE);
                    entries.add(Beehives.WARPED_BEEHIVE);
                })
                .build());

        Beehives.registerVanillaHives();

        ModRegistries.registerFuelandFlammable();

        ModPOITypes.init();
    }
}