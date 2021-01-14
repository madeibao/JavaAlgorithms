package com.linkedlist.www;

import java.util.Stack;

/**
 * @ClassName PrintReverseList
 * @Author：Mayuan
 * @Date 2020/3/4 21:11
 * @Description TODO
 * @Version 1.0
 * <p>
 * 从头到尾部的打印链表。
 * <p>
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 * 示例 1：
 * <p>
 * 输入：head = [1,3,2]
 * 输出：[2,3,1]
 **/
public class PrintReverseList {

    public static int[] reversePrint(ListNode head) {
        int[] arr = new int[getSize(head)];
        Stack<Integer> stack = new Stack<>();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }

        int i = 0;
        while (!stack.isEmpty()) {
            int temp = stack.pop();
            arr[i++] = temp;
        }
        return arr;
    }

    private static int getSize(ListNode head) {
        int size = 0;
        while (head != null) {
            size++;
            head = head.next;
        }
        return size;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        ListNode list = new ListNode(nums);
        int[] arr = reversePrint(list);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
