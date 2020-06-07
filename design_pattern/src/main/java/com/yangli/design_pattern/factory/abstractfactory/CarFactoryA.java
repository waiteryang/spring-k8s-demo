package com.yangli.design_pattern.factory.abstractfactory;

import com.yangli.design_pattern.factory.AUDI;
import com.yangli.design_pattern.factory.ICar;
import com.yangli.design_pattern.strategy.AbstractStrategy;

/**
 * @author yangli
 */
public class CarFactoryA implements AbstractCarFactory {


    @Override
    public ICar createCar() {
        return null;
    }

    @Override
    public void productDrive() {
        System.out.println("我是生产DriveA");
        new AUDI().dirve();
    }

}
