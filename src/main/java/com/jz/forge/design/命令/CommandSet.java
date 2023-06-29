package com.jz.forge.design.命令;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author james
 * @version 1.0
 * @date 2023/6/29 10:36
 */
@Configuration
public class CommandSet{
    Map<String,Command> commandMap = new LinkedHashMap<>();


    public CommandSet(){
        commandMap.put("prd",new PRD());
        commandMap.put("coding",  new Coding());
        commandMap.put("design",new Design());
        commandMap.put("test",new Test());
        commandMap.put("online",new Online());
    }

}
