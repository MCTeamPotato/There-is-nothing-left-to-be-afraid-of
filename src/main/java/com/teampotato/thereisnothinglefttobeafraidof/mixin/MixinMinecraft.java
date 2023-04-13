package com.teampotato.thereisnothinglefttobeafraidof.mixin;

import net.minecraft.client.Minecraft;
import net.minecraft.nbt.CompoundNBT;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(Minecraft.class)
public class MixinMinecraft {
    @Redirect(method = "addCustomNbtData", at = @At(value = "INVOKE", target = "Lnet/minecraft/nbt/CompoundNBT;contains(Ljava/lang/String;)Z"))
    private boolean on_addCustomNbtData(CompoundNBT instance, String p_74764_1_) {
        return false;
    }
}
