package com.harenochipine.minecraft.mods.noise1.init;

import com.harenochipine.minecraft.mods.noise1.NoiseOne;
import com.harenochipine.minecraft.mods.noise1.NoiseOne.NoiseOneItemGroup;
import com.harenochipine.minecraft.mods.noise1.objects.items.NoiseOneItemTier;
import com.harenochipine.minecraft.mods.noise1.objects.items.RubyItem;

import net.minecraft.item.AxeItem;
import net.minecraft.item.Food;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(NoiseOne.MOD_ID)
@Mod.EventBusSubscriber(modid = NoiseOne.MOD_ID, bus = Bus.MOD)
public class ItemInit {
    public static final Item ruby = null;
    public static final Item ruby_sword = null;
    public static final Item ruby_shovel = null;
    public static final Item ruby_pickaxe = null;
    public static final Item ruby_axe = null;
    public static final Item ruby_hoe = null;

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event) {
        final IForgeRegistry<Item> regitry = event.getRegistry();
        //Just a ruby
        //event.getRegistry().register(new Item(new Item.Properties().group(ItemGroup.MATERIALS)).setRegistryName("ruby"));
        //Edible ruby
        //event.getRegistry().register(new Item(new Item.Properties().group(ItemGroup.MATERIALS).food(new Food.Builder().hunger(6).saturation(1.2f).effect(() -> new EffectInstance(Effects.HASTE, 6000, 5), 1).build())).setRegistryName("ruby"));
        //Edible enchanted ruby
        regitry.register(new RubyItem(new Item.Properties().group(ItemGroup.MATERIALS).food(new Food.Builder().hunger(6).saturation(1.2f).effect(() -> new EffectInstance(Effects.HASTE, 6000, 5), 1).build())).setRegistryName("ruby"));
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
    }
}
