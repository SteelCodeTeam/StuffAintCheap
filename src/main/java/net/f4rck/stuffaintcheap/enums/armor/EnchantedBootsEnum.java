package net.f4rck.stuffaintcheap.enums.armor;

import net.f4rck.stuffaintcheap.enums.EnchantedItemEnum;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;

import java.util.function.Supplier;

import static net.f4rck.stuffaintcheap.config.ModConfigValues.*;

public enum EnchantedBootsEnum implements EnchantedItemEnum {
    UNBREAKING_AND_PROTECTION(Enchantments.UNBREAKING, 2, Enchantments.PROTECTION, 3, () -> BOOTS_UNBREAKING_AND_PROTECTION_EMERALDS.get(), () -> BOOTS_UNBREAKING_AND_PROTECTION_DIAMONDS.get()),
    UNBREAKING_AND_FIRE_PROTECTION(Enchantments.UNBREAKING, 2, Enchantments.FIRE_PROTECTION, 2, () -> BOOTS_UNBREAKING_AND_FIRE_PROTECTION_EMERALDS.get(), () -> BOOTS_UNBREAKING_AND_FIRE_PROTECTION_DIAMONDS.get()),
    UNBREAKING_AND_PROYECTILE_PROTECTION(Enchantments.UNBREAKING, 2, Enchantments.PROJECTILE_PROTECTION, 2, () -> BOOTS_UNBREAKING_AND_PROYECTILE_PROTECTION_EMERALDS.get(), () -> BOOTS_UNBREAKING_AND_PROYECTILE_PROTECTION_DIAMONDS.get()),
    UNBREAKING_AND_DEPTH_STRIDER(Enchantments.UNBREAKING, 2, Enchantments.DEPTH_STRIDER, 2, () -> BOOTS_UNBREAKING_AND_DEPTH_STRIDER_EMERALDS.get(), () -> BOOTS_UNBREAKING_AND_DEPTH_STRIDER_DIAMONDS.get()),
    UNBREAKING_AND_FALL_PROTECTION(Enchantments.UNBREAKING, 2, Enchantments.FEATHER_FALLING, 2, () -> BOOTS_UNBREAKING_AND_FALL_PROTECTION_EMERALDS.get(), () -> BOOTS_UNBREAKING_AND_FALL_PROTECTION_DIAMONDS.get());

    private final ResourceKey<Enchantment> firstEnchantment;
    private final int levelOfFirstEnchantment;
    private final ResourceKey<Enchantment> secondEnchantment;
    private final int levelOfSecondEnchantment;
    private final Supplier<Integer> emeraldsCost;
    private final Supplier<Integer> diamondCost;


    EnchantedBootsEnum(ResourceKey<Enchantment> firstEnchantment, int levelOfFirstEnchantment, ResourceKey<Enchantment> secondEnchantment, int levelOfSecondEnchantment, Supplier<Integer> emeraldsCost, Supplier<Integer> diamondCost) {
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