package com.designpattern.demo.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class JdkProxyTest {

    public static void main(String[] args) {
        ISubject subject =  new Subject();
        InvocationHandler handler = new SubjectProxyHandler(subject.getClass());
        ISubject proxy =
                (ISubject) Proxy.newProxyInstance(subject.getClass().getClassLoader(),
                        subject.getClass().getInterfaces(), handler);
        proxy.action();
        System.out.println("--------------------");
        proxy.action1();
        System.out.println("--------------------");
        proxy.action2();
        System.out.println("--------------------");
        proxy.action3();
    }
}
