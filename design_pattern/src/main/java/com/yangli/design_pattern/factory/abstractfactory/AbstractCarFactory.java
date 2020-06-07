package com.yangli.design_pattern.factory.abstractfactory;

import com.yangli.design_pattern.factory.ICar;

/**
 * 抽象汽车工厂
 */
public  interface AbstractCarFactory {

    /**
     * 创建汽车
     */
    ICar createCar();

    void productDrive();
}
