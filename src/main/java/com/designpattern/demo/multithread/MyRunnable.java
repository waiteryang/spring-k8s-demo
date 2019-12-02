package com.designpattern.demo.multithread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;

public class MyRunnable implements Runnable {

    private Integer taskId;

    private CountDownLatch countDownLatch;

    private CyclicBarrier cyclicBarrier;

    public MyRunnable(Integer integer,CountDownLatch countDownLatch,CyclicBarrier cyclicBarrier){
        this.taskId = integer;
        this.countDownLatch = countDownLatch;
        this.cyclicBarrier = cyclicBarrier;
    }

    /**
     * 具体线程实现
     */
    @Override
    public void run() {
        try {
//            cyclicBarrier.await();
            Thread.sleep(10);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("我是线程MyRunnable,线程任务id:"+taskId+"线程名称:"+Thread.currentThread().getName());
        countDownLatch.countDown();
    }
}
