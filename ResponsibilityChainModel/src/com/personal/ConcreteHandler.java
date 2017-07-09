package com.personal;

/**
 * Created by mac on 07/07/2017.
 * @TODO 具体处理者角色
 */
public class ConcreteHandler extends Handler {

    /**
     * 处理方法，调用此方法处理请求
     * */
    @Override
    public void handlerRequest() {
        /**
         * 判断是否有后继的责任对象，如果有，就转发请求给后继的责任对象
         * 如果没有，则处理请求
         * */
        if (getSuccessor() != null) {
            System.out.println("放过请求!");
            getSuccessor().handlerRequest();
        } else {
            System.out.println("处理请求");
        }
    }

    @Override
    public String handleFeeRequest(String user, double fee) {
        return null;
    }
}
