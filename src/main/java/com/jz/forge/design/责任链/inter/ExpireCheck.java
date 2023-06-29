package com.jz.forge.design.责任链.inter;

import org.springframework.stereotype.Component;

/**
 * @author james
 * @version 1.0
 * @date 2023/6/26 16:03
 */
@Component
public class ExpireCheck implements OrderHandler{

    private String id;
    public ExpireCheck(String id){
        this.id = id;
    }
    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }


    @Override
    public OrderContext handle(OrderContext context) {
        System.out.println("检查订单是否过期");
        return context;
    }
}
