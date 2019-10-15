package com.designpattern.demo.ratelimiter;

import com.google.common.hash.BloomFilter;
import com.google.common.util.concurrent.RateLimiter;
import com.sun.javafx.scene.control.skin.VirtualFlow;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RateLimiterDemo {

    public static void main(String[] args) {
//        List list1 = new ArrayList();
//        list1.add("1111");
//        list1.add("2222");
//        list1.add("3333");
//        List list2 = new ArrayList();
//        list2.add("1111234");
//        list2.add("222224");
//        list2.add("333311");
//        boolean b = list1.retainAll(list2);
//        System.out.println(b);
//        System.out.println("list1:"+list1);
//        System.out.println("list2:"+list2);

//        //并发控制,令牌桶算法
//        RateLimiter rateLimiter = RateLimiter.create(12,12, TimeUnit.SECONDS);
//        //获取令牌
//        rateLimiter.acquire();
//        BloomFilter<String> bloomFilter = new  BloomFilter<>();

//        String temp = "订单号%s，客户%s，%s，已安排二次销售，请务必包装合格和妥善保管，有异常及时反馈，感谢！";
//        String x = String.format(temp,"23","ee","");
//        System.out.println(x);
        List<String> list1 = new ArrayList<>();
        list1.add("sfsf");
        list1.add("11");
        List<String> list2 = new ArrayList<>();
//        list2.add("sfsf");
        System.out.println(list1.containsAll(list2));
    }
}
