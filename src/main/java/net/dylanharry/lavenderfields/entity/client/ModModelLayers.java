package net.dylanharry.lavenderfields.entity.client;

import net.dylanharry.lavenderfields.LavenderFields;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class ModModelLayers {
    public static final EntityModelLayer GOLDFINCH =
            new EntityModelLayer(new Identifier(LavenderFields.MOD_ID, "goldfinch"), "main");

    public static final EntityModelLayer LAVENDERGOLEM =
            new EntityModelLayer(new Identifier(LavenderFields.MOD_ID, "lavendergolem"), "main");
}
