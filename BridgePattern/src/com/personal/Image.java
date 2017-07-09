package com.personal;

/**
 * Created by mac on 09/07/2017.
 */
public abstract class Image {

    protected  ImageImp imp;

    public void setImp(ImageImp imp) {
        this.imp = imp;
    }

    public abstract void parseFile(String fileName);
}
