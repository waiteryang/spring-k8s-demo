package com.designpattern.demo.blockingqueue;

import java.util.*;
import java.util.concurrent.*;

/**
 * @author yl
 */
public class Teacher {
    static final int STUDENT_SIZE = 30;
    public static void main(String[] args) throws InterruptedException {
//        BlockingQueue queue = new ArrayBlockingQueue(1024);
//        queue.take()
//        BlockingQueue queue1 = new LinkedBlockingQueue();
//        queue1.add();
//        queue1.take()
        CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();

        copyOnWriteArrayList.add("");
        Map<String,Object> map = new HashMap<>();

        Collections.synchronizedMap(new HashMap<>());

        for (int i=0; i<=300 ;i++){
            new Thread(()->{
                map.put(Thread.currentThread().getName().toString(),UUID.randomUUID().toString().substring(0,8));
                System.out.println(map);
            },String.valueOf(i)).start();
        }
//        Random r = new Random();
//        //把所有学生看做一个延迟队列
//        DelayQueue<Student> students = new DelayQueue<Student>();
//        //构造一个线程池用来让学生们“做作业”
//        ExecutorService exec = Executors.newFixedThreadPool(STUDENT_SIZE);
//        for ( int i = 0; i < STUDENT_SIZE; i++) {
//            //初始化学生的姓名和做题时间
//            students.put( new Student( "学生" + (i + 1), 3000 + r.nextInt(10000)));
//        }
//        //开始做题
//        while(! students.isEmpty()){
//            exec.execute( students.take());
//        }
//        exec.shutdown();
    }
}
