package com.yangli.design_pattern.factory.simplefactory;


import com.yangli.design_pattern.factory.ICar;

import java.util.Calendar;

/**
 * 简单工厂
 * 简单工厂又叫静态工厂
 * 简单工厂模式是属于创建型模式，是工厂模式的一种。简单工厂模式是由一个工厂对象决定创建出哪一种产品类的实例。简单工厂模式是工厂模式家族中最简单使用的模式
 * 2.简单工厂模式:定义一个创建对象的类，由这个类来封装实例化对象的行为
 *
 * @author yangli
 */
public class SimpleFactoryTest {


    public static void main(String[] args) {

        ICar car = CarSimpleFactory.createCar("AUDI");
        car.dirve();


        //查看工厂模式在JDK -Calendar应用的源码分析
        Calendar calendar = Calendar.getInstance();

    }

}
