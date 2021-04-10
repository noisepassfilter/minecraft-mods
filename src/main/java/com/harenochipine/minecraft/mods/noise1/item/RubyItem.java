package com.harenochipine.minecraft.mods.noise1.objects.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class RubyItem extends Item {
   public RubyItem(Properties builder) {
      super(builder);
   }

   /**
    * Returns true if this item has an enchantment glint. By default, this returns <code>stack.isItemEnchanted()</code>,
    * but other items can override it (for instance, written books always return true).
    *  
    * Note that if you override this method, you generally want to also call the super version (on {@link Item}) to get
    * the glint for enchanted items. Of course, that is unnecessary if the overwritten version always returns true.
    */
   public boolean hasEffect(ItemStack stack) {
      return true;
   }
}
