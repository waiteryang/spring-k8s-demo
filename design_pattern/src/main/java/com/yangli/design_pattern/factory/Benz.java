package com.yangli.design_pattern.factory;

import com.yangli.design_pattern.abstractfactory.Car;

/**
 * @author yangli
 */
public class Benz implements ICar {
    @Override
    public String getName() {
        return "我是奔驰啊";
    }

    @Override
    public void dirve() {
        System.out.println("我是大奔啊");
    }
}
