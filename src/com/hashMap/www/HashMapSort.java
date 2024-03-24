package com.hashMap.www;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @ClassName HashMapSort
 * @Author：Mayuan
 * @Date 2023/10/15/0015 10:34
 * @Description TODO
 * @Version 1.0
 **/
public class HashMapSort {

    public static void main(String[] args) {

        Map<Character,Integer> map = new HashMap<>();
        String str = "abababb";


        Map<Character, Integer> sortedMap = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors
                        .toMap(Map.Entry::getKey,
                                Map.Entry::getValue,
                                (e1, e2) -> e2,
                                LinkedHashMap::new));

        for(var i:str.toCharArray()) {
            sortedMap.put(i,sortedMap.getOrDefault(i,0)+1);
        }

        for(var i:sortedMap.keySet()) {
            System.out.println(i+" "+sortedMap.get(i));
        }
    }
}
