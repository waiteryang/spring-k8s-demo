package com.yangli.design_pattern.proxy.dynamicproxy;

import com.yangli.design_pattern.proxy.ISubject;
import com.yangli.design_pattern.proxy.TargetSubject;

public class CglibTest {


    public static void main(String[] args) {

        ISubject subject = new TargetSubject();
        ISubject proxy = (ISubject) new CglibProxyFactory(subject).getProxyInstance();
        proxy.action();

    }
}
