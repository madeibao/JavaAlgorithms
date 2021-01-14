package com.datastructure.www;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @ClassName TreeMapTest
 * @Author：Mayuan
 * @Date 2020/6/13 9:10
 * @Description TODO
 * @Version 1.0
 * <p>
 * 字典树结构，
 * 是根据有序的结果值来进行排列的。
 * TreeMap 是线程不安全的。
 * <p>
 * TreeMap能便捷的实现对其内部元素的各种排序，但其一般性能比前两种map差。
 * 通过牺牲性能保持有序。
 **/
public class TreeMapTest {
    public static void main(String[] args) {
        HashMap<Integer, String> hmap = new HashMap<>();
        hmap.put(13, "Yellow");
        hmap.put(3, "Red");
        hmap.put(2, "Green");
        hmap.put(33, "Blue");
        System.out.println("key & values in hmap:");
        for (Map.Entry entry : hmap.entrySet()) {
            System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue());
        }

        // 默认的是根据字典序的升序来进行排列的。
        System.out.println("----------------------------------------");
        TreeMap<Integer, String> tmap = new TreeMap<>(hmap);
        System.out.println("key & values in tmap:");
        for (Map.Entry entry : tmap.entrySet()) {
            System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue());
        }
    }
}
