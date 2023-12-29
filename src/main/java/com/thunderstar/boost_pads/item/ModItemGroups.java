package com.thunderstar.boost_pads.item;

import com.thunderstar.boost_pads.BoostPads;
import com.thunderstar.boost_pads.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    // Groups
    public static final ItemGroup BOOST_PAD_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(BoostPads.MOD_ID, "boost_pad_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.boost_pad_group"))
                    .icon(() -> new ItemStack(ModItems.SMITHING_TEMPLATE_BOOST_PAD_UPGRADE)).entries((displayContext, entries) -> {
                        // Items
                        entries.add(ModItems.SMITHING_TEMPLATE_BOOST_PAD_UPGRADE);

                        // Blocks
                        entries.add(ModBlocks.BOOST_PAD_LVL0);

                    }).build());

    // Register Item Groups
    public static void registerItemGroups() {
        BoostPads.LOGGER.info("Registering Item Groups for " + BoostPads.MOD_ID);
    }
}
