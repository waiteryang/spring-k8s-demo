package com.yangli.design_pattern.factory.abstractfactory;

import com.yangli.design_pattern.factory.ICar;

/**
 * @author yangli
 */
public class CarFactoryB implements AbstractCarFactory {

    @Override
    public ICar createCar() {

        ICar car = null;


        return car;
        //return null;
    }

    @Override
    public void productDrive() {
        System.out.println("我是生产B");
    }

}
