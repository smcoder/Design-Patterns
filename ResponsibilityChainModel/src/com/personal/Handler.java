package com.personal;

/**
 * Created by mac on 07/07/2017.
 *
 */
public abstract class Handler {
    /**
     * 持有后继的责任对象
     * */
    protected Handler successor = null;

    /**
     * 示意处理请求方法的方法，虽然这个示意方法是没有传入参数的
     * 但实际是可以传入参数的，根据具体需要来选择是否传递参数
     * */
    public abstract void handlerRequest();

    /**
     * 取值方法
     * */
    public Handler getSuccessor() {
        return successor;
    }

    /**
     * 赋值方法，设置后继的责任对象
     * */
    public void setSuccessor(Handler handler) {
        this.successor = successor;
    }

    /**
     * 处理聚餐费用的申请
     *
     * @param user 申请人
     * @param fee 申请的钱数
     * @return 成功或失败的具体通知
     * */
    public abstract String handleFeeRequest(String user, double fee);
}
