package me.kall.registrynameprovider.impl.mixin;

import me.kall.registrynameprovider.impl.RegistryNameContainer;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.ai.attributes.Attribute;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

@Mixin(Attribute.class)
public abstract class AttributeMixin implements RegistryNameContainer {
    @Unique
    private ResourceLocation provider$registryName = null;

    @Override
    public ResourceLocation provider$getRegistryName() {
        if (provider$registryName == null) provider$registryName = BuiltInRegistries.ATTRIBUTE.getKey((Attribute) (Object)this);
        return this.provider$registryName;
    }
}
