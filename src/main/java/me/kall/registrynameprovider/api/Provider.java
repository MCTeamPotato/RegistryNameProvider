package me.kall.registrynameprovider.api;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

public final class Provider {
    public static ResourceLocation getRegistryName(@NotNull EntityType<?> entityType) {
        return entityType.getRegistryName();
    }

    public static ResourceLocation getRegistryName(@NotNull Item item) {
        return item.getRegistryName();
    }

    public static ResourceLocation getRegistryName(@NotNull Block block) {
        return block.getRegistryName();
    }

    public static ResourceLocation getRegistryName(@NotNull Enchantment enchantment) {
        return enchantment.getRegistryName();
    }

    public static ResourceLocation getRegistryName(@NotNull Attribute attribute) {
        return attribute.getRegistryName();
    }

    public static ResourceLocation getRegistryName(@NotNull MobEffect effect) {
        return effect.getRegistryName();
    }
}

