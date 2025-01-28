package com.m41den.aeterna.items;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static com.m41den.aeterna.LuxorAeterna.MOD_ID;

public class ItemRegistry {

    public static void registerItems() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(PINK_GOLD);
            entries.add(RAW_PINK_GOLD);
        });
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MOD_ID, name), item);
    }

    // region Items

    public static final Item PINK_GOLD = registerItem(
            "pink_gold",
            new Item(new Item.Settings())
    );
    public static final Item RAW_PINK_GOLD = registerItem(
            "raw_pink_gold",
            new Item(new Item.Settings())
    );

    //endregion
}
