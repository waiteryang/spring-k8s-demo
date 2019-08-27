package com.designpattern.demo.singleton;


import com.designpattern.demo.abstract_factory.Car;
import com.google.common.util.concurrent.RateLimiter;
import com.sun.org.apache.bcel.internal.generic.FADD;
import com.sun.org.apache.bcel.internal.generic.NEW;
import sun.misc.Lock;
import sun.misc.Unsafe;
import sun.misc.VM;

import javax.swing.text.StyledEditorKit;
import java.lang.ref.*;
import java.nio.ByteBuffer;
import java.util.Properties;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Test {

    public static void main(String[] args) throws  Exception {

        Class clazz = Car.class;
        Object o    = clazz.newInstance();
        System.out.println(o);

        //对于自定义类，使用系统类加载器进行加载
        ClassLoader classLoader = Car.class.getClassLoader();
        System.out.println(classLoader);
        //调用系统类加载器的getParent():获取拓展类加载器
        ClassLoader classLoader1 = classLoader.getParent();
        System.out.println(classLoader);
        //调用拓展类加载器的getParent():无法获取引导类加载器
        //引导类加载器主要负载加载Java的核心类库，无法加载自定义类的
        ClassLoader classLoader2 = classLoader1.getParent();
        System.out.println(classLoader2);



//        CountDownLatch stopLatch = new CountDownLatch(10);
//        for (int i = 0; i < 10; i++) {
//            new Thread(new Run(stopLatch)).start();
//        }
//        AtomicInteger atomicInteger = new AtomicInteger(2);
//        //cas 对比And比较
//        atomicInteger.set(23);
//        atomicInteger.compareAndSet(2,3);
//        System.out.println(atomicInteger.get());
//        java.util.concurrent.locks.Lock lock =new ReentrantLock();
        //公平锁 是指多个线程按照申请锁的顺序来获取锁，类似排队打饭，先来先到

        //非公平锁 是指多个线程

        //非公平锁的吞吐量大

        //Synchronized 也是一种非公平锁

        //可重入锁,公平锁
        //可重入锁(又名递归锁)
////        new Thread(()->{
////
////        },"aa").start();
//        CountDownLatch countDownLatch = new CountDownLatch(6);
//        for (int i = 0 ;i<=6 ;i++){
//            new Thread(()->{
//                System.out.println(Thread.currentThread().getName()+"上完自习，离开教室");
////                countDownLatch.countDown();
//                System.out.println("xxx:"+countDownLatch.getCount());
//                countDownLatch.countDown();
//            },String.valueOf(i)).start();
//        };
//        System.out.println(countDownLatch.getCount());
//        countDownLatch.await();
//        System.out.println(Thread.currentThread().getName()+"************班长最后关门走人");
//        CyclicBarrier cyclicBarrier = new CyclicBarrier(7,() -> {
//            System.out.println("*********召唤神龙");
//        });
//        for (int i= 1 ;i<=7 ; i++){
//            final  int tempInt = i;
//            new Thread(() ->{
//                System.out.println(Thread.currentThread().getName()+"收集到第："+tempInt+"龙珠");
//                try {
//                    cyclicBarrier.await();
//                }catch (InterruptedException e){
//                    e.printStackTrace();
//                }catch (BrokenBarrierException e){
//                    e.printStackTrace();
//                }
//            },String.valueOf(i)).start();
//        }
//        Semaphore semaphore = new Semaphore(3);
//        for (int i = 2; i<=6;i++){
//            new Thread(() ->{
//                try {
//                    semaphore.acquire();
//                    System.out.println(Thread.currentThread().getName()+"抢到车位");
////                    TimeUnit.SECONDS.sleep(5);
//                    System.out.println(Thread.currentThread().getName()+"停车3秒后离开车位");
//                }catch (InterruptedException e){
//                    e.printStackTrace();
//                }finally {
//                    semaphore.release();
//                }
//            },String.valueOf(i)).start();
//        }

//        BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(3);
//        blockingQueue.add("a");
//        blockingQueue.add("b");
//        blockingQueue.add("c");
////        blockingQueue.add("e");
//        blockingQueue.offer("xx",5,TimeUnit.SECONDS);
//        System.out.println("测试完成");


//        BlockingQueue<String> blockingQueue = new SynchronousQueue<>();
//        new  Thread(()->{
//            try {
//                System.out.println(Thread.currentThread().getName()+"put 1");
//                blockingQueue.put("1");
//                System.out.println(Thread.currentThread().getName()+"put 2");
//                blockingQueue.put("2");
//                System.out.println(Thread.currentThread().getName()+"put 3");
//                blockingQueue.put("3");
//            }catch ( InterruptedException e){
//                 e.printStackTrace();
//            }
//        },"AAA").start();
//
//        new Thread(()->{
//            try {
//                TimeUnit.SECONDS.sleep(5);
//                System.out.println(Thread.currentThread().getName()+":"+blockingQueue.take());
//            }catch (InterruptedException e){
//                e.printStackTrace();
//            }
//            try {
//                TimeUnit.SECONDS.sleep(5);
//                System.out.println(Thread.currentThread().getName()+":"+blockingQueue.take());
//            }catch (InterruptedException e){
//                e.printStackTrace();
//            }
//            try {
//                TimeUnit.SECONDS.sleep(5);
//                System.out.println(Thread.currentThread().getName()+":"+blockingQueue.take());
//            }catch (InterruptedException e){
//                e.printStackTrace();
//            }
//
//        },"BB").start();

//        ShareResource shareResource = new  ShareResource();
//
//        new Thread(()->{
//           shareResource.print5();
//           System.out.println(Thread.currentThread().getName()+":结束");
//        },"AA").start();
//
//        new Thread(()->{
//            shareResource.print10();
//            System.out.println(Thread.currentThread().getName()+":结束");
//        },"BB").start();
//
//        new Thread(()->{
//            shareResource.print15();
//            System.out.println(Thread.currentThread().getName()+":结束");
//        },"CC").start();
//        FutureTask<Integer> futureTask = new FutureTask<>(new MyThread());
//        new Thread(futureTask,"WSS").start();
//        new Thread(futureTask,"BB").start();
//
//        System.out.println(Thread.currentThread().getName());
//        thread.start();
//        System.out.println("result1:"+"yy");
//        while (!futureTask.isDone()){
//            System.out.println("resultxxxx:");
//        }
//        System.out.println("result2:"+futureTask.get());
//        System.out.println("result3:"+"xx");
//        ExecutorService threadPool = Executors.newSingleThreadExecutor(5,2,TimeUnit.SECONDS,4);

        //cpu核数
//        System.out.println(Runtime.getRuntime().availableProcessors());
        //创建线程池，设定线程数的大小，看业务是IO密集型的还是CPU密集型的
//        ExecutorService threadPool = new ThreadPoolExecutor(
//                2,
//                7,
//                1L,
//                TimeUnit.SECONDS,
//                new LinkedBlockingQueue<>(3),
//                Executors.defaultThreadFactory(),
//                new ThreadPoolExecutor.AbortPolicy());
//        try {
//            for (int i = 1 ;i<=10 ;i++){
//               threadPool.execute(()->{
//                    System.out.println(Thread.currentThread().getName()+"办理业务");
//                });
//            }
//        }catch (Exception e){
//            e.printStackTrace();
//        }finally {
//            threadPool.shutdown();
//        }
//        //模拟10个用户来办理，每个用户就是来自外部的请求线程
//        try {
//            threadPool.execute(() ->{
//                for (int i = 1; i <=10 ;i++){
//
//                }
//            });
//        }catch (Exception e){
//            e.printStackTrace();
//        }finally {
//            threadPool.shutdown();
//        }
//        String lockA = "lockA";
//        String lockB = "lockB";
//        System.out.println("我是一个程序");
//        //默认内存为物理机的1/64
//        long totalMemory = Runtime.getRuntime().totalMemory();
//        //最大内存为物理机的1/4
//        long maxMemory = Runtime.getRuntime().maxMemory();
//        System.out.println("totalMemory:"+totalMemory);
//        System.out.println("maxMemory:"+maxMemory);

//        Object o1 =new Object();
////        Object o2 =o1;
////        o1 = null;
////        System.gc();
////        System.out.println(o1);
//
//        SoftReference<Object>  softReference =new SoftReference<Object>(o1);
//        System.out.println(o1);
//        System.out.println(softReference.get());
//        o1 = null;
//        try {
//            byte[] bytes =new  byte[300*1024*1024];
//        }catch (Throwable e){
//             e.printStackTrace();
//        }finally {
//            System.out.println("xxo1"+o1);
//            System.out.println("sofe:"+softReference.get());
//        }
//        System.out.println(o1);
//        System.out.println(softReference.get());
//
//        Object o1 = new Object();
//        //强引用,软引用，弱引用，虚引用
//        WeakReference<Object> o2 = new WeakReference<>(o1);
//        System.out.println("初试o1"+o1);
//        o1 = null;
//        System.out.println("初试o2"+o1);
//        System.out.println("gc前"+o2.get());
//        System.gc();
//        System.out.println("gc后"+o2.get());
//         Object o1 = new Object();
//         SoftReference<Object> o2 = new SoftReference<Object>(o1);
//         System.out.println("初试值o1:"+o1);
//         o1 = null;
//        System.out.println("置空o1:"+o1);
//        System.out.println("触发GC前o2:"+o2.get());
////        System.gc();
//        byte[] bytes =new  byte[4*1024*1024];
//        System.out.println("触发GC后o1:"+o1);
//        System.out.println("触发GC后o2:"+o2.get());

//        Object o1 = new Object();
//        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
//        WeakReference<Object> o2 = new WeakReference<>(o1,referenceQueue);
//
//        System.out.println("GC前o1:"+o1);
//        System.out.println("GC前o2:"+o2.get());
//        System.out.println("引用队列1:"+referenceQueue.poll());
//
//        o1 = null;
//        System.gc();
//        System.out.println("GC1o1:"+o1);
//        System.out.println("GC1o2:"+o2.get());
//        System.out.println("引用队列2:"+referenceQueue.poll());

//        Object o1 = new Object();
//        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
//        PhantomReference<Object> phantomReference = new PhantomReference<>(o1,referenceQueue);
//        System.out.println(o1);
//        System.out.println(phantomReference.get());
//        System.out.println(referenceQueue.poll());
//        System.out.println("================");
//        o1 = null;
//        System.gc();
//        System.out.println(o1);
//        System.out.println(phantomReference.get());
//        System.out.println(referenceQueue.poll());
//        stackOverflowError();
//        byte[] bytes = new  byte[50*1024*1024];
//        RateLimiter rateLimiter = RateLimiter.create(5);
//        System.out.println("配置的maxDirectMemory:"+(VM.maxDirectMemory()/(double)1024/1024)+"MB");
//        try {
//            Thread.sleep(3000);
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }
//        //这种事分配到堆里面,属于GC管辖范围
////        ByteBuffer byteBuffer = ByteBuffer.allocate(30*1024*1024);
//        ByteBuffer byteBuffer1 = ByteBuffer.allocateDirect(30*1024*1024);
//        for (int i = 1; ;i++){
//            System.out.println("***************："+i);
//            new  Thread(()->{
//                try {
//                    Thread.sleep(Integer.MAX_VALUE);
//                }catch (InterruptedException e){
//                    e.printStackTrace();
//                }
//            },""+i).start();
//        }
    }

    public static void stackOverflowError(){
        stackOverflowError();
    }

    public static class  MyThread implements  Callable<Integer>{
        @Override
        public Integer call() throws Exception{
            System.out.println(Thread.currentThread().getName()+":xxx");
            return  1;
        }
    }
    public static class  ShareResource{
        private  int number =1;
        private java.util.concurrent.locks.Lock lock = new ReentrantLock();
        private Condition c1 = lock.newCondition();
        private Condition c2 = lock.newCondition();
        private Condition c3 =lock.newCondition();
        private  void print5(){
            lock.lock();
            try {
                //1 判断
                while (number != 1){
                    c1.await();
                }
                for (int  i = 1 ;i <=5 ;i++){
                    System.out.println(Thread.currentThread().getName() +":"+ i);
                }
                //3 通知
                number = 2;
                c2.signal();
            }catch (Exception e){
                e.printStackTrace();
            }
            finally {
                lock.unlock();
            }
            //2 干活

            // 3 通知
        }
        private void print10(){
            lock.lock();
            try {
                //1 判断
                while (number != 2){
                    c2.await();
                }
                for (int  i = 1 ;i <=10;i++){
                    System.out.println(Thread.currentThread().getName() +":"+ i);
                }
                //3 通知
                number = 3;
                c3.signal();
            }catch (Exception e){
                e.printStackTrace();
            }
            finally {
                lock.unlock();
            }
            //2 干活

            // 3 通知
        }


        private void print15(){
            lock.lock();
            try {
                //1 判断
                while (number != 3){
                    c3.await();
                }
                for (int  i = 1 ;i <= 15;i++){
                    System.out.println(Thread.currentThread().getName() +":"+ i);
                }
                //3 通知
                number = 1;
                c1.signal();
            }catch (Exception e){
                e.printStackTrace();
            }
            finally {
                lock.unlock();
            }
            //2 干活

            // 3 通知
        }

    }















    AtomicReference<Thread> atomicReference = new AtomicReference<>();
    public  void  myLock(){

        java.util.concurrent.locks.Lock lock = new ReentrantLock();

        Thread thread =Thread.currentThread();
        System.out.println(Thread.currentThread().getName());
        while (!atomicReference.compareAndSet(null,thread)){

        }
    }

    public  void  myUnlock(){
        Thread thread = Thread.currentThread();
        atomicReference.compareAndSet(thread,null);
        System.out.println(Thread.currentThread().getName());
    }


    public static class Run implements Runnable {

        private CountDownLatch stopLatch;

        public Run(CountDownLatch countDownLatch) {
            this.stopLatch = countDownLatch;
        }

        @Override
        public void run() {
            // 线程操作
            for (int i = 0; i < 10; i++) {
                Car3 instance = Car3.getInstance();
                System.out.println(instance);
            }
            // 线程结束操作
            stopLatch.countDown();
        }
    }
}
