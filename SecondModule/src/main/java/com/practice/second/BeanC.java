package com.practice.second;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by new on 30-12-2018.
 */
@Component
public class BeanC {
    public BeanC() {
        System.out.println("Bean C constructor ");
    }
}
