package net.f4rck.stuffaintcheap.enums.weapons;

import net.f4rck.stuffaintcheap.enums.EnchantedItemEnum;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;

import java.util.function.Supplier;

import static net.f4rck.stuffaintcheap.config.ModConfigValues.*;

public enum EnchantedSwordEnum implements EnchantedItemEnum {
    UNBREAKING_AND_SHARPNESS(Enchantments.UNBREAKING, 2, Enchantments.SHARPNESS, 3, () -> SWORD_UNBREAKING_AND_SHARPNESS_EMERALDS.get(), () -> SWORD_UNBREAKING_AND_SHARPNESS_DIAMONDS.get()),
    UNBREAKING_AND_LOOTING(Enchantments.UNBREAKING, 2, Enchantments.LOOTING, 2, () -> SWORD_UNBREAKING_AND_LOOTING_EMERALDS.get(), () -> SWORD_UNBREAKING_AND_LOOTING_DIAMONDS.get()),
    LOOTING_AND_SHARPNESS(Enchantments.LOOTING, 2, Enchantments.SHARPNESS, 3, () -> SWORD_LOOTING_AND_SHARPNESS_EMERALDS.get(), () -> SWORD_LOOTING_AND_SHARPNESS_DIAMONDS.get()),
    LOOTING_AND_SMITE(Enchantments.LOOTING, 2, Enchantments.SMITE, 3, () -> SWORD_LOOTING_AND_SMITE_EMERALDS.get(), () -> SWORD_LOOTING_AND_SMITE_DIAMONDS.get()),
    LOOTING_AND_BANE_OF_ANTHROPODS(Enchantments.LOOTING, 2, Enchantments.BANE_OF_ARTHROPODS, 3, () -> SWORD_LOOTING_AND_BANE_OF_ANTHROPODS_EMERALDS.get(), () -> SWORD_LOOTING_AND_BANE_OF_ANTHROPODS_DIAMONDS.get()),
    UNBREAKING_AND_SMITE(Enchantments.UNBREAKING, 2, Enchantments.SMITE, 3, () -> SWORD_UNBREAKING_AND_SMITE_EMERALDS.get(), () -> SWORD_UNBREAKING_AND_SMITE_DIAMONDS.get()),
    UNBREAKING_AND_BANE_OF_ANTHROPODS(Enchantments.UNBREAKING, 2, Enchantments.BANE_OF_ARTHROPODS, 3, () -> SWORD_UNBREAKING_AND_BANE_OF_ANTHROPODS_EMERALDS.get(), () -> SWORD_UNBREAKING_AND_BANE_OF_ANTHROPODS_DIAMONDS.get());



    private final ResourceKey<Enchantment> firstEnchantment;
    private final int levelOfFirstEnchantment;
    private final ResourceKey<Enchantment> secondEnchantment;
    private final int levelOfSecondEnchantment;
    private final Supplier<Integer> emeraldsCost;
    private final Supplier<Integer> diamondCost;


    EnchantedSwordEnum(ResourceKey<Enchantment> firstEnchantment, int levelOfFirstEnchantment, ResourceKey<Enchantment> secondEnchantment, int levelOfSecondEnchantment, Supplier<Integer> emeraldsCost, Supplier<Integer> diamondCost) {
        this.firstEnchantment = firstEnchantment;
        this.levelOfFirstEnchantment = levelOfFirstEnchantment;
        this.secondEnchantment = secondEnchantment;
        this.levelOfSecondEnchantment = levelOfSecondEnchantment;
        this.emeraldsCost = emeraldsCost;
        this.diamondCost = diamondCost;
    }

    public ResourceKey<Enchantment> getFirstEnchantment() {
        return firstEnchantment;
    }

    public int getLevelOfFirstEnchantment() {
        return levelOfFirstEnchantment;
    }

    public ResourceKey<Enchantment> getSecondEnchantment() {
        return secondEnchantment;
    }

    public int getLevelOfSecondEnchantment() {
        return levelOfSecondEnchantment;
    }

    public Supplier<Integer> getEmeraldsCost() {
        return emeraldsCost;
    }

    public Supplier<Integer> getDiamondCost() {
        return diamondCost;
    }
}