package com.yangli.design_pattern.proxy.dynamicproxy;

import com.yangli.design_pattern.proxy.ISubject;
import com.yangli.design_pattern.proxy.TargetSubject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKTest {


    public static void main(String[] args) {


        ISubject subject = new TargetSubject();

        Proxy.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                System.out.println("我是代理测试啊啊");
                return method.invoke(args);
            }
        });

        subject.action();
    }


}
