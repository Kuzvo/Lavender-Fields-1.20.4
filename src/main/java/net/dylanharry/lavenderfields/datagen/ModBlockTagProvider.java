package net.dylanharry.lavenderfields.datagen;

import net.dylanharry.lavenderfields.block.ModBlocks;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.LAVENDER_CONCRETE)
                .add(ModBlocks.LAVENDER_GLAZED_TERRACOTTA)
                .add(ModBlocks.LAVENDER_TERRACOTTA);



        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)
                .add(ModBlocks.LAVENDER_CONCRETE_POWDER);

        getOrCreateTagBuilder(BlockTags.CONCRETE_POWDER)
                .add(ModBlocks.LAVENDER_CONCRETE_POWDER);

        getOrCreateTagBuilder(BlockTags.WOOL)
                .add(ModBlocks.LAVENDER_WOOL);
    }
}
