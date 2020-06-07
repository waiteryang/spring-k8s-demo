package com.yangli.design_pattern.factory;

public class AUDI implements ICar {
    @Override
    public String getName() {
        return "奥迪";
    }

    @Override
    public void dirve() {
        System.out.println("我是奥迪我有四个圈");
    }
}
