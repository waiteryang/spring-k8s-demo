package com.designpattern.demo.simple_factory;

import java.io.InputStream;
import java.util.Properties;

public class SimpleFactory1 {


    public static Car newCar() throws Exception{
        InputStream inStream = DriveTest2.class.getClassLoader().getResourceAsStream("application.properties");
        Properties prop = new Properties();
        prop.load(inStream);
        String name = prop.getProperty("drive2");
        Car car;
        switch (name) {
            case "BMW":
                car = new BMW();
                break;
            case "Benz":
                car = new Benz();
                break;
            case "AuDi":
                car = new AuDi();
                break;
            default:
                car = null;
                break;
        }
        return car;
    }


    public static void main(String[] args) throws Exception {
        Car car = SimpleFactory1.newCar();
        car.drive();
    }
}
