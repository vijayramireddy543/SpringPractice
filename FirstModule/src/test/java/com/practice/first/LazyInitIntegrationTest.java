package com.practice.first;

import com.practice.second.BeanC;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by new on 01-01-2019.
 */
@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations ="classpath:spring-test.xml", loader = TestSmartContextLoader.class)
@ContextConfiguration(loader = TestSmartContextLoader.class)
public class LazyInitIntegrationTest {

    @Autowired
    BeanA beanA;
    @Autowired
    BeanC beanC;

    @Test
    public void testBeanCreationInFirstModule() {
        System.out.println(" Bean A created or not " + beanA);
    }
}
