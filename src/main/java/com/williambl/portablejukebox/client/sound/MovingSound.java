package com.williambl.portablejukebox.client.sound;

import net.minecraft.client.audio.TickableSound;
import net.minecraft.entity.Entity;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;

public class MovingSound extends TickableSound {

    private final Entity entity;
    private float distance = 0.0F;

    public MovingSound(Entity entityIn, SoundEvent soundIn) {
        super(soundIn, SoundCategory.NEUTRAL);
        this.entity = entityIn;
        this.repeat = false;
        this.repeatDelay = 0;
        this.volume = 1.0F;
    }

    public void tick() {
        if (!this.entity.isAlive()) {
            this.finishPlaying();
        } else {
            this.x = (float) this.entity.getPosX();
            this.y = (float) this.entity.getPosY();
            this.z = (float) this.entity.getPosZ();
        }
    }
}
