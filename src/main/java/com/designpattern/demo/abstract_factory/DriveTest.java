package com.designpattern.demo.abstract_factory;

public class DriveTest {
    public static void main(String[] args) {
        AbstractCarFactory factory = new CarBFactory();
        factory.createA();
        factory.createB();
    }
}
