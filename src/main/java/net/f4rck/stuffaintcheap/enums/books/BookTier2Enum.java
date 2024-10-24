package net.f4rck.stuffaintcheap.enums.books;

import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.EnchantedBookItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentInstance;
import net.minecraft.world.item.enchantment.Enchantments;

public enum BookTier2Enum {

    ALL_DAMAGE_PROTECTION(Enchantments.PROTECTION, 4, 45, 3),
    FALL_PROTECTION(Enchantments.FEATHER_FALLING, 4, 45, 3),
    PROJECTILE_PROTECTION(Enchantments.PROJECTILE_PROTECTION, 4, 45, 3),
    SHARPNESS(Enchantments.SHARPNESS, 4, 50, 3),
    SMITE(Enchantments.SMITE, 4, 35, 3),
    BANE_OF_ARTHROPODS(Enchantments.BANE_OF_ARTHROPODS, 4, 35, 3),
    KNOCKBACK(Enchantments.KNOCKBACK, 2, 25, 2),
    EFFICIENCY(Enchantments.EFFICIENCY, 4, 35, 3),
    POWER(Enchantments.POWER, 4, 35, 3),
    LOYALTY(Enchantments.LOYALTY, 3, 30, 2),
    IMPALING(Enchantments.IMPALING, 4, 40, 3),
    MULTISHOT(Enchantments.MULTISHOT, 1, 15, 1),
    QUICK_CHARGE(Enchantments.QUICK_CHARGE, 3, 25, 2),
    PIERCING(Enchantments.PIERCING, 4, 25, 3),
    VANISHING_CURSE(Enchantments.VANISHING_CURSE, 1, 15, 1);

    private final ResourceKey<Enchantment> enchantment;
    private final int level;
    private final int emeraldsCost;
    private final int diamondCost;

    BookTier2Enum(ResourceKey<Enchantment> enchantment, int level, int emeraldsCost, int diamondCost) {
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
