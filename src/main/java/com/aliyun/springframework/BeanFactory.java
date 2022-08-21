package com.aliyun.springframework;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author davis you
 * @Date 2022/8/21 3:40 PM
 * @Version 1.0
 */

public class BeanFactory {

    private ConcurrentHashMap<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    public Object getBean(String name){
        return beanDefinitionMap.get(name);
    }

    public void registerBeanDefinition(String name, BeanDefinition beanDefinition){
        beanDefinitionMap.put(name, beanDefinition);
    }
}
