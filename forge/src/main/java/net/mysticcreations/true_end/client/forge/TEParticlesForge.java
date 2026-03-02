package net.mysticcreations.true_end.client.forge;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.mysticcreations.true_end.init.TEParticles;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TEParticlesForge {
    @SubscribeEvent
    public static void registerParticles(RegisterParticleProvidersEvent event) {
        TEParticles.registerParticles();
    }

}
