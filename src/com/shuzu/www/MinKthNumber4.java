package com.shuzu.www;

import java.util.PriorityQueue;

/**
 * @ClassName MinKthNumber4
 * @Author：Mayuan
 * @Date 2020/8/24 20:29
 * @Description TODO
 * @Version 1.0
 * <p>
 * 一个数组中的最小的k个数字。
 *
 * //最小的k 个数字。
 **/
public class MinKthNumber4 {
    public static int[] getLeastNumbers(int[] arr, int k) {
        if (k == 0 || arr.length == 0) {
            return new int[]{};
        }

        // 默认的是小的在前面。
        PriorityQueue<Integer> res = new PriorityQueue<>((o1, o2) -> (o2 - o1));

        for (int num : arr) {
            if (res.size() < k) {
                res.add(num);
            } else if (num < res.peek()) {
                res.poll();
                res.add(num);
            }
        }

        int index = 0;
        int[] arr2 = new int[res.size()];

        for (int temp : res) {
            arr2[index++] = temp;
        }
        return arr2;


        /** 也可以采用流式的处理方式，
         * 采用 Java流的处理方式。
         *     int[] arr2 = res.stream().mapToInt(Integer::intValue).toArray();
         */


    }

    public static void main(String[] args) {
        int[] res = new int[]{2, 3, 4, 3, 4, 2, 3, 9, 12, 3, 4, 45, 9,};
        int k = 2;
        int[] temp = getLeastNumbers(res, k);
        for (int m : temp) {
            System.out.println(m);
        }
    }
}
