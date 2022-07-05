package crec.dev.betterstatsscreen.mixin;

import net.minecraft.client.gui.screens.achievement.StatsScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(StatsScreen.class)
public class StatsScreenMixin {
	@Inject(
		method = "getColumnX",
		at = @At("HEAD"),
		cancellable = true
	)
	private void modifyInitConstant(int i, CallbackInfoReturnable<Integer> cir) {
		cir.setReturnValue(86 + 68 * i);
	}
}
