package com.designpattern.demo.factory_method;

public class DriveTest {
    public static void main(String[] args) {
        CarFactory factory = new BMWFactory();
        Car car = factory.createCar();
        car.drive();
    }
}
