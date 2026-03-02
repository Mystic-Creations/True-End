package net.mysticcreations.true_end.init;

import dev.architectury.registry.client.particle.ParticleProviderRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.registries.Registries;
import net.mysticcreations.true_end.TrueEnd;
import net.mysticcreations.true_end.particle.DreamPortal;
import net.mysticcreations.true_end.particle.DreamPortalType;

public class TEParticles {
    public static final DeferredRegister<ParticleType<?>> PARTICLE_TYPES = DeferredRegister.create(TrueEnd.MOD_ID, Registries.PARTICLE_TYPE);

    public static final RegistrySupplier<SimpleParticleType> DREAM_PORTAL_PARTICLE =
        PARTICLE_TYPES.register("dream_portal_particle", () -> new DreamPortalType(false));

    public static void registerParticles() {
        ParticleProviderRegistry.register(DREAM_PORTAL_PARTICLE.get(), DreamPortal::provider);
    }

    public static void registerParticleTypes() {
        PARTICLE_TYPES.register();
    }

}
