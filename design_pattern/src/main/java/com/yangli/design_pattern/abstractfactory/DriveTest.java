package com.yangli.design_pattern.abstractfactory;

/**
 *
 * 抽象工厂模式是为了让创建工厂和一组产品与使用相分离
 *
 *
 */
public class DriveTest {

    public static void main(String[] args) {
        AbstractCarFactory factory = new CarBFactory();
        factory.createA();
        factory.createB();
    }
}
