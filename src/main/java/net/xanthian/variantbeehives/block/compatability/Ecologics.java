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

public class Ecologics {

    public static Map<Identifier, Block> ECO_HIVES = Maps.newHashMap();

    public static Block ECO_AZALEA_BEEHIVE;
    public static Block ECO_COCONUT_BEEHIVE;
    public static Block ECO_FLOWERING_AZALEA_BEEHIVE;
    public static Block ECO_WALLNUT_BEEHIVE;

    public static void registerHives() {
        ECO_AZALEA_BEEHIVE = registerBeehives("eco_azalea_beehive");
        ECO_COCONUT_BEEHIVE = registerBeehives("eco_coconut_beehive");
        ECO_FLOWERING_AZALEA_BEEHIVE = registerBeehives("eco_flowering_azalea_beehive");
        ECO_WALLNUT_BEEHIVE = registerBeehives("eco_walnut_beehive");
    }

    public static Block register(String name, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name);
        Registry.register(Registries.BLOCK, identifier, block);
        ECO_HIVES.put(identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new FabricItemSettings()));
        return block;
    }

    public static Block registerBeehives(String name) {
        return register(name, new VariantBeehiveBlock());
    }
}