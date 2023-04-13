package com.teampotato.thereisnothinglefttobeafraidof.mixin;

import net.minecraft.item.ItemStack;
import net.minecraft.loot.LootContext;
import net.minecraft.loot.functions.FillPlayerHead;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(FillPlayerHead.class)
public class MixinFillPlayerHead {
    @Inject(method = "run", at = @At("HEAD"), cancellable = true)
    private void on_run(ItemStack p_215859_1_, LootContext p_215859_2_, CallbackInfoReturnable<ItemStack> cir){
        cir.setReturnValue(p_215859_1_);
        cir.cancel();
    }
}
