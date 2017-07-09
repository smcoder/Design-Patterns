package com.personal;

/**
 * Created by mac on 09/07/2017.
 */
public abstract class Abstraction {
    // defined the implementation class interface object
    protected Implementor impl;

    public void setImpl(Implementor impl) {
        this.impl = impl;
    }

    // declare abstract business method
    public abstract void operation();
}
