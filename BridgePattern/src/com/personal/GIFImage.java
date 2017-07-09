package com.personal;

/**
 * Created by mac on 09/07/2017.
 */
public class GIFImage extends Image {

    @Override
    public void parseFile(String fileName) {
        Matrix m = new Matrix();
        imp.doPaint(m);
        System.out.println(fileName + ", the type is GIF");
    }
}
