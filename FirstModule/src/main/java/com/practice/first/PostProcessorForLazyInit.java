package com.practice.first;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * Created by new on 30-12-2018.
 */
@Component
public class PostProcessorForLazyInit implements BeanFactoryPostProcessor {
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {

        System.out.println(" Bean Factory post processor ");
        for (String name : configurableListableBeanFactory.getBeanDefinitionNames()) {
            configurableListableBeanFactory.getBeanDefinition(name).setLazyInit(true);
        }
    }
}
