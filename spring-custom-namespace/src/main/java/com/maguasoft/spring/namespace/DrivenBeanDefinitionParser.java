package com.maguasoft.spring.namespace;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.beans.factory.xml.BeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

public class DrivenBeanDefinitionParser implements BeanDefinitionParser {

    public BeanDefinition parse(Element element, ParserContext parserContext) {
        RootBeanDefinition beanDefinition = new RootBeanDefinition();
        beanDefinition.setBeanClass(MaguaAnnotationBeanPostProcessor.class);
        parserContext.getRegistry().registerBeanDefinition("maguaAnnotationBeanPostProcessor", beanDefinition);

        return beanDefinition;
    }
}