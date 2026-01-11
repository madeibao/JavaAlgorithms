package com.lru.www;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 最近，最久没有访问的方法
 * @ClassName LRUDemo
 * @Author Mayuan
 * @Date 2026/1/10/星期六 12:01
 * @Version 1.0
 **/
public class LRUDemo {
    public static void main(String[] args) {
        LRU<Integer, String> lru = new LRU<>(20);
        lru.put(1, "aa");
        lru.put(2, "ab");
        lru.put(3, "ac");

        System.out.println(lru.get(1));
        System.out.println(lru);
    }
}

class LRU<K, V> extends LinkedHashMap<K, V> {
    int masSize;

    public LRU(int size) {
        super(16, 0.75F, true);
        this.masSize = size;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry eldest) {
        return size() > masSize;
    }
}
