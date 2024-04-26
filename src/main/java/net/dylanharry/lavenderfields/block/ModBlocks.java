package net.dylanharry.lavenderfields.block;

import net.dylanharry.lavenderfields.LavenderFields;
import net.fabricmc.fabric.api.block.v1.FabricBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block LAVENDER_WOOL = registerBlock("lavender_wool",
            new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));



    public static final Block LAVENDER_CONCRETE_POWDER = registerBlock("lavender_concrete_powder",
            new Block(FabricBlockSettings.copyOf(Blocks.WHITE_CONCRETE_POWDER)));
    public static final Block LAVENDER_CONCRETE = registerBlock("lavender_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.WHITE_CONCRETE)));

    public static final Block LAVENDER_STAINED_GLASS = registerBlock("lavender_stained_glass",
            new Block(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block LAVENDER_STAINED_GLASS_PANE = registerBlock("lavender_stained_glass_pane",
            new Block (FabricBlockSettings.copyOf(Blocks.GLASS_PANE)));

    public static final Block LAVENDER_TERRACOTTA = registerBlock("lavender_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.WHITE_TERRACOTTA)));
    public static final Block LAVENDER_GLAZED_TERRACOTTA = registerBlock("lavender_glazed_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.WHITE_GLAZED_TERRACOTTA)));

    public static final Block LAVENDER_CANDLE = registerBlock("lavender_candle",
            new CandleBlock(FabricBlockSettings.copyOf(Blocks.CANDLE).nonOpaque()));
    public static final Block LAVENDER_CANDLE_CAKE = registerBlock("lavender_candle_cake",
            new CandleCakeBlock(LAVENDER_CANDLE, FabricBlockSettings.copyOf(Blocks.CANDLE_CAKE)));

    public static final Block LAVENDER_FLOWER = registerBlock("lavender_flower",
            new FlowerBlock(StatusEffects.HERO_OF_THE_VILLAGE, 10,
                    FabricBlockSettings.copyOf(Blocks.AZURE_BLUET).nonOpaque().noCollision()));
    public static final Block POTTED_LAVENDER_FLOWER = Registry.register(Registries.BLOCK,
            new Identifier(LavenderFields.MOD_ID, "potted_lavender_flower"),
            new FlowerPotBlock(LAVENDER_FLOWER, FabricBlockSettings.copyOf(Blocks.POTTED_AZURE_BLUET).nonOpaque()));



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
