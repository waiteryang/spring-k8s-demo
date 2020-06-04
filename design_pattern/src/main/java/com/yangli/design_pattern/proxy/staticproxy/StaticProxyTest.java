package com.yangli.design_pattern.proxy.staticproxy;



/**
 * 静态代理
 * 特定:代理对象与被代理对象(目标对象)
 */
public class StaticProxyTest {

    public static void main(String[] args) {

        ISubject subject = new TargetSubject();

        ProxySubject proxySubject = new ProxySubject(subject);
        proxySubject.aciton();

    }


}
