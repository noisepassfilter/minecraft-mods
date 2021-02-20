package com.harenochipine.minecraft.mods.noise1.objects.item;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class MagicWandItem extends Item {

	public MagicWandItem(Properties builder) {
		super(builder);
	}

	@Override
	public ActionResultType onItemUse(ItemUseContext context) {
		World world = context.getWorld();
		BlockPos position = context.getPos();
		Block targetBlock = world.getBlockState(position).getBlock();
		//PlayerEntity player = context.getPlayer();
		//player.sendMessage(new StringTextComponent("noise1:magic_wand used on (client/remote: " + world.isRemote() + ", type: " + world.getClass().getName() + ") " + targetBlock.getRegistryName() + "@" + position), player.getUniqueID());
		// isRemote is true on the client
        if (!world.isRemote()) {
        	switch(targetBlock.getRegistryName().toString()) {
		        // Toggle rain
        		//case "minecraft:" + Blocks.PACKED_ICE.getRegistryName().toString():
        		case "minecraft:packed_ice":
        			//player.sendMessage(new StringTextComponent("Let it rain. Or not. (isRaining: " + world.isRaining() + ")"), player.getUniqueID());
			        if(world.isRaining()) {
						world.setRainStrength(0.0f);
					} else {
						world.setRainStrength(1.0f);
					}
        			break;
        		// Toggle day/night
        		//case "minecraft:" + Blocks.COAL_BLOCK.getRegistryName().toString():
        		case "minecraft:coal_block":
        			//player.sendMessage(new StringTextComponent("Let there be light. Or not. (fixedTime: " + world.getDimensionType().doesFixedTimeExist() + ", isDaytime: " + world.isDaytime() + ", time: " + world.getDayTime() + ")"), player.getUniqueID());
			        // Does the current dimension even have time (fixed time means there's no time?)
			        if(!world.getDimensionType().doesFixedTimeExist()) {
			        	if(world.isDaytime()) {
			    	        //context.getPlayer().sendMessage(new StringTextComponent("Let there be night."), player.getUniqueID());
				        	((ServerWorld)world).setDayTime(13000);
				        } else {
					        //context.getPlayer().sendMessage(new StringTextComponent("Let there be light."), ATTACK_DAMAGE_MODIFIER);
				        	((ServerWorld)world).setDayTime(1000);
				        }
					}
        			break;
        	}
		}
		return super.onItemUse(context);
	}
}
