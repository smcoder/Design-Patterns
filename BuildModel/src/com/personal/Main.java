package com.personal;

/**
 * Created by mac on 09/07/2017.
 */
public class Main {
    public static void main(String[] args) {
        ActorBuilder ab = new AngelBuilder();

        ActorController ac = new ActorController();
        Actor actor;
        actor = ac.construct(ab);

        String type = actor.getType();
        System.out.println(type + " appearance :");
        System.out.println("sex :" + actor.getSex());
        System.out.println("face: " + actor.getFace());
        System.out.println("costume:" + actor.getCostume());
        System.out.println("hairStyle: " + actor.getHairstyle());
    }
}
