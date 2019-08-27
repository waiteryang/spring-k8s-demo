package com.designpattern.demo.proxy;

public class Subject implements ISubject{
    @Override
    public void action() {
        System.out.println("Subject方法执行中");
    }

    @Override
    public void action1() {
        System.out.println("Subject方法1执行中");
    }

    @Override
    public void action2() {
        System.out.println("Subject方法2执行中");
    }

    @Override
    public void action3() {
        System.out.println("Subject方法3执行中");
    }
}
