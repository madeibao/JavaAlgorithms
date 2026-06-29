package com.basicJava11.www;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @ClassName ListToArray
 * @Author Mayuan
 * @Date 2026/6/29/星期一 18:17
 * @Version 1.0
 **/
public class ListToArray {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("aaa","aab","aac","aad");
        String[] strs;
        strs = list.toArray(String[]::new);
        for(String s: strs) {
            System.out.println(s + " ");
        }
        List<Integer> list2 = List.of(1,1,1,2);
        Integer[] nums = list2.toArray(Integer[]::new);
        for(var j: nums) {
            System.out.print(j+" ");
        }
        System.out.println("\n----------");
        int[] res = Arrays.stream(nums).mapToInt(Integer::valueOf).toArray();
        for(int k: res) {
            System.out.print(k+" ");
        }
    }
}
