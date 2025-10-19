package com.basicJava8.www;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName HashMapSort
 * @Author Mayuan
 * @Date 2025/10/19/星期日 12:09
 * @Version 1.0
 **/
public class HashMapSort {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("A2", 3);
        map.put("B2", 4);
        map.put("A3a", 5);
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                int compare = o1.getKey().compareTo(o2.getKey());
                if (compare != 0) {
                    return compare;
                }
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        // 按key逆序
//        TreeMap<String, Integer> treeMap = new TreeMap<>((o1, o2) -> o2.compareTo(o1));
//
//// 或者使用方法引用
//        TreeMap<String, Integer> treeMap = new TreeMap<>(Comparator.reverseOrder());

        for (var j : list) {
            System.out.println(j.getKey() + " " + j.getValue());
        }
    }
}
