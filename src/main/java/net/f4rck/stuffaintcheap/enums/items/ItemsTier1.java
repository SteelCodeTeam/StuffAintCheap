package net.f4rck.stuffaintcheap.enums.items;

import net.f4rck.stuffaintcheap.enums.SimpleItemEnum;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.ItemCost;


public enum ItemsTier1 implements SimpleItemEnum {
    BOOK(new ItemCost(Items.BOOK, 1), new ItemStack(Items.EMERALD, 1),  12,5),
    PAPER(new ItemCost(Items.PAPER, 24), new ItemStack(Items.EMERALD, 1),  16,5),
    INK_SAC(new ItemCost(Items.INK_SAC, 5), new ItemStack(Items.EMERALD, 1),  12,5),
    WRITABLE_BOOK(new ItemCost(Items.WRITABLE_BOOK, 1), new ItemStack(Items.EMERALD, 1),  12,5),
    LANTERN(new ItemCost(Items.EMERALD, 1), new ItemStack(Items.LANTERN, 1),  12,5),
    BOOKSHELF(new ItemCost(Items.EMERALD, 9), new ItemStack(Items.BOOKSHELF, 1),  12,5);

    private final ItemCost itemCost;
    private final ItemStack itemResult;
    private final int maxUses;
    private final int xp;



    ItemsTier1(ItemCost itemCost, ItemStack itemResult, int maxUses, int xp) {
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