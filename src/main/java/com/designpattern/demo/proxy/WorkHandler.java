package com.designpattern.demo.proxy;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

@Slf4j
public class WorkHandler implements InvocationHandler {

    private Object target;

    public WorkHandler(Class clazz) {
        try {
            this.target = clazz.newInstance();
        }catch (Exception e){

        }
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //相关方法增强操作
        log.info("动态代理前置操作");
        log.info("动态代理类:{}",proxy.getClass().getName());
        log.info("当前类:{}",this.getClass().getName());
        log.info("方法名称:{}",method.getName());
        return method.invoke(this.target,args);
    }
}
