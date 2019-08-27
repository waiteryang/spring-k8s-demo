package com.designpattern.demo.singleton;

/**
 * 懒汉式线程安全
 * */
public class Car3 {
    private static Car3 instance ;

    private Car3(){
    }

    public synchronized static Car3 getInstance() {
        if(instance==null){
            instance  = new Car3();
        }
        return instance;
    }
}
