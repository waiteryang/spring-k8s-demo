package com.designpattern.demo.factory_method;

public class BMWFactory implements CarFactory{

    @Override
    public Car createCar() {
        return new BMW();
    }
}
