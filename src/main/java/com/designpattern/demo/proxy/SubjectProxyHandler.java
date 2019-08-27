package com.designpattern.demo.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class SubjectProxyHandler implements InvocationHandler {

    private Object target;

    @SuppressWarnings("rawtypes")
    public SubjectProxyHandler(Class clazz) {
        try {
            this.target = clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        preAction();
        Object result = method.invoke(target, args);
        System.out.println("执行代码");
        postAction();
        return result;
    }


    private void preAction() {
        System.out.println("前置代码");
    }

    private void postAction() {
        System.out.println("后置代码");
    }
}
