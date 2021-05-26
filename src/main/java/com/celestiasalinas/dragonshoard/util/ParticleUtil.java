package com.celestiasalinas.dragonshoard.util;

import com.celestiasalinas.dragonshoard.core.DragonsHoard;
import com.celestiasalinas.dragonshoard.core.particles.GlitterParticle;
import com.celestiasalinas.dragonshoard.core.registry.particles.ParticleRegistry;
import net.minecraft.client.Minecraft;
import net.minecraft.particles.BasicParticleType;
import net.minecraftforge.client.event.ParticleFactoryRegisterEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = DragonsHoard.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ParticleUtil {
    public static BasicParticleType GLITTER;
    @SubscribeEvent(priority = EventPriority.LOWEST)
    public static void registerParticles(ParticleFactoryRegisterEvent event) {
        Minecraft.getInstance().particleEngine.register(ParticleRegistry.GLITTER.get(), GlitterParticle.Factory::new);
    }

}
