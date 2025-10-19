package com.basicJava8.www;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 * @ClassName TreeMap
 * @Author Mayuan
 * @Date 2025/10/19/星期日 12:21
 * @Version 1.0
 **/
public class TreeMapSort {
    public static void main(String[] args) {
//        Map<String, Integer> map = new TreeMap<>(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                int compare = o2.length() - o1.length();
//                if (compare != 0) {
//                    return compare;
//                }
//                return o1.compareTo(o2);
//            }
//        });

//        Map<String,Integer> map = new TreeMap<>((o1, o2) -> {
//            int compare = o2.length() - o1.length(); // 按字符串长度逆序
//            if (compare != 0) {
//                return compare;
//            }
//            return o1.compareTo(o2); // 长度相同时按字母顺序正序
//        });

        Map<String, Integer> map = new TreeMap<>(
                Comparator.comparingInt(String::length)
                .reversed().thenComparing(Comparator.naturalOrder()));

        map.put("aa",1);
        map.put("ab",2);
        map.put("ac",3);
        map.put("ad3",4);
        map.put("abde",5);
        Iterator<Map.Entry<String, Integer>> entry = map.entrySet().iterator();
        while (entry.hasNext()) {
            Map.Entry<String, Integer> entry1 = entry.next();
            System.out.println(entry1.getKey()+ " " + entry1.getValue());
        }
    }
}
