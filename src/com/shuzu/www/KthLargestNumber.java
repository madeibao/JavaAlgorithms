package com.shuzu.www;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @ClassName KthLargestNumber
 * @Author：Mayuan
 * @Date 2020/3/10 15:35
 * @Description TODO
 * @Version 1.0
 * 给定一个数组，返回数组中的第K大的数据，
 * 当然就是排序之后，倒数第k个数据.
 * <p>
 * Input: [3,2,1,5,6,4] and k = 2
 * Output: 5
 **/
public class KthLargestNumber {
    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

    /**
     * 方法2, 维护的小顶堆.
     *
     * @param nums
     * @param k
     * @return
     */
    public static int findKthLargest2(int[] nums, int k) {
        // 小顶堆
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int val : nums) {
            pq.add(val);
            // 维护堆的大小为k
            if (pq.size() > k) {
                pq.poll();
            }
        }
        return pq.peek();
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        int temp = findKthLargest2(nums, k);
        System.out.println(temp);
    }
}




