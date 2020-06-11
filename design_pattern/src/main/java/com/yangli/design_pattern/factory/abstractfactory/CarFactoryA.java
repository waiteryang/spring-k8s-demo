package com.yangli.design_pattern.factory.abstractfactory;

import com.yangli.design_pattern.factory.AUDI;
import com.yangli.design_pattern.factory.BMW;
import com.yangli.design_pattern.factory.Benz;
import com.yangli.design_pattern.factory.ICar;
import com.yangli.design_pattern.strategy.AbstractStrategy;

/**
 * @author yangli
 */
public class CarFactoryA implements AbstractCarFactory {


    @Override
    public void createA() {
        System.out.println("我是创建产品AA");

        //自行实现不同的方法
        new BMW().dirve();
    }

    @Override
    public void createB() {
        System.out.println("我是产品AB");

        //自行实现不同的方法
        new Benz().dirve();
    }
}
