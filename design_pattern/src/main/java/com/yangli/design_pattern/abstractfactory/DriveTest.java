package com.yangli.design_pattern.abstractfactory;

public class DriveTest {

    public static void main(String[] args) {
        AbstractCarFactory factory = new CarBFactory();
        factory.createA();
        factory.createB();
    }
}
