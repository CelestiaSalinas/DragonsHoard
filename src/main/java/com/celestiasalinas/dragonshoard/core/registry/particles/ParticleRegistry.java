package com.celestiasalinas.dragonshoard.core.registry.particles;

import com.celestiasalinas.dragonshoard.core.DragonsHoard;
import net.minecraft.particles.BasicParticleType;
import net.minecraft.particles.ParticleType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ParticleRegistry {

        public static final DeferredRegister<ParticleType<?>> PARTICLES = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, DragonsHoard.MOD_ID);

        public static final RegistryObject<BasicParticleType> GLITTER = PARTICLES.register("glitter", () -> new BasicParticleType(true));
    }

//    @SubscribeEvent
//    public static void onParticleFactoryRegistry(final ParticleFactoryRegisterEvent event) {
//        Minecraft.getInstance().particleEngine.register(DHRegistry.GLITTER, GlitterParticle.Factory::new);
//    }
//    @SubscribeEvent
//    public static void onParticleTypeRegistry(final RegistryEvent.Register<ParticleType<?>> event) {
//        event.getRegistry().register(new BasicParticleType(false).setRegistryName("glitter"));
//    }
