package net.xanthian.variantbeehives.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.xanthian.variantbeehives.block.Vanilla;
import net.xanthian.variantbeehives.block.compatability.*;

import java.util.Map;
import java.util.concurrent.CompletableFuture;

import static net.xanthian.variantbeehives.Initialise.MOD_ID;

public class BlockTagGenerator extends FabricTagProvider.BlockTagProvider {
    private static final TagKey<Block> BEEHIVES = TagKey.of(Registries.BLOCK.getKey(), new Identifier(MOD_ID, "beehives"));

    public BlockTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
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
        registerTags(Botania.BOT_HIVES);
        registerTags(Cinderscapes.CS_HIVES);
        registerTags(DeeperAndDarker.DAD_HIVES);
        registerTags(Desolation.DS_HIVES);
        registerTags(Ecologics.ECO_HIVES);
        registerTags(EldritchEnd.EE_HIVES);
        registerTags(Meadow.LDM_HIVES);
        registerTags(MineCells.MC_HIVES);
        registerTags(NaturesSpirit.NS_HIVES);
        registerTags(Promenade.PROM_HIVES);
        registerTags(RegionsUnexplored.RU_HIVES);
        registerTags(SnifferPlus.SP_HIVES);
        registerTags(TechReborn.TR_HIVES);
        registerTags(Vinery.LDV_HIVES);

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .addTag(BEEHIVES);

        getOrCreateTagBuilder(BlockTags.BEEHIVES)
                .addTag(BEEHIVES);
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