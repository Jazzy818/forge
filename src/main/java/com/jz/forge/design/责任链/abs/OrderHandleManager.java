package com.jz.forge.design.责任链.abs;

import com.jz.forge.design.责任链.inter.OrderContext;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * @author james
 * @version 1.0
 * @date 2023/6/26 17:04
 */
@Component
public class OrderHandleManager implements ApplicationContextAware {

    @Autowired
    private List<AbstractOrderHandler> orderHandlerList = new ArrayList<>();

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        Map<String,AbstractOrderHandler> map = applicationContext.getBeansOfType(AbstractOrderHandler.class);
        for(Map.Entry<String,AbstractOrderHandler> orderHandlerMap:map.entrySet()){
            orderHandlerList.add(orderHandlerMap.getValue());
        }
    }
    public void init(AbstractOrderHandler...orderHandlers){
        orderHandlerList.addAll(Arrays.asList(orderHandlers));
    }
    public OrderContext execute(OrderContext context){
        for (AbstractOrderHandler orderHandler : orderHandlerList) {
            context = orderHandler.execute(context);
        }
        return context;
    }
}
