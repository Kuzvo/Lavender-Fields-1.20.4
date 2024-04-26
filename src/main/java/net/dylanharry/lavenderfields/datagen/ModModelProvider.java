package net.dylanharry.lavenderfields.datagen;

import net.dylanharry.lavenderfields.block.ModBlocks;
import net.dylanharry.lavenderfields.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.CakeBlock;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.BlockItem;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LAVENDER_TERRACOTTA);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LAVENDER_GLAZED_TERRACOTTA);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LAVENDER_CONCRETE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LAVENDER_CONCRETE_POWDER);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LAVENDER_STAINED_GLASS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LAVENDER_WOOL);



        blockStateModelGenerator.registerCandle(ModBlocks.LAVENDER_CANDLE, ModBlocks.LAVENDER_CANDLE_CAKE);

        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.LAVENDER_FLOWER, ModBlocks.POTTED_LAVENDER_FLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);
        //blockStateModelGenerator.registerGlassPane(ModBlocks.LAVENDER_STAINED_GLASS, ModBlocks.LAVENDER_STAINED_GLASS_PANE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.LAVENDER_DYE, Models.GENERATED);
        itemModelGenerator.register(ModItems.LAVENDER_OIL, Models.GENERATED);

    }
}
