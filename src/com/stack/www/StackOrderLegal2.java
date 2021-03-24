package com.stack.www;

import java.util.Stack;

/**
 * @program: Pro1->StackOrderLegal2
 * @description: 判断出栈和入栈顺序是否合法
 * @author: MaYuan
 * @create: 2019-12-24 21:58
 * @version: 1.0
 * * 判断栈的顺序是否为合法的。
 * * 给定两个数组判断另一个数组是否为一个数组的合法的栈的弹出内容。
 * * 假如入栈序列为1 2 3 4 5，判断4 5 3 2 1 是否是合法的出栈顺序。
 **/
public class StackOrderLegal2 {
    private static boolean isLegal(int[] push, int[] pop) {
        if (push == null || pop == null || push.length == 0 || pop.length == 0 || push.length != pop.length) {
            return false;
        }
        Stack<Integer> stack = new Stack<>();
        //用于记录入栈数组元素的处理位置内容。
        int pushIndex = 0;
        //用于记录出栈数组元素的处理位置内容。
        int popIndex = 0;

        while (popIndex < pop.length) {
            while (pushIndex < push.length && (stack.isEmpty() || stack.peek() != pop[popIndex])) {
                // 入栈数组中的元素入栈
                stack.push(push[pushIndex]);
                // 指向下一个要处理的入栈元素
                pushIndex++;
            }
            // 如果在上一步的入栈过程中找到了与出栈的元素相等的元素
            if (stack.peek() == pop[popIndex]) {
                // 将元素出栈
                stack.pop();
                // 处理下一个出栈元素
                popIndex++;
            }
            //最后的栈一定是一个为空的栈。
            // 如果没有找到与出栈元素相等的元素，说明这个出栈顺序是不合法的
            // 就返回false
            else {
                return false;
            }
        }

        // 下面的语句总是成立的
        // return stack.isEmpty();
        // 为什么可以直接返回true：对上面的外层while进行分析可知道，对每一个入栈的元素，
        // 在stack栈中，通过一些入栈操作，总可以在栈顶上找到与入栈元素值相同的元素，
        // 这就说明了这个出栈的顺序是入栈顺序的一个弹出队列，这也可以解释为什么stack.isEmpty()
        // 总是返回true，所有的入栈元素都可以进栈，并且可以被匹配到，之后就弹出，最后栈中就无元素。

        return true;
    }

    // 判断是否为合法的弹入和弹出顺序。
    private static boolean isLegal2(int[] push, int[] pop) {
        if (push == null || pop == null || push.length == 0 || pop.length == 0 || push.length != pop.length) {
            return false;
        }
        int popIndex = 0;
        int pushIndex = 0;
        Stack<Integer> stack = new Stack<>();
        while (popIndex < pop.length) {
            while (pushIndex < push.length && (stack.isEmpty() || stack.peek() != pop[popIndex])) {
                stack.push(push[pushIndex]);
                pushIndex++;
            }
            if (stack.peek() == pop[popIndex]) {
                stack.pop();
                popIndex++;
            }
            else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] push = {1, 2, 3, 4, 5};
        int[] pop1 = {4, 5, 3, 2, 1};

        int[] push6 = {1};
        int[] pop6 = {1};
        System.out.println(isLegal2(push6, pop6));
    }
}
