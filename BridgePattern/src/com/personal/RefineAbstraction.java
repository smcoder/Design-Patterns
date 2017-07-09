package com.personal;

/**
 * Created by mac on 09/07/2017.
 */
public class RefineAbstraction extends Abstraction {
    @Override
    public void operation() {
        // business code
        impl.operationImpl(); // call the implementation class method
        // business code
    }
}
