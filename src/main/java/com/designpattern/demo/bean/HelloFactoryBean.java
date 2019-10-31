package com.designpattern.demo.bean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class HelloFactoryBean implements FactoryBean<Person> {

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

    @Override
    public boolean isSingleton() {
        return true;
//        return false;
    }
}
