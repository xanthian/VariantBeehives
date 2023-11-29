package net.xanthian.variantbeehives.block.compatability;

import com.google.common.collect.Maps;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.xanthian.variantbeehives.Initialise;
import net.xanthian.variantbeehives.block.VariantBeehiveBlock;

import java.util.Map;

public class AdAstra {

    public static Map<Identifier, Block> AA_HIVES = Maps.newHashMap();

    public static Block AA_AERONOS_BEEHIVE;
    public static Block AA_GLACIAN_BEEHIVE;
    public static Block AA_STROPHAR_BEEHIVE;

    public static void registerHives() {
        AA_AERONOS_BEEHIVE = registerBeehives("aa_aeronos_beehive");
        AA_GLACIAN_BEEHIVE = registerBeehives("aa_glacian_beehive");
        AA_STROPHAR_BEEHIVE = registerBeehives("aa_strophar_beehive");
    }

    private static Block register(String name, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name);
        Registry.register(Registries.BLOCK, identifier, block);
        AA_HIVES.put(identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new FabricItemSettings()));
        return block;
    }

    private static Block registerBeehives(String name) {
        return register(name, new VariantBeehiveBlock());
    }
}