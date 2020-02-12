package com.designpattern.demo.bean;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
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
      // ApplicationContext applicationContext = new AnnotationConfigApplicationContext(HelloFactoryBean.class);
       // HelloFactoryBean helloFactoryBean = applicationContext.getBean(HelloFactoryBean.class);
//        helloFactoryBean.getObject().getName();
//        System.out.println("helloFactory -> " + applicationContext.getBean("helloFactoryBean"));
//        System.out.println("&helloFactory -> " + applicationContext.getBean("&helloFactoryBean"));
//       applicationContext.getBean("&helloFactoryBean");
        try {
            //log.info("bean值:{}",helloFactoryBean.getObject().getName());
            System.out.println("我的朋友是呆逼");

        }catch (Exception e){

        }
        //log.info("我要测试啊:{}",2343);
    }
}
