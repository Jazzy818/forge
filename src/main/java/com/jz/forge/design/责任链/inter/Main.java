package com.jz.forge.design.责任链.inter;

/**
 * 责任链接口版
 * @author james
 * @version 1.0
 * @date 2023/6/26 16:23
 */
public class Main {

    public static void main(String[] args) {

        OrderContext context = new OrderContext();
        OrderHandlerManager manager = new OrderHandlerManager();
        manager.register(
                new RepeatCheck("orderRepeatCheck"),new RepeatCheck("claimRepeatCheck"),new EmailCheck("emailCheck"),new ExpireCheck("expireCheck")
        );
        manager.execute(context);
    }
}
