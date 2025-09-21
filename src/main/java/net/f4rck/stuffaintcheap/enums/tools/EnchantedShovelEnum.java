package net.f4rck.stuffaintcheap.enums.tools;

import net.f4rck.stuffaintcheap.enums.EnchantedItemEnum;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;

import java.util.function.Supplier;

import static net.f4rck.stuffaintcheap.config.ModConfigValues.*;

public enum EnchantedShovelEnum implements EnchantedItemEnum {
    UNBREAKING_AND_EFFICIENCY(Enchantments.UNBREAKING, 2, Enchantments.EFFICIENCY, 3, () -> SHOVEL_UNBREAKING_AND_EFFICIENCY_EMERALDS.get(), () -> SHOVEL_UNBREAKING_AND_EFFICIENCY_DIAMONDS.get()),
    UNBREAKING_AND_FORTUNE(Enchantments.UNBREAKING, 2, Enchantments.FORTUNE, 2, () -> SHOVEL_UNBREAKING_AND_FORTUNE_EMERALDS.get(), () -> SHOVEL_UNBREAKING_AND_FORTUNE_DIAMONDS.get()),
    FORTUNE_AND_EFFICIENCY(Enchantments.FORTUNE, 2, Enchantments.EFFICIENCY, 3, () -> SHOVEL_FORTUNE_AND_EFFICIENCY_EMERALDS.get(), () -> SHOVEL_FORTUNE_AND_EFFICIENCY_DIAMONDS.get());


    private final ResourceKey<Enchantment> firstEnchantment;
    private final int levelOfFirstEnchantment;
    private final ResourceKey<Enchantment> secondEnchantment;
    private final int levelOfSecondEnchantment;
    private final Supplier<Integer> emeraldsCost;
    private final Supplier<Integer> diamondCost;


    EnchantedShovelEnum(ResourceKey<Enchantment> firstEnchantment, int levelOfFirstEnchantment, ResourceKey<Enchantment> secondEnchantment, int levelOfSecondEnchantment, Supplier<Integer> emeraldsCost, Supplier<Integer> diamondCost) {
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