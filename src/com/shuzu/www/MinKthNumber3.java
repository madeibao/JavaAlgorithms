package com.shuzu.www;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @ClassName MinKthNumber3
 * @Author：Mayuan
 * @Date 2020/12/31/0031 21:51
 * @Description TODO
 * @Version 1.0
 * 最小的k 个数字
 *
 *
 **/
public class MinKthNumber3 {

    public static int[] getLeastNumbers(int[] arr, int k) {
        if(k<=0) {
            return new int[]{};
        }
        PriorityQueue<Integer> queue =new PriorityQueue<>((o1,o2)->o2-o1);

        for(int num:arr) {
            if(queue.size()<k) {
                queue.add(num);
            }
            else if(num<queue.peek()) {
                queue.poll();
                queue.add(num);
            }
        }
        return queue.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] nums ={3,2,1};
        int k =2;
        int[] res = getLeastNumbers(nums, k);
        System.out.println(Arrays.toString(res));

    }
}
