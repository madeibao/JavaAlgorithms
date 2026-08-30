package com.hashMap.www;

import java.util.*;

/**
 * @ClassName HashMapValue2
 * @Author：Mayuan
 * @Date 2023/10/15/0015 10:43
 * @Description TODO
 * @Version 1.0
 **/
public class HashMapValue2 {

    public static void main(String[] args) {

        // Map按value排序
        HashMap<Character, Integer> map = new HashMap<>();
        String str = "xyxyXXX";
        for (var i : str.toCharArray()) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        List<Map.Entry<Character, Integer>> list = getEntries(map);
        StringBuilder res = new StringBuilder();
        for (var j : list) {
            System.out.println(j.getKey() + " " + j.getValue());
        }
        for (var k : list) {
            res.append(k.getKey()).append(":").append(k.getValue()).append(";");
        }
        System.out.println(res);
    }

    private static List<Map.Entry<Character, Integer>> getEntries(HashMap<Character, Integer> map) {
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((o1, o2) -> {
            /** return o2.getValue()-o1.getValue(); */
            if (!Objects.equals(o1.getValue(), o2.getValue())) {
                return o2.getValue() - o1.getValue();
            } else if (!Objects.equals(o2.getKey(), o1.getKey())) {
                return o1.getKey() - o2.getKey();
            }
            return 0;
        });
        return list;
    }
}
