package com.designpattern.demo.singleton;

/**
 * 饿汉式
 * */
public class Car1 {
    private static Car1 instance = new Car1();

    private Car1 (){
    }

    public static Car1 getInstance() {
        return instance;
    }
}
