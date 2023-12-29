package com.thunderstar.boost_pads.item;

import com.thunderstar.boost_pads.BoostPads;
import com.thunderstar.boost_pads.item.custom.CustomSmithingTemplateItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    // Items
    public static final Item SMITHING_TEMPLATE_BOOST_PAD_UPGRADE = registerItem("smithing_template_boost_pad_upgrade",
            new CustomSmithingTemplateItem(new FabricItemSettings()));

    // Add Items to Vanilla Tabs
    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(SMITHING_TEMPLATE_BOOST_PAD_UPGRADE);
    }

    // Helper Methods
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(BoostPads.MOD_ID, name), item);
    }

    // Register Items
    public static void registerModItems() {
        BoostPads.LOGGER.info("Registering Mod Items for " + BoostPads.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
