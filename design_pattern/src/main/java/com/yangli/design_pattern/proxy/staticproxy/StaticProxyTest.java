package com.yangli.design_pattern.proxy.staticproxy;


import com.yangli.design_pattern.proxy.ISubject;
import com.yangli.design_pattern.proxy.TargetSubject;

/**
 * 静态代理
 * 特定:代理对象与被代理对象(目标对象)
 *
 * @author yangli
 * <p>
 * 特点: 静态代理在编译的时实现，编译完成后代理类是一个实际的class文件
 * 优点:在不修改目标对象的功能前提下，能通过代理对象对目标对象功能进行扩展
 * 缺点:因为代理对象需要与目标对象实现一个的接口，所以会有很多代理类，一旦接口增加方法，目标对象与代理对象都要维护
 */
public class StaticProxyTest {

    public static void main(String[] args) {

//        ISubject subject = new TargetSubject();
//        ProxySubject proxySubject = new ProxySubject(subject);
//        proxySubject.action();

        Integer n = null;
        System.out.println(0 == n);
    }


}
