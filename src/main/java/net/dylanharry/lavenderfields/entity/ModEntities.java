package net.dylanharry.lavenderfields.entity;

import net.dylanharry.lavenderfields.LavenderFields;
import net.dylanharry.lavenderfields.entity.custom.GoldfinchEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.fabricmc.fabric.impl.object.builder.FabricEntityType;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {

    public static final EntityType<GoldfinchEntity> GOLDFINCH = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(LavenderFields.MOD_ID, "goldfinch"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, GoldfinchEntity::new)
                    .dimensions(EntityDimensions.fixed(0.6f, 0.6f)).build());
}
