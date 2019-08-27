package com.designpattern.demo.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * 工厂级接口（此接口可用于重写或添加bean的属性值，甚至可以立即初始化Bean）
 *
 * BeanFactoryPostProcessor可以对bean的定义（配置元数据）进行处理。
 * 也就是说，Spring IoC容器允许BeanFactoryPostProcessor
 * 在容器实际实例化任何其它的bean之前读取配置元数据，并有可能修改它。
 * 如果你愿意，你可以配置多个BeanFactoryPostProcessor。
 * 你还能通过设置'order'属性来控制BeanFactoryPostProcessor的执行次序。
 */
@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    public MyBeanFactoryPostProcessor() {
        super();
        System.out.println("这是BeanFactoryPostProcessor实现类构造器！！");
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory arg0)
            throws BeansException {
        System.out
                .println("BeanFactoryPostProcessor调用postProcessBeanFactory方法");
        BeanDefinition bd = arg0.getBeanDefinition("person");
        // 重写Person Bean的phone属性
        bd.getPropertyValues().addPropertyValue("phone", "110");
    }

}
