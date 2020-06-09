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
        new BMW().dirve();
    }

    @Override
    public void createB() {
        System.out.println("我是产品AB");
        new Benz().dirve();
    }
}
