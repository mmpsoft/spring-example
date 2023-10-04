package com.maguasoft.spring.namespace;


import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class MaguaAnnotationNamespaceHandler extends NamespaceHandlerSupport {

    public void init() {
        this.registerBeanDefinitionParser("property-placeholder", new DrivenBeanDefinitionParser());
    }
}
