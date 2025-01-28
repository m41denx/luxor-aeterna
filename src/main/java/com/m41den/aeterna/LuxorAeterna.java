package com.m41den.aeterna;

import com.m41den.aeterna.blocks.BlockRegistry;
import com.m41den.aeterna.items.ItemRegistry;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LuxorAeterna implements ModInitializer {
	public static final String MOD_ID = "luxoraeterna";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ItemRegistry.registerItems();
		BlockRegistry.registerItems();
	}
}