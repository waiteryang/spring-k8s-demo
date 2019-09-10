package com.designpattern.demo.lru;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * LRU 最近最少使用到的
 */
public class LRULinkedMap<K,V> extends LinkedHashMap<K,V> {

    final int cacheSize = 100;
    Map<String, String> map = new LinkedHashMap<String, String>((int) Math.ceil(cacheSize / 0.75f) + 1, 0.75f, true) {
        @Override
        protected boolean removeEldestEntry(Map.Entry<String, String> eldest) {
            return size() > cacheSize;
        }
    };
}

//    //LinkedHashMap的一个构造函数，当参数accessOrder为true时，即会按照访问顺序排序，最近访问的放在最前，最早访问的放在后面
//    public LinkedHashMap(int initialCapacity, float loadFactor, boolean accessOrder) {
//        super(initialCapacity, loadFactor);
//        this.accessOrder = accessOrder;
//    }
//
//    //LinkedHashMap自带的判断是否删除最老的元素方法，默认返回false，即不删除老数据
////我们要做的就是重写这个方法，当满足一定条件时删除老数据
//    protected boolean removeEldestEntry(Map.Entry<K,V> eldest) {
//        return false;
//    }