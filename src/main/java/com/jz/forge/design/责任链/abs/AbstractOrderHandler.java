package com.jz.forge.design.责任链.abs;

import com.jz.forge.design.责任链.inter.OrderContext;

/**
 * @author james
 * @version 1.0
 * @date 2023/6/26 16:52
 */
public abstract class AbstractOrderHandler {


    public OrderContext execute(OrderContext context){
        context = handle(context);
        return context;
    }

    public abstract OrderContext handle(OrderContext context);




}
