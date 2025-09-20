package net.f4rck.stuffaintcheap.enums;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.enchantment.Enchantment;

public interface EnchantedBookEnum {
    int getEmeraldsCost();
    int getDiamondCost();
    ResourceKey<Enchantment> getEnchantment();
    int getLevel();
}
