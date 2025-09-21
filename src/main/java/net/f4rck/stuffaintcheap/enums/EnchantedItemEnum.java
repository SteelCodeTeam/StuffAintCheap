package net.f4rck.stuffaintcheap.enums;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.enchantment.Enchantment;

import java.util.function.Supplier;

public interface EnchantedItemEnum {
    Supplier<Integer> getEmeraldsCost();
    Supplier<Integer> getDiamondCost();
    ResourceKey<Enchantment> getFirstEnchantment();
    ResourceKey<Enchantment> getSecondEnchantment();
    int getLevelOfFirstEnchantment();
    int getLevelOfSecondEnchantment();
}