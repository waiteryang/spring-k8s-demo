package com.designpattern.demo.zk_distribute_lock;


import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author: alex
 * @Date: 2019/4/9
 * @Description: 业务代码
 */
public class DemoService {

    public static AtomicInteger count = new AtomicInteger(0);//生成计数器

    /**
     * 业务代码
     * @param name
     */
    public void sayHello(String name) {
        ZookeeperDistributedLock lock = new ZookeeperDistributedLock();
        try {
            //加锁
            lock.lock();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            count.getAndIncrement(); //加一
            System.out.println(Thread.currentThread().getName() + " say hello to " + name + "_" + count);
        }finally {
            lock.unlock();
        }
    }
}