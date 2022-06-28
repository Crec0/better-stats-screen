package crec.dev.betterstatsscreen.mixin;

import net.minecraft.client.gui.screens.achievement.StatsScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(StatsScreen.ItemStatisticsList.ItemRow.class)
public class ItemRowMixin {
	@ModifyVariable(method = "render", at = @At(value = "HEAD"), argsOnly = true, index = 4, ordinal = 2)
	private int shiftIconsAndText(int constant) {
		return constant - 13;
	}

	@ModifyConstant(method = "render", constant = @Constant(intValue = 40))
	private int shiftIcons(int constant) {
		return 0;
	}
}
