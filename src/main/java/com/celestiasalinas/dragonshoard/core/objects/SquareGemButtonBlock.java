package com.celestiasalinas.dragonshoard.core.objects;

import com.celestiasalinas.dragonshoard.util.AbstractGemButtonBlock;
import com.celestiasalinas.dragonshoard.util.SquareAbstractGemButtonBlock;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

public class SquareGemButtonBlock extends SquareAbstractGemButtonBlock {

    public SquareGemButtonBlock(Properties p_i48315_1_) {
        super(false, p_i48315_1_);
    }

    protected SoundEvent getSound(boolean p_196369_1_) {
        return p_196369_1_ ? SoundEvents.STONE_BUTTON_CLICK_ON : SoundEvents.STONE_BUTTON_CLICK_OFF;
    }
}
