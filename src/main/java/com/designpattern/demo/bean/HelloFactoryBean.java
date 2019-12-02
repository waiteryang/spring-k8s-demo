package com.designpattern.demo.bean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class HelloFactoryBean implements FactoryBean<Person> {

    //返回对象,这个对象会自动添加到容器中
    @Override
    public Person getObject() throws Exception {
        Person person = new Person();
        person.setBeanName("sdfd");
        person.setName("你想干啥啊啊");
        return person;
//        return null;
    }

    @Override
    public Class<?> getObjectType() {
        return Person.class;
//        return null;
    }

    /**
     * 是否单例
     * true:这个bean是单例，在容器中保存一份
     * false:多实例,每次获取都会创建一个新的Bean
     */
    @Override
    public boolean isSingleton() {
        return true;
//        return false;
    }
}
