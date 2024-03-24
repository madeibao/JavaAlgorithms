package com.shuzu.www;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @ClassName WindowMaxNumber
 * @Author：Mayuan
 * @Date 2020/6/9 20:20
 * @Description TODO
 * @Version 1.0
 * <p>
 * 滑动窗口的最大值。
 * 通过一个单调栈来实现滑动窗口的最大值。
 **/
public class WindowMaxNumber {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0 || k == 0) {
            return new int[0];
        }
        Deque<Integer> deque = new LinkedList<>();
        // 总的列表的大小。
        int[] res = new int[nums.length - k + 1];

        // -2, -1, 0
        for (int j = 0, i = 1 - k; j < nums.length; i++, j++) {
            // 删除 deque 中对应的 nums[i-1]
            if (i > 0 && deque.peekFirst() == nums[i - 1]) {
                deque.removeFirst();
            }
            while (!deque.isEmpty() && deque.peekLast() < nums[j]) {

                // 人为的保持递减的数列内容。
                // 保持 deque 递减
                deque.removeLast();
            }
            deque.addLast(nums[j]);


            if (i >= 0) {
                // 记录窗口最大值
                res[i] = deque.peekFirst();
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] res = maxSlidingWindow(nums, k);
        for (int j : res) {
            System.out.println(j);
        }
    }
}
