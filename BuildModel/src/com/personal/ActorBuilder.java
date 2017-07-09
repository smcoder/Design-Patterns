package com.personal;

/**
 * Created by mac on 09/07/2017.
 * actor builder: abstract builder
 */
public abstract class ActorBuilder {
    protected static Actor actor = new Actor();

    public abstract void buildType();
    public abstract void buildSex();
    public abstract void buildFace();
    public abstract void buildCostume();
    public abstract void buildHairstyle();

    // hook method
    public boolean isBareheaded() {
        return false;
    }

    // factory method, return a complete game actor object
    public Actor createActor() {
        return actor;
    }

    public static Actor construct(ActorBuilder ab) {
        ab.buildType();
        ab.buildSex();
        ab.buildHairstyle();
        ab.buildCostume();
        ab.buildFace();
        return actor;
    }

    /**
    public Actor construct() {
        this.buildFace();
        this.buildCostume();
        this.buildHairstyle();
        this.buildSex();
        this.buildType();
        return actor;
    }*/
}
