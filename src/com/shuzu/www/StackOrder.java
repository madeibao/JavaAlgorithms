package com.shuzu.www;

import java.util.Stack;

/**
 * @ClassName StackOrder
 * @Author：Mayuan
 * @Date 2020/11/26/0026 20:53
 * @Description TODO
 * @Version 1.0
 * <p>
 * Java的栈的序列
 **/

public class StackOrder {

    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        int j = 0;
        for (i = 0; i < pushed.length; i++) {
            stack.push(pushed[i]);
            while (j < popped.length && !stack.isEmpty() && stack.peek() == popped[j]) {
                j++;
                stack.pop();
            }
        }

        // 最后来判断栈是否为空。
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] num2 = {4, 3, 2, 1};
        System.out.println(validateStackSequences(nums, num2));

    }
}
