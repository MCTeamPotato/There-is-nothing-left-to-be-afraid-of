package com.teampotato.thereisnothinglefttobeafraidof.mixin;

import net.minecraft.client.renderer.tileentity.ItemStackTileEntityRenderer;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(ItemStackTileEntityRenderer.class)
public class MixinItemStackTileEntityRenderer {
    @Redirect(method = "renderByItem", at = @At(value = "INVOKE", target = "Lnet/minecraft/item/ItemStack;hasTag()Z"))
    private boolean on_renderByItem(ItemStack instance) {
        return false;
    }
}
