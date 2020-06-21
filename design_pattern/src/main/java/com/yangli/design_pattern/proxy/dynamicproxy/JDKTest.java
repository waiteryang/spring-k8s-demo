package com.yangli.design_pattern.proxy.dynamicproxy;

import com.yangli.design_pattern.proxy.ISubject;
import com.yangli.design_pattern.proxy.TargetSubject;
/**
 * JDK代理
 * JDK的动态代理有一个限制，就是使用动态代理对象必须实现一个或者多个接口，如果想代理没有实现接口的类，可以使用cglib实现
 * 静态代理在编译时就实现，编译完成后代理类是一个实际的class文件
 * 静态代理在使用时，需要定义接口或者父类，被代理对象与代理对象一起实现相同的接口或者是继承相同的父类
 *
 * 优点:可以在不修改目标对象的前提下扩展目标对象的功能
 *
 */
public class JDKTest {


    public static void main(String[] args) {

        //目标对象
        ISubject subject = new TargetSubject();

        ISubject proxy = (ISubject) new ProxyFactory(subject).getProxyInstance();
        proxy.action();

    }
}
