package com.jz.forge.design.模板;

import cn.hutool.extra.spring.SpringUtil;

/**
 * @author james
 * @version 1.0
 * @date 2023/6/27 16:01
 */
public abstract class AbstractTemplate implements Mytemplate {

    private Mytemplate mytemplate;

    public AbstractTemplate(){
        this.mytemplate = SpringUtil.getBean(Mytemplate.class);
    }

    public void dailyRountine(){
        System.out.println("起床");
        System.out.println("洗漱");
        System.out.println("吃早餐");
        mytemplate.work();
        mytemplate.offWork();
        mytemplate.traffic();
    }


}
