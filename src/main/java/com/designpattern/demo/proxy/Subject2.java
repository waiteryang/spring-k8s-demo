package com.designpattern.demo.proxy;

import com.sun.org.apache.bcel.internal.generic.ISUB;

import java.net.SocketPermission;

public class Subject2 implements ISubject{
    @Override
    public void action() {
        System.out.println("我是Subject2 action 方法");
    }

    @Override
    public void action1() {
        System.out.println("我是Subject2 action1 方法");
    }

    @Override
    public void action2() {
        System.out.println("我是Subject2 action2 方法");
    }

    @Override
    public void action3() {
        System.out.println("我是Subject2 action3 方法");
    }
}
