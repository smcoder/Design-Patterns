package com.personal;

/**
 * Created by mac on 09/07/2017.
 */
public class ActorController {
    // gradually build the responsible product object
    public Actor construct(ActorBuilder ab) {
        Actor actor;
        ab.buildType();
        ab.buildSex();
        ab.buildFace();
        ab.buildCostume();
        if (!ab.isBareheaded()) {
            ab.buildHairstyle();
        }
        actor = ab.createActor();
        return actor;
    }
}
