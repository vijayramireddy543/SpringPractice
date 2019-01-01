package com.practice.first.loaders;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by new on 01-01-2019.
 */
public class LazyApplicationContext extends ClassPathXmlApplicationContext {

    public LazyApplicationContext(String path) throws BeansException {
        super(path);
    }

    @Override
    protected void initBeanDefinitionReader(XmlBeanDefinitionReader reader) {
        super.initBeanDefinitionReader(reader);
        reader.setDocumentReaderClass(LazyReader.class);
    }
}
