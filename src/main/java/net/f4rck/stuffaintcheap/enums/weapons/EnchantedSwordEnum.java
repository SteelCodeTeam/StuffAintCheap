package net.f4rck.stuffaintcheap.enums.weapons;

import net.f4rck.stuffaintcheap.enums.EnchantedItemEnum;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;


public enum EnchantedSwordEnum implements EnchantedItemEnum {
    UNBREAKING_AND_SHARPNESS(Enchantments.UNBREAKING, 2, Enchantments.SHARPNESS, 3, 27, 1),
    UNBREAKING_AND_LOOTING(Enchantments.UNBREAKING, 2, Enchantments.LOOTING, 2, 21, 1),
    LOOTING_AND_SHARPNESS(Enchantments.LOOTING, 2, Enchantments.SHARPNESS, 3, 28, 1),
    LOOTING_AND_SMITE(Enchantments.LOOTING, 2, Enchantments.SMITE, 3, 25, 1),
    LOOTING_AND_BANE_OF_ANTHROPODS(Enchantments.LOOTING, 2, Enchantments.BANE_OF_ARTHROPODS, 3, 23, 1),
    UNBREAKING_AND_SMITE(Enchantments.UNBREAKING, 2, Enchantments.SMITE, 3, 24, 2),
    UNBREAKING_AND_BANE_OF_ANTHROPODS(Enchantments.UNBREAKING, 2, Enchantments.BANE_OF_ARTHROPODS, 3, 22, 1);



    private final ResourceKey<Enchantment> firstEnchantment;
    private final int levelOfFirstEnchantment;
    private final ResourceKey<Enchantment> secondEnchantment;
    private final int levelOfSecondEnchantment;
    private final int emeraldsCost;
    private final int diamondCost;


    EnchantedSwordEnum(ResourceKey<Enchantment> firstEnchantment, int levelOfFirstEnchantment, ResourceKey<Enchantment> secondEnchantment, int levelOfSecondEnchantment, int emeraldsCost, int diamondCost) {
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

    public int getEmeraldsCost() {
        return emeraldsCost;
    }

    public int getDiamondCost() {
        return diamondCost;
    }
}