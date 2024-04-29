package net.dylanharry.lavenderfields.entity.client;

import net.dylanharry.lavenderfields.entity.animation.ModAnimations;
import net.dylanharry.lavenderfields.entity.custom.GoldfinchEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class GoldfinchModel<T extends GoldfinchEntity> extends SinglePartEntityModel<T> {
	private final ModelPart goldfinch;
	private final ModelPart head;


	public GoldfinchModel(ModelPart root) {
		this.goldfinch = root.getChild("Goldfinch");
		this.head = goldfinch.getChild("head");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData Goldfinch = modelPartData.addChild("Goldfinch", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData head = Goldfinch.addChild("head", ModelPartBuilder.create().uv(2, 2).cuboid(-1.0F, 0.5F, -0.5F, 2.0F, 3.0F, 2.0F, new Dilation(0.0F))
		.uv(11, 7).cuboid(-0.5F, 1.0F, -1.4F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -8.3F, -2.8F));

		ModelPartData body = Goldfinch.addChild("body", ModelPartBuilder.create().uv(2, 8).cuboid(-1.5F, 2.0F, -1.5F, 3.0F, 4.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.5F, -3.0F, 0.4363F, 0.0F, 0.0F));

		ModelPartData wing0 = body.addChild("wing0", ModelPartBuilder.create().uv(19, 8).cuboid(-0.5F, 1.8F, -1.1F, 1.0F, 5.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(1.5F, 0.4F, 0.2F, -0.1745F, 3.1416F, 0.0F));

		ModelPartData wing1 = body.addChild("wing1", ModelPartBuilder.create().uv(19, 8).cuboid(-0.5F, 1.8F, -1.1F, 1.0F, 5.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-1.5F, 0.4F, 0.2F, -0.1745F, 3.1416F, 0.0F));

		ModelPartData leg1 = Goldfinch.addChild("leg1", ModelPartBuilder.create().uv(14, 18).cuboid(-1.0F, -0.5F, -1.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(-0.5F, -1.5F, -0.5F));

		ModelPartData leg0 = Goldfinch.addChild("leg0", ModelPartBuilder.create().uv(14, 18).cuboid(-1.0F, -0.5F, -1.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(1.5F, -1.5F, -0.5F));

		ModelPartData tail = Goldfinch.addChild("tail", ModelPartBuilder.create().uv(24, 2).cuboid(-1.5F, -1.0F, -0.3F, 3.0F, 4.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.9F, 1.2F, 0.8727F, 0.0F, 0.0F));
		return TexturedModelData.of(modelData, 32, 32);
	}
	@Override
	public void setAngles(GoldfinchEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.getPart().traverse().forEach(ModelPart::resetTransform);
		this.setHeadAngles(netHeadYaw, headPitch);

		this.animateMovement(ModAnimations.GOLDFINCH_WALKING, limbSwing, limbSwingAmount, 2f, 2.5f);
		this.updateAnimation(entity.idleAnimationState, ModAnimations.GOLDFINCH_IDLE, ageInTicks, 1f);


	}

	private void setHeadAngles(float headYaw, float headPitch) {
		headYaw = MathHelper.clamp(headYaw, -30.0F, 30.0F);
		headPitch = MathHelper.clamp(headPitch, -25.0F, 45.0F);

		this.head.yaw = headYaw * 0.017453292F;
		this.head.pitch = headPitch * 0.017453292F;
	}

	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		goldfinch.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getPart() {
		return goldfinch;
	}
}