package com.harenochipine.minecraft.mods.noise1.init;

import com.harenochipine.minecraft.mods.noise1.NoiseOne;
import com.harenochipine.minecraft.mods.noise1.NoiseOne.NoiseOneItemGroup;
import com.harenochipine.minecraft.mods.noise1.objects.item.MagicWandItem;
import com.harenochipine.minecraft.mods.noise1.objects.item.NoiseOneItemTier;
import com.harenochipine.minecraft.mods.noise1.objects.item.RubyItem;

import net.minecraft.item.AxeItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Food;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemTier;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

//@ObjectHolder(NoiseOne.MOD_ID)
//@Mod.EventBusSubscriber(modid = NoiseOne.MOD_ID, bus = Bus.MOD)
public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, NoiseOne.MOD_ID);

	public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
	public static final RegistryObject<Item> RUBY_EDIBLE = ITEMS.register("ruby_edible", () -> new RubyItem(new Item.Properties().group(ItemGroup.MATERIALS).food(new Food.Builder().hunger(6).saturation(1.2f).effect(() -> new EffectInstance(Effects.HASTE, 6000, 5), 1).build())));
	public static final RegistryObject<Item> RUBY_SWORD = ITEMS.register("ruby_sword", () -> new SwordItem(ItemTier.DIAMOND, 15, -2.4F, (new Item.Properties()).group(ItemGroup.COMBAT)));
	public static final RegistryObject<Item> RUBY_SHOVEL = ITEMS.register("ruby_shovel", () -> new ShovelItem(NoiseOneItemTier.RUBY, 1.5F, -3.0F, (new Item.Properties()).group(NoiseOneItemGroup.instance)));
	public static final RegistryObject<Item> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe", () -> new PickaxeItem(NoiseOneItemTier.RUBY, 1, -2.8F, (new Item.Properties()).group(NoiseOneItemGroup.instance)));
	public static final RegistryObject<Item> RUBY_AXE = ITEMS.register("ruby_axe", () -> new AxeItem(NoiseOneItemTier.RUBY, 5.0F, -3.0F, (new Item.Properties()).group(NoiseOneItemGroup.instance)));
	public static final RegistryObject<Item> RUBY_HOE = ITEMS.register("ruby_hoe", () -> new HoeItem(NoiseOneItemTier.RUBY, -3, 0.0F, (new Item.Properties()).group(NoiseOneItemGroup.instance)));
	public static final RegistryObject<Item> MAGIC_WAND = ITEMS.register("magic_wand", () -> new MagicWandItem(new Item.Properties().group(NoiseOneItemGroup.instance)));

	public static final RegistryObject<BlockItem> RUBY_ORE = ITEMS.register("ruby_ore", () -> new BlockItem(BlockInit.RUBY_ORE.get(), new Item.Properties().group(NoiseOneItemGroup.instance)));
	public static final RegistryObject<BlockItem> RUBY_BLOCK = ITEMS.register("ruby_block", () -> new BlockItem(BlockInit.RUBY_BLOCK.get(), new Item.Properties().group(NoiseOneItemGroup.instance)));
	public static final RegistryObject<BlockItem> JUICE_MIXER = ITEMS.register("juice_mixer", () -> new BlockItem(BlockInit.JUICE_MIXER.get(), new Item.Properties().group(NoiseOneItemGroup.instance)));
	public static final RegistryObject<BlockItem> QUARRY = ITEMS.register("quarry", () -> new BlockItem(BlockInit.QUARRY.get(), new Item.Properties().group(NoiseOneItemGroup.instance)));
	/*
    public static final Item ruby = null;
    public static final Item ruby_edible = null;
    public static final Item ruby_sword = null;
    public static final Item ruby_shovel = null;
    public static final Item ruby_pickaxe = null;
    public static final Item ruby_axe = null;
    public static final Item ruby_hoe = null;
    public static final Item magic_wand = null;
    //public static final Item juice_mixer = null;

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event) {
        final IForgeRegistry<Item> regitry = event.getRegistry();
        //Just a ruby
        //event.getRegistry().register(new Item(new Item.Properties().group(ItemGroup.MATERIALS)).setRegistryName("ruby"));
        //Edible ruby
        //event.getRegistry().register(new Item(new Item.Properties().group(ItemGroup.MATERIALS).food(new Food.Builder().hunger(6).saturation(1.2f).effect(() -> new EffectInstance(Effects.HASTE, 6000, 5), 1).build())).setRegistryName("ruby"));
        //Edible enchanted ruby
        regitry.register(new Item(new Item.Properties().group(ItemGroup.MATERIALS)).setRegistryName("ruby"));
        regitry.register(new RubyItem(new Item.Properties().group(ItemGroup.MATERIALS).food(new Food.Builder().hunger(6).saturation(1.2f).effect(() -> new EffectInstance(Effects.HASTE, 6000, 5), 1).build())).setRegistryName("ruby_edible"));
        //Sword as just an item
        //event.getRegistry().register(new Item(new Item.Properties().group(ItemGroup.COMBAT)).setRegistryName("ruby_sword"));
        //Sword in the COMBAT group
        //event.getRegistry().register(new SwordItem(ItemTier.DIAMOND, 15, -2.4F, (new Item.Properties()).group(ItemGroup.COMBAT)).setRegistryName("ruby_sword"));
        //Sword in the mod's group
        regitry.register(new SwordItem(NoiseOneItemTier.RUBY, 15, -2.4F, (new Item.Properties()).group(NoiseOneItemGroup.instance)).setRegistryName("ruby_sword"));
        regitry.register(new ShovelItem(NoiseOneItemTier.RUBY, 1.5F, -3.0F, (new Item.Properties()).group(NoiseOneItemGroup.instance)).setRegistryName("ruby_shovel"));
        regitry.register(new PickaxeItem(NoiseOneItemTier.RUBY, 1, -2.8F, (new Item.Properties()).group(NoiseOneItemGroup.instance)).setRegistryName("ruby_pickaxe"));
        regitry.register(new AxeItem(NoiseOneItemTier.RUBY, 5.0F, -3.0F, (new Item.Properties()).group(NoiseOneItemGroup.instance)).setRegistryName("ruby_axe"));
        regitry.register(new HoeItem(NoiseOneItemTier.RUBY, -3, 0.0F, (new Item.Properties()).group(NoiseOneItemGroup.instance)).setRegistryName("ruby_hoe"));
        regitry.register(new MagicWandItem(new Item.Properties().group(NoiseOneItemGroup.instance)).setRegistryName("magic_wand"));
        //regitry.register(new Item(new Item.Properties().group(NoiseOneItemGroup.instance)).setRegistryName("juice_mixer"));
    }
    */
}
