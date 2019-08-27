package com.designpattern.demo.singleton;

/**
 * 双重检查模式（DCL）
 * */
public class Car4 {
    private static volatile Car4 instance;

    private Car4(){
    }

    public  static Car4 getInstance() {
        if(instance==null){
            synchronized (Car4.class) {
                if (instance== null) {
                    instance= new Car4();
                }
            }
        }
        return instance;
    }
}
