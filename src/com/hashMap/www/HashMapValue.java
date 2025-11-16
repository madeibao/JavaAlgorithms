package com.hashMap.www;

import java.util.*;

/**
 * @ClassName HashMapValue
 * @Author：Mayuan
 * @Date 2023/10/15/0015 10:39
 * @Description TODO
 * @Version 1.0
 **/
public class HashMapValue {
    public static void main(String[] args) {

        //        Map按value排序
        HashMap<String, Long> map = new HashMap<String, Long>();

        map.put("A", (long) 99);
        map.put("C", (long) 109);
        map.put("B", (long) 67);
        map.put("D", (long) 2);

        System.out.println("unsorted map: " + map);

        List<Map.Entry<String, Long>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Long>>() {
            @Override
            public int compare(Map.Entry<String, Long> o1, Map.Entry<String, Long> o2) {
                return (int) (o2.getValue() - o1.getValue());
            }
        });

        String res = "";

        for(var j:list) {
            System.out.println(j.getKey()+" "+j.getValue());
        }

        for(var k:list) {
            res+=k.getKey()+":"+k.getValue()+";";
        }

        System.out.println(res);
    }
}
