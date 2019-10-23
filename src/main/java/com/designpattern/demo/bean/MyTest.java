package com.designpattern.demo.bean;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

//   @Test
//    public void testFactoryBean() {
//        String configLocation = "application-factory-bean.xml";
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(configLocation);
//        System.out.println("helloFactory -> " + applicationContext.getBean("helloFactory"));
//        System.out.println("&helloFactory -> " + applicationContext.getBean("&helloFactory"));
//    }

    public static void main(String[] args) {
//        String configLocation = "application-factory-bean.xml";
       ApplicationContext applicationContext = new AnnotationConfigApplicationContext(HelloFactoryBean.class);
//        System.out.println("helloFactory -> " + applicationContext.getBean("helloFactoryBean"));
//        System.out.println("&helloFactory -> " + applicationContext.getBean("&helloFactoryBean"));
       applicationContext.getBean("springApplicationArguments");

    }
}
