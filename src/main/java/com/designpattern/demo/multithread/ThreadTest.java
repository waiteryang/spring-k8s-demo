package com.designpattern.demo.multithread;

import com.google.common.hash.BloomFilter;
import org.springframework.context.ApplicationListener;

import java.util.EventObject;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
public class ThreadTest {


    public static void main(String[] args) {
//        ExecutorService executorService1 =Executors.newSingleThreadExecutor();
//        ExecutorService executorService2 = Executors.newFixedThreadPool(2);
//        ExecutorService executorService = Executors.newCachedThreadPool();
//        ExecutorService executorService3 = Executors.newScheduledThreadPool(2);
//        ExecutorService executorService4 = new ThreadPoolExecutor(
//                2,
//                10,
//                10L,
//                TimeUnit.SECONDS,
//                new LinkedBlockingQueue<>(10),
//                Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
        Lock lock = new ReentrantLock();
        lock.lock();
        int t =0;
        lock.lock();
        int t22 =0;
        lock.unlock();
        int xxx=3;
        lock.unlock();
        AtomicInteger atomicInteger = new AtomicInteger(0);
        atomicInteger.getAndIncrement();
//        BloomFilter<String> bloomFilter = new  byte[];
//        bloomFilter.mightContain("3");
//        bloomFilter.put()
//        BlockingQueue blockingQueue = new ArrayBlockingQueue(1024);
//        ForkJoinPool forkJoinPool = new ForkJoinPool();
//        //生成一个计算任务,负责计算1+2+3+4
//        CountTask task = new CountTask(1,1000);
//        //执行一个任务
//        Future<Integer> result = forkJoinPool.submit(task);
//        try {
//            System.out.println(result.get());
//            System.out.println(forkJoinPool.getPoolSize());
//        }catch (InterruptedException e){
//        }catch (ExecutionException e){
//        }


    }
}
