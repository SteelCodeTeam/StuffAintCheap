package net.f4rck.stuffaintcheap.enums.items;

import net.f4rck.stuffaintcheap.enums.SimpleItemEnum;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.common.ModConfigSpec;

import java.util.function.Supplier;

import static net.f4rck.stuffaintcheap.config.ModConfigValues.*;


public enum ItemsTier3 implements SimpleItemEnum {
    NAME_TAG(Items.EMERALD, () -> ITEMS_TIER3_NAME_TAG_COST, Items.NAME_TAG, () -> ITEMS_TIER3_NAME_TAG_RESULT, () -> ITEMS_TIER3_NAME_TAG_USES, () -> ITEMS_TIER3_NAME_TAG_XP),
    GLASS(Items.EMERALD, () -> ITEMS_TIER3_GLASS_COST, Items.GLASS, () -> ITEMS_TIER3_GLASS_RESULT, () -> ITEMS_TIER3_GLASS_USES, () -> ITEMS_TIER3_GLASS_XP),
    CLOCK(Items.EMERALD, () -> ITEMS_TIER3_CLOCK_COST, Items.CLOCK, () -> ITEMS_TIER3_CLOCK_RESULT, () -> ITEMS_TIER3_CLOCK_USES, () -> ITEMS_TIER3_CLOCK_XP),
    COMPASS(Items.EMERALD, () -> ITEMS_TIER3_COMPASS_COST, Items.COMPASS, () -> ITEMS_TIER3_COMPASS_RESULT, () -> ITEMS_TIER3_COMPASS_USES, () -> ITEMS_TIER3_COMPASS_XP);


    private final Item itemCost;
    private final Item itemResult;
    private final Supplier<ModConfigSpec.ConfigValue<Integer>> cost;
    private final Supplier<ModConfigSpec.ConfigValue<Integer>> result;
    private final Supplier<ModConfigSpec.ConfigValue<Integer>> maxUses;
    private final Supplier<ModConfigSpec.ConfigValue<Integer>> xp;



    ItemsTier3(Item itemCost, Supplier<ModConfigSpec.ConfigValue<Integer>> cost, Item itemResult, Supplier<ModConfigSpec.ConfigValue<Integer>> result, Supplier<ModConfigSpec.ConfigValue<Integer>> maxUses, Supplier<ModConfigSpec.ConfigValue<Integer>> xp) {
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