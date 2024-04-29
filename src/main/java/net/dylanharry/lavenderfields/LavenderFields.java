package net.dylanharry.lavenderfields;

import net.dylanharry.lavenderfields.block.ModBlocks;
import net.dylanharry.lavenderfields.entity.ModEntities;
import net.dylanharry.lavenderfields.entity.custom.GoldfinchEntity;
import net.dylanharry.lavenderfields.item.ModItemGroups;
import net.dylanharry.lavenderfields.item.ModItems;
import net.dylanharry.lavenderfields.villager.ModVillagers;
import net.dylanharry.lavenderfields.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LavenderFields implements ModInitializer {
	public static final String MOD_ID = "lavenderfields";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModVillagers.registerVillagers();

		FabricDefaultAttributeRegistry.register(ModEntities.GOLDFINCH, GoldfinchEntity.createGoldfinchAttributes());

		ModWorldGeneration.generateModWorldGen();
	}
}