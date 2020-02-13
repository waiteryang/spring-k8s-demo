package com.designpattern.demo.multithread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

import com.sun.jmx.snmp.tasks.ThreadService;
import com.sun.org.apache.xml.internal.resolver.readers.ExtendedXMLCatalogReader;
import lombok.extern.slf4j.Slf4j;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.StopWatch;

@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@Slf4j
public class Demo2ServiceTest {

    @Test
    public void test(){
        List<Integer> list = new ArrayList<>(1000);
        for (int i=0;i<1000;i++){
            list.add(i);
        };
//        Thread thread = new Thread(new MyThread());
//        thread.start();
//        Thread thread1 = new Thread(new MyRunnable());
//        thread1.start();
//        myRunnable.run();
//        List<Integer> list = new ArrayList<>(10000);
//        for (int i=0;i<10000;i++){
//            list.add(i);
//        };
//        ExecutorService es = new ThreadPoolExecutor(5,20,5,TimeUnit.SECONDS,new ArrayBlockingQueue<>(10000));
//        ExecutorService es2 = Executors.newFixedThreadPool(8);//显示创建

//        for (int i=0;i<100;i++){
////            new Thread(new MyRunnable(i));
////            es.submit(new Thread(new MyRunnable(i)));
//            FutureTask<Integer> futureTask = new FutureTask<>(new MyCallable(i));
////            new Thread(futureTask).start();
//            es.submit(futureTask);
//            try {
//                System.out.println("判断线程是否完成:"+futureTask.isDone());
//                System.out.println("判断线程是否取消:"+futureTask.isCancelled());
//                //返回的结果,会进行阻塞，直到获取结果值
//                System.out.println("所有输出的值:"+futureTask.get());
//            }catch (Exception e){
//                e.printStackTrace();
//            };
////            es.submit(futureTask);
//        };
//        es.shutdown();
//        MyCallable myCallable = new MyCallable();
//        FutureTask<Integer> futureTask = new FutureTask<>(myCallable);
//        //采用thread来开启多线程，futuretask继承了Runnable，可以放在线程池中来启动执行
//        Thread thread = new Thread(futureTask);
//        thread.start();
//        try {
//            System.out.println("我所获取的结果是:"+futureTask.get());
//        }catch (Exception e){
//            e.printStackTrace();
//        }
        //多线程处理相关数据
//        List<Callable<String>> callables = new ArrayList<>();
//        for(int i=0;i<10;i++){
//            callables.add(()-> Math.random()+"");
//        }
//        List<String> res = ThreadPool.addTask(callables);
//        System.out.println("**********************");
//        for(String str : res){
//            System.out.println(str);
//        }
        // 定义3个Callable类型的任务
//        MyCallableClass task1 = new MyCallableClass();
//        task1.setFlag(new AtomicInteger(0));
//        MyCallableClass task2 = new MyCallableClass();
//        task2.setFlag(new AtomicInteger(1));
//        MyCallableClass task3 = new MyCallableClass();
//        task3.setFlag(new AtomicInteger(2));
//        // 创建一个执行任务的服务
////        ExecutorService es = Executors.newFixedThreadPool(3);
//          ExecutorService es =  new ThreadPoolExecutor(5,100
//                  ,5,TimeUnit.SECONDS,new ArrayBlockingQueue<>(10));
//        try {
//            // 提交并执行任务，任务启动时返回了一个Future对象，
//            // 如果想得到任务执行的结果或者是异常可对这个Future对象进行操作
//            Future future1 = es.submit(task1);
//            // 获得第一个任务的结果，如果调用get方法，当前线程会等待任务执行完毕后才往下执行
//            System.out.println("task1: " + future1.get());
//            Future future2 = es.submit(task2);
//            // 等待5秒后，再停止第二个任务。因为第二个任务进行的是无限循环
//            Thread.sleep(5000);
//            System.out.println("task2 cancel: " + future2.cancel(true));
//            // 获取第三个任务的输出，因为执行第三个任务会引起异常
//            // 所以下面的语句将引起异常的抛出
//            Future future3 = es.submit(task3);
//            System.out.println("task3: " + future3.get());
//        } catch (Exception e) {
//            //捕获异常
//            e.printStackTrace();
//        }
//        // 停止任务执行服务
//        es.shutdownNow();
//        ExecutorService executorService = new ThreadPoolExecutor(3,100,
//                5,TimeUnit.SECONDS,new LinkedBlockingQueue<>(100));
//        list.forEach(c->{
//            MyRunnable myRunnable = new MyRunnable(c);
//            executorService.submit(myRunnable);
//        });
//        executorService.shutdown();
        ExecutorService es = new ThreadPoolExecutor(5,20,
                5,TimeUnit.SECONDS,new LinkedBlockingQueue<>(1000));

        //计数器
        // 计数器
        CountDownLatch countDownLatch = new CountDownLatch(list.size());
        CyclicBarrier cyclicBarrier = new CyclicBarrier(list.size());
        StopWatch stopWatch1 = new StopWatch();
        stopWatch1.start();
          list.forEach(c ->{
              MyRunnable myRunnable = new MyRunnable(c,countDownLatch,cyclicBarrier);
              es.submit(myRunnable);
//              //为了更好的效果，休眠一秒
//              Thread.sleep(1000);
//              countDownLatch.countDown();
//              testPrint(c);
          });
         //等待线程执行
        try {
            //等待所有的线程任务执行完成
            countDownLatch.await();
            System.out.println("主线程执行完毕");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //关闭线程池,但是不会强制退出,而是等到已经提交的任务全部执行完,但是一旦调用shutdown，就不会
        //接受新提交的任务
        es.shutdown();
        stopWatch1.stop();
        //log.info("测试时间耗时 export time:"+stopWatch1.getTotalTimeSeconds());
    }



    public static void testPrint(Integer integer){
        try {
            Thread.sleep(10);
            System.out.println("我是要测试的值啊:"+integer);
        }catch (Exception e){
        }
    }
}

