package com.designpattern.demo.zk_distribute_lock;


import java.util.concurrent.*;

/**
 * @author: alex
 * @Date: 2019/4/9
 * @Description:
 */
public class DemoThread {

    static CyclicBarrier cyclicBarrier = new CyclicBarrier(10);
    static class DemoRun implements  Runnable {

        private int i;

        public DemoRun(int i) {
            this.i = i;
        }

        @Override
        public void run() {
            try {
                DemoService demoService = new DemoService();
                //保证所有DemoService实例化完成
                cyclicBarrier.await();
                demoService.sayHello("name_" + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        //创建线程池,线程池的作用，避免频繁创建和销毁线程
        //提交任务的几种方式 1.execute()与submit()
        ExecutorService es = new ThreadPoolExecutor(3,5,5,
                TimeUnit.SECONDS,new ArrayBlockingQueue<>(10));
        for(int i = 0;i<10;i++) {
//            es.submit(new DemoRun(i));
              new Thread(new DemoRun(i)).start();
        };
//        es.shutdown();
    }
}
