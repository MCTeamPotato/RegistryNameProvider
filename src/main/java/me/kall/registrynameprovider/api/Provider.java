package me.kall.registrynameprovider.api;

import me.kall.registrynameprovider.impl.RegistryNameContainer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.level.block.Block;

public final class Provider {
    public static ResourceLocation getRegistryName(EntityType<?> entityType) {
        return ((RegistryNameContainer)entityType).provider$getRegistryName();
    }

    public static ResourceLocation getRegistryName(Item item) {
        return ((RegistryNameContainer)item).provider$getRegistryName();
    }

    public static ResourceLocation getRegistryName(Block block) {
        return ((RegistryNameContainer)block).provider$getRegistryName();
    }

    public static ResourceLocation getRegistryName(Enchantment enchantment) {
        return ((RegistryNameContainer)enchantment).provider$getRegistryName();
    }

    public static ResourceLocation getRegistryName(Attribute attribute) {
        return ((RegistryNameContainer)attribute).provider$getRegistryName();
    }

    public static ResourceLocation getRegistryName(MobEffect effect) {
        return ((RegistryNameContainer)effect).provider$getRegistryName();
    }
}

