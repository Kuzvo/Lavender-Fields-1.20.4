package net.dylanharry.lavenderfields.entity.client;

import net.dylanharry.lavenderfields.LavenderFields;
import net.dylanharry.lavenderfields.entity.custom.GoldfinchEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class GoldfinchRenderer extends MobEntityRenderer<GoldfinchEntity, GoldfinchModel<GoldfinchEntity>> {
    private static final Identifier TEXTURE = new Identifier(LavenderFields.MOD_ID, "textures/entity/goldfinch.png");
    public GoldfinchRenderer(EntityRendererFactory.Context context) {
        super(context, new GoldfinchModel<>(context.getPart(ModModelLayers.GOLDFINCH)), 0.3f);
    }

    @Override
    public Identifier getTexture(GoldfinchEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(GoldfinchEntity mobEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {

        if(mobEntity.isBaby()) {
            matrixStack.scale(0.7f, 0.7f, 0.7f);
        }
        else{
            matrixStack.scale(1f, 1f, 1f);

        }

        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
