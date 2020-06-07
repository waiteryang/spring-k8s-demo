package com.yangli.design_pattern.factory;

public class BMW implements ICar {


    @Override
    public String getName() {
        return "我是宝马";
    }

    @Override
    public void dirve() {
        System.out.println("我要坐在宝马上哭啊");
    }
}
