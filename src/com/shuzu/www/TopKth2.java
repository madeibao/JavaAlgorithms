package com.shuzu.www;

import java.util.PriorityQueue;

/**
 * @ClassName TopKth2
 * @Author：Mayuan
 * @Date 2020/9/18 11:17
 * @Description TODO
 * @Version 1.0
 * <p>
 * 一个数组中的第K大的数字。
 **/
public class TopKth2 {

    public static int kthNumber(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> (o1 - o2));
        for (int n : nums) {
            queue.add(n);
            if (queue.size() > k) {
                queue.poll();
            }
        }
        return queue.poll();
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        System.out.println(kthNumber(nums, k));
    }
}





