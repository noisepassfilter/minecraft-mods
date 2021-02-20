package com.harenochipine.minecraft.mods.noise1.init;

import com.harenochipine.minecraft.mods.noise1.NoiseOne;
import com.harenochipine.minecraft.mods.noise1.NoiseOne.NoiseOneItemGroup;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(NoiseOne.MOD_ID)
@Mod.EventBusSubscriber(modid = NoiseOne.MOD_ID, bus = Bus.MOD)
public class BlockInit {
    public static final Block ruby_ore = null;
    public static final Block ruby_block = null;
    public static final Block juice_mixer = null;

    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).setRequiresTool().hardnessAndResistance(3.0F, 3.0F)).setRegistryName("ruby_ore"));
        event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).setRequiresTool().hardnessAndResistance(3.0F, 3.0F)).setRegistryName("ruby_block"));
        //event.getRegistry().register(new Block(Block.Properties.create(Material.IRON).setRequiresTool().hardnessAndResistance(0.5F)).setRegistryName("juice_mixer"));
        event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).notSolid().setRequiresTool().hardnessAndResistance(0.5F)).setRegistryName("juice_mixer"));
    }

    @SubscribeEvent
    public static void registerBlocksItems(final RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new BlockItem(ruby_ore, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("ruby_ore"));
        event.getRegistry().register(new BlockItem(ruby_block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("ruby_block"));
        event.getRegistry().register(new BlockItem(juice_mixer, new Item.Properties().group(NoiseOneItemGroup.instance)).setRegistryName("juice_mixer"));
    }
}
