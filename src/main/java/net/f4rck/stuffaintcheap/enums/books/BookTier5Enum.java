package net.f4rck.stuffaintcheap.enums.books;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.EnchantedBookItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentInstance;
import net.minecraft.world.item.enchantment.Enchantments;

public enum BookTier5Enum {
    THORNS(Enchantments.THORNS, 3, 50, 2),
    BINDING_CURSE(Enchantments.BINDING_CURSE, 1, 25, 1),
    SILK_TOUCH(Enchantments.SILK_TOUCH, 1, 45, 3),
    UNBREAKING(Enchantments.UNBREAKING, 3, 40, 3),
    INFINITY(Enchantments.INFINITY, 1, 35, 1),
    CHANNELING(Enchantments.CHANNELING, 1, 25, 2),
    MENDING(Enchantments.MENDING, 1, 60, 5);


    private final ResourceKey<Enchantment> enchantment;
    private final int level;
    private final int emeraldsCost;
    private final int diamondCost;

    BookTier5Enum(ResourceKey<Enchantment> enchantment, int level, int emeraldsCost, int diamondCost) {
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


    public int getEmeraldsCost() {
        return emeraldsCost;
    }

    public int getDiamondCost() {
        return diamondCost;
    }

}