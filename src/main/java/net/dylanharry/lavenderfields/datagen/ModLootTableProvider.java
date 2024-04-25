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

        addDrop(ModBlocks.LAVENDER_STAINED_GLASS, dropsWithSilkTouch(ModBlocks.LAVENDER_STAINED_GLASS));
    }
}
