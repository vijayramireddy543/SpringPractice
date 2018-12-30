package com.practice.first;

import com.practice.second.BeanC;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by new on 30-12-2018.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:spring-test.xml")
public class FirstModuleIntegrationTest {

    @Autowired
    BeanA beanA;
    @Autowired
    BeanC beanC;

    @Test
    public void testBeanCreationInFirstModule() {
        System.out.println(" Bean A created or not " + beanA);
    }
}
