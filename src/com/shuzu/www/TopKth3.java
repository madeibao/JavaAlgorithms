package com.shuzu.www;

import java.util.PriorityQueue;

/**
 * @ClassName TopKth3
 * @Author：Mayuan
 * @Date 2020/10/28 9:24
 * @Description TODO
 * @Version 1.0
 * <p>
 * 数组中的第k 大的元素内容。
 * 在未排序的数组中找到第 k 个最大的元素。请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [3,2,1,5,6,4] 和 k = 2
 * 输出: 5
 * 示例 2:
 * <p>
 * 输入: [3,2,3,1,2,4,5,5,6] 和 k = 4
 * 输出: 4
 **/

public class TopKth3 {
    public static int findKthLargest(int[] nums, int k) {
        int len = nums.length;
        //构造有len个元素的小顶堆
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(len);
        //把 len 个元素都放入一个最小堆中
        for (int num : nums) {
            minHeap.offer(num);
        }
        //然后再 poll() 出 len - k 个元素
        for (int i = 0; i < len - k; i++) {
            minHeap.poll();
        }
        //此时最小堆只剩下 k 个元素，堆顶元素就是数组中的第 k 个最大元素
        return minHeap.peek();
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        System.out.println(findKthLargest(nums, k));
    }
}
