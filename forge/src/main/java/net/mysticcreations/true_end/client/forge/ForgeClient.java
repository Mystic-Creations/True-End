package net.mysticcreations.true_end.client.forge;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.mysticcreations.true_end.client.CommonClient;
import net.mysticcreations.true_end.forge.TrueEndForge;
import net.mysticcreations.true_end.init.TEParticles;

@OnlyIn(Dist.CLIENT)
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ForgeClient {

    @SubscribeEvent
    public static void init(FMLClientSetupEvent event) {

        TrueEndForge.EVENT_BUS.addListener(EntityRenderers::registerEntityRenderers);
        TEParticles.registerParticles();
        event.enqueueWork(CommonClient::init);
    }

}
