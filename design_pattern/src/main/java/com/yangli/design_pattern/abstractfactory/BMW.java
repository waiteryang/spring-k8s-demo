package com.yangli.design_pattern.abstractfactory;

public class BMW implements  Car {

    private String name;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void dirve() {

        System.out.println("坐在奔驰上哭");
    }
}
