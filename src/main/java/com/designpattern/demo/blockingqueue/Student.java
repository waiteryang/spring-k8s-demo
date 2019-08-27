package com.designpattern.demo.blockingqueue;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class Student implements Runnable,Delayed {
    private String name;  //姓名
    private long costTime;//做试题的时间
    private long finishedTime;//完成时间

    public Student(String name, long costTime) {
        this. name = name;
        this. costTime= costTime;
        finishedTime = costTime + System. currentTimeMillis();
    }

    @Override
    public void run() {
        System. out.println( name + " 交卷,用时" + costTime /1000);
    }

    /*
    * 获取延迟时间
    * */
    @Override
    public long getDelay(TimeUnit unit) {
        return ( finishedTime - System. currentTimeMillis());
    }

    /*
    * 比较器
    * 比较规则:延迟时间越长的对象越靠后
    * */
    @Override
    public int compareTo(Delayed o) {
        Student other = (Student) o;
        return costTime >= other. costTime?1:-1;
    }

}
