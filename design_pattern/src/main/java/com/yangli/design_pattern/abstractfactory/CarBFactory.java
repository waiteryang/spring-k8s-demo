package com.yangli.design_pattern.abstractfactory;

public class CarBFactory implements AbstractCarFactory {
    @Override
    public void createA() {

        System.out.println("汽车创建A");
        new AuDi().dirve();

    }

    @Override
    public void createB() {
        System.out.println("汽车创建B");
        new Benz().dirve();
    }

    @Override
    public String handleList(String x) {
        return "xx";
    }
}
