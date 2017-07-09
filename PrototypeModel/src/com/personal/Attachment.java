package com.personal;

import java.io.Serializable;

/**
 * Created by mac on 09/07/2017.
 */
public class Attachment implements Serializable {
    private String name; // attachment name

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void download() {
        System.out.println("download attachment, filename is:" + name);
    }

}
