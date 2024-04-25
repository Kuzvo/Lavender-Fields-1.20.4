package net.dylanharry.lavenderfields.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

import net.minecraft.entity.LivingEntity;

public class ModFoodComponents {
  public static final FoodComponent LAVENDER_OIL = new FoodComponent.Builder().
          statusEffect(new StatusEffectInstance(StatusEffects.HERO_OF_THE_VILLAGE, 300),1.0f) .build();
}
