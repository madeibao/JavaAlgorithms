package com.KthTop.www;

import java.util.PriorityQueue;

/**
 * @ClassName KthLargestNum
 * @Author：Mayuan
 * @Date 2024/3/17/0017 21:25
 * @Description TODO
 * @Version 1.0
 **/
public class KthLargestNum {
    public static int findKthLargest(int[] nums, int k) {
        int len = nums.length;
        //构造有len个元素的小顶堆
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(len);
        //把 len 个元素都放入一个最小堆中
        for(int num: nums){
            minHeap.offer(num);
        }
        //然后再 poll() 出 len - k 个元素
        for(int i=0;i<len-k;i++){
            minHeap.poll();
        }
        //此时最小堆只剩下 k 个元素，堆顶元素就是数组中的第 k 个最大元素
        return minHeap.peek();
    }
    public static void main(String[] args) {

        int[] nums = {3,2,1,5,6,4};
        int k = 2;

        System.out.println(findKthLargest(nums,k));
    }
}
