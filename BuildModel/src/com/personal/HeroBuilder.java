package com.personal;

/**
 * Created by mac on 09/07/2017.
 */
public class HeroBuilder extends ActorBuilder {

    @Override
    public void buildType() {
        actor.setType("hero");
    }

    @Override
    public void buildSex() {
        actor.setSex("male");
    }

    @Override
    public void buildFace() {
        actor.setFace("handsome");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("armor");
    }

    @Override
    public void buildHairstyle() {
        actor.setHairstyle("elegant");
    }
}
