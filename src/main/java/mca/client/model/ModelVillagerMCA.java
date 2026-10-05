package mca.client.model;

import mca.entity.EntityVillagerMCA;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;

public class ModelVillagerMCA extends ModelBiped {

    public ModelVillagerMCA() {
        super(0.0F, 0.0F, 64, 64);
        // Field initialization for breasts removed to prevent unused memory allocation
    }

    @Override
    public void render(Entity entity, float swing, float swingAmount, float age, float headYaw, float headPitch, float scale) {
        // Retains standard biped rendering (head, arms, legs, body) without chest extensions
        super.render(entity, swing, swingAmount, age, headYaw, headPitch, scale);
    }
}