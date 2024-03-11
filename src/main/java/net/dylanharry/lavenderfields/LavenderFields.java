package net.dylanharry.lavenderfields;

import net.dylanharry.lavenderfields.item.ModItemGroups;
import net.dylanharry.lavenderfields.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LavenderFields implements ModInitializer {
	public static final String MOD_ID = "lavenderfields";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();

	}
}