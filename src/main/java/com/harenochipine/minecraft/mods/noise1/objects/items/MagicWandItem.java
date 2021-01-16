package com.harenochipine.minecraft.mods.noise1.objects.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

public class MagicWandItem extends Item {

	public MagicWandItem(Properties builder) {
		super(builder);
	}

	@Override
	public ActionResultType onItemUse(ItemUseContext context) {
		World world = context.getWorld();
		BlockPos position = context.getPos();
        context.getPlayer().sendMessage(new StringTextComponent("noise1:magic_wand used on (remote: " + world.isRemote + ") " + world.getBlockState(position).getBlock() + "@" + position), ATTACK_DAMAGE_MODIFIER);
		if (world.isRemote) {
	        context.getPlayer().sendMessage(new StringTextComponent("Let it rain. Or not. (isRaining: " + world.isRaining() + ")"), ATTACK_DAMAGE_MODIFIER);
	        if(world.isRaining()) {
				world.setRainStrength(0.0f);
			} else {
				world.setRainStrength(1.0f);
			}
		}
		return super.onItemUse(context);
	}
}
