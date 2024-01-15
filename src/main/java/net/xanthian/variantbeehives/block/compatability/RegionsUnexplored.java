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

public class RegionsUnexplored {

    public static Map<Identifier, Block> RU_HIVES = Maps.newHashMap();

    public static Block RU_ALPHA_BEEHIVE;
    public static Block RU_BAOBAB_BEEHIVE;
    public static Block RU_BLACK_PAINTED_BEEHIVE;
    public static Block RU_BLACKWOOD_BEEHIVE;
    public static Block RU_BLUE_BIOSHROOM_BEEHIVE;
    public static Block RU_BLUE_PAINTED_BEEHIVE;
    public static Block RU_BRIMWOOD_BEEHIVE;
    public static Block RU_BROWN_PAINTED_BEEHIVE;
    public static Block RU_COBALT_BEEHIVE;
    public static Block RU_CYAN_PAINTED_BEEHIVE;
    public static Block RU_CYPRESS_BEEHIVE;
    public static Block RU_DEAD_BEEHIVE;
    public static Block RU_EUCALYPTUS_BEEHIVE;
    public static Block RU_GRAY_PAINTED_BEEHIVE;
    public static Block RU_GREEN_BIOSHROOM_BEEHIVE;
    public static Block RU_GREEN_PAINTED_BEEHIVE;
    public static Block RU_JOSHUA_BEEHIVE;
    public static Block RU_KAPOK_BEEHIVE;
    public static Block RU_LARCH_BEEHIVE;
    public static Block RU_LIGHT_BLUE_PAINTED_BEEHIVE;
    public static Block RU_LIGHT_GRAY_PAINTED_BEEHIVE;
    public static Block RU_LIME_PAINTED_BEEHIVE;
    public static Block RU_MAGENTA_PAINTED_BEEHIVE;
    public static Block RU_MAGNOLIA_BEEHIVE;
    public static Block RU_MAPLE_BEEHIVE;
    public static Block RU_MAUVE_BEEHIVE;
    public static Block RU_ORANGE_PAINTED_BEEHIVE;
    public static Block RU_PALM_BEEHIVE;
    public static Block RU_PINE_BEEHIVE;
    public static Block RU_PINK_BIOSHROOM_BEEHIVE;
    public static Block RU_PINK_PAINTED_BEEHIVE;
    public static Block RU_PURPLE_PAINTED_BEEHIVE;
    public static Block RU_REDWOOD_BEEHIVE;
    public static Block RU_RED_PAINTED_BEEHIVE;
    public static Block RU_SOCOTRA_BEEHIVE;
    public static Block RU_WHITE_PAINTED_BEEHIVE;
    public static Block RU_WILLOW_BEEHIVE;
    public static Block RU_YELLOW_BIOSHROOM_BEEHIVE;
    public static Block RU_YELLOW_PAINTED_BEEHIVE;

    public static void registerHives() {
        RU_ALPHA_BEEHIVE = registerBeehives("ru_alpha_beehive");
        RU_BAOBAB_BEEHIVE = registerBeehives("ru_baobab_beehive");
        RU_BLACK_PAINTED_BEEHIVE = registerBeehives("ru_black_painted_beehive");
        RU_BLACKWOOD_BEEHIVE = registerBeehives("ru_blackwood_beehive");
        RU_BLUE_BIOSHROOM_BEEHIVE = registerBeehives("ru_blue_bioshroom_beehive");
        RU_BLUE_PAINTED_BEEHIVE = registerBeehives("ru_blue_painted_beehive");
        RU_BRIMWOOD_BEEHIVE = registerBeehives("ru_brimwood_beehive");
        RU_BROWN_PAINTED_BEEHIVE = registerBeehives("ru_brown_painted_beehive");
        RU_COBALT_BEEHIVE = registerBeehives("ru_cobalt_beehive");
        RU_CYAN_PAINTED_BEEHIVE = registerBeehives("ru_cyan_painted_beehive");
        RU_CYPRESS_BEEHIVE = registerBeehives("ru_cypress_beehive");
        RU_DEAD_BEEHIVE = registerBeehives("ru_dead_beehive");
        RU_EUCALYPTUS_BEEHIVE = registerBeehives("ru_eucalyptus_beehive");
        RU_GREEN_BIOSHROOM_BEEHIVE = registerBeehives("ru_green_bioshroom_beehive");
        RU_GREEN_PAINTED_BEEHIVE = registerBeehives("ru_green_painted_beehive");
        RU_GRAY_PAINTED_BEEHIVE = registerBeehives("ru_gray_painted_beehive");
        RU_JOSHUA_BEEHIVE = registerBeehives("ru_joshua_beehive");
        RU_KAPOK_BEEHIVE = registerBeehives("ru_kapok_beehive");
        RU_LARCH_BEEHIVE = registerBeehives("ru_larch_beehive");
        RU_LIGHT_BLUE_PAINTED_BEEHIVE = registerBeehives("ru_light_blue_painted_beehive");
        RU_LIGHT_GRAY_PAINTED_BEEHIVE = registerBeehives("ru_light_gray_painted_beehive");
        RU_LIME_PAINTED_BEEHIVE = registerBeehives("ru_lime_painted_beehive");
        RU_MAGENTA_PAINTED_BEEHIVE = registerBeehives("ru_magenta_painted_beehive");
        RU_MAGNOLIA_BEEHIVE = registerBeehives("ru_magnolia_beehive");
        RU_MAPLE_BEEHIVE = registerBeehives("ru_maple_beehive");
        RU_MAUVE_BEEHIVE = registerBeehives("ru_mauve_beehive");
        RU_ORANGE_PAINTED_BEEHIVE = registerBeehives("ru_orange_painted_beehive");
        RU_PALM_BEEHIVE = registerBeehives("ru_palm_beehive");
        RU_PINE_BEEHIVE = registerBeehives("ru_pine_beehive");
        RU_PINK_BIOSHROOM_BEEHIVE = registerBeehives("ru_pink_bioshroom_beehive");
        RU_PINK_PAINTED_BEEHIVE = registerBeehives("ru_pink_painted_beehive");
        RU_PURPLE_PAINTED_BEEHIVE = registerBeehives("ru_purple_painted_beehive");
        RU_RED_PAINTED_BEEHIVE = registerBeehives("ru_red_painted_beehive");
        RU_REDWOOD_BEEHIVE = registerBeehives("ru_redwood_beehive");
        RU_SOCOTRA_BEEHIVE = registerBeehives("ru_socotra_beehive");
        RU_WHITE_PAINTED_BEEHIVE = registerBeehives("ru_white_painted_beehive");
        RU_WILLOW_BEEHIVE = registerBeehives("ru_willow_beehive");
        RU_YELLOW_BIOSHROOM_BEEHIVE = registerBeehives("ru_yellow_bioshroom_beehive");
        RU_YELLOW_PAINTED_BEEHIVE = registerBeehives("ru_yellow_painted_beehive");
    }

    private static Block register(String name, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name);
        Registry.register(Registries.BLOCK, identifier, block);
        RU_HIVES.put(identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new FabricItemSettings()));
        return block;
    }

    private static Block registerBeehives(String name) {
        return register(name, new VariantBeehiveBlock());
    }
}