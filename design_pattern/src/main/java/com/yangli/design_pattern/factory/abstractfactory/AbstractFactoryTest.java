package com.yangli.design_pattern.factory.abstractfactory;

public class AbstractFactoryTest {


    public static void main(String[] args) {

        AbstractCarFactory abstractCarFactory = new CarFactoryA();
        abstractCarFactory.productDrive();
    }

}
