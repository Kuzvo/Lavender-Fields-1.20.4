package net.dylanharry.lavenderfields.item;

import net.dylanharry.lavenderfields.LavenderFields;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
public static final ItemGroup LAVENDER_GROUP = Registry.register(Registries.ITEM_GROUP,
        new Identifier(LavenderFields.MOD_ID, "lavendergroup"),
        FabricItemGroup.builder().displayName(Text.translatable("itemgroup.lavendergroup"))
                .icon(() -> new ItemStack(ModItems.LAVENDERDYE)).entries((displayContext, entries) -> {
                    entries.add(ModItems.LAVENDERDYE);


                }).build());

public static void registerItemGroups() {
    LavenderFields.LOGGER.info(("Registering Item Groups for " + LavenderFields.MOD_ID));
}


}
