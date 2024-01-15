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

public class Botania {

    public static Map<Identifier, Block> BOT_HIVES = Maps.newHashMap();

    public static Block BOT_DREAMWOOD_BEEHIVE;
    public static Block BOT_LIVINGWOOD_BEEHIVE;
    public static Block BOT_SHIMMERWOOD_BEEHIVE;

    public static void registerHives() {
        BOT_DREAMWOOD_BEEHIVE = registerCraftingHive("bot_dreamwood_beehive");
        BOT_LIVINGWOOD_BEEHIVE = registerCraftingHive("bot_livingwood_beehive");
        BOT_SHIMMERWOOD_BEEHIVE = registerCraftingHive("bot_shimmerwood_beehive");
    }

    public static Block register(String name, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name);
        Registry.register(Registries.BLOCK, identifier, block);
        BOT_HIVES.put(identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new FabricItemSettings()));
        return block;
    }

    public static Block registerCraftingHive(String name) {
        return register(name, new VariantBeehiveBlock());
    }
}