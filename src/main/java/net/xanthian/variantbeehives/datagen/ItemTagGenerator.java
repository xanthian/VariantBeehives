package net.xanthian.variantbeehives.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;
import net.xanthian.variantbeehives.block.Vanilla;
import net.xanthian.variantbeehives.block.compatability.*;

import java.util.Map;
import java.util.concurrent.CompletableFuture;

import static net.xanthian.variantbeehives.utils.ModItemTags.BEEHIVES;

public class ItemTagGenerator extends FabricTagProvider.ItemTagProvider {

    public ItemTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        registerTags(Vanilla.VANILLA_HIVES);

        registerTags(AdAstra.AA_HIVES);
        registerTags(BeachParty.LDBP_HIVES);
        registerTags(BetterArcheology.BA_HIVES);
        registerTags(Bewitchment.BW_HIVES);
        registerTags(BiomeMakeover.BM_HIVES);
        registerTags(Blockus.BLS_HIVES);
        registerTags(DeeperAndDarker.DAD_HIVES);
        registerTags(EldritchEnd.EE_HIVES);
        registerTags(MineCells.MC_HIVES);
        registerTags(NaturesSpirit.NS_HIVES);
        registerTags(Promenade.PROM_HIVES);
        registerTags(RegionsUnexplored.RU_HIVES);
        registerTags(SnifferPlus.SP_HIVES);
        registerTags(TechReborn.TR_HIVES);
        registerTags(Vinery.LDV_HIVES);

        getOrCreateTagBuilder(ItemTags.NON_FLAMMABLE_WOOD)
                .add(Vanilla.CRIMSON_BEEHIVE.asItem())
                .add(Vanilla.CRIMSON_BEEHIVE.asItem())
                .addOptional(new Identifier("variantbeehives:bls_charred_beehive"))
                .addOptional(new Identifier("variantbeehives:prom_dark_amaranth_beehive"))
                .addOptional(new Identifier("variantbeehives:ru_brimwood_beehive"))
                .addOptional(new Identifier("variantbeehives:ru_cobalt_beehive"))
                .addOptional(new Identifier("variantbeehives:ru_dead_beehive"))
                .addOptional(new Identifier("variantbeehives:ru_yellow_bioshroom_beehive"));
    }

    private void registerTags(Map<Identifier, Block> blockMap) {
        for (Block block : blockMap.values()) {
            Identifier lootTableId = block.getLootTableId();
            String newPath = lootTableId.getPath().replaceFirst("blocks/", "");
            Identifier modifiedId = new Identifier(lootTableId.getNamespace(), newPath);
            getOrCreateTagBuilder(BEEHIVES)
                    .addOptional(modifiedId);
        }
    }
}