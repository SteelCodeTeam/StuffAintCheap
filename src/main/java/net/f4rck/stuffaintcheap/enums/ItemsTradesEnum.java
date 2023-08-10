package net.f4rck.stuffaintcheap.enums;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class ItemsTradesEnum {
    public enum ItemsTier1 {
        BOOK(new ItemStack(Items.BOOK, 1), new ItemStack(Items.EMERALD, 1),  12,5),
        PAPER(new ItemStack(Items.PAPER, 24), new ItemStack(Items.EMERALD, 1),  16,5),
        INK_SAC(new ItemStack(Items.INK_SAC, 5), new ItemStack(Items.EMERALD, 1),  12,5),
        WRITABLE_BOOK(new ItemStack(Items.WRITABLE_BOOK, 1), new ItemStack(Items.EMERALD, 1),  12,5),
        LANTERN(new ItemStack(Items.EMERALD, 1), new ItemStack(Items.LANTERN, 1),  12,5),
        BOOKSHELF(new ItemStack(Items.EMERALD, 9), new ItemStack(Items.BOOKSHELF, 1),  12,5);

        private final ItemStack itemCost;
        private final ItemStack itemResult;
        private final int maxUses;
        private final int xp;



        ItemsTier1(ItemStack itemCost, ItemStack itemResult, int maxUses, int xp) {
            this.itemCost = itemCost;
            this.itemResult = itemResult;
            this.maxUses = maxUses;
            this.xp = xp;
        }

        public ItemStack getItemCost() {
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


    public enum ItemsTier3 {
        NAME_TAG( new ItemStack(Items.EMERALD, 20), new ItemStack(Items.NAME_TAG, 1),  12, 30),
        GLASS( new ItemStack(Items.EMERALD, 1), new ItemStack(Items.GLASS, 4),  16, 10),
        CLOCK( new ItemStack(Items.EMERALD, 1), new ItemStack(Items.CLOCK, 1),  12, 20),
        COMPASS( new ItemStack(Items.EMERALD, 1), new ItemStack(Items.COMPASS, 1),  12, 20);


        private final ItemStack itemCost;
        private final ItemStack itemResult;
        private final int maxUses;
        private final int xp;

        ItemsTier3(ItemStack itemCost, ItemStack itemResult, int maxUses, int xp) {
            this.itemCost = itemCost;
            this.itemResult = itemResult;
            this.maxUses = maxUses;
            this.xp = xp;
        }

        public ItemStack getItemCost() {
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
}
