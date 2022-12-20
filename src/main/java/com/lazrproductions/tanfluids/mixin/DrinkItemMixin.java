package com.lazrproductions.tanfluids.mixin;

import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import toughasnails.item.DrinkItem;


@Mixin(DrinkItem.class)
public class DrinkItemMixin extends Item {
    public DrinkItemMixin(Properties p_41383_) {
		super(p_41383_);
	}

    @Override
    public ItemStack getCraftingRemainingItem(ItemStack itemStack) {
        return new ItemStack(Items.GLASS_BOTTLE);
    }
    @Override
    public boolean hasCraftingRemainingItem(ItemStack stack) {
        return true;
    }
    // @Override
    // public int getMaxStackSize(ItemStack stack) {
    //     return 16;
    // }


}
