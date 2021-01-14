package com.algorithm.www;

import java.util.LinkedHashMap;

/**
 * @ClassName LRUTest
 * @Author：Mayuan
 * @Date 2020/11/10 10:27
 * @Description TODO
 * @Version 1.0
 * <p>
 * Java的最近最少使用算法概述
 **/
public class LRUTest {
    int cap;
    LinkedHashMap<Integer, Integer> cache = new LinkedHashMap<>();

    public LRUTest(int capacity) {
        this.cap = capacity;
    }

    // 获得队列的值。

    public int get(int key) {
        if (!cache.containsKey(key)) {
            return -1;
        }
        int value = cache.get(key);
        insertFirst(key, value);
        return value;
    }

    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            insertFirst(key, value);
            return;
        }
        if (cache.size() >= cap) {
            cache.remove(cache.keySet().iterator().next());
        }
        cache.put(key, value);
    }

    // 删除key并重新插入到尾部
    public void insertFirst(int key, int value) {
        cache.remove(key);
        cache.put(key, value);
    }

    public static void main(String[] args) {
        LRUTest lt = new LRUTest(10);
        lt.put(1, 2);
        lt.put(2, 3);
        System.out.println(lt.get(1));
    }
}
