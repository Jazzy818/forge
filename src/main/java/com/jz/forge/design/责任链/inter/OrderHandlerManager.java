package com.jz.forge.design.责任链.inter;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author james
 * @version 1.0
 * @date 2023/6/26 16:04
 */
@Component
public class OrderHandlerManager implements ApplicationContextAware {
    public static Map<String,OrderHandler> chain = new LinkedHashMap<>();
    public void register(OrderHandler...orderHandlers){
        for (OrderHandler orderHandler:orderHandlers){
            if(!chain.containsKey(orderHandler.getId())){
                chain.put(orderHandler.getId(),orderHandler);
            }
        }
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        Map<String, OrderHandler> map = applicationContext.getBeansOfType(OrderHandler.class);
        for (Map.Entry<String, OrderHandler> entry : map.entrySet()) {
            if(!chain.containsKey(entry.getKey())){
                chain.put(entry.getKey(),entry.getValue());
            }
        }
    }

    public OrderContext execute(OrderContext orderContext){
        for (Map.Entry<String, OrderHandler> entry : chain.entrySet()) {
            OrderHandler y = entry.getValue();
            orderContext = y.handle(orderContext);
        }
        return orderContext;
    }
}
