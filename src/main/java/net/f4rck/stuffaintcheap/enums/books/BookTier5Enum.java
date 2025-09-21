package net.f4rck.stuffaintcheap.enums.books;

import net.f4rck.stuffaintcheap.enums.EnchantedBookEnum;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;

import java.util.function.Supplier;

import static net.f4rck.stuffaintcheap.config.ModConfigValues.*;

public enum BookTier5Enum implements EnchantedBookEnum {
    THORNS(Enchantments.THORNS, 3, () -> BOOK_TIER5_THORNS_EMERALDS.get(), () -> BOOK_TIER5_THORNS_DIAMONDS.get()),
    BINDING_CURSE(Enchantments.BINDING_CURSE, 1, () -> BOOK_TIER5_BINDING_CURSE_EMERALDS.get(), () -> BOOK_TIER5_BINDING_CURSE_DIAMONDS.get()),
    SILK_TOUCH(Enchantments.SILK_TOUCH, 1, () -> BOOK_TIER5_SILK_TOUCH_EMERALDS.get(), () -> BOOK_TIER5_SILK_TOUCH_DIAMONDS.get()),
    UNBREAKING(Enchantments.UNBREAKING, 3, () -> BOOK_TIER5_UNBREAKING_EMERALDS.get(), () -> BOOK_TIER5_UNBREAKING_DIAMONDS.get()),
    INFINITY(Enchantments.INFINITY, 1, () -> BOOK_TIER5_INFINITY_EMERALDS.get(), () -> BOOK_TIER5_INFINITY_DIAMONDS.get()),
    CHANNELING(Enchantments.CHANNELING, 1, () -> BOOK_TIER5_CHANNELING_EMERALDS.get(), () -> BOOK_TIER5_CHANNELING_DIAMONDS.get()),
    MENDING(Enchantments.MENDING, 1, () -> BOOK_TIER5_MENDING_EMERALDS.get(), () -> BOOK_TIER5_MENDING_DIAMONDS.get());


    private final ResourceKey<Enchantment> enchantment;
    private final int level;
    private final Supplier<Integer> emeraldsCost;
    private final Supplier<Integer> diamondCost;

    BookTier5Enum(ResourceKey<Enchantment> enchantment, int level, Supplier<Integer> emeraldsCost, Supplier<Integer> diamondCost) {
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