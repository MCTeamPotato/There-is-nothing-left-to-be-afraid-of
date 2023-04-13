package com.teampotato.thereisnothinglefttobeafraidof.mixin;

import net.minecraft.item.ItemStack;
import net.minecraft.item.SkullItem;
import net.minecraft.nbt.CompoundNBT;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(SkullItem.class)
public class MixinSkullItem {
    @Redirect(method = "verifyTagAfterLoad", at = @At(value = "INVOKE", target = "Lnet/minecraft/nbt/CompoundNBT;contains(Ljava/lang/String;I)Z"))
    private boolean on_verifyTagAfterLoad(CompoundNBT instance, String p_150297_1_, int p_150297_2_) {
        return false;
    }

    @Redirect(method = "getName", at = @At(value = "INVOKE", target = "Lnet/minecraft/item/ItemStack;hasTag()Z"))
    private boolean on_getName(ItemStack instance) {
        return false;
    }
}
