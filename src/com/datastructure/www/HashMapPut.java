package com.datastructure.www;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName HashMapPut
 * @Author：Mayuan
 * @Date 2023/8/31/0031 9:05
 * @Description TODO
 * @Version 1.0
 **/
public class HashMapPut {
    public static void main(String[] args) {

        HashMap<Integer,Integer> map = new HashMap<>();
        int[] nums ={2,3,2,3,1,1,1,3};

        for(int i:nums) {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
        for (Map.Entry<Integer,Integer> entry : entrySet) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

    }
}

