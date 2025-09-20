package net.f4rck.stuffaintcheap.event.registry;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;

import java.util.Optional;

public class GetRegistryEnchantmentUtil {

    public static ItemStack makeItemStack(Item item, HolderLookup.Provider registryAccess, ResourceKey<Enchantment> enchKey1, ResourceKey<Enchantment> enchKey2, int levelOfFirstEnch, int levelOfSecondEnch) {
        HolderLookup.RegistryLookup<Enchantment> enchRegistry = registryAccess.lookupOrThrow(Registries.ENCHANTMENT);
        Optional<? extends Holder<Enchantment>> get1 = enchRegistry.get(enchKey1);
        Optional<? extends Holder<Enchantment>> get2 = Optional.empty();
        if (enchKey2 != null) {
            get2 = enchRegistry.get(enchKey2);
        }
        ItemStack itemStack = new ItemStack(item, 1);
        get1.ifPresent(holder -> itemStack.enchant(holder, levelOfFirstEnch));
        get2.ifPresent(holder -> itemStack.enchant(holder, levelOfSecondEnch));
        return itemStack;
    }
}
