package com.algorithm.www;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @ClassName FrequenceNumber
 * @Author：Mayuan
 * @Date 2020/5/17 20:56
 * @Description TODO
 * @Version 1.0
 * <p>
 * <p>
 * 数字的出现频率
 **/
public class FrequenceNumber {
    public static int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>(16);
        for (int j : nums) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> q = new PriorityQueue<>((o1, o2) -> {
            //按照出现次数高到低，出现次数相同相等按字符
            if (o1.getValue().equals(o2.getValue())) {
                return o1.getKey().compareTo(o2.getKey());
            }
            return o2.getValue() - o1.getValue();
        });

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            q.offer(entry);
        }

        int[] res = new int[nums.length];
        int index = 0;

        while (!q.isEmpty()) {
            final Map.Entry<Integer, Integer> item = q.poll();
            for (int i = 0; i < item.getValue(); i++) {
                res[index++] = item.getKey();
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 2, 3, 3, 1, 6, 4, 4, 4, 4};
        int[] res = frequencySort(nums);
        for (int j : res) {
            System.out.print(j + " ");
        }
    }
}
