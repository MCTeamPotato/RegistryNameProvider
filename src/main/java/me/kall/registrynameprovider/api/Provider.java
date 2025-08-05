package me.kall.registrynameprovider.api;

import me.kall.registrynameprovider.impl.RegistryNameContainer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.Nullable;

public final class Provider {
    public static @Nullable ResourceLocation getRegistryName(EntityType<?> entityType) {
        return ((RegistryNameContainer)entityType).provider$getRegistryName();
    }

    public static @Nullable ResourceLocation getRegistryName(Item item) {
        return ((RegistryNameContainer)item).provider$getRegistryName();
    }

    public static @Nullable ResourceLocation getRegistryName(Block block) {
        return ((RegistryNameContainer)block).provider$getRegistryName();
    }

    public static @Nullable ResourceLocation getRegistryName(Attribute attribute) {
        return ((RegistryNameContainer)attribute).provider$getRegistryName();
    }

    public static @Nullable ResourceLocation getRegistryName(MobEffect effect) {
        return ((RegistryNameContainer)effect).provider$getRegistryName();
    }
}

