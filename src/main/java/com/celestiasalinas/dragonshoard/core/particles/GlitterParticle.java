package com.celestiasalinas.dragonshoard.core.particles;

import net.minecraft.client.particle.IAnimatedSprite;
import net.minecraft.client.particle.IParticleFactory;
import net.minecraft.client.particle.IParticleRenderType;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.SpriteTexturedParticle;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.particles.BasicParticleType;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;

@OnlyIn(Dist.CLIENT)
public class GlitterParticle extends SpriteTexturedParticle {

    /*
     * Just like all other SpriteTexturedParticles this class is more or less copied, take a look at existing
     * particles and add change some numbers around until you get what you need!
     */

    protected GlitterParticle(World worldIn, double xCoordIn, double yCoordIn, double zCoordIn, double xSpeedIn, double ySpeedIn, double zSpeedIn) {
        super((ClientWorld) worldIn, xCoordIn, yCoordIn, zCoordIn, xSpeedIn, ySpeedIn, zSpeedIn);

        float f = this.random.nextFloat() * 1.0f;
        this.rCol = f;
        this.gCol = f;
        this.bCol = f;

        this.setSize(0.02f, 0.02f);
        this.xd *= 0.02f;
        this.yd *= 0.02f;
        this.zd *= 0.02f;
        this.lifetime = (int)(20.0D / (Math.random() * 1.0D));

    }

    @Override
    public IParticleRenderType getRenderType() {
        return IParticleRenderType.PARTICLE_SHEET_LIT;
    }

    @Override
    public void tick() {
        this.xo = this.x;
        this.yo = this.y;
        this.zo = this.z;

        if(this.lifetime-- <= 0) {
            this.remove();
        } else {
            this.move(this.xd, this.yd, this.zd);
            this.xd *= 1.0D;
            this.yd *= 1.0D;
            this.zd *= 1.0D;
        }
    }

    @OnlyIn(Dist.CLIENT)
    public static class Factory implements IParticleFactory<BasicParticleType> {
        private final IAnimatedSprite spriteSet;

        public Factory(IAnimatedSprite sprite) {
            this.spriteSet = sprite;
        }


        public Particle makeParticle(BasicParticleType typeIn, World worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
            GlitterParticle glitter = new GlitterParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed);
            glitter.setColor(1.0f, 1.0f, 1.0f);
            glitter.pickSprite(this.spriteSet);
            return glitter;
        }

        @Nullable
        @Override
        public Particle createParticle(BasicParticleType p_199234_1_, ClientWorld p_199234_2_, double p_199234_3_, double p_199234_5_, double p_199234_7_, double p_199234_9_, double p_199234_11_, double p_199234_13_) {
            return null;
        }
    }


}













//
//import net.minecraft.client.particle.*;
//import net.minecraft.client.world.ClientWorld;
//import net.minecraft.particles.BasicParticleType;
//import net.minecraft.util.math.MathHelper;
//import net.minecraftforge.api.distmarker.Dist;
//import net.minecraftforge.api.distmarker.OnlyIn;
//
//public class GlitterParticle extends SpriteTexturedParticle {
//
//    private final IAnimatedSprite spriteset;
//    private int fakeAge = 0;
//    private int fakeMaxAge;
//
//    public GlitterParticle(ClientWorld world, double posX, double posY, double posZ, double motionX, double motionY, double motionZ, IAnimatedSprite sprite) {
//        super(world, posX, posY, posZ, motionX, motionY, motionZ);
//        this.spriteSet = sprite;
//        this.motionX = motionX;
//        this.motionY = motionY;
//        this.motionZ = motionZ;
//        this.particleGravity = 0.002f;
//        this.maxAge = 10;
//        this.fakeMaxAge = this.rand.nextInt(10) + 30;
//        this.selectSpriteWithAge(sprite);
//    }
//    @Override
//    public IParticleRenderType getRenderType() {
//        return ICustomParticleRender.PARTICLE_SHEET_LIT;
//    }
//
//    @Override
//    public void tick() {
//        this.prevPosX = this.posX;
//        this.prevPosY = this.posY;
//        this.prevPosZ = this.posZ;
//        if (this.age++ <= this.maxAge) {
//            this.motionX += this.rand.nextFloat() / 5000.0F * (float)(this.rand.nextBoolean() ? 1 : -1);
//            this.motionZ += this.rand.nextFloat() / 5000.0F * (float)(this.rand.nextBoolean() ? 1 : -1);
//            this.motionY -= this.rand.nextFloat() / 5000.0F;
//            this.move(this.motionX, this.motionY, this.motionZ);
//            if (this.fakeAge++ <= this.fakeMaxAge) {
//                this.age = 0;
//                this.fakeAge++;
//            } else {
//                this.selectSpriteWithAge(spriteSet);
//            }
//        } else {
//            this.setExpired();
//        }
//    }
//
//    @Override
//    public int getBrightnessForRender(float partialTick) {
//        float f = 1.0F;
//        f = MathHelper.clamp(f, 0.0F, 1.0F);
//        int i = super.getBrightnessForRender(partialTick);
//        int j = i & 255;
//        int k = i >> 16 & 255;
//        j += (int)(f * 15.0F * 16.0F);
//        if (j > 240) {
//            j = 240;
//        }
//
//        return j | k << 16;
//    }
//
//    @OnlyIn(Dist.CLIENT)
//    public static class Factory implements IParticleFactory<BasicParticleType> {
//        private final IAnimatedSprite spriteSet;
//
//        public Factory(IAnimatedSprite sprite) {
//            this.spriteSet = sprite;
//        }
//
//        @Override
//        public Particle makeParticle(BasicParticleType typeIn, ClientWorld world, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
//            return new GlitterParticle(world, x, y, z, xSpeed, ySpeed, zSpeed, this.spriteSet);
//        }
//    }
//
//}
