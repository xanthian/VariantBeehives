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

public class Cinderscapes {
    public static Map<Identifier, Block> CS_HIVES = Maps.newHashMap();

    public static Block CS_SCORCHED_BEEHIVE;
    public static Block CS_UMBRAL_BEEHIVE;

    public static void registerHives() {
        CS_SCORCHED_BEEHIVE = registerBeehives("cs_scorched_beehive");
        CS_UMBRAL_BEEHIVE = registerBeehives("cs_umbral_beehive");
    }

    public static Block register(String name, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name);
        Registry.register(Registries.BLOCK, identifier, block);
        CS_HIVES.put(identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new FabricItemSettings()));
        return block;
    }

    public static Block registerBeehives(String name) {
        return register(name, new VariantBeehiveBlock());
    }
}