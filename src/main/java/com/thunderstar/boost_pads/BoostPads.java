package com.thunderstar.boost_pads;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BoostPads implements ModInitializer {
	public static final String MOD_ID = "boost_pads";
    public static final Logger LOGGER = LoggerFactory.getLogger("boost_pads");

	@Override
	public void onInitialize() {
		LOGGER.info("DEJA VU!");
	}
}