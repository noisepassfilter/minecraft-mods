package com.harenochipine.minecraft.mods.noise1.objects.tileentity;

import com.harenochipine.minecraft.mods.noise1.NoiseOne;
import com.harenochipine.minecraft.mods.noise1.objects.block.BlocksInit;

import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TileEntitiesInit {
    public static final DeferredRegister<TileEntityType<?>> TILE_ENTITIES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, NoiseOne.MOD_ID);

	//public static final RegistryObject<TileEntityType<JuiceMixerTileEntity>> JUICE_MIXER = TILE_ENTITIES.register("juice_mixer", ()->TileEntityType.Builder.create(JuiceMixerTileEntity::new, BlockInit.juice_mixer).build(null));
    public static final RegistryObject<TileEntityType<JuiceMixerTileEntity>> JUICE_MIXER = TILE_ENTITIES.register("juice_mixer", () -> TileEntityType.Builder.create(() -> new JuiceMixerTileEntity(), BlocksInit.JUICE_MIXER.get()).build(null));
    public static final RegistryObject<TileEntityType<QuarryTileEntity>> QUARRY = TILE_ENTITIES.register("quarry", () -> TileEntityType.Builder.create(() -> new QuarryTileEntity(), BlocksInit.QUARRY.get()).build(null));
}
