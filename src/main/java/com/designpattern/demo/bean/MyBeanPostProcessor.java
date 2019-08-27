package com.designpattern.demo.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MyBeanPostProcessor implements BeanPostProcessor {

    public MyBeanPostProcessor() {
        super();
        System.out.println("[MyBeanPostProcessor] constructor.");
    }

    /**
     * Bean 实例化之前进行的处理
     */
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("[MyBeanPostProcessor] postProcessBeforeInitialization: " + bean.getClass() + ": " + beanName);
        return bean;
    }

    /**
     * Bean 实例化之后进行的处理
     */
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("[MyBeanPostProcessor] postProcessAfterInitialization: " + bean.getClass() + ": " + beanName);
        return bean;
    }
}
