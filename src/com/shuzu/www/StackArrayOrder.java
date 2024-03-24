package com.shuzu.www;

import java.util.Stack;

/**
 * @ClassName StackArray
 * @Author：Mayuan
 * @Date 2020/5/27 20:50
 * @Description TODO
 * @Version 1.0
 * <p>
 * 一个栈的弹出和弹入的顺序
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序。假设压入栈的所有数字均不相等。
 * 例如，序列 {1,2,3,4,5} 是某栈的压栈序列，序列 {4,5,3,2,1} 是该压栈序列对应的一个弹出序列，
 * 但 {4,3,5,1,2} 就不可能是该压栈序列的弹出序列。 
 * <p>
 * 示例 1：
 * <p>
 * 输入：pushed = [1,2,3,4,5], popped = [4,5,3,2,1]
 * 输出：true
 * 解释：我们可以按以下顺序执行：
 * push(1), push(2), push(3), push(4), pop() -> 4,
 * push(5), pop() -> 5, pop() -> 3, pop() -> 2, pop() -> 1
 * 示例 2：
 * <p>
 * 输入：pushed = [1,2,3,4,5], popped = [4,3,5,1,2]
 * 输出：false
 * 解释：1 不能在 2 之前弹出。
 * <p>
 * 来源：力扣（LeetCode)
 * 链接：https://leetcode-cn.com/problems/zhan-de-ya-ru-dan-chu-xu-lie-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/
public class StackArrayOrder {

    public static boolean validateStackSequences(int[] pushed, int[] popped) {

        if (pushed == null || popped == null) {
            return false;
        }

        if (pushed.length == 0 || popped.length == 0) {
            return false;
        }

        if (pushed.length != popped.length) {
            return false;
        }
        int j = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < pushed.length; i++) {
            stack.push(pushed[i]);
            // 当栈不为空的时候，或者是栈顶指针的位置。
            while (!stack.isEmpty() && stack.peek() == popped[j]) {
                stack.pop();
                j += 1;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 3, 2, 1};
        System.out.println(validateStackSequences(arr1, arr2));
    }
}
