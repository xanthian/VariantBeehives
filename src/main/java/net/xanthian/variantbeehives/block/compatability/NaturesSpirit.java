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

public class NaturesSpirit {

    public static Map<Identifier, Block> NS_HIVES = Maps.newHashMap();

    public static Block NS_ASPEN_BEEHIVE;
    public static Block NS_CEDAR_BEEHIVE;
    public static Block NS_COCONUT_BEEHIVE;
    public static Block NS_CYPRESS_BEEHIVE;
    public static Block NS_FIR_BEEHIVE;
    public static Block NS_GHAF_BEEHIVE;
    public static Block NS_JOSHUA_BEEHIVE;
    public static Block NS_MAPLE_BEEHIVE;
    public static Block NS_LARCH_BEEHIVE;
    public static Block NS_OLIVE_BEEHIVE;
    public static Block NS_PALO_VERDE_BEEHIVE;
    public static Block NS_REDWOOD_BEEHIVE;
    public static Block NS_SUGI_BEEHIVE;
    public static Block NS_WILLOW_BEEHIVE;
    public static Block NS_WISTERIA_BEEHIVE;

    public static void registerHives() {
        NS_ASPEN_BEEHIVE = registerBeehives("ns_aspen_beehive");
        NS_CEDAR_BEEHIVE = registerBeehives("ns_cedar_beehive");
        NS_COCONUT_BEEHIVE = registerBeehives("ns_coconut_beehive");
        NS_CYPRESS_BEEHIVE = registerBeehives("ns_cypress_beehive");
        NS_FIR_BEEHIVE = registerBeehives("ns_fir_beehive");
        NS_GHAF_BEEHIVE = registerBeehives("ns_ghaf_beehive");
        NS_JOSHUA_BEEHIVE = registerBeehives("ns_joshua_beehive");
        NS_LARCH_BEEHIVE = registerBeehives("ns_larch_beehive");
        NS_MAPLE_BEEHIVE = registerBeehives("ns_maple_beehive");
        NS_OLIVE_BEEHIVE = registerBeehives("ns_olive_beehive");
        NS_PALO_VERDE_BEEHIVE = registerBeehives("ns_palo_verde_beehive");
        NS_REDWOOD_BEEHIVE = registerBeehives("ns_redwood_beehive");
        NS_SUGI_BEEHIVE = registerBeehives("ns_sugi_beehive");
        NS_WILLOW_BEEHIVE = registerBeehives("ns_willow_beehive");
        NS_WISTERIA_BEEHIVE = registerBeehives("ns_wisteria_beehive");
    }

    private static Block register(String name, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name);
        Registry.register(Registries.BLOCK, identifier, block);
        NS_HIVES.put(identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new FabricItemSettings()));
        return block;
    }

    private static Block registerBeehives(String name) {
        return register(name, new VariantBeehiveBlock());
    }
}