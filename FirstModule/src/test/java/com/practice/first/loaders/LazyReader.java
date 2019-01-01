package com.practice.first.loaders;

import org.springframework.beans.factory.xml.BeanDefinitionParserDelegate;
import org.springframework.beans.factory.xml.DefaultBeanDefinitionDocumentReader;
import org.springframework.beans.factory.xml.XmlReaderContext;
import org.w3c.dom.Element;

/**
 * Created by new on 01-01-2019.
 */
public class LazyReader extends DefaultBeanDefinitionDocumentReader {
    @Override
    protected BeanDefinitionParserDelegate createDelegate(XmlReaderContext readerContext, Element root, BeanDefinitionParserDelegate parentDelegate) {
        root.setAttribute("default-lazy-init","true");
        return super.createDelegate(readerContext, root, parentDelegate);
    }

}
