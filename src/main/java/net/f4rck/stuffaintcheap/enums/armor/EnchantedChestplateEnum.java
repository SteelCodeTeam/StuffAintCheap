package net.f4rck.stuffaintcheap.enums.armor;

import net.f4rck.stuffaintcheap.enums.EnchantedItemEnum;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;

public enum EnchantedChestplateEnum implements EnchantedItemEnum {
    UNBREAKING_AND_PROTECTION(Enchantments.UNBREAKING, 2, Enchantments.PROTECTION, 3, 25, 6),
    UNBREAKING_AND_FIRE_PROTECTION(Enchantments.UNBREAKING, 2, Enchantments.FIRE_PROTECTION, 2, 20, 6),
    UNBREAKING_AND_PROJECTILE_PROTECTION(Enchantments.UNBREAKING, 2, Enchantments.PROJECTILE_PROTECTION, 2, 20, 6),
    UNBREAKING_AND_BLAST_PROTECTION(Enchantments.UNBREAKING, 2, Enchantments.BLAST_PROTECTION, 2, 24, 6),
    UNBREAKING_AND_THORNS(Enchantments.UNBREAKING, 2, Enchantments.THORNS, 2, 25, 6);


    private final ResourceKey<Enchantment> firstEnchantment;
    private final int levelOfFirstEnchantment;
    private final ResourceKey<Enchantment> secondEnchantment;
    private final int levelOfSecondEnchantment;
    private final int emeraldsCost;
    private final int diamondCost;


    EnchantedChestplateEnum(ResourceKey<Enchantment> firstEnchantment, int levelOfFirstEnchantment, ResourceKey<Enchantment> secondEnchantment, int levelOfSecondEnchantment, int emeraldsCost, int diamondCost) {
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
