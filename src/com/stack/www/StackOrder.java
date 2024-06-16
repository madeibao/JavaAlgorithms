package com.stack.www;

import java.util.Stack;

/**
 * @ClassName StackOrder
 * @Author：Mayuan
 * @Date 2024/5/5/0005 22:32
 * @Description TODO
 * @Version 1.0
 **/
public class StackOrder {
    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        int j = 0;
        int i = 0;
        Stack<Integer> stack = new Stack<>();
        while (i<pushed.length&&j<popped.length) {
            stack.push(pushed[i]);
            while ( !stack.empty()&& stack.peek()==popped[j]) {
                stack.pop();
                j++;
            }
            i+=1;
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {

        int[] pushed = {1,2,3,4,5}, popped = {4,5,3,2,1};
        System.out.println(validateStackSequences(pushed,popped));

    }
}
