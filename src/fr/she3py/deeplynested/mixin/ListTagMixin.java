package fr.she3py.deeplynested.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(targets = "net.minecraft.nbt.ListTag$1")
public class ListTagMixin {
	@ModifyConstant(
		method = "load(Ljava/io/DataInput;ILnet/minecraft/nbt/NbtAccounter;)Lnet/minecraft/nbt/ListTag;",
		constant = @Constant(intValue = 512),
		require = 1,
		allow = 1
	)
	private int maxComplexity(int value) {
		return value + value / 2;
	}
}
