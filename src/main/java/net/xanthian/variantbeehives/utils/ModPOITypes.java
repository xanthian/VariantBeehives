package net.xanthian.variantbeehives.utils;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.registry.Registries;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.world.poi.PointOfInterestType;
import net.minecraft.world.poi.PointOfInterestTypes;
import net.xanthian.variantbeehives.block.VariantBeehiveBlock;
import net.xanthian.variantbeehives.mixin.PointOfInterestTypesAccessor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ModPOITypes {
    public static void init() {

        Map<BlockState, RegistryEntry<PointOfInterestType>> poiStatesToType = PointOfInterestTypesAccessor
                .getPointOfInterestStatesToType();
        RegistryEntry<PointOfInterestType> beeEntry = Registries.POINT_OF_INTEREST_TYPE
                .getEntry(PointOfInterestTypes.BEEHIVE).get();
        PointOfInterestType beePoiType = Registries.POINT_OF_INTEREST_TYPE.get(PointOfInterestTypes.BEEHIVE);
        List<BlockState> beeBlockStates = new ArrayList<>(beePoiType.blockStates);

        for (Block block : Registries.BLOCK) {
            if (block instanceof VariantBeehiveBlock beehiveBlock) {
                ImmutableList<BlockState> blockStates = beehiveBlock.getStateManager().getStates();

                for (BlockState blockState : blockStates) {
                    poiStatesToType.putIfAbsent(blockState, beeEntry);
                }
                beeBlockStates.addAll(blockStates);
            }
            beePoiType.blockStates = ImmutableSet.copyOf(beeBlockStates);
        }
    }
}