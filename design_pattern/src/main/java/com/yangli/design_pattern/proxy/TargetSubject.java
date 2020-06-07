package com.yangli.design_pattern.proxy;

import com.yangli.design_pattern.proxy.ISubject;

/**
 * 目标对象，被代理对象
 *
 * @author yangli
 */
public class TargetSubject implements ISubject {


    @Override
    public void action() {
        System.out.println("我是被代理对象action方法");
    }

    @Override
    public void action1() {

    }

    @Override
    public void action2() {

    }

    @Override
    public void action3() {

    }

}
