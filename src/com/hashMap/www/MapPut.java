package com.hashMap.www;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @ClassName MapPut
 * @Author Mayuan
 * @Date 2026/1/11/星期日 18:22
 * @Version 1.0
 **/
public class MapPut {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);

        // key已存在 - 不执行任何操作，返回现有值
        Integer result1 = map1.putIfAbsent("A", 100);
        System.out.println(result1);    // 1
        System.out.println(map1.get("A")); // 1 (未改变)

        // key不存在 - 插入新值，返回null
        Integer result2 = map1.putIfAbsent("B", 2);
        System.out.println(result2);    // null
        System.out.println(map1.get("B")); // 2 (已插入)
    }
}
