package com.datastructure.www.hashmap2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @ClassName Map3
 * @Author：Mayuan
 * @Date 2020/9/28 9:06
 * @Description TODO
 * @Version 1.0
 **/
public class Map3 {
    public static void main(String[] args) {
        // 创建并赋值 HashMap
        Map<Integer, String> map = new HashMap();
        map.put(1, "Java");
        map.put(2, "JDK");
        map.put(3, "Spring Framework");
        map.put(4, "MyBatis framework");
        map.put(5, "Java中文社群");
        // 遍历
        Iterator<Integer> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            Integer key = iterator.next();
            System.out.println(key);
            System.out.println(map.get(key));
        }
    }
}
