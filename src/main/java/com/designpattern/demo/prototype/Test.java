package com.designpattern.demo.prototype;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) {
//        Prototype prototype = new Prototype();
//        prototype.setName("xh");
//        List<String> ids = new ArrayList<>();
//        ids.add("a");
//        ids.add("b");
//        ids.add("c");
//        prototype.setIds(ids);
//        Prototype clone = prototype.clone();
//        System.out.println(clone);
//        System.out.println(prototype);
//        System.out.println(clone.getName());
//        System.out.println(clone.getIds().size());
//        System.out.println(clone.getIds());
//        System.out.println(prototype.getIds());
//
//        System.out.println(clone.getName()==prototype.getName());

        for (int i=0 ;i<45768 ;i++){

            //异步
            CompletableFuture.runAsync(() -> {
                try {
                    Thread.sleep(1);
                    System.out.println("我是异步啊"+Thread.currentThread().getName());
                }catch (Exception e){
                    System.out.println("异常");
                    System.out.println("异常");
                }
            });
        }
        System.out.println("完结");
    }

}
