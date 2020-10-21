package com.yangli.design_pattern.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 创建动态代理对象
 * 动态代理不需要实现接口，但是需要指定接口类型
 */
public class ProxyFactory {


    /**
     * 维护一个目标对象
     */
    private Object target;


    /**
     * 构造函数
     * 通过构造函数赋值
     */
    public ProxyFactory(Object target) {
        this.target = target;
    }


    /**
     * 获取代理实例
     */
    public Object getProxyInstance() {

        return Proxy.newProxyInstance(
                //一个classloader对象，定义了由哪个classloader对象对生成的代理类进行加载
                //需要将其指定为和目标对象同一个类加载器
                target.getClass().getClassLoader(),
                //一个interface对象数组，表示我们将要给我们的代理对象提供一组什么样的接口，如果我们提供了这样一个接口对象数组，那么也就是声明了代理类实现了这些接口，代理类就可以调用接口中声明的所有方法。
                //目标对象实现的接口
                target.getClass().getInterfaces(),
                // java.lang.reflect.InvocationHandler接口
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //1.0执行方法前操作
                        System.out.println("我是行动前");
                        //执行被代理类中的方法
                        Object res = method.invoke(target, args);
                        //2.0执行方法后操作
                        System.out.println("我是行动后");
                        return res;
                    }
                });
    }
}
