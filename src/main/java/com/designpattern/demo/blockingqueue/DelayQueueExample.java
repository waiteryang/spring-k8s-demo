package com.designpattern.demo.blockingqueue;

import java.util.concurrent.DelayQueue;

public class DelayQueueExample {
    public static void main(String[] args) throws InterruptedException {
        DelayQueue<DelayedElement> queue= new DelayQueue<>();
        DelayedElement ele= new DelayedElement( "cache 3 seconds",3000);
        queue.put( ele);
        System. out.println( queue.take());
    }
}