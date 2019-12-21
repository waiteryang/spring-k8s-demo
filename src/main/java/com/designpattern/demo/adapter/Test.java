package com.designpattern.demo.adapter;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test {
    public static void main(String[] args) {
//        ITarget target = new ConnectTarget();
//        target.request();
//
//        ITarget adapterTarget = new Adapter();
//        adapterTarget.request();
        try {
            int i = 0;
            int j = 1;
            int t = j/i;
            System.out.println("try");
        }catch (Exception e){
            System.out.println("catch");
        }finally {
            System.out.println("finally");
        }

        Lock lock = new ReentrantLock();


    }

    
}

