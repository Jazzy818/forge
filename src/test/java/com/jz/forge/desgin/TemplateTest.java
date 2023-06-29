package com.jz.forge.desgin;

import com.jz.forge.design.模板.WeekDay;
import com.jz.forge.design.模板.Weekend;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author james
 * @version 1.0
 * @date 2023/6/27 16:07
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class TemplateTest {

    @Autowired
    WeekDay weekDay;
    @Autowired
    Weekend weekend;
    @Test
    public void test(){
        weekend.dailyRountine();
        weekDay.dailyRountine();
    }
}
