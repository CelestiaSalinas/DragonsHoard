package com.celestiasalinas.dragonshoard.core.registry.particles;

import com.celestiasalinas.dragonshoard.core.DragonsHoard;
import com.celestiasalinas.dragonshoard.util.ParticleUtil;
import net.minecraft.client.particle.Particle;
import net.minecraft.item.Item;
import net.minecraft.particles.BasicParticleType;
import net.minecraft.particles.ParticleType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ParticleRegistry {
    public static final DeferredRegister<ParticleType<?>> PARTICLES = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, DragonsHoard.MOD_ID);

    public static final RegistryObject<BasicParticleType> GLITTER = PARTICLES.register("glitter", () -> new BasicParticleType(true));



}






//import com.celestiasalinas.dragonshoard.core.particles.*;
//import net.minecraft.client.Minecraft;
//import net.minecraft.client.particle.ParticleManager;
//import net.minecraft.particles.BasicParticleType;
//import net.minecraftforge.api.distmarker.Dist;
//import net.minecraftforge.api.distmarker.OnlyIn;
//
//public class ParticleRegistry {
//    public static final BasicParticleType glitter = new BasicParticleType(true);
//
//    @OnlyIn(Dist.CLIENT)
//    public static void registerFactories() {
//        ParticleManager particles = Minecraft.getInstance().particleEngine;
//
//        particles.particleFactory(glitter, GlitterParticle.Factory::new);
//    }
//
//}
