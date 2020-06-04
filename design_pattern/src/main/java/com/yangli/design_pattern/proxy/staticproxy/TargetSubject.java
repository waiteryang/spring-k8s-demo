package com.yangli.design_pattern.proxy.staticproxy;

/**
 * 目标对象，被代理对象
 *
 * @author yangli
 */
public class TargetSubject implements  ISubject {
    @Override
    public void aciton() {
        System.out.println("我是被代理对象action方法");
    }

    @Override
    public void aciton2() {

    }

    @Override
    public void action3() {

    }

    @Override
    public void action4() {

    }
}
