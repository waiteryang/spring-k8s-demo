package com.yangli.design_pattern.proxy.staticproxy;

import com.yangli.design_pattern.proxy.ISubject;

/**
 * 代理对象
 *
 * @author yangli
 */
public class ProxySubject implements ISubject {

    ISubject target;

    /**
     * 构造函数
     */
    public ProxySubject(ISubject target) {
        this.target = target;
    }

    @Override
    public void action() {
        System.out.println("我是代理action方法中的前缀");
        target.action();
        System.out.println("我是后缀");
    }

    @Override
    public void action1() {
        System.out.println("我是代理action1方法中的前缀");
        target.action1();
    }

    @Override
    public void action2() {
        System.out.println("我是代理action2方法中的前缀");
        target.action2();
    }

    @Override
    public void action3() {
        System.out.println("我是代理action3方法中的前缀");
        target.action3();
    }
}
