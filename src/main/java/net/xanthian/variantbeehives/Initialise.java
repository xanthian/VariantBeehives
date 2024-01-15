package net.xanthian.variantbeehives;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.xanthian.variantbeehives.block.Vanilla;
import net.xanthian.variantbeehives.block.compatability.*;
import net.xanthian.variantbeehives.utils.ModCreativeTab;
import net.xanthian.variantbeehives.utils.ModPOITypes;
import net.xanthian.variantbeehives.utils.ModRegistries;

public class Initialise implements ModInitializer {

    public static final String MOD_ID = "variantbeehives";

    public static void ifModLoaded(String modId, Runnable runnable) {
        if (FabricLoader.getInstance().isModLoaded(modId)) {
            runnable.run();
        }
    }

    @Override
    public void onInitialize() {

        Vanilla.registerVanillaBeehives();

        ifModLoaded("ad_astra", AdAstra::registerHives);
        ifModLoaded("beachparty", BeachParty::registerHives);
        ifModLoaded("betterarcheology", BetterArcheology::registerHives);
        ifModLoaded("bewitchment", Bewitchment::registerHives);
        ifModLoaded("biomemakeover", BiomeMakeover::registerHives);
        ifModLoaded("blockus", Blockus::registerHives);
        ifModLoaded("botania", Botania::registerHives);
        ifModLoaded("cinderscapes", Cinderscapes::registerHives);
        ifModLoaded("deeperdarker", DeeperAndDarker::registerHives);
        ifModLoaded("desolation", Desolation::registerHives);
        ifModLoaded("ecologics", Ecologics::registerHives);
        ifModLoaded("eldritch_end", EldritchEnd::registerHives);
        ifModLoaded("meadow", Meadow::registerHives);
        ifModLoaded("minecells", MineCells::registerHives);
        ifModLoaded("natures_spirit", NaturesSpirit::registerHives);
        ifModLoaded("promenade", Promenade::registerHives);
        ifModLoaded("regions_unexplored", RegionsUnexplored::registerHives);
        ifModLoaded("snifferplus", SnifferPlus::registerHives);
        ifModLoaded("techreborn", TechReborn::registerHives);
        ifModLoaded("vinery", Vinery::registerHives);

        ModRegistries.registerFuelandFlammable();
        ModCreativeTab.registerItemGroup();
        ModPOITypes.init();

        //Datagen Block - disable for client run
        //Botania.registerHives();
        //SnifferPlus.registerHives();
    }
}