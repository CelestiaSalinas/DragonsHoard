package com.celestiasalinas.dragonshoard.core.registry.blocks;


import com.celestiasalinas.dragonshoard.core.DragonsHoard;
import net.minecraft.entity.item.PaintingType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class DHBanners {
    public static final DeferredRegister<PaintingType> PAINTINGS = DeferredRegister.create(ForgeRegistries.PAINTING_TYPES, DragonsHoard.MOD_ID);


    public static final RegistryObject<PaintingType> ALECTRONA = PAINTINGS.register("january", () -> new PaintingType(48,128));
    public static final RegistryObject<PaintingType> ASTERIA = PAINTINGS.register("february", () -> new PaintingType(48,128));
    public static final RegistryObject<PaintingType> CAMELLIUS = PAINTINGS.register("march", () -> new PaintingType(48,128));
    public static final RegistryObject<PaintingType> ASCELIA = PAINTINGS.register("april", () -> new PaintingType(48,128));
    public static final RegistryObject<PaintingType> SHENRYU = PAINTINGS.register("may", () -> new PaintingType(48,128));
    public static final RegistryObject<PaintingType> MIRA = PAINTINGS.register("june", () -> new PaintingType(48,128));
    public static final RegistryObject<PaintingType> AURELIUS = PAINTINGS.register("july", () -> new PaintingType(48,128));
    public static final RegistryObject<PaintingType> LEVIATHAN = PAINTINGS.register("august", () -> new PaintingType(48,128));
    public static final RegistryObject<PaintingType> MAURE = PAINTINGS.register("september", () -> new PaintingType(48,128));
    public static final RegistryObject<PaintingType> NEHSK = PAINTINGS.register("october", () -> new PaintingType(48,128));
    public static final RegistryObject<PaintingType> ATLAS = PAINTINGS.register("november", () -> new PaintingType(48,128));
    public static final RegistryObject<PaintingType> FOMALHAUT = PAINTINGS.register("december", () -> new PaintingType(48,128));



}
