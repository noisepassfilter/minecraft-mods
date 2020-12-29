package com.harenochipine.minecraft.mods.noise1.init;

import com.harenochipine.minecraft.mods.noise1.NoiseOne;
import com.harenochipine.minecraft.mods.noise1.NoiseOne.NoiseOneItemGroup;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemTier;
import net.minecraft.item.SwordItem;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(NoiseOne.MOD_ID)
@Mod.EventBusSubscriber(modid = NoiseOne.MOD_ID, bus = Bus.MOD)
public class ItemInit {
	public static final Item ruby = null;
	public static final Item ruby_sword = null;

	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event) {
		//event.getRegistry().register(new Item(new Item.Properties().group(ItemGroup.MATERIALS)).setRegistryName("ruby"));
		event.getRegistry().register(new Item(new Item.Properties().group(ItemGroup.MATERIALS).food(new Food.Builder().hunger(6).saturation(1.2f).effect(() -> new EffectInstance(Effects.HASTE, 6000, 5), 1).build())).setRegistryName("ruby"));
		//event.getRegistry().register(new Item(new Item.Properties().group(ItemGroup.COMBAT)).setRegistryName("ruby_sword"));
		//event.getRegistry().register(new SwordItem(ItemTier.DIAMOND, 15, -2.4F, (new Item.Properties()).group(ItemGroup.COMBAT)).setRegistryName("ruby_sword"));
		event.getRegistry().register(new SwordItem(ItemTier.DIAMOND, 15, -2.4F, (new Item.Properties()).group(NoiseOneItemGroup.instance)).setRegistryName("ruby_sword"));
	}
}
