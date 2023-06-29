package com.jz.forge.design.模板;

import org.springframework.stereotype.Component;

/**
 * @author james
 * @version 1.0
 * @date 2023/6/27 16:17
 */
@Component
public class Weekend  extends AbstractTemplate {
    @Override
    public void work() {
        System.out.println("休息");
    }

    @Override
    public void offWork() {
        System.out.println("休息");
    }

    @Override
    public void traffic() {
        System.out.println("休息");
    }


}
