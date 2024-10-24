package net.f4rck.stuffaintcheap.enums.books;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.EnchantedBookItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentInstance;
import net.minecraft.world.item.enchantment.Enchantments;

public enum BookTier4Enum {
    PROJECTILE_PROTECTION(Enchantments.PROJECTILE_PROTECTION, 4, 45, 3),
    RESPIRATION(Enchantments.RESPIRATION, 3, 30, 2),
    AQUA_AFFINITY(Enchantments.AQUA_AFFINITY, 1, 15, 1),
    DEPTH_STRIDER(Enchantments.DEPTH_STRIDER, 3, 35, 2),
    FROST_WALKER(Enchantments.FROST_WALKER, 2, 25, 2),
    FIRE_ASPECT(Enchantments.FIRE_ASPECT, 2, 20, 2),
    LOOTING(Enchantments.LOOTING, 3, 40, 3),
    SWEEPING_EDGE(Enchantments.SWEEPING_EDGE, 3, 30, 3),
    FORTUNE(Enchantments.FORTUNE, 3, 35, 3),
    PUNCH(Enchantments.PUNCH, 2, 25, 1),
    FLAME(Enchantments.FLAME, 1, 15, 1),
    LUCK_OF_THE_SEA(Enchantments.LUCK_OF_THE_SEA, 3, 25, 1),
    LURE(Enchantments.LURE, 3, 25, 1),
    RIPTIDE(Enchantments.RIPTIDE, 3, 30, 2);


    private final ResourceKey<Enchantment> enchantment;
    private final int level;
    private final int emeraldsCost;
    private final int diamondCost;

    BookTier4Enum(ResourceKey<Enchantment> enchantment, int level, int emeraldsCost, int diamondCost) {
        this.enchantment = enchantment;
        this.level = level;
        this.emeraldsCost = emeraldsCost;
        this.diamondCost = diamondCost;
    }


    public ResourceKey<Enchantment> getEnchantment() {
        return enchantment;
    }

    public int getLevel() {
        return level;
    }


    public int getEmeraldsCost() {
        return emeraldsCost;
    }

    public int getDiamondCost() {
        return diamondCost;
    }

}
