package com.yangli.design_pattern.proxy.dynamicproxy;

import com.yangli.design_pattern.proxy.ISubject;
import com.yangli.design_pattern.proxy.TargetSubject;

import java.lang.reflect.Proxy;

public class JDKTest {


    public static void main(String[] args) {

        //目标对象
        ISubject subject = new TargetSubject();

        System.out.println("目标对象类:" + subject.getClass());
//        //给目标对象，创建代理对象
//        ISubject proxy = (ISubject) new ProxyFactory(subject).getProxyInstance();

        ISubject subject1 = (ISubject) Proxy.newProxyInstance(subject.getClass().getClassLoader(),subject.getClass().getInterfaces(),new WorkInvocationHandler());

//        System.out.println("代理对象类:" + proxy.getClass());
//        proxy.action();

        subject1.action();
    }
}
