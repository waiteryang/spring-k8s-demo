package com.designpattern.demo.singleton;


import java.util.HashMap;
import java.util.Map;

/**
 * 使用容器实现单例模式(登记)
 * */
public class CarManage {

    private static Map<String, Object> objMap = new HashMap<String,Object>();

    private CarManage(){}

    public static void registerService(String key, Object instance){
        if (!objMap.containsKey(key))objMap.put(key, instance);
    }

    public static Object getService(String key) {
        return objMap.get(key);
    }

}
