package com.harenochipine.minecraft.mods.noise1.objects.block;

import com.harenochipine.minecraft.mods.noise1.init.TileEntityInit;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

public class JuiceMixerBlock extends Block {
	public JuiceMixerBlock(Properties properties) {
		super(properties);
	}

	@Override
	public boolean hasTileEntity(BlockState state) {
		return true;
	}

	@Override
	public TileEntity createTileEntity(BlockState state, IBlockReader world) {
		return TileEntityInit.JUICE_MIXER.get().create();
	}
}
