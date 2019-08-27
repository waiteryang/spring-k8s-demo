package com.designpattern.demo.abstract_factory;

public class CarBFactory implements AbstractCarFactory {

    @Override
    public void createA() {
        System.out.println("创建C产品");
         new AuDi().drive();
    }

    @Override
    public void createB() {
        System.out.println("创建B产品");
        new BMW().drive();
    }
}
