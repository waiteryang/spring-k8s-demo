package com.designpattern.demo.ratelimiter;

import com.google.common.hash.BloomFilter;
import com.google.common.util.concurrent.RateLimiter;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RateLimiterDemo {

    public static void main(String[] args) {
        //并发控制,令牌桶算法
        RateLimiter rateLimiter = RateLimiter.create(12,12, TimeUnit.SECONDS);
        //获取令牌
        rateLimiter.acquire();


//        BloomFilter<String> bloomFilter = new  BloomFilter<>();
    }
}
