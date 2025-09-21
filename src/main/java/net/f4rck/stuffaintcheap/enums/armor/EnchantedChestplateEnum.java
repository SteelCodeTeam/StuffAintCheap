package net.f4rck.stuffaintcheap.enums.armor;

import net.f4rck.stuffaintcheap.enums.EnchantedItemEnum;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;

import java.util.function.Supplier;

import static net.f4rck.stuffaintcheap.config.ModConfigValues.*;

public enum EnchantedChestplateEnum implements EnchantedItemEnum {
    UNBREAKING_AND_PROTECTION(Enchantments.UNBREAKING, 2, Enchantments.PROTECTION, 3, () -> CHESTPLATE_UNBREAKING_AND_PROTECTION_EMERALDS.get(), () -> CHESTPLATE_UNBREAKING_AND_PROTECTION_DIAMONDS.get()),
    UNBREAKING_AND_FIRE_PROTECTION(Enchantments.UNBREAKING, 2, Enchantments.FIRE_PROTECTION, 2, () -> CHESTPLATE_UNBREAKING_AND_FIRE_PROTECTION_EMERALDS.get(), () -> CHESTPLATE_UNBREAKING_AND_FIRE_PROTECTION_DIAMONDS.get()),
    UNBREAKING_AND_PROJECTILE_PROTECTION(Enchantments.UNBREAKING, 2, Enchantments.PROJECTILE_PROTECTION, 2, () -> CHESTPLATE_UNBREAKING_AND_PROJECTILE_PROTECTION_EMERALDS.get(), () -> CHESTPLATE_UNBREAKING_AND_PROJECTILE_PROTECTION_DIAMONDS.get()),
    UNBREAKING_AND_BLAST_PROTECTION(Enchantments.UNBREAKING, 2, Enchantments.BLAST_PROTECTION, 2, () -> CHESTPLATE_UNBREAKING_AND_BLAST_PROTECTION_EMERALDS.get(), () -> CHESTPLATE_UNBREAKING_AND_BLAST_PROTECTION_DIAMONDS.get()),
    UNBREAKING_AND_THORNS(Enchantments.UNBREAKING, 2, Enchantments.THORNS, 2, () -> CHESTPLATE_UNBREAKING_AND_THORNS_EMERALDS.get(), () -> CHESTPLATE_UNBREAKING_AND_THORNS_DIAMONDS.get());


    private final ResourceKey<Enchantment> firstEnchantment;
    private final int levelOfFirstEnchantment;
    private final ResourceKey<Enchantment> secondEnchantment;
    private final int levelOfSecondEnchantment;
    private final Supplier<Integer> emeraldsCost;
    private final Supplier<Integer> diamondCost;


    EnchantedChestplateEnum(ResourceKey<Enchantment> firstEnchantment, int levelOfFirstEnchantment, ResourceKey<Enchantment> secondEnchantment, int levelOfSecondEnchantment, Supplier<Integer> emeraldsCost, Supplier<Integer> diamondCost) {
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
