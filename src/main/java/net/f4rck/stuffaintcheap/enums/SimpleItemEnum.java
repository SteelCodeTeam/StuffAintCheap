package net.f4rck.stuffaintcheap.enums;

import net.minecraft.world.item.trading.ItemCost;

public interface SimpleItemEnum {
    ItemCost getItemCost();
    net.minecraft.world.item.ItemStack getItemResult();
    int getMaxUses();
    int getXp();
}
