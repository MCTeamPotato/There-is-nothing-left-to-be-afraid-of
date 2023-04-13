package com.teampotato.thereisnothinglefttobeafraidof.mixin;

import net.minecraft.client.renderer.entity.layers.HeadLayer;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(HeadLayer.class)
public class MixinHeadLayer {
    @Redirect(method = "render(Lcom/mojang/blaze3d/matrix/MatrixStack;Lnet/minecraft/client/renderer/IRenderTypeBuffer;ILnet/minecraft/entity/LivingEntity;FFFFFF)V", at = @At(value = "INVOKE", target = "Lnet/minecraft/item/ItemStack;hasTag()Z"))
    private boolean on_render(ItemStack instance) {
        return false;
    }
}
