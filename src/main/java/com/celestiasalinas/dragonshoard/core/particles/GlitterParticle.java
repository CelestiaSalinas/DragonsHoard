package com.celestiasalinas.dragonshoard.core.particles;

import net.minecraft.client.particle.*;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.particles.BasicParticleType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.awt.*;
import java.util.Random;

public class GlitterParticle extends SpriteTexturedParticle {


    public GlitterParticle(ClientWorld worldIn, double posXIn, double posYIn, double posZIn, double speedX,
                           double speedY, double speedZ) {
        super(worldIn, posXIn, posYIn, posZIn, speedX, speedY, speedZ);
        gravity = 10;
        float f = this.random.nextFloat() * 1.0f;
        this.rCol = f;
        this.gCol = f;
        this.bCol = f;

        this.setSize(0.02f, 0.02f);
        this.xd *= -0.1f;
        this.yd *= -0.1f;
        this.zd *= -0.1f;
        this.lifetime = (int) (30.0D / (Math.random() * 1.0D));

    }

    @Override
    public void tick() {
        this.xo = this.x;
        this.yo = this.y;
        this.zo = this.z;

        if (this.lifetime-- <= 0) {
            this.remove();
        } else {
            this.move(this.xd, this.yd, this.zd);
            this.xd *= 1.0D;
            this.yd *= 1.0D;
            this.zd *= 1.0D;
        }
    }

    @Override
    public IParticleRenderType getRenderType() {
        return IParticleRenderType.PARTICLE_SHEET_OPAQUE;
    }

    @OnlyIn(Dist.CLIENT)
    public static class Factory implements IParticleFactory<BasicParticleType> {
        private final IAnimatedSprite spriteSet;

        public Factory(IAnimatedSprite spriteSet) {
            this.spriteSet = spriteSet;
        }

        @Nullable
        @Override
        public Particle createParticle(BasicParticleType typeIn, ClientWorld worldIn, double x, double y, double z,
                                       double xSpeed, double ySpeed, double zSpeed) {
            GlitterParticle glitter = new GlitterParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed);
            glitter.setColor(1.0f, 1.0f, 1.0f);
            glitter.pickSprite(this.spriteSet);
            return glitter;
        }
    }
}
