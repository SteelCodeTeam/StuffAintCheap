package net.f4rck.stuffaintcheap.enums;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.enchantment.Enchantment;

public interface EnchantedItemEnum {
    int getEmeraldsCost();
    int getDiamondCost();
    ResourceKey<Enchantment> getFirstEnchantment();
    ResourceKey<Enchantment> getSecondEnchantment();
    int getLevelOfFirstEnchantment();
    int getLevelOfSecondEnchantment();
}