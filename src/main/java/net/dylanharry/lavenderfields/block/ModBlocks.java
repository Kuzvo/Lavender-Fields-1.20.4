package net.dylanharry.lavenderfields.block;

import net.dylanharry.lavenderfields.LavenderFields;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block LAVENDER_WOOL = registerBlock("lavender_wool",
            new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block LAVENDER_TERRACOTTA = registerBlock("lavender_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.WHITE_TERRACOTTA)));
    public static final Block LAVENDER_CONCRETE_POWDER = registerBlock("lavender_concrete_powder",
            new Block(FabricBlockSettings.copyOf(Blocks.WHITE_CONCRETE_POWDER)));
    public static final Block LAVENDER_CONCRETE = registerBlock("lavender_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.WHITE_CONCRETE)));
    public static final Block LAVENDER_STAINED_GLASS = registerBlock("lavender_stained_glass",
            new Block(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block LAVENDER_STAINED_GLASS_PANE = registerBlock("lavender_stained_glass_pane",
            new Block(FabricBlockSettings.copyOf(Blocks.GLASS_PANE)));
    public static final Block LAVENDER_GLAZED_TERRACOTTA = registerBlock("lavender_glazed_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.WHITE_GLAZED_TERRACOTTA)));



    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(LavenderFields.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(LavenderFields.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks(){
        LavenderFields.LOGGER.info("Registering ModBlocks for " + LavenderFields.MOD_ID);
    }
}
