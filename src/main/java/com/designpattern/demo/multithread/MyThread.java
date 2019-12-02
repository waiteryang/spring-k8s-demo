package com.designpattern.demo.multithread;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public class MyThread extends Thread {


    /**
     * 具体的方法实现
     */
    @Override
    public void run(){
        try {
            Thread.sleep(1);
            System.out.println("当前线程的名称:"+Thread.currentThread().getName());
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
