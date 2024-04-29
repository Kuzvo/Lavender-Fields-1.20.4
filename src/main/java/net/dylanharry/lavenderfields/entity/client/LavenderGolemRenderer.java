package net.dylanharry.lavenderfields.entity.client;

import net.dylanharry.lavenderfields.LavenderFields;
import net.dylanharry.lavenderfields.entity.custom.LavenderGolemEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class LavenderGolemRenderer  extends MobEntityRenderer<LavenderGolemEntity, LavenderGolemModel<LavenderGolemEntity>> {
    private static final Identifier TEXTURE = new Identifier(LavenderFields.MOD_ID, "textures/entity/lavendergolem.png");

    public LavenderGolemRenderer(EntityRendererFactory.Context context) {
        super(context, new LavenderGolemModel<>(context.getPart(ModModelLayers.LAVENDERGOLEM)), 0.6f);
    }

    @Override
    public Identifier getTexture(LavenderGolemEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(LavenderGolemEntity mobEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
        if(mobEntity.isBaby()) {
            matrixStack.scale(0.7f, 0.7f, 0.7f);
        }
        else{
            matrixStack.scale(1.3f, 1.3f, 1.3f);

        }

        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
