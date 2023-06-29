package com.jz.forge.design.命令;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * PM 发布软件开发流程命令
 * 需求
 * 设计
 * 开发
 * 测试
 * 上线
 * @author james
 * @version 1.0
 * @date 2023/6/29 10:02
 */
public class Invoker {

    private CommandSet commandset =new CommandSet();

    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        invoker.invoke("prd");
        invoker.invoke("coding");
        invoker.invoke("design");
        invoker.invoke("test");
        invoker.invoke("online");
    }

    public void invoke(String commandName){
        commandset.commandMap.get(commandName)
                .execute();
    }
}
