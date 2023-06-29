package com.jz.forge.design.责任链.abs;


import com.jz.forge.design.责任链.inter.OrderContext;

/**
 * @author james
 * @version 1.0
 * @date 2023/6/26 16:52
 */
public class Main {

    public static void main(String[] args) {
        OrderHandleManager orderHandleManager = new OrderHandleManager();
        orderHandleManager.init(new RepeatCheck("orderRepeatCheck"),new RepeatCheck("claimRepeatCheck"),new EmailCheck("emailCheck"),new ExpireCheck("expireCheck"));
        orderHandleManager.execute(new OrderContext());
    }
}
