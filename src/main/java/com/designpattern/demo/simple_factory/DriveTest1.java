package com.designpattern.demo.simple_factory;

public class DriveTest1 {
    public static void main(String[] args) {
        Car car = new Benz();
        car.drive();
    }
}
