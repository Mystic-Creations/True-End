package net.mysticcreations.true_end.procedures.randomevents;

import dev.architectury.event.EventResult;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;

public class NoVoidDamage {
    public static boolean eventActive;

    public static void onPlayerJoin(ServerPlayer player) {
        //if (!Variables.doRandomEvents) return;
        if (Math.random() < 0.5) {
            eventActive = true;
        } else {
            eventActive = false;
        }
    }

    public static EventResult onEntityDamaged(LivingEntity entity, DamageSource source, float amount) {
        if (!eventActive) return EventResult.pass();
        if (!(entity instanceof ServerPlayer player)) return EventResult.pass();

        if (player.level().dimension().equals(Level.END)) return EventResult.pass();
        if (source == null) return EventResult.pass();
        if (source.is(DamageTypes.FELL_OUT_OF_WORLD) && player.getY() >= -2010) return EventResult.interruptTrue();
        //It's set to -2010 cuz year 2010 is when Alpha 1.1.2_01 released
        return EventResult.pass();
    }
}