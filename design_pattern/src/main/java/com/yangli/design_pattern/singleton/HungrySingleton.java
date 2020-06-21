package com.yangli.design_pattern.singleton;


/**
 * 单例-饿汉模式
 * 一旦加载就创建实例
 * @author yangli
 */
public class HungrySingleton {


    /**
     * 创建私有静态实例，意味着这个类第一次使用的时候就会进行创建
     */
    private static final HungrySingleton instance = new HungrySingleton();


    /**
     * 构造函数
     */
    public HungrySingleton(){

    }

    /**
     * 获取单例对象
     */
    public static HungrySingleton getInstance(){
        return instance;
    }
}
