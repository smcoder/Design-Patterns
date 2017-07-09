package com.personal;

/**
 * Created by mac on 07/07/2017.
 */
public class ProjectHandler extends Handler {

    @Override
    public void handlerRequest() {

    }

    @Override
    public String handleFeeRequest(String user, double fee) {
        String str = "";

        // 项目经历权限比较小，只能在500 以内
        if (fee < 500) {
            if ("zhangsan".equals(user)) {
                str = "success:[" + user + " project manager agree the fee: " + fee + "]";
            } else {
                str = "failure:[" + user + " project manager disagree the fee:" + fee + "]";
            }
        } else {
            // 超过500，继续传递给级别更高的人处理
            if (getSuccessor() != null) {
                getSuccessor().handleFeeRequest(user, fee);
            }
        }

        return str;
    }
}
