package com.datastructure.www.hashmap2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @ClassName Map2
 * @Author：Mayuan
 * @Date 2020/9/28 9:04
 * @Description TODO
 * @Version 1.0
 * <p>
 * Hashmap的遍历方式
 **/
public class Map2 {
    public static void main(String[] args) {
        // 创建并赋值 HashMap
        Map<Integer, String> map = new HashMap();
        map.put(1, "Java");
        map.put(2, "JDK");
        map.put(3, "Spring Framework");
        map.put(4, "MyBatis framework");
        map.put(5, "Java中文社群");
        // 遍历
        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
