package com.teampotato.thereisnothinglefttobeafraidof.mixin;

import net.minecraft.block.BlockState;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.SkullTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(SkullTileEntity.class)
public class MixinSkullTileEntity extends TileEntity {
    public MixinSkullTileEntity(TileEntityType<?> p_i48289_1_) {
        super(p_i48289_1_);
    }

    @Inject(method = "save", at = @At("HEAD"), cancellable = true)
    private void  on_save(CompoundNBT p_189515_1_, CallbackInfoReturnable<CompoundNBT> cir) {
        super.save(p_189515_1_);
        cir.setReturnValue(p_189515_1_);
        cir.cancel();
    }

    @Inject(method = "load", at = @At("HEAD"), cancellable = true)
    private void on_load(BlockState p_230337_1_, CompoundNBT p_230337_2_, CallbackInfo ci) {
        super.load(p_230337_1_, p_230337_2_);
        ci.cancel();
    }
}
