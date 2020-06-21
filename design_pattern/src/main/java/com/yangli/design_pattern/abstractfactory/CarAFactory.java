package com.yangli.design_pattern.abstractfactory;


/**
 * 实际的工厂A
 */
public class CarAFactory implements AbstractCarFactory {

    @Override
    public void createA() {
        System.out.println("创建产品");

    }

    @Override
    public void createB() {
        System.out.println("创建B产品");
    }
}
