package com.designpattern.demo.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class JdkProxyTest {

    public static void main(String[] args) {
        ISubject subject =  new Subject();
        InvocationHandler handler = new SubjectProxyHandler(subject.getClass());
//        newProxyInstance，方法有三个参数：
//
//        loader: 用哪个类加载器去加载代理对象
//
//        interfaces:动态代理类需要实现的接口
//
//        h:动态代理方法在执行时，会调用h里面的invoke方法去执行
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
