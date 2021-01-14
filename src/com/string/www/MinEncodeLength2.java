package com.string.www;

/**
 * @ClassName MinEncodeLength2
 * @Author：Mayuan
 * @Date 2020/10/10 9:51
 * @Description TODO
 * @Version 1.0
 * <p>
 * <p>
 * 一个字符串的最小的编码的长度值。
 **/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.PriorityQueue;

public class MinEncodeLength2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        while ((line = br.readLine()) != null) {
            HashMap<Character, Integer> map = new HashMap<>();
            for (char c : line.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            for (int v : map.values()) {
                pq.offer(v);
            }
            int ans = 0;
            while (pq.size() > 1) {
                int a = pq.poll(), b = pq.poll();
                ans += a + b;
                pq.offer(a + b);
            }
            System.out.println(ans);
        }
    }
}
