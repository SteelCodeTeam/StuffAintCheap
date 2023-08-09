package net.f4rck.stuffaintcheap;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
public  class StuffThatAintCheap {

    public enum EnchantedBooksListTier1 {
        PROTECCION(GiveEnchantedBook(Enchantments.ALL_DAMAGE_PROTECTION, 4), 45, 3),
        FALL_PROTECCION(GiveEnchantedBook(Enchantments.FALL_PROTECTION, 4), 45, 3),
        FIRE_PROTECTION(GiveEnchantedBook(Enchantments.FIRE_PROTECTION, 4), 45, 3),
        PROYECTILE_PROTECTION(GiveEnchantedBook(Enchantments.PROJECTILE_PROTECTION, 4), 45, 3),
        SHARPNESS(GiveEnchantedBook(Enchantments.SHARPNESS, 4), 50, 3),
        SMITE(GiveEnchantedBook(Enchantments.SMITE, 4), 35, 3),
        BANE_OF_ANTHROPODS(GiveEnchantedBook(Enchantments.BANE_OF_ARTHROPODS, 4), 35, 3),
        KNOKBACK(GiveEnchantedBook(Enchantments.KNOCKBACK, 2), 25, 2),
        EFFICIENCY(GiveEnchantedBook(Enchantments.BLOCK_EFFICIENCY, 4), 35, 3),
        POWER(GiveEnchantedBook(Enchantments.POWER_ARROWS, 4), 35, 3),
        LOYALTY(GiveEnchantedBook(Enchantments.LOYALTY, 3), 30, 2),
        INPALING(GiveEnchantedBook(Enchantments.IMPALING, 4), 40, 3),
        MULTISHOT(GiveEnchantedBook(Enchantments.MULTISHOT, 1), 15, 1),
        QUICK_CHARGE(GiveEnchantedBook(Enchantments.QUICK_CHARGE, 3), 25, 2),
        PIERCING(GiveEnchantedBook(Enchantments.PIERCING, 4), 25, 3),
        VANISHING_CURSE(GiveEnchantedBook(Enchantments.VANISHING_CURSE, 1), 15, 1);


        private final ItemStack item;
        private final int emeraldsCost;

        private final int diamondCost;

        EnchantedBooksListTier1(ItemStack item, int emeraldsCost, int diamondCost) {
            this.item = item;
            this.emeraldsCost = emeraldsCost;
            this.diamondCost = diamondCost;
        }

        private static ItemStack GiveEnchantedBook(Enchantment enchantments, int level) {
            ItemStack itemStack = new ItemStack(Items.ENCHANTED_BOOK, 1);
            itemStack.enchant(enchantments, level);
            return itemStack;
        }

        public ItemStack getItem() {
            return item;
        }

        public int getEmeraldsCost() {
            return emeraldsCost;
        }

        public int getDiamondCost() {
            return diamondCost;
        }


    }

    public enum EnchantedBooksListTier2 {
        PROYECTILE_PROTECTION(GiveEnchantedBook(Enchantments.PROJECTILE_PROTECTION, 4), 45, 3),
        RESPIRATION(GiveEnchantedBook(Enchantments.RESPIRATION, 3), 30, 2),
        AQUA_AFINITY(GiveEnchantedBook(Enchantments.AQUA_AFFINITY, 1), 15, 1),
        DEPTH_STRIDER(GiveEnchantedBook(Enchantments.DEPTH_STRIDER, 3), 35, 2),
        FROST_WALKER(GiveEnchantedBook(Enchantments.FROST_WALKER, 2), 25, 2),
        FIRE_ASPECT(GiveEnchantedBook(Enchantments.FIRE_ASPECT, 2), 25, 2),
        LOOTING(GiveEnchantedBook(Enchantments.MOB_LOOTING, 3), 35, 3),
        SWEEPING_EDGE(GiveEnchantedBook(Enchantments.SWEEPING_EDGE, 3), 35, 3),
        FORTUNE(GiveEnchantedBook(Enchantments.BLOCK_FORTUNE, 3), 45, 3),
        PUNCH(GiveEnchantedBook(Enchantments.PUNCH_ARROWS, 2), 45, 1),
        FLAME(GiveEnchantedBook(Enchantments.FLAMING_ARROWS, 1), 25, 1),
        LUCK_OF_THE_SEA(GiveEnchantedBook(Enchantments.FISHING_LUCK, 3), 45, 1),
        LURE(GiveEnchantedBook(Enchantments.FISHING_SPEED, 4), 45, 3),
        RIPTIDE(GiveEnchantedBook(Enchantments.RIPTIDE, 3), 45, 3);


        private final ItemStack item;
        private final int emeraldsCost;

        private final int diamondCost;

        EnchantedBooksListTier2(ItemStack item, int emeraldsCost, int diamondCost) {
            this.item = item;
            this.emeraldsCost = emeraldsCost;
            this.diamondCost = diamondCost;
        }

        private static ItemStack GiveEnchantedBook(Enchantment enchantments, int level) {
            ItemStack itemStack = new ItemStack(Items.ENCHANTED_BOOK, 1);
            itemStack.enchant(enchantments, level);
            return itemStack;
        }

        public ItemStack getItem() {
            return item;
        }

        public int getEmeraldsCost() {
            return emeraldsCost;
        }

        public int getDiamondCost() {
            return diamondCost;
        }


    }

    public enum EnchantedBooksListTier3 {
        THORNS(GiveEnchantedBook(Enchantments.THORNS, 3), 50, 3),
        BINDING_CURSE(GiveEnchantedBook(Enchantments.BINDING_CURSE, 1), 25, 1),
        SINLK_TOUCH(GiveEnchantedBook(Enchantments.SILK_TOUCH, 1), 45, 3),
        UNBREAKING(GiveEnchantedBook(Enchantments.UNBREAKING, 3), 40, 3),
        INFINITY(GiveEnchantedBook(Enchantments.INFINITY_ARROWS, 1), 35, 1),
        CHANELING(GiveEnchantedBook(Enchantments.CHANNELING, 1), 25, 2),
        MENDING(GiveEnchantedBook(Enchantments.MENDING, 1), 60, 5);


        private final ItemStack item;
        private final int emeraldsCost;

        private final int diamondCost;

        EnchantedBooksListTier3(ItemStack item, int emeraldsCost, int diamondCost) {
            this.item = item;
            this.emeraldsCost = emeraldsCost;
            this.diamondCost = diamondCost;
        }

        private static ItemStack GiveEnchantedBook(Enchantment enchantments, int level) {
            ItemStack itemStack = new ItemStack(Items.ENCHANTED_BOOK, 1);
            itemStack.enchant(enchantments, level);
            return itemStack;
        }

        public ItemStack getItem() {
            return item;
        }

        public int getEmeraldsCost() {
            return emeraldsCost;
        }

        public int getDiamondCost() {
            return diamondCost;
        }


    }

    public enum EnchantedListBoots {
        UNBREAKING_AND_PROTECTION(GiveEnchantedItem(Enchantments.UNBREAKING, 2, Enchantments.ALL_DAMAGE_PROTECTION, 3), 25, 2),
        UNBREAKING_AND_FIRE_PROTECTION(GiveEnchantedItem(Enchantments.UNBREAKING, 2, Enchantments.FIRE_PROTECTION, 2), 20, 2),
        UNBREAKING_AND_PROYECTILE_PROTECTION(GiveEnchantedItem(Enchantments.UNBREAKING, 2, Enchantments.PROJECTILE_PROTECTION, 2), 20, 2),
        UNBREAKING_AND_DEPTH_STRIDER(GiveEnchantedItem(Enchantments.UNBREAKING, 2, Enchantments.DEPTH_STRIDER, 2), 20, 2),
        UNBREAKING_AND_FALL_PROTECTION(GiveEnchantedItem(Enchantments.UNBREAKING, 2, Enchantments.FALL_PROTECTION, 2), 25, 2);


        private final ItemStack item;
        private final int emeraldsCost;

        private final int diamondCost;

        EnchantedListBoots(ItemStack item, int emeraldsCost, int diamondCost) {
            this.item = item;
            this.emeraldsCost = emeraldsCost;
            this.diamondCost = diamondCost;
        }

        private static ItemStack GiveEnchantedItem(Enchantment enchantments, int level, Enchantment enchantments2, int level2) {
            ItemStack itemStack = new ItemStack(Items.DIAMOND_BOOTS, 1);
            itemStack.enchant(enchantments, level);
            itemStack.enchant(enchantments2, level2);
            return itemStack;
        }

        public ItemStack getItem() {
            return item;
        }

        public int getEmeraldsCost() {
            return emeraldsCost;
        }

        public int getDiamondCost() {
            return diamondCost;
        }


    }

    public enum EnchantedListLeggings {
        UNBREAKING_AND_PROTECTION(GiveEnchantedItem(Enchantments.UNBREAKING, 2, Enchantments.ALL_DAMAGE_PROTECTION, 3), 25, 5),
        UNBREAKING_AND_FIRE_PROTECTION(GiveEnchantedItem(Enchantments.UNBREAKING, 2, Enchantments.FIRE_PROTECTION, 2), 20, 5),
        UNBREAKING_AND_PROYECTILE_PROTECTION(GiveEnchantedItem(Enchantments.UNBREAKING, 2, Enchantments.PROJECTILE_PROTECTION, 2), 20, 5),
        UNBREAKING_AND_BLAST_PROTECTION(GiveEnchantedItem(Enchantments.UNBREAKING, 2, Enchantments.BLAST_PROTECTION, 2), 20, 5),
        UNBREAKING_AND_THORNS(GiveEnchantedItem(Enchantments.UNBREAKING, 2, Enchantments.THORNS, 2), 25, 5);


        private final ItemStack item;
        private final int emeraldsCost;

        private final int diamondCost;

        EnchantedListLeggings(ItemStack item, int emeraldsCost, int diamondCost) {
            this.item = item;
            this.emeraldsCost = emeraldsCost;
            this.diamondCost = diamondCost;
        }

        private static ItemStack GiveEnchantedItem(Enchantment enchantments, int level, Enchantment enchantments2, int level2) {
            ItemStack itemStack = new ItemStack(Items.DIAMOND_LEGGINGS, 1);
            itemStack.enchant(enchantments, level);
            itemStack.enchant(enchantments2, level2);
            return itemStack;
        }

        public ItemStack getItem() {
            return item;
        }

        public int getEmeraldsCost() {
            return emeraldsCost;
        }

        public int getDiamondCost() {
            return diamondCost;
        }


    }

    public enum EnchantedListHelmet {
        UNBREAKING_AND_PROTECTION(GiveEnchantedItem(Enchantments.UNBREAKING, 2, Enchantments.ALL_DAMAGE_PROTECTION, 3), 25, 3),
        UNBREAKING_AND_FIRE_PROTECTION(GiveEnchantedItem(Enchantments.UNBREAKING, 2, Enchantments.FIRE_PROTECTION, 2), 20, 3),
        UNBREAKING_AND_PROYECTILE_PROTECTION(GiveEnchantedItem(Enchantments.UNBREAKING, 2, Enchantments.PROJECTILE_PROTECTION, 2), 20, 3),
        UNBREAKING_AND_RESPIRATION(GiveEnchantedItem(Enchantments.UNBREAKING, 2, Enchantments.RESPIRATION, 2), 20, 3),
        UNBREAKING_AND_AQUA_AFINITY(GiveEnchantedItem(Enchantments.UNBREAKING, 2, Enchantments.AQUA_AFFINITY, 1), 25, 3);


        private final ItemStack item;
        private final int emeraldsCost;

        private final int diamondCost;

        EnchantedListHelmet(ItemStack item, int emeraldsCost, int diamondCost) {
            this.item = item;
            this.emeraldsCost = emeraldsCost;
            this.diamondCost = diamondCost;
        }

        private static ItemStack GiveEnchantedItem(Enchantment enchantments, int level, Enchantment enchantments2, int level2) {
            ItemStack itemStack = new ItemStack(Items.DIAMOND_HELMET, 1);
            itemStack.enchant(enchantments, level);
            itemStack.enchant(enchantments2, level2);
            return itemStack;
        }

        public ItemStack getItem() {
            return item;
        }

        public int getEmeraldsCost() {
            return emeraldsCost;
        }

        public int getDiamondCost() {
            return diamondCost;
        }


    }

    public enum EnchantedListChestplate {
        UNBREAKING_AND_PROTECTION(GiveEnchantedItem(Enchantments.UNBREAKING, 2, Enchantments.ALL_DAMAGE_PROTECTION, 3), 25, 6),
        UNBREAKING_AND_FIRE_PROTECTION(GiveEnchantedItem(Enchantments.UNBREAKING, 2, Enchantments.FIRE_PROTECTION, 2), 20, 6),
        UNBREAKING_AND_PROYECTILE_PROTECTION(GiveEnchantedItem(Enchantments.UNBREAKING, 2, Enchantments.PROJECTILE_PROTECTION, 2), 20, 6),
        UNBREAKING_AND_BLAST_PROTECTION(GiveEnchantedItem(Enchantments.UNBREAKING, 2, Enchantments.BLAST_PROTECTION, 2), 20, 6),
        UNBREAKING_AND_THORNS(GiveEnchantedItem(Enchantments.UNBREAKING, 2, Enchantments.THORNS, 2), 25, 6);


        private final ItemStack item;
        private final int emeraldsCost;

        private final int diamondCost;

        EnchantedListChestplate(ItemStack item, int emeraldsCost, int diamondCost) {
            this.item = item;
            this.emeraldsCost = emeraldsCost;
            this.diamondCost = diamondCost;
        }

        private static ItemStack GiveEnchantedItem(Enchantment enchantments, int level, Enchantment enchantments2, int level2) {
            ItemStack itemStack = new ItemStack(Items.DIAMOND_CHESTPLATE, 1);
            itemStack.enchant(enchantments, level);
            itemStack.enchant(enchantments2, level2);
            return itemStack;
        }

        public ItemStack getItem() {
            return item;
        }

        public int getEmeraldsCost() {
            return emeraldsCost;
        }

        public int getDiamondCost() {
            return diamondCost;
        }
    }
        public enum EnchantedListPickaxe {
            UNBREAKING_AND_EFFICIENCY(GiveEnchantedItem(Enchantments.UNBREAKING, 2, Enchantments.BLOCK_EFFICIENCY, 3), 20, 2),
            UNBREAKING_AND_FORTUNE(GiveEnchantedItem(Enchantments.UNBREAKING, 2, Enchantments.BLOCK_FORTUNE, 2), 24, 2),
            FORTUNE_AND_EFFICIENCY(GiveEnchantedItem(Enchantments.BLOCK_FORTUNE, 2, Enchantments.BLOCK_EFFICIENCY, 3), 26, 2);



            private final ItemStack item;
            private final int emeraldsCost;

            private final int diamondCost;

            EnchantedListPickaxe(ItemStack item, int emeraldsCost, int diamondCost) {
                this.item = item;
                this.emeraldsCost = emeraldsCost;
                this.diamondCost = diamondCost;
            }

            private static ItemStack GiveEnchantedItem(Enchantment enchantments, int level, Enchantment enchantments2, int level2) {
                ItemStack itemStack = new ItemStack(Items.DIAMOND_PICKAXE, 1);
                itemStack.enchant(enchantments, level);
                itemStack.enchant(enchantments2, level2);
                return itemStack;
            }

            public ItemStack getItem() {
                return item;
            }

            public int getEmeraldsCost() {
                return emeraldsCost;
            }

            public int getDiamondCost() {
                return diamondCost;
            }
            }
        public enum EnchantedListShovel {
            UNBREAKING_AND_EFFICIENCY(GiveEnchantedItem(Enchantments.UNBREAKING, 2, Enchantments.BLOCK_EFFICIENCY, 3), 20, 1),
            UNBREAKING_AND_FORTUNE(GiveEnchantedItem(Enchantments.UNBREAKING, 2, Enchantments.BLOCK_FORTUNE, 2), 24, 1),
            FORTUNE_AND_EFFICIENCY(GiveEnchantedItem(Enchantments.BLOCK_FORTUNE, 2, Enchantments.BLOCK_EFFICIENCY, 3), 26, 1);


            private final ItemStack item;
            private final int emeraldsCost;

            private final int diamondCost;

            EnchantedListShovel(ItemStack item, int emeraldsCost, int diamondCost) {
                this.item = item;
                this.emeraldsCost = emeraldsCost;
                this.diamondCost = diamondCost;
            }

            private static ItemStack GiveEnchantedItem(Enchantment enchantments, int level, Enchantment enchantments2, int level2) {
                ItemStack itemStack = new ItemStack(Items.DIAMOND_SHOVEL, 1);
                itemStack.enchant(enchantments, level);
                itemStack.enchant(enchantments2, level2);
                return itemStack;
            }

            public ItemStack getItem() {
                return item;
            }

            public int getEmeraldsCost() {
                return emeraldsCost;
            }

            public int getDiamondCost() {
                return diamondCost;
            }
        }
        public enum EnchantedListAxe {
            UNBREAKING_AND_EFFICIENCY(GiveEnchantedItem(Enchantments.UNBREAKING, 2, Enchantments.BLOCK_EFFICIENCY, 3), 20, 2),
            UNBREAKING_AND_FORTUNE(GiveEnchantedItem(Enchantments.UNBREAKING, 2, Enchantments.BLOCK_FORTUNE, 2), 24, 2),
            FORTUNE_AND_EFFICIENCY(GiveEnchantedItem(Enchantments.BLOCK_FORTUNE, 2, Enchantments.BLOCK_EFFICIENCY, 3), 26, 2);



            private final ItemStack item;
            private final int emeraldsCost;

            private final int diamondCost;

            EnchantedListAxe(ItemStack item, int emeraldsCost, int diamondCost) {
                this.item = item;
                this.emeraldsCost = emeraldsCost;
                this.diamondCost = diamondCost;
            }

            private static ItemStack GiveEnchantedItem(Enchantment enchantments, int level, Enchantment enchantments2, int level2) {
                ItemStack itemStack = new ItemStack(Items.DIAMOND_AXE, 1);
                itemStack.enchant(enchantments, level);
                itemStack.enchant(enchantments2, level2);
                return itemStack;
            }

            public ItemStack getItem() {
                return item;
            }

            public int getEmeraldsCost() {
                return emeraldsCost;
            }

            public int getDiamondCost() {
                return diamondCost;
            }
        }
        public enum EnchantedListCaxe {
            UNBREAKING_AND_SHARPNESS(GiveEnchantedItem(Enchantments.UNBREAKING, 2, Enchantments.SHARPNESS, 3), 27, 2),
            UNBREAKING_AND_LOOTING(GiveEnchantedItem(Enchantments.UNBREAKING, 2, Enchantments.MOB_LOOTING, 2), 21, 2),
            LOOTING_AND_SHARPNESS(GiveEnchantedItem(Enchantments.MOB_LOOTING, 2, Enchantments.SHARPNESS, 3), 28, 2),
            LOOTING_AND_SMITE(GiveEnchantedItem(Enchantments.MOB_LOOTING, 2, Enchantments.SMITE, 3), 25, 2),
            LOOTING_AND_BANE_OF_ANTHROPODS(GiveEnchantedItem(Enchantments.MOB_LOOTING, 2, Enchantments.BANE_OF_ARTHROPODS, 3), 23, 2),
            UNBREAKING_AND_SMITE(GiveEnchantedItem(Enchantments.UNBREAKING, 2, Enchantments.SMITE, 3), 24, 2),
            UNBREAKING_AND_BANE_OF_ANTHROPODS(GiveEnchantedItem(Enchantments.UNBREAKING, 2, Enchantments.BANE_OF_ARTHROPODS, 3), 22, 2);



            private final ItemStack item;
            private final int emeraldsCost;

            private final int diamondCost;

            EnchantedListCaxe(ItemStack item, int emeraldsCost, int diamondCost) {
                this.item = item;
                this.emeraldsCost = emeraldsCost;
                this.diamondCost = diamondCost;
            }

            private static ItemStack GiveEnchantedItem(Enchantment enchantments, int level, Enchantment enchantments2, int level2) {
                ItemStack itemStack = new ItemStack(Items.DIAMOND_AXE, 1);
                itemStack.enchant(enchantments, level);
                itemStack.enchant(enchantments2, level2);
                return itemStack;
            }

            public ItemStack getItem() {
                return item;
            }

            public int getEmeraldsCost() {
                return emeraldsCost;
            }

            public int getDiamondCost() {
                return diamondCost;
            }
        }
        public enum EnchantedListSword {
            UNBREAKING_AND_SHARPNESS(GiveEnchantedItem(Enchantments.UNBREAKING, 2, Enchantments.SHARPNESS, 3), 27, 1),
            UNBREAKING_AND_LOOTING(GiveEnchantedItem(Enchantments.UNBREAKING, 2, Enchantments.MOB_LOOTING, 2), 21, 1),
            LOOTING_AND_SHARPNESS(GiveEnchantedItem(Enchantments.MOB_LOOTING, 2, Enchantments.SHARPNESS, 3), 28, 1),
            LOOTING_AND_SMITE(GiveEnchantedItem(Enchantments.MOB_LOOTING, 2, Enchantments.SMITE, 3), 25, 1),
            LOOTING_AND_BANE_OF_ANTHROPODS(GiveEnchantedItem(Enchantments.MOB_LOOTING, 2, Enchantments.BANE_OF_ARTHROPODS, 3), 23, 1),
            UNBREAKING_AND_SMITE(GiveEnchantedItem(Enchantments.UNBREAKING, 2, Enchantments.SMITE, 3), 24, 2),
            UNBREAKING_AND_BANE_OF_ANTHROPODS(GiveEnchantedItem(Enchantments.UNBREAKING, 2, Enchantments.BANE_OF_ARTHROPODS, 3), 22, 1);



            private final ItemStack item;
            private final int emeraldsCost;

            private final int diamondCost;

            EnchantedListSword(ItemStack item, int emeraldsCost, int diamondCost) {
                this.item = item;
                this.emeraldsCost = emeraldsCost;
                this.diamondCost = diamondCost;
            }

            private static ItemStack GiveEnchantedItem(Enchantment enchantments, int level, Enchantment enchantments2, int level2) {
                ItemStack itemStack = new ItemStack(Items.DIAMOND_SWORD, 1);
                itemStack.enchant(enchantments, level);
                itemStack.enchant(enchantments2, level2);
                return itemStack;
            }

            public ItemStack getItem() {
                return item;
            }

            public int getEmeraldsCost() {
                return emeraldsCost;
            }

            public int getDiamondCost() {
                return diamondCost;
            }
        }
    }
