package com.designpattern.demo.simple_factory;

import java.io.InputStream;
import java.util.Properties;

public class SimpleFactory2 {


    public static Car newCar() throws Exception{
        InputStream inStream = DriveTest2.class.getClassLoader().getResourceAsStream("application.properties");
        Properties prop = new Properties();
        prop.load(inStream);
        String name = prop.getProperty("drive2ClassName");
        Car car = (Car)Class.forName(name).newInstance();
        return car;
    }


    public static void main(String[] args) throws Exception {
        Car car = SimpleFactory2.newCar();
        car.drive();
    }
}
