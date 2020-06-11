package com.yangli.design_pattern.proxy.dynamicproxy;

import com.yangli.design_pattern.proxy.ISubject;
import com.yangli.design_pattern.proxy.TargetSubject;

public class JDKTest {


    public static void main(String[] args) {

        //目标对象
        ISubject subject = new TargetSubject();

        ISubject proxy = (ISubject) new ProxyFactory(subject).getProxyInstance();
        proxy.action();

    }
}
