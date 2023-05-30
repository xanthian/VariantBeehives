package net.xanthian.variantbeehives.utils;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.FireBlock;
import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import net.xanthian.variantbeehives.block.Beehives;

public class ModRegistries {

    public static void registerFuelandFlammable() {
        registerFlammableBlocks();
        // registerFuel(); cannot be used as fuel
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

    private static void registerFuel() {
        FuelRegistry registry = FuelRegistry.INSTANCE;

/**
 Copy from {@link AbstractFurnaceBlockEntity#createFuelTimeMap()}
 **/

        registry.add(Beehives.ACACIA_BEEHIVE, 0);
        registry.add(Beehives.BAMBOO_BEEHIVE, 0);
        registry.add(Beehives.BIRCH_BEEHIVE, 0);
        registry.add(Beehives.CHERRY_BEEHIVE, 0);
        registry.add(Beehives.DARK_OAK_BEEHIVE, 0);
        registry.add(Beehives.JUNGLE_BEEHIVE, 0);
        registry.add(Beehives.MANGROVE_BEEHIVE, 0);
        registry.add(Beehives.SPRUCE_BEEHIVE, 0);
    }
}
