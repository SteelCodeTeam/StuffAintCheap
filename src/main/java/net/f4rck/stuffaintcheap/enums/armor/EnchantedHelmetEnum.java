package net.f4rck.stuffaintcheap.enums.armor;

import net.f4rck.stuffaintcheap.enums.EnchantedItemEnum;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;

import java.util.function.Supplier;

import static net.f4rck.stuffaintcheap.config.ModConfigValues.*;

public enum EnchantedHelmetEnum implements EnchantedItemEnum {
    UNBREAKING_AND_PROTECTION(Enchantments.UNBREAKING, 2, Enchantments.PROTECTION, 3, () -> HELMET_UNBREAKING_AND_PROTECTION_EMERALDS.get(), () -> HELMET_UNBREAKING_AND_PROTECTION_DIAMONDS.get()),
    UNBREAKING_AND_FIRE_PROTECTION(Enchantments.UNBREAKING, 2, Enchantments.FIRE_PROTECTION, 2, () -> HELMET_UNBREAKING_AND_FIRE_PROTECTION_EMERALDS.get(), () -> HELMET_UNBREAKING_AND_FIRE_PROTECTION_DIAMONDS.get()),
    UNBREAKING_AND_PROJECTILE_PROTECTION(Enchantments.UNBREAKING, 2, Enchantments.PROJECTILE_PROTECTION, 2, () -> HELMET_UNBREAKING_AND_PROJECTILE_PROTECTION_EMERALDS.get(), () -> HELMET_UNBREAKING_AND_PROJECTILE_PROTECTION_DIAMONDS.get()),
    UNBREAKING_AND_RESPIRATION(Enchantments.UNBREAKING, 2, Enchantments.RESPIRATION, 2, () -> HELMET_UNBREAKING_AND_RESPIRATION_EMERALDS.get(), () -> HELMET_UNBREAKING_AND_RESPIRATION_DIAMONDS.get()),
    UNBREAKING_AND_AQUA_AFFINITY(Enchantments.UNBREAKING, 2, Enchantments.AQUA_AFFINITY, 1, () -> HELMET_UNBREAKING_AND_AQUA_AFFINITY_EMERALDS.get(), () -> HELMET_UNBREAKING_AND_AQUA_AFFINITY_DIAMONDS.get());


    private final ResourceKey<Enchantment> firstEnchantment;
    private final int levelOfFirstEnchantment;
    private final ResourceKey<Enchantment> secondEnchantment;
    private final int levelOfSecondEnchantment;
    private final Supplier<Integer> emeraldsCost;
    private final Supplier<Integer> diamondCost;


    EnchantedHelmetEnum(ResourceKey<Enchantment> firstEnchantment, int levelOfFirstEnchantment, ResourceKey<Enchantment> secondEnchantment, int levelOfSecondEnchantment, Supplier<Integer> emeraldsCost, Supplier<Integer> diamondCost) {
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