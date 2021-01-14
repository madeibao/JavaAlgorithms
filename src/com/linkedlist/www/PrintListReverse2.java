package com.linkedlist.www;

import java.util.Arrays;
import java.util.Stack;

/**
 * @ClassName PrintListReverse2
 * @Author：Mayuan
 * @Date 2020/10/8 17:03
 * @Description TODO
 * @Version 1.0
 * <p>
 * 从尾部到首部的方式来打印一个链表
 **/
public class PrintListReverse2 {
    public static int[] reversePrint(ListNode head) {
        int[] res = new int[getSize(head)];

        // 首先是声明栈结构来构造一个栈。
        // 栈中来逆序的存放着链表的元素值。
        Stack<Integer> stack = new Stack<>();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }

        int i = 0;
        while (!stack.isEmpty()) {
            res[i++] = stack.pop();
        }
        return res;
    }

    private static int getSize(ListNode head) {
        int res = 0;
        while (head != null) {
            head = head.next;
            res++;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] temp = {1, 2, 3, 4, 5};
        ListNode list2 = new ListNode(temp);
        int[] res = reversePrint(list2);
        System.out.println(Arrays.toString(res));
    }
}
