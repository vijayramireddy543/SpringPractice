package com.practice.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by new on 30-12-2018.
 */
@Component
public class BeanA {

    //@Autowired
    BeanB beanB;

    @Value("${app.message}")
    String message;

    public BeanA() {
        System.out.println("Bean A constructor");
    }
}
