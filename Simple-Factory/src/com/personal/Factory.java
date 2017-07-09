package com.personal;

/**
 * Created by mac on 08/07/2017.
 */
public class Factory {

    // 静态工厂方法
    public static Product getProduct(String arg) {
        Product product = null;
        if (arg.equalsIgnoreCase("A")) {
//            product = new ConcreteProductA();
        } else if (arg.equalsIgnoreCase("B")) {
//            product = new ConcreteProductB();
        }

        return product;
    }
}
