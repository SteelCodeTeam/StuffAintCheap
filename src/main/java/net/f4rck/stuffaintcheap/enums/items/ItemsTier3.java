package net.f4rck.stuffaintcheap.enums.items;

import net.f4rck.stuffaintcheap.enums.SimpleItemEnum;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.ItemCost;


public enum ItemsTier3 implements SimpleItemEnum {
    NAME_TAG(new ItemCost(Items.EMERALD, 20), new ItemStack(Items.NAME_TAG, 1),  12, 30),
    GLASS(new ItemCost(Items.EMERALD, 1), new ItemStack(Items.GLASS, 4),  16, 10),
    CLOCK(new ItemCost(Items.EMERALD, 1), new ItemStack(Items.CLOCK, 1),  12, 20),
    COMPASS(new ItemCost(Items.EMERALD, 1), new ItemStack(Items.COMPASS, 1),  12, 20);


    private final ItemCost itemCost;
    private final ItemStack itemResult;
    private final int maxUses;
    private final int xp;

    ItemsTier3(ItemCost itemCost, ItemStack itemResult, int maxUses, int xp) {
        this.itemCost = itemCost;
        this.itemResult = itemResult;
        this.maxUses = maxUses;
        this.xp = xp;
    }

    public ItemCost getItemCost() {
        return itemCost;
    }

    public ItemStack getItemResult() {
        return itemResult;
    }

    public int getMaxUses() {
        return maxUses;
    }

    public int getXp() {
        return xp;
    }
}