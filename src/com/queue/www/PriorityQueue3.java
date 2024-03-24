package com.queue.www;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @ClassName PriorityQueue3
 * @Author：Mayuan
 * @Date 2020/5/10 20:19
 * @Description TODO
 * @Version 1.0
 * <p>
 * 优先权队列2
 **/
public class PriorityQueue3 {
    public static void main(String[] args) {

        Queue<Integer> q = new PriorityQueue<>();
        int[] nums = {2, 5, 3, 4, 1, 6};
        for (int i : nums) {
            q.add(i);
        }
        Object[] nn = q.toArray();
        Arrays.sort(nn);
        for (int i = nn.length - 1; i >= 0; i--) {
            System.out.print((int) nn[i] + " ");
        }
        /**
         * 输出结果
         * 6 5 4 3 2 1
         */
    }
}
