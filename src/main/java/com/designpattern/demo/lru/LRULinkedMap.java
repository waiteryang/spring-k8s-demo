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
