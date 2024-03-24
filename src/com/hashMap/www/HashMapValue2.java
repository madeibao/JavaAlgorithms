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
        String str = "xyxyXX";

        for(var i:str.toCharArray()) {
            map.put(i,map.getOrDefault(i,0)+1);
        }

        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                /** return o2.getValue()-o1.getValue(); */
                if(o1.getValue()!=o2.getValue()) {
                    return o2.getValue()-o1.getValue();
                }
                else if(o1.getKey().equals(o2.getKey())){
                    return o1.getKey()-o2.getKey();
                }
                return 0;
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
