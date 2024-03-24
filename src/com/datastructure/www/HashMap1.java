package com.datastructure.www;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: Pro1->HashMap1
 * @description: 基本的hash表
 * @author: MaYuan
 * @create: 2019-12-23 18:23
 * @version: 1.0
 * <p>
 * hash表的基本的用法内容。
 **/
public class HashMap1 {
    public static void main(String[] args) {
        /**
         * 最常见也是大多数情况下用的最多的，一般在键值对都需要使用
         */
        // 初始化的时候，尽量的初始化值的内容。
        Map<String, String> map = new HashMap<String, String>(2);
        map.put("熊大", "棕色");
        map.put("熊二", "黄色");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String mapKey = entry.getKey();
            String mapValue = entry.getValue();
            System.out.println(mapKey + ":" + mapValue);
        }
    }
}
