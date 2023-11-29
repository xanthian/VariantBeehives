package net.xanthian.variantbeehives.utils;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.Block;
import net.xanthian.variantbeehives.block.Vanilla;
import net.xanthian.variantbeehives.block.compatability.*;

public class ModRegistries {

    public static void registerFuelandFlammable() {
        registerFlammableBlocks();
    }

    private static void registerFlammableBlocks() {
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();

        registry.add(Vanilla.ACACIA_BEEHIVE, 5, 20);
        registry.add(Vanilla.BAMBOO_BEEHIVE, 5, 20);
        registry.add(Vanilla.BIRCH_BEEHIVE, 5, 20);
        registry.add(Vanilla.CHERRY_BEEHIVE, 5, 20);
        registry.add(Vanilla.DARK_OAK_BEEHIVE, 5, 20);
        registry.add(Vanilla.JUNGLE_BEEHIVE, 5, 20);
        registry.add(Vanilla.MANGROVE_BEEHIVE, 5, 20);
        registry.add(Vanilla.SPRUCE_BEEHIVE, 5, 20);


        if (FabricLoader.getInstance().isModLoaded("ad_astra")) {
            for (Block block : AdAstra.AA_HIVES.values()) {
                registry.add(block, 5, 20);
            }
        }
        if (FabricLoader.getInstance().isModLoaded("beachparty")) {
            registry.add(BeachParty.LDBP_PALM_BEEHIVE, 5, 20);
        }
        if (FabricLoader.getInstance().isModLoaded("betterarcheology")) {
            registry.add(BetterArcheology.BA_ROTTEN_BEEHIVE, 5, 20);
        }
        if (FabricLoader.getInstance().isModLoaded("bewitchment")) {
            for (Block block : Bewitchment.BW_HIVES.values()) {
                registry.add(block, 5, 20);
            }
        }
        if (FabricLoader.getInstance().isModLoaded("biomemakeover")) {
            for (Block block : BiomeMakeover.BM_HIVES.values()) {
                registry.add(block, 5, 20);
            }
        }
        if (FabricLoader.getInstance().isModLoaded("blockus")) {
            registry.add(Blockus.BLS_RAW_BAMBOO_BEEHIVE, 5, 20);
            registry.add(Blockus.BLS_WHITE_OAK_BEEHIVE, 5, 20);
        }
        if (FabricLoader.getInstance().isModLoaded("deeperdarker")) {
            registry.add(DeeperAndDarker.DAD_ECHO_BEEHIVE, 5, 20);
        }
        if (FabricLoader.getInstance().isModLoaded("eldritch_end")) {
            registry.add(EldritchEnd.EE_PRIMORDIAL_BEEHIVE, 5, 20);
        }
        if (FabricLoader.getInstance().isModLoaded("minecells")) {
            registry.add(MineCells.MC_PUTRID_BEEHIVE, 5, 20);
        }
        if (FabricLoader.getInstance().isModLoaded("natures_spirit")) {
            for (Block block : NaturesSpirit.NS_HIVES.values()) {
                registry.add(block, 5, 20);
            }
        }
        if (FabricLoader.getInstance().isModLoaded("promenade")) {
            registry.add(Promenade.PROM_MAPLE_BEEHIVE, 5, 20);
            registry.add(Promenade.PROM_PALM_BEEHIVE, 5, 20);
            registry.add(Promenade.PROM_SAKURA_BEEHIVE, 5, 20);
        }
        if (FabricLoader.getInstance().isModLoaded("regions_unexplored")) {
            registry.add(RegionsUnexplored.RU_ALPHA_BEEHIVE, 5, 20);
            registry.add(RegionsUnexplored.RU_BAOBAB_BEEHIVE, 5, 20);
            registry.add(RegionsUnexplored.RU_BLACK_PAINTED_BEEHIVE, 5, 20);
            registry.add(RegionsUnexplored.RU_BLACKWOOD_BEEHIVE, 5, 20);
            registry.add(RegionsUnexplored.RU_BLUE_PAINTED_BEEHIVE, 5, 20);
            registry.add(RegionsUnexplored.RU_BROWN_PAINTED_BEEHIVE, 5, 20);
            registry.add(RegionsUnexplored.RU_CYAN_PAINTED_BEEHIVE, 5, 20);
            registry.add(RegionsUnexplored.RU_CYPRESS_BEEHIVE, 5, 20);
            registry.add(RegionsUnexplored.RU_EUCALYPTUS_BEEHIVE, 5, 20);
            registry.add(RegionsUnexplored.RU_GRAY_PAINTED_BEEHIVE, 5, 20);
            registry.add(RegionsUnexplored.RU_GREEN_PAINTED_BEEHIVE, 5, 20);
            registry.add(RegionsUnexplored.RU_JOSHUA_BEEHIVE, 5, 20);
            registry.add(RegionsUnexplored.RU_LARCH_BEEHIVE, 5, 20);
            registry.add(RegionsUnexplored.RU_LIGHT_BLUE_PAINTED_BEEHIVE, 5, 20);
            registry.add(RegionsUnexplored.RU_LIGHT_GRAY_PAINTED_BEEHIVE, 5, 20);
            registry.add(RegionsUnexplored.RU_LIME_PAINTED_BEEHIVE, 5, 20);
            registry.add(RegionsUnexplored.RU_MAGENTA_PAINTED_BEEHIVE, 5, 20);
            registry.add(RegionsUnexplored.RU_MAPLE_BEEHIVE, 5, 20);
            registry.add(RegionsUnexplored.RU_MAUVE_BEEHIVE, 5, 20);
            registry.add(RegionsUnexplored.RU_ORANGE_PAINTED_BEEHIVE, 5, 20);
            registry.add(RegionsUnexplored.RU_PALM_BEEHIVE, 5, 20);
            registry.add(RegionsUnexplored.RU_PINE_BEEHIVE, 5, 20);
            registry.add(RegionsUnexplored.RU_PINK_PAINTED_BEEHIVE, 5, 20);
            registry.add(RegionsUnexplored.RU_PURPLE_PAINTED_BEEHIVE, 5, 20);
            registry.add(RegionsUnexplored.RU_REDWOOD_BEEHIVE, 5, 20);
            registry.add(RegionsUnexplored.RU_RED_PAINTED_BEEHIVE, 5, 20);
            registry.add(RegionsUnexplored.RU_WHITE_PAINTED_BEEHIVE, 5, 20);
            registry.add(RegionsUnexplored.RU_WILLOW_BEEHIVE, 5, 20);
            registry.add(RegionsUnexplored.RU_YELLOW_PAINTED_BEEHIVE, 5, 20);

            registry.add(RegionsUnexplored.RU_CHERRY_BEEHIVE, 5, 20);
            registry.add(RegionsUnexplored.RU_SCULKWOOD_BEEHIVE, 5, 20);

            registry.add(RegionsUnexplored.RU_BLUE_BIOSHROOM_BEEHIVE, 5, 20);
            registry.add(RegionsUnexplored.RU_GREEN_BIOSHROOM_BEEHIVE, 5, 20);
            registry.add(RegionsUnexplored.RU_KAPOK_BEEHIVE, 5, 20);
            registry.add(RegionsUnexplored.RU_MAGNOLIA_BEEHIVE, 5, 20);
            registry.add(RegionsUnexplored.RU_PINK_BIOSHROOM_BEEHIVE, 5, 20);
            registry.add(RegionsUnexplored.RU_SOCOTRA_BEEHIVE, 5, 20);

        }
        if (FabricLoader.getInstance().isModLoaded("snifferplus")) {
            registry.add(SnifferPlus.SP_STONE_PINE_BEEHIVE, 5, 20);
        }
        if (FabricLoader.getInstance().isModLoaded("techreborn")) {
            registry.add(TechReborn.TR_RUBBER_BEEHIVE, 5, 20);
        }
        if (FabricLoader.getInstance().isModLoaded("vinery")) {
            registry.add(Vinery.LDV_CHERRY_BEEHIVE, 5, 20);
        }
    }
}