package com.m41den.aeterna.blocks;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import static com.m41den.aeterna.LuxorAeterna.MOD_ID;

public class BlockRegistry {

    public static void registerItems() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(PINK_GOLD_BLOCK);
        });
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(
                Registries.ITEM, Identifier.of(MOD_ID, name),
                new BlockItem(block, new Item.Settings())
        );
    }

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(MOD_ID, name), block);
    }

    // region Items

    public static final Block PINK_GOLD_BLOCK = registerBlock(
            "pink_gold_block",
            new Block(
                    AbstractBlock.Settings.create()
                            .strength(4f) // Set toughness and blast resistance?
                            .requiresTool() // Would need regular iron pickaxe
                            .sounds(BlockSoundGroup.AMETHYST_BLOCK)
            )
    );

    //endregion
}
