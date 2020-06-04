package com.yangli.design_pattern.proxy.staticproxy;

/**
 * 代理对象
 * @author yangli
 */
public class ProxySubject implements  ISubject {

    ISubject target;

    /**
     * 构造函数
     */
    public ProxySubject(ISubject target){
        this.target = target;
    }

    @Override
    public void aciton() {
        System.out.println("我是代理action方法中的前缀");
        target.aciton();
    }

    @Override
    public void aciton2() {
        System.out.println("我是代理action2方法中的前缀");
        target.aciton2();
    }

    @Override
    public void action3() {
        System.out.println("我是代理action3方法中的前缀");
        target.action3();
    }

    @Override
    public void action4() {
        System.out.println("我是代理action4方法中的前缀");
        target.action4();
    }
}
