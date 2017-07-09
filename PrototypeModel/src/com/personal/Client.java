package com.personal;

import java.io.IOException;

/**
 * Created by mac on 09/07/2017.
 */
public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        DeepClone first, second = null;
        first = new DeepClone(); // create a prototype object
        Attachment attachment = new Attachment();
        first.setAttachment(attachment);

        second = first.deepClone();

        System.out.println(first == second);
        System.out.println(first.getAttachment() == second.getAttachment());
    }
}
