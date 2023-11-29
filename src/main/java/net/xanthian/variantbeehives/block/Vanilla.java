package net.xanthian.variantbeehives.block;

import com.google.common.collect.Maps;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.BeehiveBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.xanthian.variantbeehives.Initialise;

import java.util.Map;

public class Vanilla {

    public static final BeehiveBlock ACACIA_BEEHIVE = new VariantBeehiveBlock();
    public static final BeehiveBlock BAMBOO_BEEHIVE = new VariantBeehiveBlock();
    public static final BeehiveBlock CHERRY_BEEHIVE = new VariantBeehiveBlock();
    public static final BeehiveBlock DARK_OAK_BEEHIVE = new VariantBeehiveBlock();
    public static final BeehiveBlock JUNGLE_BEEHIVE = new VariantBeehiveBlock();
    public static final BeehiveBlock MANGROVE_BEEHIVE = new VariantBeehiveBlock();
    public static final BeehiveBlock BIRCH_BEEHIVE = new VariantBeehiveBlock();
    public static final BeehiveBlock SPRUCE_BEEHIVE = new VariantBeehiveBlock();
    public static final BeehiveBlock WARPED_BEEHIVE = new VariantBeehiveBlock();
    public static final BeehiveBlock CRIMSON_BEEHIVE = new VariantBeehiveBlock();
    public static Map<Identifier, Block> VANILLA_HIVES = Maps.newHashMap();

    public static void registerVanillaBeehives() {
        registerBeehiveBlock("acacia_beehive", ACACIA_BEEHIVE);
        registerBeehiveBlock("bamboo_beehive", BAMBOO_BEEHIVE);
        registerBeehiveBlock("cherry_beehive", CHERRY_BEEHIVE);
        registerBeehiveBlock("dark_oak_beehive", DARK_OAK_BEEHIVE);
        registerBeehiveBlock("jungle_beehive", JUNGLE_BEEHIVE);
        registerBeehiveBlock("mangrove_beehive", MANGROVE_BEEHIVE);
        registerBeehiveBlock("birch_beehive", BIRCH_BEEHIVE);
        registerBeehiveBlock("spruce_beehive", SPRUCE_BEEHIVE);
        registerBeehiveBlock("crimson_beehive", CRIMSON_BEEHIVE);
        registerBeehiveBlock("warped_beehive", WARPED_BEEHIVE);
    }

    private static void registerBeehiveBlock(String name, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name);
        Registry.register(Registries.BLOCK, identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new FabricItemSettings()));
        VANILLA_HIVES.put(identifier, block);
    }
}