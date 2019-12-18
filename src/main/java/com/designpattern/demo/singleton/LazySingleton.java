package com.designpattern.demo.singleton;

import com.sun.imageio.plugins.common.LZWCompressor;

import java.util.concurrent.ExecutorService;

/**
 * 懒汉单例加载模式，用的时候就加载
 * 单例模式的好处:节约内存，不用重新实例化对象，保证数据一致性
 */
public class LazySingleton {

    public static LazySingleton lazySingleton;

//    public static synchronized LazySingleton getInstance(){
//
//            if (lazySingleton == null){
//                try {
//                    Thread.sleep(10);
//                }catch (Exception e){
//                    e.printStackTrace();
//                }
//                lazySingleton = new LazySingleton();
//            }
//            return lazySingleton;
//    }

    /**
     * 双检查模式
     */
    public static  LazySingleton getInstance(){
        if (lazySingleton == null){
            synchronized (LazySingleton.class){
                if (lazySingleton == null){
                    lazySingleton = new LazySingleton();
                }
            };
        }
        return lazySingleton;
    }
}
