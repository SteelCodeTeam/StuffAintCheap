package net.f4rck.stuffaintcheap.enums.tools;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;


public enum EnchantedShovelEnum {
    UNBREAKING_AND_EFFICIENCY(Enchantments.UNBREAKING, 2, Enchantments.EFFICIENCY, 3, 18, 1),
    UNBREAKING_AND_FORTUNE(Enchantments.UNBREAKING, 2, Enchantments.FORTUNE, 2, 20, 1),
    FORTUNE_AND_EFFICIENCY(Enchantments.FORTUNE, 2, Enchantments.EFFICIENCY, 3, 22, 1);


    private final ResourceKey<Enchantment> firstEnchantment;
    private final int levelOfFirstEnchantment;
    private final ResourceKey<Enchantment> secondEnchantment;
    private final int levelOfSecondEnchantment;
    private final int emeraldsCost;
    private final int diamondCost;


    EnchantedShovelEnum(ResourceKey<Enchantment> firstEnchantment, int levelOfFirstEnchantment, ResourceKey<Enchantment> secondEnchantment, int levelOfSecondEnchantment, int emeraldsCost, int diamondCost) {
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