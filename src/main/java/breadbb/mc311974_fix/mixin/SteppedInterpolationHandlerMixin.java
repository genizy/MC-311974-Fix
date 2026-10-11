package breadbb.mc311974_fix.mixin;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.InterpolationHandler;
import net.minecraft.world.entity.LinearInterpolationHandler;
import net.minecraft.world.entity.SteppedInterpolationHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = SteppedInterpolationHandler.class, remap = false)
public abstract class SteppedInterpolationHandlerMixin {
    @Inject(method = "create(Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/entity/InterpolationHandler;",
            at = @At("HEAD"), cancellable = true, remap = false)
    private static void restoreLinearSmoothing(Entity entity, CallbackInfoReturnable<InterpolationHandler> callback) {
        if (entity.level().isClientSide()) {
            callback.setReturnValue(LinearInterpolationHandler.create(entity, 3));
        }
    }
}
