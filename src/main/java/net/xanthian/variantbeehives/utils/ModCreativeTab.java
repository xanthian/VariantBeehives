package net.xanthian.variantbeehives.utils;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.xanthian.variantbeehives.Initialise;
import net.xanthian.variantbeehives.block.Vanilla;
import net.xanthian.variantbeehives.block.compatability.*;


public class ModCreativeTab {

    public static final ItemGroup ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Initialise.MOD_ID, "variantbeehives"),
            FabricItemGroup.builder()
                    .displayName(Text.literal("Variant Beehives"))
                    .icon(() -> new ItemStack(Vanilla.MANGROVE_BEEHIVE))
                    .entries((displayContext, entries) -> {
                        entries.add(Vanilla.ACACIA_BEEHIVE);
                        entries.add(Vanilla.BAMBOO_BEEHIVE);
                        entries.add(Vanilla.BIRCH_BEEHIVE);
                        entries.add(Vanilla.CHERRY_BEEHIVE);
                        entries.add(Vanilla.CRIMSON_BEEHIVE);
                        entries.add(Vanilla.DARK_OAK_BEEHIVE);
                        entries.add(Vanilla.JUNGLE_BEEHIVE);
                        entries.add(Vanilla.MANGROVE_BEEHIVE);
                        entries.add(Blocks.BEEHIVE); // Oak
                        entries.add(Vanilla.SPRUCE_BEEHIVE);
                        entries.add(Vanilla.WARPED_BEEHIVE);

                        if (FabricLoader.getInstance().isModLoaded("ad_astra")) {
                            for (Block block : AdAstra.AA_HIVES.values()) {
                                entries.add(block);
                            }
                        }
                        if (FabricLoader.getInstance().isModLoaded("beachparty")) {
                            entries.add(BeachParty.LDBP_PALM_BEEHIVE);
                        }
                        if (FabricLoader.getInstance().isModLoaded("betterarcheology")) {
                            entries.add(BetterArcheology.BA_ROTTEN_BEEHIVE);
                        }
                        if (FabricLoader.getInstance().isModLoaded("bewitchment")) {
                            for (Block block : Bewitchment.BW_HIVES.values()) {
                                entries.add(block);
                            }
                        }
                        if (FabricLoader.getInstance().isModLoaded("biomemakeover")) {
                            for (Block block : BiomeMakeover.BM_HIVES.values()) {
                                entries.add(block);
                            }
                        }
                        if (FabricLoader.getInstance().isModLoaded("blockus")) {
                            for (Block block : Blockus.BLS_HIVES.values()) {
                                entries.add(block);
                            }
                        }
                        if (FabricLoader.getInstance().isModLoaded("deeperdarker")) {
                            entries.add(DeeperAndDarker.DAD_ECHO_BEEHIVE);
                        }
                        if (FabricLoader.getInstance().isModLoaded("eldritch_end")) {
                            entries.add(EldritchEnd.EE_PRIMORDIAL_BEEHIVE);
                        }
                        if (FabricLoader.getInstance().isModLoaded("minecells")) {
                            entries.add(MineCells.MC_PUTRID_BEEHIVE);
                        }
                        if (FabricLoader.getInstance().isModLoaded("natures_spirit")) {
                            for (Block block : NaturesSpirit.NS_HIVES.values()) {
                                entries.add(block);
                            }
                        }
                        if (FabricLoader.getInstance().isModLoaded("promenade")) {
                            for (Block block : Promenade.PROM_HIVES.values()) {
                                entries.add(block);
                            }
                        }
                        if (FabricLoader.getInstance().isModLoaded("regions_unexplored")) {
                            for (Block block : RegionsUnexplored.RU_HIVES.values()) {
                                entries.add(block);
                            }
                        }
                        if (FabricLoader.getInstance().isModLoaded("snifferplus")) {
                            entries.add(SnifferPlus.SP_STONE_PINE_BEEHIVE);
                        }
                        if (FabricLoader.getInstance().isModLoaded("techreborn")) {
                            entries.add(TechReborn.TR_RUBBER_BEEHIVE);
                        }
                        if (FabricLoader.getInstance().isModLoaded("vinery")) {
                            entries.add(Vinery.LDV_CHERRY_BEEHIVE);
                        }

                    })
                    .texture("variantbeehives.png").noRenderedName().build());

    public static void registerItemGroup() {
    }
}