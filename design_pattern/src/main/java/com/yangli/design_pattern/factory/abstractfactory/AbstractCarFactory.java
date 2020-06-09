package com.yangli.design_pattern.factory.abstractfactory;

import com.yangli.design_pattern.factory.ICar;

/**
 * 定义工厂的公共接口
 * 抽象汽车工厂
 */
public  interface AbstractCarFactory {

    void createA();

    void createB();
}
