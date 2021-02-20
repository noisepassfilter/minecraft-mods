package com.harenochipine.minecraft.mods.noise1.init;

import com.harenochipine.minecraft.mods.noise1.NoiseOne;
import com.harenochipine.minecraft.mods.noise1.objects.tileentity.JuiceMixerTileEntity;

import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TileEntityInit {
	public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, NoiseOne.MOD_ID);
	public static final RegistryObject<TileEntityType<JuiceMixerTileEntity>> JUICE_MIXER = TILE_ENTITY_TYPES.register("juice_mixer", ()->TileEntityType.Builder.create(JuiceMixerTileEntity::new, BlockInit.juice_mixer).build(null));
}
