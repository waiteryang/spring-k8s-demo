package com.designpattern.demo.decorator;

public class Subject implements ISubject {
    @Override
    public void action() {
        System.out.println("Subject方法执行中");
    }
}
