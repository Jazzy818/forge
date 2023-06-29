package com.jz.forge.design.责任链.abs;

import com.jz.forge.design.责任链.inter.OrderContext;
import org.springframework.stereotype.Component;

/**
 *
 * @author james
 * @version 1.0
 * @date 2023/6/26 16:02
 */
@Component
public class EmailCheck extends AbstractOrderHandler{

    private String id;

    public EmailCheck(String id){
        this.id = id;
    }


    @Override
    public OrderContext handle(OrderContext context) {
        System.out.println("email 格式是否正确");
        return context;
    }
}
