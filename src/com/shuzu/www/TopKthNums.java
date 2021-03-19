package com.shuzu.www;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName TopKthNums
 * @Author：Mayuan
 * @Date 2020/9/15 11:03
 * @Description TODO
 * @Version 1.0
 * <p>
 * 出现频率最高的k个元素
 **/
public class TopKthNums {
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return map.entrySet()
                .stream()
                .sorted((m1, m2) -> m2.getValue() - m1.getValue())

                // 限制数量为k,返回的是数组。
                .limit(k)
                .mapToInt(Map.Entry::getKey)
                .toArray();
    }

    public static void main(String[] args) {
        int[] res = {1, 1, 1, 1, 2, 2, 2, 3, 3, 3};
        int k = 2;
        int[] res2 = topKFrequent(res, k);
        for (int j : res2) {
            System.out.print(j + " ");
        }
    }
}
