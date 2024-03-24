package com.datastructure.www;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName HashMap6
 * @Author：Mayuan
 * @Date 2020/2/18 16:52
 * @Description TODO
 * @Version 1.0
 * <p>
 * <p>
 * 最常规的构建字典的方法。
 **/
public class HashMap6 {

    public static void main(String[] args) {
        int[] nums = {3, 4, 4, 4,};
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}



