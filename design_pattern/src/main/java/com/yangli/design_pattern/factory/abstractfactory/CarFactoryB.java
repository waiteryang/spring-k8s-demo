package com.yangli.design_pattern.factory.abstractfactory;

import com.yangli.design_pattern.factory.AUDI;
import com.yangli.design_pattern.factory.Benz;
import com.yangli.design_pattern.factory.ICar;

/**
 * @author yangli
 */
public class CarFactoryB implements AbstractCarFactory {

    @Override
    public void createA() {
        System.out.println("我是创建产品A");
        //自行实现不同的方法
        new Benz().dirve();
    }



    @Override
    public void createB() {
        System.out.println("我是创建产品B");
        //自行实现不同的方法
        new AUDI().dirve();
    }
}
