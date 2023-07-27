package net.xanthian.variantbeehives.utils;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;

import net.minecraft.block.FireBlock;

import net.xanthian.variantbeehives.block.Beehives;

public class ModRegistries {

    public static void registerFuelandFlammable() {
        registerFlammableBlocks();
    }

    private static void registerFlammableBlocks() {
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();

/**
 Copy from {@link FireBlock#registerDefaultFlammables()}
 **/

        registry.add(Beehives.ACACIA_BEEHIVE, 5, 20);
        registry.add(Beehives.BAMBOO_BEEHIVE, 5, 20);
        registry.add(Beehives.BIRCH_BEEHIVE, 5, 20);
        registry.add(Beehives.CHERRY_BEEHIVE, 5, 20);
        registry.add(Beehives.DARK_OAK_BEEHIVE, 5, 20);
        registry.add(Beehives.JUNGLE_BEEHIVE, 5, 20);
        registry.add(Beehives.MANGROVE_BEEHIVE, 5, 20);
        registry.add(Beehives.SPRUCE_BEEHIVE, 5, 20);
    }
}