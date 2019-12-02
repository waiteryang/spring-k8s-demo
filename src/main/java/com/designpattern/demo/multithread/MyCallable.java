package com.designpattern.demo.multithread;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {

    private Integer taskId;

    public MyCallable(Integer id){
        this.taskId = id;
    }

    @Override
    public Integer call() throws Exception {
        Thread.currentThread().interrupt();
        int j=0;
//        int t = taskId/j;
        System.out.println("我是线程Callable,线程id:"+taskId+",线程名字:"+Thread.currentThread().getName());

        return taskId;
    };
}
