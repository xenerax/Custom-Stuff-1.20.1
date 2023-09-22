package net.xenerax.customstuff;

import net.fabricmc.api.ModInitializer;

import net.xenerax.customstuff.block.ModBlocks;
import net.xenerax.customstuff.item.ModItemGroups;
import net.xenerax.customstuff.item.ModItems;
import net.xenerax.customstuff.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomStuff implements ModInitializer {
	public static final String MOD_ID = "custom_stuff";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}