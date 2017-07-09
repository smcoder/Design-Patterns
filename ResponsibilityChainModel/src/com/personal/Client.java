package com.personal;

/**
 * Created by mac on 07/07/2017.
 */
public class Client {
    public static void main(String[] args) {
        // 组转责任链
        Handler handler = new ConcreteHandler();
        Handler handler1 = new ConcreteHandler();
        handler.setSuccessor(handler1);
        // 提交请求
        handler.handlerRequest();
    }
}
