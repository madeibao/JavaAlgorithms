package com.shuzu.www;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @ClassName TopKthNumber3
 * @Author：Mayuan
 * @Date 2020/10/10 14:53
 * @Description TODO
 * @Version 1.0
 * <p>
 * 最小的k个数字。
 **/
public class TopKthNumber3 {
    public static int[] getLeastNumbers(int[] arr, int k) {

        if (arr == null || arr.length == 0) {
            return null;
        }
        PriorityQueue<Integer> res = new PriorityQueue<>((o1, o2) -> o2 - o1);

        for (int num : arr) {
            if (res.size() < k) {
                res.offer(num);
            } else if (num < res.peek()) {
                res.poll();
                res.offer(num);
            }
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 2;
        int[] res = getLeastNumbers(nums, k);
        System.out.println(Arrays.toString(res));
    }
}
