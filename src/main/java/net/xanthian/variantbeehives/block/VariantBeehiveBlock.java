package net.xanthian.variantbeehives.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.BeehiveBlock;
import net.minecraft.block.Blocks;

public class VariantBeehiveBlock extends BeehiveBlock {
    public VariantBeehiveBlock() {
        super(FabricBlockSettings.copy(Blocks.BEEHIVE));
    }
}
