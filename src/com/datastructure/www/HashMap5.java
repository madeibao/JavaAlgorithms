package com.datastructure.www;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: JavaWorkSpace2->HashMap5
 * @description: 哈希表的方法
 * @author: MaYuan
 * @create: 2020-02-11 16:16
 * @version: 1.0
 **/
public class HashMap5 {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        System.out.println(map.getOrDefault(4, "d"));
        // 返回的是d

    }

}
