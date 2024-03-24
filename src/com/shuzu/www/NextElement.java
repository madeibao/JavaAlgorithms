package com.shuzu.www;

import java.util.Stack;

/**
 * @ClassName NextElement
 * @Author：Mayuan
 * @Date 2020/5/6 23:20
 * @Description TODO
 * @Version 1.0
 * <p>
 * 下一个元素结果值
 * 更大的元素值。
 **/
public class NextElement {
    public static int[] findNext(int[] A, int n) {
        // write code here
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < A.length; i++) {
            while (!stack.isEmpty() && A[stack.peek()] < A[i]) {
                A[stack.pop()] = A[i];
            }
            stack.add(i);
        }
        while (!stack.empty()) {
            A[stack.pop()] = -1;
        }
        return A;
    }

    public static void main(String[] args) {
        int[] nums = {11, 13, 10, 5, 12, 21, 3};
        int n = 7;
        int[] temp = findNext(nums, n);

        for (int i : temp) {
            System.out.print(i + " ");
        }
    }
}
