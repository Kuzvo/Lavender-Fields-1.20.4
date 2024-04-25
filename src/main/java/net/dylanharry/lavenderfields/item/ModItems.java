package net.dylanharry.lavenderfields.item;

import net.dylanharry.lavenderfields.LavenderFields;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.FoodComponents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item LAVENDER_DYE = registerItem("lavender_dye", new Item(new FabricItemSettings()));

    public static final Item LAVENDER_OIL = registerItem("lavender_oil", new Item(new FabricItemSettings().food(ModFoodComponents.LAVENDER_OIL)));


    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries){
        entries.add(LAVENDER_DYE);
    }

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(LavenderFields.MOD_ID, name), item);
    }

    public static void registerModItems(){
        LavenderFields.LOGGER.info("Registering Mod Items for " + LavenderFields.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
