package com.shuzu.www;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

/**
 * @ClassName TopKthNumber2
 * @Author：Mayuan
 * @Date 2020/9/27 10:27
 * @Description TODO
 * @Version 1.0
 * 数组中的前k个高频的元素内容/
 **/
public class TopKthNumber2 {
    public static int[] topKFrequent(int[] nums, int k) {
        if (nums == null) {
            return null;
        }

        HashMap<Integer, Integer> dictionary = new HashMap<>();

        // 将 数字 和 其出现次数 存放到 map 中
        for (int num : nums) {
            if (!dictionary.containsKey(num)) {
                dictionary.put(num, 1);
            } else {
                dictionary.put(num, dictionary.get(num) + 1);
            }
        }
        // 最小堆
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(dictionary::get));
        for (Integer key : dictionary.keySet()) {
            // 当 最小堆的大小 小于 k 时
            if (priorityQueue.size() < k) {
                priorityQueue.add(key);

            } else if (dictionary.get(key) > dictionary.get(priorityQueue.peek())) {

                // 保证 堆顶元素的出现频率 > 正遍历到的元素
                priorityQueue.remove();
                priorityQueue.add(key);
            }
        }

        int[] result = new int[k];
        int index = 0;
        while (!priorityQueue.isEmpty()) {
            result[index++] = priorityQueue.remove();
        }
        // 由于题目说明 返回结果可以按照任意顺序，因此，此处不需要反置，可以直接返回
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        int[] res = topKFrequent(nums, k);
        for (int j : res) {
            System.out.print(j + " ");
        }
    }
}
