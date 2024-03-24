package com.shuzu.www;

import java.util.PriorityQueue;

/**
 * @ClassName MaxWindowNumber
 * @Author：Mayuan
 * @Date 2020/7/24 9:57
 * @Description TODO
 * @Version 1.0
 * <p>
 * 滑动窗口的最大值。
 **/
public class MaxWindowNumber {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) {
            return new int[0];
        }

        // 这里创建的是一个大顶堆。
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>((a, b) -> b - a);
        for (int i = 0; i < k; i++) {
            queue.add(nums[i]);
        }
        int[] res = new int[nums.length - k + 1];
        int j = 0;
        res[j++] = queue.peek();

        for (int i = k; i < nums.length; i++) {
            // 把链表的一个去掉。
            queue.remove(nums[i - k]);
            queue.add(nums[i]);
            res[j++] = queue.peek();
        }

        return res;
    }

    public static void main(String[] args) {

        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] res = new MaxWindowNumber().maxSlidingWindow(nums, k);
        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}
