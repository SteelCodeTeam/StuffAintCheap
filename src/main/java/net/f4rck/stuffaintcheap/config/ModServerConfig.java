package net.f4rck.stuffaintcheap.config;

import net.neoforged.fml.ModContainer;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.neoforge.common.ModConfigSpec;

public class ModServerConfig {

    public static ModConfigSpec.Builder SERVER_CONFIG;

    public static void register(ModContainer container) {
        SERVER_CONFIG = new ModConfigSpec.Builder();
        createConfig();
        container.registerConfig(ModConfig.Type.SERVER, SERVER_CONFIG.build());
    }

    private static void createConfig() {
        // Boots
        ModConfigValues.BOOTS_UNBREAKING_AND_PROTECTION_DIAMONDS = SERVER_CONFIG
                .defineInRange("boots-unbreaking-protection.diamond-cost", 2, 1, 64);
        ModConfigValues.BOOTS_UNBREAKING_AND_PROTECTION_EMERALDS = SERVER_CONFIG
                .defineInRange("boots-unbreaking-protection.emerald-cost", 17, 1, 64);
        ModConfigValues.BOOTS_UNBREAKING_AND_FIRE_PROTECTION_DIAMONDS = SERVER_CONFIG
                .defineInRange("boots-unbreaking-fire_protection.diamond-cost", 2, 1, 64);
        ModConfigValues.BOOTS_UNBREAKING_AND_FIRE_PROTECTION_EMERALDS = SERVER_CONFIG
                .defineInRange("boots-unbreaking-fire_protection.emerald-cost", 17, 1, 64);
        ModConfigValues.BOOTS_UNBREAKING_AND_PROYECTILE_PROTECTION_DIAMONDS = SERVER_CONFIG
                .defineInRange("boots-unbreaking-projectile_protection.diamond-cost", 2, 1, 64);
        ModConfigValues.BOOTS_UNBREAKING_AND_PROYECTILE_PROTECTION_EMERALDS = SERVER_CONFIG
                .defineInRange("boots-unbreaking-projectile_protection.emerald-cost", 15, 1, 64);
        ModConfigValues.BOOTS_UNBREAKING_AND_DEPTH_STRIDER_DIAMONDS = SERVER_CONFIG
                .defineInRange("boots-unbreaking-depth_strider.diamond-cost", 2, 1, 64);
        ModConfigValues.BOOTS_UNBREAKING_AND_DEPTH_STRIDER_EMERALDS = SERVER_CONFIG
                .defineInRange("boots-unbreaking-depth_strider.emerald-cost", 14, 1, 64);
        ModConfigValues.BOOTS_UNBREAKING_AND_FALL_PROTECTION_DIAMONDS = SERVER_CONFIG
                .defineInRange("boots-unbreaking-fall_protection.diamond-cost", 2, 1, 64);
        ModConfigValues.BOOTS_UNBREAKING_AND_FALL_PROTECTION_EMERALDS = SERVER_CONFIG
                .defineInRange("boots-unbreaking-fall_protection.emerald-cost", 15, 1, 64);


        // Chestplate
        ModConfigValues.CHESTPLATE_UNBREAKING_AND_PROTECTION_DIAMONDS = SERVER_CONFIG
                .defineInRange("chestplate-unbreaking-protection.diamond-cost", 6, 1, 64);
        ModConfigValues.CHESTPLATE_UNBREAKING_AND_PROTECTION_EMERALDS = SERVER_CONFIG
                .defineInRange("chestplate-unbreaking-protection.emerald-cost", 25, 1, 64);
        ModConfigValues.CHESTPLATE_UNBREAKING_AND_FIRE_PROTECTION_DIAMONDS = SERVER_CONFIG
                .defineInRange("chestplate-unbreaking-fire_protection.diamond-cost", 6, 1, 64);
        ModConfigValues.CHESTPLATE_UNBREAKING_AND_FIRE_PROTECTION_EMERALDS = SERVER_CONFIG
                .defineInRange("chestplate-unbreaking-fire_protection.emerald-cost", 20, 1, 64);
        ModConfigValues.CHESTPLATE_UNBREAKING_AND_PROJECTILE_PROTECTION_DIAMONDS = SERVER_CONFIG
                .defineInRange("chestplate-unbreaking-projectile_protection.diamond-cost", 6, 1, 64);
        ModConfigValues.CHESTPLATE_UNBREAKING_AND_PROJECTILE_PROTECTION_EMERALDS = SERVER_CONFIG
                .defineInRange("chestplate-unbreaking-projectile_protection.emerald-cost", 20, 1, 64);
        ModConfigValues.CHESTPLATE_UNBREAKING_AND_BLAST_PROTECTION_DIAMONDS = SERVER_CONFIG
                .defineInRange("chestplate-unbreaking-blast_protection.diamond-cost", 6, 1, 64);
        ModConfigValues.CHESTPLATE_UNBREAKING_AND_BLAST_PROTECTION_EMERALDS = SERVER_CONFIG
                .defineInRange("chestplate-unbreaking-blast_protection.emerald-cost", 24, 1, 64);
        ModConfigValues.CHESTPLATE_UNBREAKING_AND_THORNS_DIAMONDS = SERVER_CONFIG
                .defineInRange("chestplate-unbreaking-thorns.diamond-cost", 6, 1, 64);
        ModConfigValues.CHESTPLATE_UNBREAKING_AND_THORNS_EMERALDS = SERVER_CONFIG
                .defineInRange("chestplate-unbreaking-thorns.emerald-cost", 25, 1, 64);


        // Leggings
        ModConfigValues.LEGGINGS_UNBREAKING_AND_PROTECTION_DIAMONDS = SERVER_CONFIG
                .defineInRange("leggings-unbreaking-protection.diamond-cost", 5, 1, 64);
        ModConfigValues.LEGGINGS_UNBREAKING_AND_PROTECTION_EMERALDS = SERVER_CONFIG
                .defineInRange("leggings-unbreaking-protection.emerald-cost", 21, 1, 64);
        ModConfigValues.LEGGINGS_UNBREAKING_AND_FIRE_PROTECTION_DIAMONDS = SERVER_CONFIG
                .defineInRange("leggings-unbreaking-fire_protection.diamond-cost", 5, 1, 64);
        ModConfigValues.LEGGINGS_UNBREAKING_AND_FIRE_PROTECTION_EMERALDS = SERVER_CONFIG
                .defineInRange("leggings-unbreaking-fire_protection.emerald-cost", 21, 1, 64);
        ModConfigValues.LEGGINGS_UNBREAKING_AND_PROYECTILE_PROTECTION_DIAMONDS = SERVER_CONFIG
                .defineInRange("leggings-unbreaking-projectile_protection.diamond-cost", 5, 1, 64);
        ModConfigValues.LEGGINGS_UNBREAKING_AND_PROYECTILE_PROTECTION_EMERALDS = SERVER_CONFIG
                .defineInRange("leggings-unbreaking-projectile_protection.emerald-cost", 18, 1, 64);
        ModConfigValues.LEGGINGS_UNBREAKING_AND_BLAST_PROTECTION_DIAMONDS = SERVER_CONFIG
                .defineInRange("leggings-unbreaking-blast_protection.diamond-cost", 5, 1, 64);
        ModConfigValues.LEGGINGS_UNBREAKING_AND_BLAST_PROTECTION_EMERALDS = SERVER_CONFIG
                .defineInRange("leggings-unbreaking-blast_protection.emerald-cost", 19, 1, 64);
        ModConfigValues.LEGGINGS_UNBREAKING_AND_THORNS_DIAMONDS = SERVER_CONFIG
                .defineInRange("leggings-unbreaking-thorns.diamond-cost", 5, 1, 64);
        ModConfigValues.LEGGINGS_UNBREAKING_AND_THORNS_EMERALDS = SERVER_CONFIG
                .defineInRange("leggings-unbreaking-thorns.emerald-cost", 22, 1, 64);


        // Helmet
        ModConfigValues.HELMET_UNBREAKING_AND_PROTECTION_DIAMONDS = SERVER_CONFIG
                .defineInRange("helmet-unbreaking-protection.diamond-cost", 3, 1, 64);
        ModConfigValues.HELMET_UNBREAKING_AND_PROTECTION_EMERALDS = SERVER_CONFIG
                .defineInRange("helmet-unbreaking-protection.emerald-cost", 18, 1, 64);
        ModConfigValues.HELMET_UNBREAKING_AND_FIRE_PROTECTION_DIAMONDS = SERVER_CONFIG
                .defineInRange("helmet-unbreaking-fire_protection.diamond-cost", 3, 1, 64);
        ModConfigValues.HELMET_UNBREAKING_AND_FIRE_PROTECTION_EMERALDS = SERVER_CONFIG
                .defineInRange("helmet-unbreaking-fire_protection.emerald-cost", 18, 1, 64);
        ModConfigValues.HELMET_UNBREAKING_AND_PROJECTILE_PROTECTION_DIAMONDS = SERVER_CONFIG
                .defineInRange("helmet-unbreaking-projectile_protection.diamond-cost", 3, 1, 64);
        ModConfigValues.HELMET_UNBREAKING_AND_PROJECTILE_PROTECTION_EMERALDS = SERVER_CONFIG
                .defineInRange("helmet-unbreaking-projectile_protection.emerald-cost", 16, 1, 64);
        ModConfigValues.HELMET_UNBREAKING_AND_RESPIRATION_DIAMONDS = SERVER_CONFIG
                .defineInRange("helmet-unbreaking-respiration.diamond-cost", 3, 1, 64);
        ModConfigValues.HELMET_UNBREAKING_AND_RESPIRATION_EMERALDS = SERVER_CONFIG
                .defineInRange("helmet-unbreaking-respiration.emerald-cost", 15, 1, 64);
        ModConfigValues.HELMET_UNBREAKING_AND_AQUA_AFFINITY_DIAMONDS = SERVER_CONFIG
                .defineInRange("helmet-unbreaking-aqua_affinity.diamond-cost", 3, 1, 64);
        ModConfigValues.HELMET_UNBREAKING_AND_AQUA_AFFINITY_EMERALDS = SERVER_CONFIG
                .defineInRange("helmet-unbreaking-aqua_affinity.emerald-cost", 13, 1, 64);




        // Axe Attack
        ModConfigValues.AXE_ATTACK_UNBREAKING_AND_SHARPNESS_DIAMONDS = SERVER_CONFIG
                .defineInRange("axe-unbreaking-sharpness.diamond-cost", 2, 1, 64);
        ModConfigValues.AXE_ATTACK_UNBREAKING_AND_SHARPNESS_EMERALDS = SERVER_CONFIG
                .defineInRange("axe-unbreaking-sharpness.emerald-cost", 27, 1, 64);
        ModConfigValues.AXE_ATTACK_UNBREAKING_AND_LOOTING_DIAMONDS = SERVER_CONFIG
                .defineInRange("axe-unbreaking-looting.diamond-cost", 2, 1, 64);
        ModConfigValues.AXE_ATTACK_UNBREAKING_AND_LOOTING_EMERALDS = SERVER_CONFIG
                .defineInRange("axe-unbreaking-looting.emerald-cost", 21, 1, 64);
        ModConfigValues.AXE_ATTACK_LOOTING_AND_SHARPNESS_DIAMONDS = SERVER_CONFIG
                .defineInRange("axe-looting-sharpness.diamond-cost", 2, 1, 64);
        ModConfigValues.AXE_ATTACK_LOOTING_AND_SHARPNESS_EMERALDS = SERVER_CONFIG
                .defineInRange("axe-looting-sharpness.emerald-cost", 28, 1, 64);
        ModConfigValues.AXE_ATTACK_LOOTING_AND_SMITE_DIAMONDS = SERVER_CONFIG
                .defineInRange("axe-looting-smite.diamond-cost", 2, 1, 64);
        ModConfigValues.AXE_ATTACK_LOOTING_AND_SMITE_EMERALDS = SERVER_CONFIG
                .defineInRange("axe-looting-smite.emerald-cost", 25, 1, 64);
        ModConfigValues.AXE_ATTACK_LOOTING_AND_BANE_OF_ARTHROPODS_DIAMONDS = SERVER_CONFIG
                .defineInRange("axe-looting-bane_of_arthropods.diamond-cost", 2, 1, 64);
        ModConfigValues.AXE_ATTACK_LOOTING_AND_BANE_OF_ARTHROPODS_EMERALDS = SERVER_CONFIG
                .defineInRange("axe-looting-bane_of_arthropods.emerald-cost", 23, 1, 64);
        ModConfigValues.AXE_ATTACK_UNBREAKING_AND_SMITE_DIAMONDS = SERVER_CONFIG
                .defineInRange("axe-unbreaking-smite.diamond-cost", 2, 1, 64);
        ModConfigValues.AXE_ATTACK_UNBREAKING_AND_SMITE_EMERALDS = SERVER_CONFIG
                .defineInRange("axe-unbreaking-smite.emerald-cost", 24, 1, 64);
        ModConfigValues.AXE_ATTACK_UNBREAKING_AND_BANE_OF_ARTHROPODS_DIAMONDS = SERVER_CONFIG
                .defineInRange("axe-unbreaking-bane_of_arthropods.diamond-cost", 2, 1, 64);
        ModConfigValues.AXE_ATTACK_UNBREAKING_AND_BANE_OF_ARTHROPODS_EMERALDS = SERVER_CONFIG
                .defineInRange("axe-unbreaking-bane_of_arthropods.emerald-cost", 22, 1, 64);
        ModConfigValues.AXE_UNBREAKING_AND_EFFICIENCY_DIAMONDS = SERVER_CONFIG
                .defineInRange("axe-unbreaking-efficiency.diamond-cost", 2, 1, 64);
        ModConfigValues.AXE_UNBREAKING_AND_EFFICIENCY_EMERALDS = SERVER_CONFIG
                .defineInRange("axe-unbreaking-efficiency.emerald-cost", 19, 1, 64);
        ModConfigValues.AXE_UNBREAKING_AND_FORTUNE_DIAMONDS = SERVER_CONFIG
                .defineInRange("axe-unbreaking-fortune.diamond-cost", 2, 1, 64);
        ModConfigValues.AXE_UNBREAKING_AND_FORTUNE_EMERALDS = SERVER_CONFIG
                .defineInRange("axe-unbreaking-fortune.emerald-cost", 21, 1, 64);
        ModConfigValues.AXE_FORTUNE_AND_EFFICIENCY_DIAMONDS = SERVER_CONFIG
                .defineInRange("axe-fortune-efficiency.diamond-cost", 2, 1, 64);
        ModConfigValues.AXE_FORTUNE_AND_EFFICIENCY_EMERALDS = SERVER_CONFIG
                .defineInRange("axe-fortune-efficiency.emerald-cost", 24, 1, 64);

        ModConfigValues.SWORD_UNBREAKING_AND_SHARPNESS_DIAMONDS = SERVER_CONFIG
                .defineInRange("sword-unbreaking-sharpness.diamond-cost", 1, 1, 64);
        ModConfigValues.SWORD_UNBREAKING_AND_SHARPNESS_EMERALDS = SERVER_CONFIG
                .defineInRange("sword-unbreaking-sharpness.emerald-cost", 27, 1, 64);
        ModConfigValues.SWORD_UNBREAKING_AND_LOOTING_DIAMONDS = SERVER_CONFIG
                .defineInRange("sword-unbreaking-looting.diamond-cost", 1, 1, 64);
        ModConfigValues.SWORD_UNBREAKING_AND_LOOTING_EMERALDS = SERVER_CONFIG
                .defineInRange("sword-unbreaking-looting.emerald-cost", 21, 1, 64);
        ModConfigValues.SWORD_LOOTING_AND_SHARPNESS_DIAMONDS = SERVER_CONFIG
                .defineInRange("sword-looting-sharpness.diamond-cost", 1, 1, 64);
        ModConfigValues.SWORD_LOOTING_AND_SHARPNESS_EMERALDS = SERVER_CONFIG
                .defineInRange("sword-looting-sharpness.emerald-cost", 28, 1, 64);
        ModConfigValues.SWORD_LOOTING_AND_SMITE_DIAMONDS = SERVER_CONFIG
                .defineInRange("sword-looting-smite.diamond-cost", 1, 1, 64);
        ModConfigValues.SWORD_LOOTING_AND_SMITE_EMERALDS = SERVER_CONFIG
                .defineInRange("sword-looting-smite.emerald-cost", 25, 1, 64);
        ModConfigValues.SWORD_LOOTING_AND_BANE_OF_ANTHROPODS_DIAMONDS = SERVER_CONFIG
                .defineInRange("sword-looting-bane_of_anthropods.diamond-cost", 1, 1, 64);
        ModConfigValues.SWORD_LOOTING_AND_BANE_OF_ANTHROPODS_EMERALDS = SERVER_CONFIG
                .defineInRange("sword-looting-bane_of_anthropods.emerald-cost", 23, 1, 64);
        ModConfigValues.SWORD_UNBREAKING_AND_SMITE_DIAMONDS = SERVER_CONFIG
                .defineInRange("sword-unbreaking-smite.diamond-cost", 2, 1, 64);
        ModConfigValues.SWORD_UNBREAKING_AND_SMITE_EMERALDS = SERVER_CONFIG
                .defineInRange("sword-unbreaking-smite.emerald-cost", 24, 1, 64);
        ModConfigValues.SWORD_UNBREAKING_AND_BANE_OF_ANTHROPODS_DIAMONDS = SERVER_CONFIG
                .defineInRange("sword-unbreaking-bane_of_anthropods.diamond-cost", 1, 1, 64);
        ModConfigValues.SWORD_UNBREAKING_AND_BANE_OF_ANTHROPODS_EMERALDS = SERVER_CONFIG
                .defineInRange("sword-unbreaking-bane_of_anthropods.emerald-cost", 22, 1, 64);

        ModConfigValues.PICKAXE_UNBREAKING_AND_EFFICIENCY_DIAMONDS = SERVER_CONFIG
                .defineInRange("pickaxe-unbreaking-efficiency.diamond-cost", 2, 1, 64);
        ModConfigValues.PICKAXE_UNBREAKING_AND_EFFICIENCY_EMERALDS = SERVER_CONFIG
                .defineInRange("pickaxe-unbreaking-efficiency.emerald-cost", 20, 1, 64);
        ModConfigValues.PICKAXE_UNBREAKING_AND_FORTUNE_DIAMONDS = SERVER_CONFIG
                .defineInRange("pickaxe-unbreaking-fortune.diamond-cost", 2, 1, 64);
        ModConfigValues.PICKAXE_UNBREAKING_AND_FORTUNE_EMERALDS = SERVER_CONFIG
                .defineInRange("pickaxe-unbreaking-fortune.emerald-cost", 24, 1, 64);
        ModConfigValues.PICKAXE_FORTUNE_AND_EFFICIENCY_DIAMONDS = SERVER_CONFIG
                .defineInRange("pickaxe-fortune-efficiency.diamond-cost", 2, 1, 64);
        ModConfigValues.PICKAXE_FORTUNE_AND_EFFICIENCY_EMERALDS = SERVER_CONFIG
                .defineInRange("pickaxe-fortune-efficiency.emerald-cost", 26, 1, 64);

        ModConfigValues.SHOVEL_UNBREAKING_AND_EFFICIENCY_DIAMONDS = SERVER_CONFIG
                .defineInRange("shovel-unbreaking-efficiency.diamond-cost", 1, 1, 64);
        ModConfigValues.SHOVEL_UNBREAKING_AND_EFFICIENCY_EMERALDS = SERVER_CONFIG
                .defineInRange("shovel-unbreaking-efficiency.emerald-cost", 18, 1, 64);
        ModConfigValues.SHOVEL_UNBREAKING_AND_FORTUNE_DIAMONDS = SERVER_CONFIG
                .defineInRange("shovel-unbreaking-fortune.diamond-cost", 1, 1, 64);
        ModConfigValues.SHOVEL_UNBREAKING_AND_FORTUNE_EMERALDS = SERVER_CONFIG
                .defineInRange("shovel-unbreaking-fortune.emerald-cost", 20, 1, 64);
        ModConfigValues.SHOVEL_FORTUNE_AND_EFFICIENCY_DIAMONDS = SERVER_CONFIG
                .defineInRange("shovel-fortune-efficiency.diamond-cost", 1, 1, 64);
        ModConfigValues.SHOVEL_FORTUNE_AND_EFFICIENCY_EMERALDS = SERVER_CONFIG
                .defineInRange("shovel-fortune-efficiency.emerald-cost", 22, 1, 64);


        ModConfigValues.ITEMS_TIER1_BOOK_COST = SERVER_CONFIG
                .defineInRange("items-book.cost", 2, 1, 64);
        ModConfigValues.ITEMS_TIER1_BOOK_RESULT = SERVER_CONFIG
                .defineInRange("items-book.result", 12, 1, 64);
        ModConfigValues.ITEMS_TIER1_BOOK_USES = SERVER_CONFIG
                .defineInRange("items-book.uses", 8, 1, 24);
        ModConfigValues.ITEMS_TIER1_BOOK_XP = SERVER_CONFIG
                .defineInRange("items-book.xp", 5, 1, 24);
        ModConfigValues.ITEMS_TIER1_PAPER_COST = SERVER_CONFIG
                .defineInRange("items-paper.cost", 6, 1, 64);
        ModConfigValues.ITEMS_TIER1_PAPER_RESULT = SERVER_CONFIG
                .defineInRange("items-paper.result", 1, 1, 64);
        ModConfigValues.ITEMS_TIER1_PAPER_USES = SERVER_CONFIG
                .defineInRange("items-paper.uses", 10, 1, 24);
        ModConfigValues.ITEMS_TIER1_PAPER_XP = SERVER_CONFIG
                .defineInRange("items-paper.xp", 5, 1, 24);
        ModConfigValues.ITEMS_TIER1_INK_SAC_COST = SERVER_CONFIG
                .defineInRange("items-ink-sac.cost", 5, 1, 64);
        ModConfigValues.ITEMS_TIER1_INK_SAC_RESULT = SERVER_CONFIG
                .defineInRange("items-ink-sac.result", 1, 1, 64);
        ModConfigValues.ITEMS_TIER1_INK_SAC_USES = SERVER_CONFIG
                .defineInRange("items-ink-sac.uses", 10, 1, 24);
        ModConfigValues.ITEMS_TIER1_INK_SAC_XP = SERVER_CONFIG
                .defineInRange("items-ink-sac.xp", 4, 1, 24);

        ModConfigValues.ITEMS_TIER1_WRITABLE_BOOK_COST = SERVER_CONFIG
                .defineInRange("items-writable-book.cost", 1, 1, 64);
        ModConfigValues.ITEMS_TIER1_WRITABLE_BOOK_RESULT = SERVER_CONFIG
                .defineInRange("items-writable-book.result", 1, 1, 64);
        ModConfigValues.ITEMS_TIER1_WRITABLE_BOOK_USES = SERVER_CONFIG
                .defineInRange("items-writable-book.uses", 3, 1, 24);
        ModConfigValues.ITEMS_TIER1_WRITABLE_BOOK_XP = SERVER_CONFIG
                .defineInRange("items-writable-book.xp", 6, 1, 24);

        ModConfigValues.ITEMS_TIER1_LANTERN_COST = SERVER_CONFIG
                .defineInRange("items-lantern.cost", 7, 1, 64);
        ModConfigValues.ITEMS_TIER1_LANTERN_RESULT = SERVER_CONFIG
                .defineInRange("items-lantern.result", 1, 1, 64);
        ModConfigValues.ITEMS_TIER1_LANTERN_USES = SERVER_CONFIG
                .defineInRange("items-lantern.uses", 4, 1, 24);
        ModConfigValues.ITEMS_TIER1_LANTERN_XP = SERVER_CONFIG
                .defineInRange("items-lantern.xp", 6, 1, 24);

        ModConfigValues.ITEMS_TIER1_BOOKSHELF_COST = SERVER_CONFIG
                .defineInRange("items-bookshelf.cost", 9, 1, 64);
        ModConfigValues.ITEMS_TIER1_BOOKSHELF_RESULT = SERVER_CONFIG
                .defineInRange("items-bookshelf.result", 1, 1, 64);
        ModConfigValues.ITEMS_TIER1_BOOKSHELF_USES = SERVER_CONFIG
                .defineInRange("items-bookshelf.uses", 4, 1, 24);
        ModConfigValues.ITEMS_TIER1_BOOKSHELF_XP = SERVER_CONFIG
                .defineInRange("items-bookshelf.xp", 12, 1, 24);



        ModConfigValues.ITEMS_TIER3_NAME_TAG_COST = SERVER_CONFIG
                .defineInRange("items-name-tag.cost", 12, 1, 64);
        ModConfigValues.ITEMS_TIER3_NAME_TAG_RESULT = SERVER_CONFIG
                .defineInRange("items-name-tag.result", 12, 1, 64);
        ModConfigValues.ITEMS_TIER3_NAME_TAG_USES = SERVER_CONFIG
                .defineInRange("items-name-tag.uses", 12, 1, 24);
        ModConfigValues.ITEMS_TIER3_NAME_TAG_XP = SERVER_CONFIG
                .defineInRange("items-name-tag.xp", 12, 1, 24);

        ModConfigValues.ITEMS_TIER3_GLASS_COST = SERVER_CONFIG
                .defineInRange("items-glass.cost", 16, 1, 64);
        ModConfigValues.ITEMS_TIER3_GLASS_RESULT = SERVER_CONFIG
                .defineInRange("items-glass.result", 16, 1, 64);
        ModConfigValues.ITEMS_TIER3_GLASS_USES = SERVER_CONFIG
                .defineInRange("items-glass.uses", 16, 1, 24);
        ModConfigValues.ITEMS_TIER3_GLASS_XP = SERVER_CONFIG
                .defineInRange("items-glass.xp", 16, 1, 24);


        ModConfigValues.ITEMS_TIER3_CLOCK_COST = SERVER_CONFIG
                .defineInRange("items-clock.cost", 12, 1, 64);
        ModConfigValues.ITEMS_TIER3_CLOCK_RESULT = SERVER_CONFIG
                .defineInRange("items-clock.result", 12, 1, 64);
        ModConfigValues.ITEMS_TIER3_CLOCK_USES = SERVER_CONFIG
                .defineInRange("items-clock.uses", 12, 1, 24);
        ModConfigValues.ITEMS_TIER3_CLOCK_XP = SERVER_CONFIG
                .defineInRange("items-clock.xp", 12, 1, 24);

        ModConfigValues.ITEMS_TIER3_COMPASS_COST = SERVER_CONFIG
                .defineInRange("items-compass.cost", 12, 1, 64);
        ModConfigValues.ITEMS_TIER3_COMPASS_RESULT = SERVER_CONFIG
                .defineInRange("items-compass.result", 12, 1, 64);
        ModConfigValues.ITEMS_TIER3_COMPASS_USES = SERVER_CONFIG
                .defineInRange("items-compass.uses", 12, 1, 24);
        ModConfigValues.ITEMS_TIER3_COMPASS_XP = SERVER_CONFIG
                .defineInRange("items-compass.xp", 12, 1, 24);




        ModConfigValues.BOOK_TIER2_ALL_DAMAGE_PROTECTION_DIAMONDS = SERVER_CONFIG
                .defineInRange("books-all_damage_protection.diamond-cost", 3, 1, 64);
        ModConfigValues.BOOK_TIER2_ALL_DAMAGE_PROTECTION_EMERALDS = SERVER_CONFIG
                .defineInRange("books-all_damage_protection.emerald-cost", 45, 1, 64);
        ModConfigValues.BOOK_TIER2_FALL_PROTECTION_DIAMONDS = SERVER_CONFIG
                .defineInRange("books-fall_protection.diamond-cost", 3, 1, 64);
        ModConfigValues.BOOK_TIER2_FALL_PROTECTION_EMERALDS = SERVER_CONFIG
                .defineInRange("books-fall_protection.emerald-cost", 45, 1, 64);
        ModConfigValues.BOOK_TIER2_PROJECTILE_PROTECTION_DIAMONDS = SERVER_CONFIG
                .defineInRange("books-projectile_protection.diamond-cost", 3, 1, 64);
        ModConfigValues.BOOK_TIER2_PROJECTILE_PROTECTION_EMERALDS = SERVER_CONFIG
                .defineInRange("books-projectile_protection.emerald-cost", 45, 1, 64);
        ModConfigValues.BOOK_TIER2_SHARPNESS_DIAMONDS = SERVER_CONFIG
                .defineInRange("books-sharpness.diamond-cost", 3, 1, 64);
        ModConfigValues.BOOK_TIER2_SHARPNESS_EMERALDS = SERVER_CONFIG
                .defineInRange("books-sharpness.emerald-cost", 50, 1, 64);
        ModConfigValues.BOOK_TIER2_SMITE_DIAMONDS = SERVER_CONFIG
                .defineInRange("books-smite.diamond-cost", 3, 1, 64);
        ModConfigValues.BOOK_TIER2_SMITE_EMERALDS = SERVER_CONFIG
                .defineInRange("books-smite.emerald-cost", 35, 1, 64);
        ModConfigValues.BOOK_TIER2_BANE_OF_ARTHROPODS_DIAMONDS = SERVER_CONFIG
                .defineInRange("books-bane_of_arthropods.diamond-cost", 3, 1, 64);
        ModConfigValues.BOOK_TIER2_BANE_OF_ARTHROPODS_EMERALDS = SERVER_CONFIG
                .defineInRange("books-bane_of_arthropods.emerald-cost", 35, 1, 64);
        ModConfigValues.BOOK_TIER2_KNOCKBACK_DIAMONDS = SERVER_CONFIG
                .defineInRange("books-knockback.diamond-cost", 2, 1, 64);
        ModConfigValues.BOOK_TIER2_KNOCKBACK_EMERALDS = SERVER_CONFIG
                .defineInRange("books-knockback.emerald-cost", 25, 1, 64);
        ModConfigValues.BOOK_TIER2_EFFICIENCY_DIAMONDS = SERVER_CONFIG
                .defineInRange("books-efficiency.diamond-cost", 3, 1, 64);
        ModConfigValues.BOOK_TIER2_EFFICIENCY_EMERALDS = SERVER_CONFIG
                .defineInRange("books-efficiency.emerald-cost", 35, 1, 64);
        ModConfigValues.BOOK_TIER2_POWER_DIAMONDS = SERVER_CONFIG
                .defineInRange("books-power.diamond-cost", 3, 1, 64);
        ModConfigValues.BOOK_TIER2_POWER_EMERALDS = SERVER_CONFIG
                .defineInRange("books-power.emerald-cost", 35, 1, 64);
        ModConfigValues.BOOK_TIER2_LOYALTY_DIAMONDS = SERVER_CONFIG
                .defineInRange("books-loyalty.diamond-cost", 2, 1, 64);
        ModConfigValues.BOOK_TIER2_LOYALTY_EMERALDS = SERVER_CONFIG
                .defineInRange("books-loyalty.emerald-cost", 30, 1, 64);
        ModConfigValues.BOOK_TIER2_IMPALING_DIAMONDS = SERVER_CONFIG
                .defineInRange("books-impaling.diamond-cost", 3, 1, 64);
        ModConfigValues.BOOK_TIER2_IMPALING_EMERALDS = SERVER_CONFIG
                .defineInRange("books-impaling.emerald-cost", 40, 1, 64);
        ModConfigValues.BOOK_TIER2_MULTISHOT_DIAMONDS = SERVER_CONFIG
                .defineInRange("books-multishot.diamond-cost", 1, 1, 64);
        ModConfigValues.BOOK_TIER2_MULTISHOT_EMERALDS = SERVER_CONFIG
                .defineInRange("books-multishot.emerald-cost", 15, 1, 64);
        ModConfigValues.BOOK_TIER2_QUICK_CHARGE_DIAMONDS = SERVER_CONFIG
                .defineInRange("books-quick_charge.diamond-cost", 2, 1, 64);
        ModConfigValues.BOOK_TIER2_QUICK_CHARGE_EMERALDS = SERVER_CONFIG
                .defineInRange("books-quick_charge.emerald-cost", 25, 1, 64);
        ModConfigValues.BOOK_TIER2_PIERCING_DIAMONDS = SERVER_CONFIG
                .defineInRange("books-piercing.diamond-cost", 3, 1, 64);
        ModConfigValues.BOOK_TIER2_PIERCING_EMERALDS = SERVER_CONFIG
                .defineInRange("books-piercing.emerald-cost", 25, 1, 64);
        ModConfigValues.BOOK_TIER2_VANISHING_CURSE_DIAMONDS = SERVER_CONFIG
                .defineInRange("books-vanishing_curse.diamond-cost", 1, 1, 64);
        ModConfigValues.BOOK_TIER2_VANISHING_CURSE_EMERALDS = SERVER_CONFIG
                .defineInRange("books-vanishing_curse.emerald-cost", 15, 1, 64);

        // Book Tier 4
        ModConfigValues.BOOK_TIER4_PROJECTILE_PROTECTION_DIAMONDS = SERVER_CONFIG
                .defineInRange("books-projectile_protection.diamond-cost", 3, 1, 64);
        ModConfigValues.BOOK_TIER4_PROJECTILE_PROTECTION_EMERALDS = SERVER_CONFIG
                .defineInRange("books-projectile_protection.emerald-cost", 45, 1, 64);
        ModConfigValues.BOOK_TIER4_RESPIRATION_DIAMONDS = SERVER_CONFIG
                .defineInRange("books-respiration.diamond-cost", 2, 1, 64);
        ModConfigValues.BOOK_TIER4_RESPIRATION_EMERALDS = SERVER_CONFIG
                .defineInRange("books-respiration.emerald-cost", 30, 1, 64);
        ModConfigValues.BOOK_TIER4_AQUA_AFFINITY_DIAMONDS = SERVER_CONFIG
                .defineInRange("books-aqua_affinity.diamond-cost", 1, 1, 64);
        ModConfigValues.BOOK_TIER4_AQUA_AFFINITY_EMERALDS = SERVER_CONFIG
                .defineInRange("books-aqua_affinity.emerald-cost", 15, 1, 64);
        ModConfigValues.BOOK_TIER4_DEPTH_STRIDER_DIAMONDS = SERVER_CONFIG
                .defineInRange("books-depth_strider.diamond-cost", 2, 1, 64);
        ModConfigValues.BOOK_TIER4_DEPTH_STRIDER_EMERALDS = SERVER_CONFIG
                .defineInRange("books-depth_strider.emerald-cost", 35, 1, 64);
        ModConfigValues.BOOK_TIER4_FROST_WALKER_DIAMONDS = SERVER_CONFIG
                .defineInRange("books-frost_walker.diamond-cost", 2, 1, 64);
        ModConfigValues.BOOK_TIER4_FROST_WALKER_EMERALDS = SERVER_CONFIG
                .defineInRange("books-frost_walker.emerald-cost", 25, 1, 64);
        ModConfigValues.BOOK_TIER4_FIRE_ASPECT_DIAMONDS = SERVER_CONFIG
                .defineInRange("books-fire_aspect.diamond-cost", 2, 1, 64);
        ModConfigValues.BOOK_TIER4_FIRE_ASPECT_EMERALDS = SERVER_CONFIG
                .defineInRange("books-fire_aspect.emerald-cost", 20, 1, 64);
        ModConfigValues.BOOK_TIER4_LOOTING_DIAMONDS = SERVER_CONFIG
                .defineInRange("books-looting.diamond-cost", 3, 1, 64);
        ModConfigValues.BOOK_TIER4_LOOTING_EMERALDS = SERVER_CONFIG
                .defineInRange("books-looting.emerald-cost", 40, 1, 64);
        ModConfigValues.BOOK_TIER4_SWEEPING_EDGE_DIAMONDS = SERVER_CONFIG
                .defineInRange("books-sweeping_edge.diamond-cost", 3, 1, 64);
        ModConfigValues.BOOK_TIER4_SWEEPING_EDGE_EMERALDS = SERVER_CONFIG
                .defineInRange("books-sweeping_edge.emerald-cost", 30, 1, 64);
        ModConfigValues.BOOK_TIER4_FORTUNE_DIAMONDS = SERVER_CONFIG
                .defineInRange("books-fortune.diamond-cost", 3, 1, 64);
        ModConfigValues.BOOK_TIER4_FORTUNE_EMERALDS = SERVER_CONFIG
                .defineInRange("books-fortune.emerald-cost", 35, 1, 64);
        ModConfigValues.BOOK_TIER4_PUNCH_DIAMONDS = SERVER_CONFIG
                .defineInRange("books-punch.diamond-cost", 1, 1, 64);
        ModConfigValues.BOOK_TIER4_PUNCH_EMERALDS = SERVER_CONFIG
                .defineInRange("books-punch.emerald-cost", 25, 1, 64);
        ModConfigValues.BOOK_TIER4_FLAME_DIAMONDS = SERVER_CONFIG
                .defineInRange("books-flame.diamond-cost", 1, 1, 64);
        ModConfigValues.BOOK_TIER4_FLAME_EMERALDS = SERVER_CONFIG
                .defineInRange("books-flame.emerald-cost", 15, 1, 64);
        ModConfigValues.BOOK_TIER4_LUCK_OF_THE_SEA_DIAMONDS = SERVER_CONFIG
                .defineInRange("books-luck_of_the_sea.diamond-cost", 1, 1, 64);
        ModConfigValues.BOOK_TIER4_LUCK_OF_THE_SEA_EMERALDS = SERVER_CONFIG
                .defineInRange("books-luck_of_the_sea.emerald-cost", 25, 1, 64);
        ModConfigValues.BOOK_TIER4_LURE_DIAMONDS = SERVER_CONFIG
                .defineInRange("books-lure.diamond-cost", 1, 1, 64);
        ModConfigValues.BOOK_TIER4_LURE_EMERALDS = SERVER_CONFIG
                .defineInRange("books-lure.emerald-cost", 25, 1, 64);
        ModConfigValues.BOOK_TIER4_RIPTIDE_DIAMONDS = SERVER_CONFIG
                .defineInRange("books-riptide.diamond-cost", 2, 1, 64);
        ModConfigValues.BOOK_TIER4_RIPTIDE_EMERALDS = SERVER_CONFIG
                .defineInRange("books-riptide.emerald-cost", 30, 1, 64);

        // Book Tier 5
        ModConfigValues.BOOK_TIER5_THORNS_DIAMONDS = SERVER_CONFIG
                .defineInRange("books-thorns.diamond-cost", 2, 1, 64);
        ModConfigValues.BOOK_TIER5_THORNS_EMERALDS = SERVER_CONFIG
                .defineInRange("books-thorns.emerald-cost", 50, 1, 64);
        ModConfigValues.BOOK_TIER5_BINDING_CURSE_DIAMONDS = SERVER_CONFIG
                .defineInRange("books-binding_curse.diamond-cost", 1, 1, 64);
        ModConfigValues.BOOK_TIER5_BINDING_CURSE_EMERALDS = SERVER_CONFIG
                .defineInRange("books-binding_curse.emerald-cost", 25, 1, 64);
        ModConfigValues.BOOK_TIER5_SILK_TOUCH_DIAMONDS = SERVER_CONFIG
                .defineInRange("books-silk_touch.diamond-cost", 3, 1, 64);
        ModConfigValues.BOOK_TIER5_SILK_TOUCH_EMERALDS = SERVER_CONFIG
                .defineInRange("books-silk_touch.emerald-cost", 45, 1, 64);
        ModConfigValues.BOOK_TIER5_UNBREAKING_DIAMONDS = SERVER_CONFIG
                .defineInRange("books-unbreaking.diamond-cost", 3, 1, 64);
        ModConfigValues.BOOK_TIER5_UNBREAKING_EMERALDS = SERVER_CONFIG
                .defineInRange("books-unbreaking.emerald-cost", 40, 1, 64);
        ModConfigValues.BOOK_TIER5_INFINITY_DIAMONDS = SERVER_CONFIG
                .defineInRange("books-infinity.diamond-cost", 1, 1, 64);
        ModConfigValues.BOOK_TIER5_INFINITY_EMERALDS = SERVER_CONFIG
                .defineInRange("books-infinity.emerald-cost", 35, 1, 64);
        ModConfigValues.BOOK_TIER5_CHANNELING_DIAMONDS = SERVER_CONFIG
                .defineInRange("books-channeling.diamond-cost", 2, 1, 64);
        ModConfigValues.BOOK_TIER5_CHANNELING_EMERALDS = SERVER_CONFIG
                .defineInRange("books-channeling.emerald-cost", 25, 1, 64);
        ModConfigValues.BOOK_TIER5_MENDING_DIAMONDS = SERVER_CONFIG
                .defineInRange("books-mending.diamond-cost", 5, 1, 64);
        ModConfigValues.BOOK_TIER5_MENDING_EMERALDS = SERVER_CONFIG
                .defineInRange("books-mending.emerald-cost", 60, 1, 64);

    }
}
