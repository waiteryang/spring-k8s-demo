package com.yangli.design_pattern.proxy.dynamicproxy;

import org.springframework.cglib.proxy.Enhancer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author yangli
 * <p>
 * 代理实现类
 */
public class WorkInvocationHandler implements InvocationHandler {


    /**
     * @param proxy  代理对象
     * @param method 方法
     * @param args   参数
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("我是代理前事件处理");
        Object object = method.invoke(args);
        System.out.println("我是代理后事件处理");


        Enhancer enhancer = new Enhancer();
        //设置父类
        //enhancer.setSuperclass();
        //设置回调函数
        //enhancer.setCallback();

        //创建子类(代理对象)
        //enhancer.create();

        return object;
    }

}
