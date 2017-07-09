package com.personal;

/**
 * Created by mac on 09/07/2017.
 */
public class AngelBuilder extends ActorBuilder {
    @Override
    public void buildType() {
        actor.setType("angel");
    }

    @Override
    public void buildSex() {
        actor.setSex("female");
    }

    @Override
    public void buildFace() {
        actor.setFace("handsome");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("white skirt");
    }

    @Override
    public void buildHairstyle() {
        actor.setHairstyle("shawl long hair");
    }
}
