package com.yangli.design_pattern.proxy.dynamicproxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxyFactory implements MethodInterceptor {

    private Object target;

    public CglibProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {

        //1.0工具类
        Enhancer en = new Enhancer();

        //2.0设置父类
        en.setSuperclass(target.getClass());

        //3.0设置回调函数
        en.setCallback(this);

        //4.0创建子类(代理对象)
        return en.create();

    }


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        System.out.println("开始事务。。。。");
        //执行目标对象的方法
        Object returnValue = method.invoke(target, objects);

        //提交事务
        System.out.println("提交事务");

        return returnValue;
    }
}
