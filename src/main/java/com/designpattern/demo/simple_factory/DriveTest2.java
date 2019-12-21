package com.designpattern.demo.simple_factory;


import java.io.InputStream;
import java.util.Properties;

public class DriveTest2 {

    public static void main(String[] args) throws Exception {
        InputStream inStream = DriveTest2.class.getClassLoader().getResourceAsStream("application.yml");
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
            case "AuDiAuDi":
                car = new AuDi();
                break;
            default:
                car = null;
                break;
        }
        car.drive();
    }

}
