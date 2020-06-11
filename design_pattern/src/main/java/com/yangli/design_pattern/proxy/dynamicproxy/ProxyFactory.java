package com.yangli.design_pattern.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 创建动态代理对象
 * 动态代理不需要实现接口，但是需要指定接口类型
 */
public class ProxyFactory {


    //维护一个目标对象
    private Object target;


    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {

        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //1.0执行方法前操作
                        System.out.println("我是行动前");
                        Object res = method.invoke(target, args);
                        //2.0执行方法后操作
                        System.out.println("我是行动后");
                        return res;
                    }
                });
    }
}
