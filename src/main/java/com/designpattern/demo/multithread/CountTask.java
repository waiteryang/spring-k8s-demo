package com.designpattern.demo.multithread;

import java.awt.image.RGBImageFilter;
import java.util.concurrent.RecursiveTask;

public class CountTask extends RecursiveTask<Integer> {

    //阈值
    private static  final  int THRESHOLD =1;
    private  int start;
    private int end;

    public  CountTask(int start,int end){
        this.start = start;
        this.end = end;
    }
    @Override
    protected Integer compute() {
        int sum = 0;
        //如果任务足够小就计算任务
        boolean canCompute = (end - start) <= THRESHOLD;
        if (canCompute){
            for (int i = start;i <= end;i++){
                sum+=i;
            }
        }else {
            //如果任务大于阀值,就分裂成两个子任务
            int middle = (start+end)/2;
            CountTask leftTask = new CountTask(start,middle);
            CountTask rightTask = new CountTask(middle+1,end);
            //执行子任务
            leftTask.fork();
            rightTask.fork();
            //invokeAll的任务中,其中N-1任务会使用fork()交给其他线程,但是，它还会留一个任务自己执行，这样，就充分利用了线程池，保证没有空闲的不干活的线程
            invokeAll(leftTask,rightTask);
            //等待子任务执行完，并得到其结果
            int leftResult =  leftTask.join();
            int rightReslut = rightTask.join();
            //合并子任务
            sum = leftResult + rightReslut;
        }
        return sum;
    }
}
