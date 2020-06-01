package com.yangli.design_pattern.abstractfactory;

public class Benz implements  Car {

    private String name;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void dirve() {
        System.out.println("你想在奔驰上哭吗");
    }
}
