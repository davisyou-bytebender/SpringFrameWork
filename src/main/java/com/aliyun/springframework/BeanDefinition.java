package com.aliyun.springframework;

/**
 * @Author davis you
 * @Date 2022/8/21 3:39 PM
 * @Version 1.0
 */
public class BeanDefinition {
    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }
}
