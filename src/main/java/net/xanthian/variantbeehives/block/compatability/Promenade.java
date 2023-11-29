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

public class Promenade {

    public static Map<Identifier, Block> PROM_HIVES = Maps.newHashMap();

    public static Block PROM_DARK_AMARANTH_BEEHIVE;
    public static Block PROM_MAPLE_BEEHIVE;
    public static Block PROM_PALM_BEEHIVE;
    public static Block PROM_SAKURA_BEEHIVE;

    public static void registerHives() {
        PROM_DARK_AMARANTH_BEEHIVE = registerBeehives("prom_dark_amaranth_beehive");
        PROM_MAPLE_BEEHIVE = registerBeehives("prom_maple_beehive");
        PROM_PALM_BEEHIVE = registerBeehives("prom_palm_beehive");
        PROM_SAKURA_BEEHIVE = registerBeehives("prom_sakura_beehive");
    }

    private static Block register(String name, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name);
        Registry.register(Registries.BLOCK, identifier, block);
        PROM_HIVES.put(identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new FabricItemSettings()));
        return block;
    }

    private static Block registerBeehives(String name) {
        return register(name, new VariantBeehiveBlock());
    }
}