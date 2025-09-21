package net.f4rck.stuffaintcheap.enums;

import net.minecraft.world.item.Item;
import net.neoforged.neoforge.common.ModConfigSpec;

import java.util.function.Supplier;

public interface SimpleItemEnum {
    Supplier<ModConfigSpec.ConfigValue<Integer>> getCost();
    Supplier<ModConfigSpec.ConfigValue<Integer>> getResult();
    Item getItemCost();
    Item getItemResult();
    Supplier<ModConfigSpec.ConfigValue<Integer>> getMaxUses();
    Supplier<ModConfigSpec.ConfigValue<Integer>> getXp();
}
