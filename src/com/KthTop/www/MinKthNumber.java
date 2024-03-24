package com.KthTop.www;

import java.util.PriorityQueue;

/**
 * @ClassName MinKNumber
 * @Author：Mayuan
 * @Date 2024/3/17/0017 21:17
 * @Description TODO
 * @Version 1.0
 *
 *
 * 求最小的 k 个数字
 *
 **/
public class MinKthNumber {
    public static int[] smallestK(int[] arr, int k) {

        PriorityQueue<Integer> queue = new PriorityQueue<>(k+1);
        for(int i=0;i<arr.length;i++) {
            queue.offer(arr[i]);
        }
        int[] res = new int[k];
        int size = 0;
        while (size<k){
            res[size++] = queue.poll();
        }
        return res;
    }
    public static void main(String[] args) {

        int[] arr = {1,3,5,7,2,4,6,8};
        int k = 4;
        int[] res = smallestK(arr,k);
        for(int i:res) {
            System.out.print(i+" ");
        }

    }
}
