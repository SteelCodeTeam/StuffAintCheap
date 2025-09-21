package net.f4rck.stuffaintcheap.enums.books;

import net.f4rck.stuffaintcheap.enums.EnchantedBookEnum;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;

import java.util.function.Supplier;

import static net.f4rck.stuffaintcheap.config.ModConfigValues.*;

public enum BookTier2Enum implements EnchantedBookEnum {

    ALL_DAMAGE_PROTECTION(Enchantments.PROTECTION, 4, () -> BOOK_TIER2_ALL_DAMAGE_PROTECTION_EMERALDS.get(), () -> BOOK_TIER2_ALL_DAMAGE_PROTECTION_DIAMONDS.get()),
    FALL_PROTECTION(Enchantments.FEATHER_FALLING, 4, () -> BOOK_TIER2_FALL_PROTECTION_EMERALDS.get(), () -> BOOK_TIER2_FALL_PROTECTION_DIAMONDS.get()),
    PROJECTILE_PROTECTION(Enchantments.PROJECTILE_PROTECTION, 4, () -> BOOK_TIER2_PROJECTILE_PROTECTION_EMERALDS.get(), () -> BOOK_TIER2_PROJECTILE_PROTECTION_DIAMONDS.get()),
    SHARPNESS(Enchantments.SHARPNESS, 4, () -> BOOK_TIER2_SHARPNESS_EMERALDS.get(), () -> BOOK_TIER2_SHARPNESS_DIAMONDS.get()),
    SMITE(Enchantments.SMITE, 4, () -> BOOK_TIER2_SMITE_EMERALDS.get(), () -> BOOK_TIER2_SMITE_DIAMONDS.get()),
    BANE_OF_ARTHROPODS(Enchantments.BANE_OF_ARTHROPODS, 4, () -> BOOK_TIER2_BANE_OF_ARTHROPODS_EMERALDS.get(), () -> BOOK_TIER2_BANE_OF_ARTHROPODS_DIAMONDS.get()),
    KNOCKBACK(Enchantments.KNOCKBACK, 2, () -> BOOK_TIER2_KNOCKBACK_EMERALDS.get(), () -> BOOK_TIER2_KNOCKBACK_DIAMONDS.get()),
    EFFICIENCY(Enchantments.EFFICIENCY, 4, () -> BOOK_TIER2_EFFICIENCY_EMERALDS.get(), () -> BOOK_TIER2_EFFICIENCY_DIAMONDS.get()),
    POWER(Enchantments.POWER, 4, () -> BOOK_TIER2_POWER_EMERALDS.get(), () -> BOOK_TIER2_POWER_DIAMONDS.get()),
    LOYALTY(Enchantments.LOYALTY, 3, () -> BOOK_TIER2_LOYALTY_EMERALDS.get(), () -> BOOK_TIER2_LOYALTY_DIAMONDS.get()),
    IMPALING(Enchantments.IMPALING, 4, () -> BOOK_TIER2_IMPALING_EMERALDS.get(), () -> BOOK_TIER2_IMPALING_DIAMONDS.get()),
    MULTISHOT(Enchantments.MULTISHOT, 1, () -> BOOK_TIER2_MULTISHOT_EMERALDS.get(), () -> BOOK_TIER2_MULTISHOT_DIAMONDS.get()),
    QUICK_CHARGE(Enchantments.QUICK_CHARGE, 3, () -> BOOK_TIER2_QUICK_CHARGE_EMERALDS.get(), () -> BOOK_TIER2_QUICK_CHARGE_DIAMONDS.get()),
    PIERCING(Enchantments.PIERCING, 4, () -> BOOK_TIER2_PIERCING_EMERALDS.get(), () -> BOOK_TIER2_PIERCING_DIAMONDS.get()),
    VANISHING_CURSE(Enchantments.VANISHING_CURSE, 1, () -> BOOK_TIER2_VANISHING_CURSE_EMERALDS.get(), () -> BOOK_TIER2_VANISHING_CURSE_DIAMONDS.get());

    private final ResourceKey<Enchantment> enchantment;
    private final int level;
    private final Supplier<Integer> emeraldsCost;
    private final Supplier<Integer> diamondCost;

    BookTier2Enum(ResourceKey<Enchantment> enchantment, int level, Supplier<Integer> emeraldsCost, Supplier<Integer> diamondCost) {
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


    public Supplier<Integer> getEmeraldsCost() {
        return emeraldsCost;
    }

    public Supplier<Integer> getDiamondCost() {
        return diamondCost;
    }



}
