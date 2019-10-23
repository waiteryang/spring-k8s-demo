package com.designpattern.demo.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSourceResolvable;
import org.springframework.context.NoSuchMessageException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.ResolvableType;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BeanLifeCycle {


    public static void main(String[] args) {

        System.out.println("现在开始初始化容器");
        AnnotationConfigApplicationContext annotationConfigApplicationContext
                = new AnnotationConfigApplicationContext(Person.class);
//        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MyBeanPostProcessor.class);

        annotationConfigApplicationContext.getBeanFactory().registerSingleton("xx","sfs");

        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        annotationConfigApplicationContext.addBeanFactoryPostProcessor(new MyBeanFactoryPostProcessor());

//        beanFactory.addBeanPostProcessor(new MyBeanFactoryPostProcessor());
//        beanFactory.addBeanPostProcessor(new MyBeanPostProcessor());
//        System.out.println("容器初始化成功");
//        //得到Preson，并使用
//        Person person = annotationConfigApplicationContext.getBean("person",Person.class);
//        System.out.println("获取得到bean对象:"+person);
//        System.out.println("现在开始关闭容器！");
//        //确保正常关闭,并且调用相关的destroy方法
//        annotationConfigApplicationContext.registerShutdownHook();


//        BlockingQueue blockingQueue = new ArrayBlockingQueue(12);
//        ExecutorService executorService = new ThreadPoolExecutor(1,31,33, TimeUnit.MINUTES,blockingQueue,
//                                               Executors.defaultThreadFactory());



        Lock lock = new ReentrantLock();

    }
}
