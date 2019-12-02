package com.designpattern.demo.multithread;

import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 测试CyclicBarrier类的使用
 */
public class TestCyclicBarrier {
    static final Integer NUM = 5;
    public static void main(String[] args) throws InterruptedException {
        //实例CyclicBarrier对象
        CyclicBarrier cyclicBarrier = new CyclicBarrier(NUM);
        //实例化一个固定大小线程池
        ExecutorService es = new ThreadPoolExecutor(5,NUM,5,TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(100));
        //Executor executor = Executors.newFixedThreadPool(NUM);
        for(int i = 1;i<=NUM;i++){
            //执行线程
            es.execute(new MyRunnale(cyclicBarrier,i+"号"));
            //为了更好的效果，休眠一秒
            Thread.sleep(1000);
        }
        System.out.println("指令通知完成,循环栅栏值:"+cyclicBarrier.getParties());
    }
}
class MyRunnale implements Runnable{
    private CyclicBarrier cyclicBarrier;
    private String mark;
    public MyRunnale(CyclicBarrier cyclicBarrier,String mark) {
        super();
        this.cyclicBarrier = cyclicBarrier;
        this.mark = mark;
    }
    @Override
    public void run() {
        System.out.println(mark+"进入线程,线程阻塞中...");
        try {
            // barrier的await方法，在所有参与者都已经在此 barrier 上调用 await 方法之前，将一直等待。
            Thread.sleep(2000);//为了看到更好的效果，线程阻塞两秒
            cyclicBarrier.await();
            System.out.println("我所有的线程任务都执行完成了,你看着办吧");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
        System.out.println(mark+"线程阻塞结束,继续执行...");
    }
    public CyclicBarrier getCyclicBarrier() {
        return cyclicBarrier;
    }
    public void setCyclicBarrier(CyclicBarrier cyclicBarrier) {
        this.cyclicBarrier = cyclicBarrier;
    }
}
