package com.practice.second;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by new on 30-12-2018.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:spring-config-second.xml")
public class SecondModuleIntegrationTest {
    @Autowired
    BeanC beanC;
    @Test
    public void testBeanCreation(){
        System.out.println(" Bean C created or not "+beanC);
    }
}

