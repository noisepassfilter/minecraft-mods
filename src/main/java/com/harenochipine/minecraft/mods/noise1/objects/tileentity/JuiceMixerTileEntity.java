package com.harenochipine.minecraft.mods.noise1.objects.tileentity;

import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;

public class JuiceMixerTileEntity extends TileEntity implements ITickableTileEntity {

	public JuiceMixerTileEntity(final TileEntityType<?> tileEntityTypeIn) {
		super(tileEntityTypeIn);
		// TODO Auto-generated constructor stub
	}

	public JuiceMixerTileEntity() {
		this(TileEntitiesInit.JUICE_MIXER.get());
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}

}
