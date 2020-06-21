package com.yangli.design_pattern.factory.simplefactory;

import com.yangli.design_pattern.abstractfactory.Car;
import com.yangli.design_pattern.factory.AUDI;
import com.yangli.design_pattern.factory.BMW;
import com.yangli.design_pattern.factory.Benz;
import com.yangli.design_pattern.factory.ICar;

/**
 * 汽车简单的工厂
 */
public class CarSimpleFactory {


    /**
     * 静态方法传参，根据参数不同返回不同的实例
     * @param carType
     * @return 返回不同的实例
     */
    public static ICar createCar(String carType){

        ICar car = null;
        switch(carType){
            case "AUDI" :
                car = new AUDI();
                break;
            case "Benz" :
                car = new Benz();
                break;
            case "BMW" :
                car = new BMW();
                break;
            default :
                break;
        }
        return car;
    }
}
