package net.dylanharry.lavenderfields;

import net.dylanharry.lavenderfields.block.ModBlocks;
import net.dylanharry.lavenderfields.entity.ModEntities;
import net.dylanharry.lavenderfields.entity.client.*;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.RenderLayer;

public class LavenderFieldsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LAVENDER_STAINED_GLASS, RenderLayer.getTranslucent());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LAVENDER_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
        //BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LAVENDER_STAINED_GLASS_PANE, RenderLayer.getCutout());

        //BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LAVENDER_CANDLE, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LAVENDER_FLOWER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_LAVENDER_FLOWER, RenderLayer.getCutout());

        //BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LAVENDER_CANDLE_CAKE, RenderLayer.getCutout());

        EntityRendererRegistry.register(ModEntities.GOLDFINCH, GoldfinchRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.GOLDFINCH, GoldfinchModel::getTexturedModelData);

        EntityRendererRegistry.register(ModEntities.LAVENDERGOLEM, LavenderGolemRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.LAVENDERGOLEM, LavenderGolemModel::getTexturedModelData);
    }
}
