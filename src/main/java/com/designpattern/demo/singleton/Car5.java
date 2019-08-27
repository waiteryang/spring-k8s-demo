package com.designpattern.demo.singleton;

/**
 * 静态内部类单例模式（DCL）
 * */
public class Car5 {
    private static Car5 instance ;

    private Car5(){
    }

    public static Car5 getInstance(){
        return Car5Holder.sInstance;
    }

    private static class Car5Holder {
        private static final Car5 sInstance = new Car5();
    }
}
