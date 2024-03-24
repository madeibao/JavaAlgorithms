package com.KthTop.www;

import java.util.PriorityQueue;

/**
 * @ClassName MinStickLength
 * @Author：Mayuan
 * @Date 2024/3/17/0017 21:46
 * @Description TODO
 * @Version 1.0
 *
 * 非常标准的哈夫曼树构造问题，
 * 最直观的思路就是每次选择当前剩下棒子中最短的两根合并，重复此过程直到完成合并。
 *
 **/
public class MinStickLength {
    public int connectSticks(int[] sticks) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int stick : sticks) {
            minHeap.offer(stick);
        }

        int res = 0;
        while (minHeap.size() >= 2) {
            int x = minHeap.poll(), y = minHeap.poll();
            res += x + y;
            minHeap.offer(x + y);
        }

        return res;
    }
    public static void main(String[] args) {

        int[] sticks = {2,3,4};
        System.out.println(new MinStickLength().connectSticks(sticks));

    }
}
