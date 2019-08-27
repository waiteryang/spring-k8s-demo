package com.designpattern.demo.abstract_factory;

public class CarAFactory implements AbstractCarFactory {

    @Override
    public void createA() {
        System.out.println("创建A产品");
         new Benz().drive();
    }

    @Override
    public void createB() {
        System.out.println("创建B产品");
        new BMW().drive();
    }
}
