package com.teampotato.thereisnothinglefttobeafraidof.mixin;

import net.minecraft.block.SkullPlayerBlock;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(SkullPlayerBlock.class)
public class MixinSkullPlayerBlock {
    @Redirect(method = "setPlacedBy", at = @At(value = "INVOKE", target = "Lnet/minecraft/item/ItemStack;hasTag()Z"))
    private boolean on_setPlacedBy(ItemStack instance) {
        return false;
    }
}
