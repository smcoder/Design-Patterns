package com.personal;

/**
 * Created by mac on 09/07/2017.
 */
public class LinuxImp implements ImageImp {

    @Override
    public void doPaint(Matrix m) {
        System.out.println("display the image in linux operating system");
    }
}
