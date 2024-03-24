package com.lru.www;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @ClassName LRUCache2
 * @Author：Mayuan
 * @Date 2023/9/1/0001 15:24
 * @Description TODO
 * @Version 1.0
 **/
class LRUCache2 {
    private int cap;
    private Map<Integer, Integer> map = new LinkedHashMap<>();
    public LRUCache2(int capacity) {
        this.cap = capacity;
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            int val = map.get(key);
            map.remove(key);
            map.put(key,val);
            return val;
        }
        return -1;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            map.remove(key);
        }else if (map.size() == cap){
            Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
            iterator.next();
            iterator.remove();
        }
        map.put(key,value);
    }
}