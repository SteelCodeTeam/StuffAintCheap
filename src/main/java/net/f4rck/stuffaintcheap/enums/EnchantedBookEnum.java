package net.f4rck.stuffaintcheap.enums;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.enchantment.Enchantment;

import java.util.function.Supplier;

public interface EnchantedBookEnum {
    Supplier<Integer> getEmeraldsCost();
    Supplier<Integer> getDiamondCost();
    ResourceKey<Enchantment> getEnchantment();
    int getLevel();
}
