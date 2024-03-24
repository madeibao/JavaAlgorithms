package com.datastructure.www;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @program: Pro1->HashMapTraverse
 * @description: 哈希表的基本遍历
 * @author: MaYuan
 * @create: 2019-12-23 18:34
 * @version: 1.0
 * 各种形式的遍历。
 * *   HashMap循环遍历方式及其性能对比
 * *   测试环境为Windows7 32位系统 3.2G双核CPU 4G内存，Java 7，Eclipse -Xms512m -Xmx512m
 * <p>
 * compare loop performance of HashMap
 * -----------------------------------------------------------------------
 * map size               | 10,000    | 100,000   | 1,000,000 | 2,000,000
 * -----------------------------------------------------------------------
 * for each entrySet      | 2 ms      | 6 ms      | 36 ms     | 91 ms
 * -----------------------------------------------------------------------
 * for iterator entrySet  | 0 ms      | 4 ms      | 35 ms     | 89 ms
 * -----------------------------------------------------------------------
 * for each keySet        | 1 ms      | 6 ms      | 48 ms     | 126 ms
 * -----------------------------------------------------------------------
 * for entrySet=entrySet()| 1 ms      | 4 ms      | 35 ms     | 92 ms
 * -----------------------------------------------------------------------
 **/
public class HashMapTraverse {
    static void goThrough() {
        //第一种遍历
        Map<String, String> map = new HashMap<String, String>(2);
        for (Entry<String, String> entry : map.entrySet()) {
            entry.getKey();
            entry.getValue();
        }

        //第二种遍历
        Iterator<Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Entry<String, String> entry = iterator.next();
            entry.getKey();   //获得键
            entry.getValue(); //获得值。
        }

        //第三种遍历
        Map<String, String> map2 = new HashMap<String, String>(2);
        for (String key : map2.keySet()) {
            //获得键
            map2.get(key);
        }
        for (String value : map2.values()) {
            //获得值。
            map2.get(value);
        }

        // 第四种遍历
        Set<Entry<String, String>> entrySet = map.entrySet();
        for (Entry<String, String> entry : entrySet) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        // 第五种遍历
        map2.forEach((k, v) -> System.out.println(k + "=" + v));
    }

    public static void main(String[] args) {
        Map<String, String> map2 = new HashMap<>(2);
        map2.put("1", "12");
        map2.put("2", "14");
        map2.forEach((k, v) -> System.out.println(k + "->" + v));
    }
}
