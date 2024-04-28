package net.dylanharry.lavenderfields.world.biome;


import net.dylanharry.lavenderfields.LavenderFields;

import net.dylanharry.lavenderfields.world.biome.surface.ModMaterialRules;
import net.minecraft.util.Identifier;
import terrablender.api.Regions;
import terrablender.api.SurfaceRuleManager;
import terrablender.api.TerraBlenderApi;

public class ModTerrablenderAPI implements TerraBlenderApi {
    @Override
    public void onTerraBlenderInitialized() {
        Regions.register(new ModOverworldRegion(new Identifier(LavenderFields.MOD_ID, "overworld"), 4));

        SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, LavenderFields.MOD_ID, ModMaterialRules.makeRules());
    }
}
