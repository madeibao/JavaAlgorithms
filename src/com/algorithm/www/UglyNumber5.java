package com.algorithm.www;

import java.util.PriorityQueue;

/**
 * @ClassName UglyNumber5
 * @Author：Mayuan
 * @Date 2020/8/9 10:57
 * @Description TODO
 * @Version 1.0
 * <p>
 * 超级丑数5
 **/
public class UglyNumber5 {
    public int nthSuperUglyNumber(int n, int[] primes) {
        PriorityQueue<Long> queue = new PriorityQueue<>();
        long res = 1;
        for (int i = 1; i < n; i++) {
            System.out.println(queue.toString());
            for (int prime : primes) {
                queue.add(prime * res);
            }

            res = queue.poll();
            while (!queue.isEmpty() && res == queue.peek()) {
                queue.poll();
            }
        }
        return (int) res;
    }

    public static void main(String[] args) {
        int n = 12;
        int[] primes = {2, 7, 13, 19};
        System.out.println(new UglyNumber5().nthSuperUglyNumber(n, primes));
    }

}
