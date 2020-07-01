package com.yangli.design_pattern.proxy.dynamicproxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * CGlib 实现MethodInterceptor 拦截器 =》实现CGLIB代理模式
 *
 * 需要引入cglib的jar文件，但是spring的核心包中已经包含了cglib功能
 * 引入功能包后，就可以在内存中动态构建子类
 *
 * @author yangli
 */
public class CglibProxyFactory implements MethodInterceptor {

    private Object target;


    /**
     * 构造函数
     * 通过构造函数传参
     */
    public CglibProxyFactory(Object target) {
        this.target = target;
    }


    /**
     * 获取代理对象
     */
    public Object getProxyInstance() {

        //1.0实现CGLIB工具类
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
