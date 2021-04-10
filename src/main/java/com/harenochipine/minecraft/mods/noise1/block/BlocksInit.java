package com.harenochipine.minecraft.mods.noise1.objects.block;

import com.harenochipine.minecraft.mods.noise1.NoiseOne;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

//@ObjectHolder(NoiseOne.MOD_ID)
//@Mod.EventBusSubscriber(modid = NoiseOne.MOD_ID, bus = Bus.MOD)
public class BlocksInit {
    //public static final Block ruby_ore = null;
    //public static final Block ruby_block = null;
    //public static final Block juice_mixer = null;
    //public static final QuarryBlock quarry = null;

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, NoiseOne.MOD_ID);

    public static final RegistryObject<Block> RUBY_ORE = BLOCKS.register("ruby_ore", () -> new Block(Block.Properties.create(Material.ROCK).setRequiresTool().hardnessAndResistance(0.5F)));
    public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", () -> new Block(Block.Properties.create(Material.ROCK).setRequiresTool().hardnessAndResistance(0.5F)));
    public static final RegistryObject<Block> JUICE_MIXER = BLOCKS.register("juice_mixer", () -> new JuiceMixerBlock(Block.Properties.create(Material.ROCK).setRequiresTool().hardnessAndResistance(0.5F)));
    public static final RegistryObject<Block> QUARRY = BLOCKS.register("quarry", () -> new QuarryBlock(Block.Properties.create(Material.ROCK).setRequiresTool().hardnessAndResistance(0.5F)));

    /*
    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> event) {
        //event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).setRequiresTool().hardnessAndResistance(3.0F, 3.0F)).setRegistryName("ruby_ore"));
        //event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).setRequiresTool().hardnessAndResistance(3.0F, 3.0F)).setRegistryName("ruby_block"));
        //event.getRegistry().register(new Block(Block.Properties.create(Material.IRON).setRequiresTool().hardnessAndResistance(0.5F)).setRegistryName("juice_mixer"));
        //event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).notSolid().setRequiresTool().hardnessAndResistance(0.5F)).setRegistryName("juice_mixer"));
        //event.getRegistry().register(new QuarryBlock(Block.Properties.create(Material.ROCK).setRequiresTool().hardnessAndResistance(0.5F)).setRegistryName("quarry"));
    }

    @SubscribeEvent
    public static void registerBlocksItems(final RegistryEvent.Register<Item> event) {
        //event.getRegistry().register(new BlockItem(ruby_ore, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("ruby_ore"));
        //event.getRegistry().register(new BlockItem(ruby_block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("ruby_block"));
        //event.getRegistry().register(new BlockItem(juice_mixer, new Item.Properties().group(NoiseOneItemGroup.instance)).setRegistryName("juice_mixer"));
        //event.getRegistry().register(new BlockItem(quarry, new Item.Properties().group(NoiseOneItemGroup.instance)).setRegistryName("quarry"));
    }
    */
}
