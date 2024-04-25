package net.dylanharry.lavenderfields.datagen;

import net.dylanharry.lavenderfields.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;


import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ItemTags.WOOL)
                .add(ModBlocks.LAVENDER_WOOL.asItem());
        getOrCreateTagBuilder(ItemTags.TERRACOTTA)
                .add(ModBlocks.LAVENDER_TERRACOTTA.asItem());
    }
}
