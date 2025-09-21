package net.f4rck.stuffaintcheap.enums.books;

import net.f4rck.stuffaintcheap.enums.EnchantedBookEnum;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;

import java.util.function.Supplier;

import static net.f4rck.stuffaintcheap.config.ModConfigValues.*;

public enum BookTier4Enum implements EnchantedBookEnum {
    PROJECTILE_PROTECTION(Enchantments.PROJECTILE_PROTECTION, 4, () -> BOOK_TIER4_PROJECTILE_PROTECTION_EMERALDS.get(), () -> BOOK_TIER4_PROJECTILE_PROTECTION_DIAMONDS.get()),
    RESPIRATION(Enchantments.RESPIRATION, 3, () -> BOOK_TIER4_RESPIRATION_EMERALDS.get(), () -> BOOK_TIER4_RESPIRATION_DIAMONDS.get()),
    AQUA_AFFINITY(Enchantments.AQUA_AFFINITY, 1, () -> BOOK_TIER4_AQUA_AFFINITY_EMERALDS.get(), () -> BOOK_TIER4_AQUA_AFFINITY_DIAMONDS.get()),
    DEPTH_STRIDER(Enchantments.DEPTH_STRIDER, 3, () -> BOOK_TIER4_DEPTH_STRIDER_EMERALDS.get(), () -> BOOK_TIER4_DEPTH_STRIDER_DIAMONDS.get()),
    FROST_WALKER(Enchantments.FROST_WALKER, 2, () -> BOOK_TIER4_FROST_WALKER_EMERALDS.get(), () -> BOOK_TIER4_FROST_WALKER_DIAMONDS.get()),
    FIRE_ASPECT(Enchantments.FIRE_ASPECT, 2, () -> BOOK_TIER4_FIRE_ASPECT_EMERALDS.get(), () -> BOOK_TIER4_FIRE_ASPECT_DIAMONDS.get()),
    LOOTING(Enchantments.LOOTING, 3, () -> BOOK_TIER4_LOOTING_EMERALDS.get(), () -> BOOK_TIER4_LOOTING_DIAMONDS.get()),
    SWEEPING_EDGE(Enchantments.SWEEPING_EDGE, 3, () -> BOOK_TIER4_SWEEPING_EDGE_EMERALDS.get(), () -> BOOK_TIER4_SWEEPING_EDGE_DIAMONDS.get()),
    FORTUNE(Enchantments.FORTUNE, 3, () -> BOOK_TIER4_FORTUNE_EMERALDS.get(), () -> BOOK_TIER4_FORTUNE_DIAMONDS.get()),
    PUNCH(Enchantments.PUNCH, 2, () -> BOOK_TIER4_PUNCH_EMERALDS.get(), () -> BOOK_TIER4_PUNCH_DIAMONDS.get()),
    FLAME(Enchantments.FLAME, 1, () -> BOOK_TIER4_FLAME_EMERALDS.get(), () -> BOOK_TIER4_FLAME_DIAMONDS.get()),
    LUCK_OF_THE_SEA(Enchantments.LUCK_OF_THE_SEA, 3, () -> BOOK_TIER4_LUCK_OF_THE_SEA_EMERALDS.get(), () -> BOOK_TIER4_LUCK_OF_THE_SEA_DIAMONDS.get()),
    LURE(Enchantments.LURE, 3, () -> BOOK_TIER4_LURE_EMERALDS.get(), () -> BOOK_TIER4_LURE_DIAMONDS.get()),
    RIPTIDE(Enchantments.RIPTIDE, 3, () -> BOOK_TIER4_RIPTIDE_EMERALDS.get(), () -> BOOK_TIER4_RIPTIDE_DIAMONDS.get());

    private final ResourceKey<Enchantment> enchantment;
    private final int level;
    private final Supplier<Integer> emeraldsCost;
    private final Supplier<Integer> diamondCost;

    BookTier4Enum(ResourceKey<Enchantment> enchantment, int level, Supplier<Integer> emeraldsCost, Supplier<Integer> diamondCost) {
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
