package com.thunderstar.boost_pads;

import com.thunderstar.boost_pads.block.ModBlocks;
import com.thunderstar.boost_pads.item.ModItemGroups;
import com.thunderstar.boost_pads.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BoostPads implements ModInitializer {
	public static final String MOD_ID = "boost_pads";
    public static final Logger LOGGER = LoggerFactory.getLogger("boost_pads");

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
