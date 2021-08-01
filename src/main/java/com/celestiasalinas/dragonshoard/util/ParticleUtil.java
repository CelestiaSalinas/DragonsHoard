package com.celestiasalinas.dragonshoard.util;

import com.celestiasalinas.dragonshoard.core.DragonsHoard;
import com.celestiasalinas.dragonshoard.core.particles.Bubbles;
import com.celestiasalinas.dragonshoard.core.particles.GlitterParticle;
import com.celestiasalinas.dragonshoard.core.particles.PurpleGlitterParticle;
import com.celestiasalinas.dragonshoard.core.registry.particles.ParticleRegistry;
import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.Drippy;
import net.minecraft.client.particle.EarthSwirls;
import net.minecraft.client.particle.Swirls;
import net.minecraft.particles.BasicParticleType;
import net.minecraft.particles.ParticleTypes;
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
        Minecraft.getInstance().particleEngine.register(ParticleRegistry.PURPLE_GLITTER.get(), PurpleGlitterParticle.Factory::new);
        Minecraft.getInstance().particleEngine.register(ParticleRegistry.BLUE_GLITTER.get(), PurpleGlitterParticle.Factory::new);
        Minecraft.getInstance().particleEngine.register(ParticleRegistry.ICE_GLITTER.get(), PurpleGlitterParticle.Factory::new);
        Minecraft.getInstance().particleEngine.register(ParticleRegistry.ORANGE_GLITTER.get(), PurpleGlitterParticle.Factory::new);
        Minecraft.getInstance().particleEngine.register(ParticleRegistry.GREEN_GLITTER.get(), PurpleGlitterParticle.Factory::new);
        Minecraft.getInstance().particleEngine.register(ParticleTypes.BUBBLE, Bubbles.Factory::new);
        Minecraft.getInstance().particleEngine.register(ParticleTypes.DRIPPING_WATER, Drippy.FallingWaterFactory::new);
        Minecraft.getInstance().particleEngine.register(ParticleTypes.DRIPPING_LAVA, Drippy.FallingLavaFactory::new);
        Minecraft.getInstance().particleEngine.register(ParticleTypes.AMBIENT_ENTITY_EFFECT, Swirls.SwirlFactory::new);
        Minecraft.getInstance().particleEngine.register(ParticleTypes.AMBIENT_ENTITY_EFFECT, EarthSwirls.EarthSwirlFactory::new);
    }

}
