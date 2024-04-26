package net.dylanharry.lavenderfields.datagen;


import net.dylanharry.lavenderfields.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import org.spongepowered.asm.service.modlauncher.MixinServiceModLauncherBootstrap;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.LAVENDER_CONCRETE);
        addDrop(ModBlocks.LAVENDER_CONCRETE_POWDER);
        addDrop(ModBlocks.LAVENDER_TERRACOTTA);
        addDrop(ModBlocks.LAVENDER_GLAZED_TERRACOTTA);
        addDrop(ModBlocks.LAVENDER_WOOL);
        candleDrops(ModBlocks.LAVENDER_CANDLE);
        candleCakeDrops(ModBlocks.LAVENDER_CANDLE_CAKE);
        addDrop(ModBlocks.LAVENDER_FLOWER);
        addPottedPlantDrops(ModBlocks.POTTED_LAVENDER_FLOWER);

        addDrop(ModBlocks.LAVENDER_STAINED_GLASS, dropsWithSilkTouch(ModBlocks.LAVENDER_STAINED_GLASS));
        addDrop(ModBlocks.LAVENDER_STAINED_GLASS_PANE, dropsWithSilkTouch(ModBlocks.LAVENDER_STAINED_GLASS_PANE));
    }
}
