package com.shuzu.www;

import java.util.PriorityQueue;

/**
 * @ClassName KthNumber3
 * @Author：Mayuan
 * @Date 2021/3/30/0030 20:42
 * @Description TODO
 * @Version 1.0
 *
 * 数组第第k大的数字。
 *
 **/
public class KthNumber3 {

    /**
     * 通过构建堆的方式来实现数组的第k大的数字。
     * @param args
     */

    public static int findKthLargest(int[] nums, int k) {
        int len = nums.length;

        // 构建堆的大小为len
        PriorityQueue<Integer> queue = new PriorityQueue<>(len);
        for(int num:nums) {
            queue.offer(num);
        }

        /**
         * 最小堆首先弹出这些个元素。
         */
        for(int i=0;i<len-k;i++) {
            queue.poll();
        }

        if(queue.peek()!=null) {
            return queue.peek();
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] nums= {1,2,3,4,5,6,7};
        int k = 2;
        System.out.println(findKthLargest(nums, k));
    }
}
