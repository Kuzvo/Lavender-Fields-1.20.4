// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports

package net.dylanharry.lavenderfields.entity.client;

import net.dylanharry.lavenderfields.entity.animation.ModAnimations;
import net.dylanharry.lavenderfields.entity.custom.GoldfinchEntity;
import net.dylanharry.lavenderfields.entity.custom.LavenderGolemEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class LavenderGolemModel<T extends LavenderGolemEntity> extends SinglePartEntityModel<T> {
	private final ModelPart body;
	private final ModelPart head;

	public LavenderGolemModel(ModelPart root) {

		this.body = root.getChild("body");
		this.head = body.getChild("head");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData body = modelPartData.addChild("body", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -7.0F, 0.0F));

		ModelPartData MainBody = body.addChild("MainBody", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 31.0F, 0.0F));

		ModelPartData body_r1 = MainBody.addChild("body_r1", ModelPartBuilder.create().uv(0, 20).cuboid(-9.0F, -27.0F, -6.0F, 18.0F, 12.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, -1.0F, 0.2618F, 0.0F, 0.0F));

		ModelPartData LowerBody = body.addChild("LowerBody", ModelPartBuilder.create().uv(57, 30).cuboid(-4.5F, -15.0F, -9.0F, 9.0F, 5.0F, 6.0F, new Dilation(0.5F)), ModelTransform.pivot(0.0F, 31.0F, 0.0F));

		ModelPartData head = body.addChild("head", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, -2.0F));

		ModelPartData head_r1 = head.addChild("head_r1", ModelPartBuilder.create().uv(32, 2).cuboid(-1.0F, -23.0F, -13.5F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-6.0F, -30.0F, -11.5F, 12.0F, 10.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 31.0F, 1.0F, 0.1745F, 0.0F, 0.0F));

		ModelPartData arm0 = body.addChild("arm0", ModelPartBuilder.create().uv(3, 44).cuboid(-13.0F, 8.5F, -11.0F, 4.0F, 23.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData arm1 = body.addChild("arm1", ModelPartBuilder.create().uv(27, 44).cuboid(9.0F, 8.5F, -11.0F, 4.0F, 23.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData leg0 = body.addChild("leg0", ModelPartBuilder.create().uv(41, 3).cuboid(-3.5F, 3.0F, -8.0F, 6.0F, 10.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(-4.0F, 18.0F, 0.0F));

		ModelPartData leg1 = body.addChild("leg1", ModelPartBuilder.create().uv(64, 3).mirrored().cuboid(-3.5F, 3.0F, -8.0F, 6.0F, 10.0F, 5.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(5.0F, 18.0F, 0.0F));

		ModelPartData Flower = body.addChild("Flower", ModelPartBuilder.create(), ModelTransform.pivot(-24.0F, 12.0F, 9.0F));

		ModelPartData cube_r1 = Flower.addChild("cube_r1", ModelPartBuilder.create().uv(58, 56).cuboid(-1.0F, -16.0F, -21.0F, 16.0F, 16.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0721F, -0.4745F, -0.1781F));

		ModelPartData cube_r2 = Flower.addChild("cube_r2", ModelPartBuilder.create().uv(58, 56).cuboid(13.0F, -16.0F, 7.0F, 16.0F, 16.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.1393F, 1.0912F, -0.0214F));

		ModelPartData cube_r3 = Flower.addChild("cube_r3", ModelPartBuilder.create().uv(58, 56).cuboid(-1.0F, -16.0F, -21.0F, 16.0F, 16.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(18.0F, -6.0F, 0.0F, 0.2618F, -0.4363F, 0.0F));

		ModelPartData cube_r4 = Flower.addChild("cube_r4", ModelPartBuilder.create().uv(58, 56).cuboid(13.0F, -16.0F, 7.0F, 16.0F, 16.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(18.0F, -6.0F, 0.0F, 0.5067F, 1.0663F, 0.5651F));
		return TexturedModelData.of(modelData, 128, 128);
	}
	@Override
	public void setAngles(LavenderGolemEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.getPart().traverse().forEach(ModelPart::resetTransform);
		this.setHeadAngles(netHeadYaw, headPitch);

		this.animateMovement(ModAnimations.LAVENDERGOLEM_WALK, limbSwing, limbSwingAmount, 2f, 2.5f);
		this.updateAnimation(entity.idleAnimationState, ModAnimations.LAVENDERGOLEM_IDLE, ageInTicks, 1f);
	}

	private void setHeadAngles(float headYaw, float headPitch) {
		headYaw = MathHelper.clamp(headYaw, -30.0F, 30.0F);
		headPitch = MathHelper.clamp(headPitch, -25.0F, 45.0F);

		this.head.yaw = headYaw * 0.017453292F;
		this.head.pitch = headPitch * 0.017453292F;
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		body.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getPart() {
		return body;
	}
}