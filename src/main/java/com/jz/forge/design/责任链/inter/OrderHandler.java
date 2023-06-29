package com.jz.forge.design.责任链.inter;

/**
 * @author james
 * @version 1.0
 * @date 2023/6/26 15:47
 */
public interface OrderHandler {

    public String getId();
    public void setId(String id);
    public OrderContext handle(OrderContext context);
}
