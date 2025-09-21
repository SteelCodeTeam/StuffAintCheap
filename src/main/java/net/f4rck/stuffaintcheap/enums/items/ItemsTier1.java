package net.f4rck.stuffaintcheap.enums.items;

import net.f4rck.stuffaintcheap.enums.SimpleItemEnum;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.common.ModConfigSpec;

import java.util.function.Supplier;

import static net.f4rck.stuffaintcheap.config.ModConfigValues.*;


public enum ItemsTier1 implements SimpleItemEnum {
    BOOK(Items.BOOK, () -> ITEMS_TIER1_BOOK_COST, Items.EMERALD, () -> ITEMS_TIER1_BOOK_RESULT, () -> ITEMS_TIER1_BOOK_USES, () -> ITEMS_TIER1_BOOK_XP),
    PAPER(Items.PAPER, () -> ITEMS_TIER1_PAPER_COST, Items.EMERALD, () -> ITEMS_TIER1_PAPER_RESULT, () -> ITEMS_TIER1_PAPER_USES, () -> ITEMS_TIER1_PAPER_XP),
    INK_SAC(Items.INK_SAC, () -> ITEMS_TIER1_INK_SAC_COST, Items.EMERALD, () -> ITEMS_TIER1_INK_SAC_RESULT, () -> ITEMS_TIER1_INK_SAC_USES, () -> ITEMS_TIER1_INK_SAC_XP),
    WRITABLE_BOOK(Items.WRITABLE_BOOK, () -> ITEMS_TIER1_WRITABLE_BOOK_COST, Items.EMERALD, () -> ITEMS_TIER1_WRITABLE_BOOK_RESULT, () -> ITEMS_TIER1_WRITABLE_BOOK_USES, () -> ITEMS_TIER1_WRITABLE_BOOK_XP),
    LANTERN(Items.EMERALD, () -> ITEMS_TIER1_LANTERN_COST, Items.LANTERN, () -> ITEMS_TIER1_LANTERN_RESULT, () -> ITEMS_TIER1_LANTERN_USES, () -> ITEMS_TIER1_LANTERN_XP),
    BOOKSHELF(Items.EMERALD, () -> ITEMS_TIER1_BOOKSHELF_COST, Items.BOOKSHELF, () -> ITEMS_TIER1_BOOKSHELF_RESULT, () -> ITEMS_TIER1_BOOKSHELF_USES, () -> ITEMS_TIER1_BOOKSHELF_XP);

    private final Item itemCost;
    private final Item itemResult;
    private final Supplier<ModConfigSpec.ConfigValue<Integer>> cost;
    private final Supplier<ModConfigSpec.ConfigValue<Integer>> result;
    private final Supplier<ModConfigSpec.ConfigValue<Integer>> maxUses;
    private final Supplier<ModConfigSpec.ConfigValue<Integer>> xp;



    ItemsTier1(Item itemCost, Supplier<ModConfigSpec.ConfigValue<Integer>> cost, Item itemResult, Supplier<ModConfigSpec.ConfigValue<Integer>> result, Supplier<ModConfigSpec.ConfigValue<Integer>> maxUses, Supplier<ModConfigSpec.ConfigValue<Integer>> xp) {
        this.itemCost = itemCost;
        this.itemResult = itemResult;
        this.cost = cost;
        this.result = result;
        this.maxUses = maxUses;
        this.xp = xp;
    }

    public Supplier<ModConfigSpec.ConfigValue<Integer>> getCost() {
        return cost;
    }

    public Supplier<ModConfigSpec.ConfigValue<Integer>> getResult() {
        return result;
    }

    public Item getItemCost() {
        return itemCost;
    }

    public Item getItemResult() {
        return itemResult;
    }

    public Supplier<ModConfigSpec.ConfigValue<Integer>> getMaxUses() {
        return maxUses;
    }

    public Supplier<ModConfigSpec.ConfigValue<Integer>> getXp() {
        return xp;
    }
}