package com.personal;

/**
 * Created by mac on 09/07/2017.
 */
public class Client {
    public static void main(String[] args) {
        Image image = new JPGImage();
        ImageImp imp = new UnixImp();

        image.setImp(imp);
        image.parseFile("little dragon girl");
    }
}
