package com.teampotato.thereisnothinglefttobeafraidof.mixin;

import net.minecraft.item.ItemStack;
import net.minecraft.item.SkullItem;
import net.minecraft.nbt.CompoundNBT;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(SkullItem.class)
public class MixinSkullItem {
    @Redirect(method = "getName", at = @At(value = "INVOKE", target = "Lnet/minecraft/item/ItemStack;hasTag()Z"))
    private boolean on_getName(ItemStack instance) {
        return false;
    }

    @Inject(method = "verifyTagAfterLoad", at = @At("HEAD"), cancellable = true)
    private void on_verifyTagAfterLoad(CompoundNBT p_179215_1_, CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(false);
        cir.cancel();
    }
}
