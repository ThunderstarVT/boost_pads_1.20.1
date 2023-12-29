package com.thunderstar.boost_pads.block;

import com.thunderstar.boost_pads.BoostPads;
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

    // Blocks
    public static final Block BOOST_PAD_LVL0 = registerBlock("boost_pad_lvl0",
            new Block(FabricBlockSettings.copyOf(Blocks.BLUE_ICE)
                    .slipperiness(1.0f)
                    .luminance(state -> 0)));

    // Helper Methods
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(BoostPads.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(BoostPads.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    // Register Blocks
    public static void registerModBlocks() {
        BoostPads.LOGGER.info("Registering Mod Blocks for " + BoostPads.MOD_ID);
    }
}
