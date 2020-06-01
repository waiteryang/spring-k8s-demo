package com.yangli.design_pattern.singleton;

/**
 * 懒加载-单例模式
 * 当调用时才创建实例
 * @author yangli
 */
public class LazySingleton {


    /**
     * 保证instance 在所有线程中都同步
     * 和饿汉模式相比，这边不需要先实例化出来，注意这里的volatile，它是必须的
     */
    private static volatile LazySingleton instance = null;

    /**
     * 避免外部被实例化
     */
    public LazySingleton(){

    }

    /**
     * 减小锁的代码块
     */
    public static LazySingleton getInstance1(){

        if (instance == null){
            //加锁
            synchronized (LazySingleton.class){
                //这次判断也是必须的，不然会有并发问题
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }


    /**
     * 将整个函数加锁
     */
    public static synchronized  LazySingleton getInstance(){

        if (instance == null){
            return new LazySingleton();
        }
        return instance;
    }


}
