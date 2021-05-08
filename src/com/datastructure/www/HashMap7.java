package com.datastructure.www;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName HashMap7
 * @Author：Mayuan
 * @Date 2021/4/6/0006 10:26
 * @Description TODO
 * @Version 1.0
 *
 * 通过java8 的流式遍历方法，
 *
 *
 **/
public class HashMap7 {
    public static void main(String[] args) {
        // 创建并赋值 HashMap
        Map<Integer, String> map = new HashMap();
        map.put(1, "Java");
        map.put(2, "JDK");
        map.put(3, "Spring Framework");
        map.put(4, "MyBatis framework");
        map.put(5, "Java中文社群");
        // 遍历
        map.entrySet().stream().forEach((entry) -> {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        });
    }
}
