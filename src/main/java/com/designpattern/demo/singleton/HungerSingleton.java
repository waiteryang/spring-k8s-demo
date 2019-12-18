package com.designpattern.demo.singleton;


/**
 * 饥汉单例模式
 */
public class HungerSingleton {

    public static final HungerSingleton hungerSingle = new HungerSingleton();

    public static HungerSingleton getInstance(){
        return hungerSingle;
    }

}
