package com.jz.forge.design.命令;

/**
 * @author james
 * @version 1.0
 * @date 2023/6/29 10:38
 */
public class PRD implements Command{
    TeamWork teamWork = new TeamWorker();
    @Override
    public void execute() {
        //do something
        System.out.println("需求评审完成");
    }
}
