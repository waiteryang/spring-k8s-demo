package com.yangli.design_pattern.abstractfactory;

public class AuDi implements  Car {

    private String name;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void dirve() {
        System.out.println("我是奥迪呀，我有四个圈");
    }
}
