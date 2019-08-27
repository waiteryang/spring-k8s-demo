package com.designpattern.demo.factory_method;

public class AuDiFactory implements CarFactory{

    @Override
    public Car createCar() {
        return new AuDi();
    }
}
