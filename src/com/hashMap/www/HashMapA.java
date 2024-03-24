package com.hashMap.www;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName HashMapA
 * @Author：Mayuan
 * @Date 2023/10/15/0015 10:28
 * @Description TODO
 * @Version 1.0
 **/
public class HashMapA {

    public static void main(String[] args) {

        Map<Character,Integer> map = new HashMap<>();
        String str = "abababb";

        for(var i:str.toCharArray()) {
            map.put(i,map.getOrDefault(i,0)+1);
        }

        for(var k:map.keySet()) {
            System.out.println(k+" "+map.get(k));
        }
    }
}
