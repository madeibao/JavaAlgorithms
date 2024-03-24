package com.shuzu.www;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @ClassName MaxWindowNumber2
 * @Author：Mayuan
 * @Date 2020/12/22/0022 15:28
 * @Description TODO
 * @Version 1.0
 * <p>
 * 滑动窗口的最大值。
 **/
public class MaxWindowNumber2 {

    public ArrayList<Integer> maxInWindows(int[] num, int size) {
        /*
        思路：用双端队列实现
        */
        ArrayList<Integer> res = new ArrayList<>();
        if (num == null || num.length < 1 || size <= 0 || size > num.length) {
            return res;
        }
        Deque<Integer> queue = new LinkedList<>();
        for (int i = 0; i < num.length; i++) {
            // 超过范围的去掉。
            while (!queue.isEmpty() && queue.peek() < i - size + 1) {
                queue.poll();
            }
            //当前值大于之前的值，之前的不可能是最大值，可以删掉
            while (!queue.isEmpty() && num[i] >= num[queue.getLast()]) {
                queue.removeLast();
            }
            queue.add(i);
            if (i >= size - 1) {
                //此时开始是第一个滑动窗口.                            
                res.add(num[queue.peek()]);
            }
        }
        return res;
    }

    public static void main(String[] args) {

        int[] nums = {2, 3, 4, 2, 6, 2, 5, 1};
        ArrayList<Integer> list2 = new MaxWindowNumber2().maxInWindows(nums, 3);
        list2.forEach(System.out::println);
    }
}
