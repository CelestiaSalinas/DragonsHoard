package com.celestiasalinas.dragonshoard.util;

import java.io.IOException;
import java.util.UUID;

import com.celestiasalinas.dragonshoard.core.objects.BannersEntity;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.entity.item.PaintingEntity;
import net.minecraft.entity.item.PaintingType;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.server.SSpawnPaintingPacket;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class SSpawnBannerPacket extends SSpawnPaintingPacket implements IPacket<IClientPlayNetHandler> {
    private int id;
    private UUID uuid;
    private BlockPos pos;
    private Direction direction;
    private int banner;

    public SSpawnBannerPacket() {
    }

    public SSpawnBannerPacket(BannersEntity p_i46972_1_) {
        this.id = p_i46972_1_.getId();
        this.uuid = p_i46972_1_.getUUID();
        this.pos = p_i46972_1_.getPos();
        this.direction = p_i46972_1_.getDirection();
        this.banner = Registry.MOTIVE.getId(p_i46972_1_.banner);
    }

    public void read(PacketBuffer p_148837_1_) throws IOException {
        this.id = p_148837_1_.readVarInt();
        this.uuid = p_148837_1_.readUUID();
        this.banner = p_148837_1_.readVarInt();
        this.pos = p_148837_1_.readBlockPos();
        this.direction = Direction.from2DDataValue(p_148837_1_.readUnsignedByte());
    }

    public void write(PacketBuffer p_148840_1_) throws IOException {
        p_148840_1_.writeVarInt(this.id);
        p_148840_1_.writeUUID(this.uuid);
        p_148840_1_.writeVarInt(this.banner);
        p_148840_1_.writeBlockPos(this.pos);
        p_148840_1_.writeByte(this.direction.get2DDataValue());
    }

    public void handle(IClientPlayNetHandler p_148833_1_) {
        p_148833_1_.handleAddPainting(this);
    }

    @Override
    public boolean isSkippable() {
        return IPacket.super.isSkippable();
    }

    @OnlyIn(Dist.CLIENT)
    public int getId() {
        return this.id;
    }

    @OnlyIn(Dist.CLIENT)
    public UUID getUUID() {
        return this.uuid;
    }

    @OnlyIn(Dist.CLIENT)
    public BlockPos getPos() {
        return this.pos;
    }

    @OnlyIn(Dist.CLIENT)
    public Direction getDirection() {
        return this.direction;
    }

    @OnlyIn(Dist.CLIENT)
    public PaintingType getMotive() {
        return Registry.MOTIVE.byId(this.banner);
    }
}