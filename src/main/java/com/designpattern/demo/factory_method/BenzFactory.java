package com.designpattern.demo.factory_method;

public class BenzFactory implements CarFactory{

    @Override
    public Car createCar() {
        return new Benz();
    }
}
