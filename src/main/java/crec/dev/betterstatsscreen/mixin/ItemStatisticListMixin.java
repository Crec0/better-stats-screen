package crec.dev.betterstatsscreen.mixin;

import net.minecraft.client.gui.screens.achievement.StatsScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(StatsScreen.ItemStatisticsList.class)
public class ItemStatisticListMixin {

	@ModifyVariable(method = "renderHeader", at = @At("HEAD"), argsOnly = true, index = 2, ordinal = 0)
	public int shiftHeader(int value) {
		return value - 40;
	}

	@ModifyVariable(method = "renderDecorations", at = @At("HEAD"), argsOnly = true, index = 2, ordinal = 0)
	public int shiftHeaderDecorations(int value) {
		return value + 40;
	}

	@ModifyVariable(method = "clickedHeader", at = @At("HEAD"), argsOnly = true, index = 1, ordinal = 0)
	public int shiftClickHeader(int value) {
		return value + 30;
	}

	@ModifyVariable(method = "renderMousehoverTooltip", at = @At("HEAD"), argsOnly = true, index = 3, ordinal = 0)
	public int shiftHeaderToolTip(int value) {
		return value - 40;
	}

	@ModifyConstant(method = "getRowWidth", constant = @Constant(intValue = 375))
	public int modifyWidth(int constant) {
		return 480;
	}

	@ModifyConstant(method = "getScrollbarPosition", constant = @Constant(intValue = 140))
	public int modifyScrollPosition(int constant) {
		return 245;
	}
}
