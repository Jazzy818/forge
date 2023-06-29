package com.jz.forge.design.命令;

/**
 * @author james
 * @version 1.0
 * @date 2023/6/29 10:39
 */
public class Coding implements Command{
    @Override
    public void execute() {
        //do something
        System.out.println("开发完成");
    }

}
