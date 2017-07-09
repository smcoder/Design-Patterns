package com.personal;

/**
 * Created by mac on 09/07/2017.
 */
public class DevilBuilder extends ActorBuilder {

    @Override
    public void buildType() {
        actor.setType("Devil");
    }

    @Override
    public void buildSex() {
        actor.setSex("monster");
    }

    @Override
    public void buildFace() {
        actor.setFace("ugly");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("black");
    }

    @Override
    public void buildHairstyle() {
        actor.setHairstyle("bald head");
    }

    // Override hook method
    public boolean isBareheaded() {
        return true;
    }
}
