package com.KthTop.www;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

/**
 * @ClassName TopWords
 * @Author：Mayuan
 * @Date 2024/3/17/0017 20:54
 * @Description TODO
 * @Version 1.0
 *
 *
 * 选出前K个高频数字
 **/
public class TopWords {
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i:nums) {
            map.put(i,map.getOrDefault(i,0)+1);
        }

        PriorityQueue<int[]> queue = new PriorityQueue<int[]>(new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return b[1]-a[1];
            }
        });

        for(int key:map.keySet()) {
            queue.add(new int[]{key,map.get(key)});
        }

        int[] ans = new int[k];
        for(int i=0;i<k;i++) {
            ans[i] = queue.poll()[0];
        }
        return ans;
    }


    public static void main(String[] args) {

        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        int[] res = topKFrequent(nums,k);
        for(int i:res) {
            System.out.print(i+" ");
        }
    }
}
