package com.linkedlist.www;

import java.util.Stack;

/**
 * @program: JavaWorkSpace2->PrintListReverse
 * @description: 逆序打印单链表
 * @author: MaYuan
 * @create: 2020-01-07 18:50
 * @version: 1.0
 * <p>
 * 将一个链表中的节点内容逆序打印出来。
 **/
public class PrintListReverse {
    private static void printListNode(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode cur = head;
        while (cur != null) {
            stack.push(cur.val);
            cur = cur.next;
        }

        while (!stack.isEmpty()) {

            // 每次打印顶端的内容。
            System.out.print(stack.peek() + "->");
            stack.pop();
        }
    }

    private static void printListNode2(ListNode head) {
        if (head != null) {
            if (head.next != null) {
                printListNode2(head.next);
            }
        }
        System.out.print(head.val + "->");
    }

    public static void main(String[] args) {
        int[] list2 = {1, 2, 3, 4};
        ListNode head = new ListNode(list2);
        printListNode2(head);
    }
}
