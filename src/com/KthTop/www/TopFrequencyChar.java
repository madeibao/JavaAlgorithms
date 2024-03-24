package com.KthTop.www;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @ClassName TopFrequencyChar
 * @Author：Mayuan
 * @Date 2024/3/17/0017 20:55
 * @Description TODO
 * @Version 1.0
 *
 * 根据字符出现频率来进行排序
 **/
public class TopFrequencyChar {

    public static String frequencySort(String s) {

        Map<Character,Integer> map2 = new HashMap<>();
        char[] chs = s.toCharArray();
        for(char c:chs) {
            map2.put(c,map2.getOrDefault(c,0)+1);
        }

        PriorityQueue<Character> queue = new PriorityQueue<>((o1,o2)->map2.get(o2) - map2.get(o1));

        for(char c:map2.keySet()) {
            queue.offer(c);
        }

        StringBuilder sb = new StringBuilder();
        while (!queue.isEmpty()) {
            char c = queue.poll();
            int cnt = map2.get(c);

            while (cnt-->0) {
                sb.append(c);
            }
        }
        return sb.toString();

    }
    public static void main(String[] args) {

        String str = "hello";
        System.out.println(frequencySort(str));
    }
}
