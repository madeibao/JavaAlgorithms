package com.linkedlist.www;

import java.util.Stack;

/**
 * @program: JavaWorkSpace2->LinkedListNumberAdd
 * @description: 链表数字相加
 * @author: MaYuan
 * @create: 2019-12-26 21:45
 * @version: 1.0
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * <p>
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * <p>
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * *	链表中的两个元素的内容进行相加。
 * *	用数字来提取链表中的元素内容。
 * *  2-4-3   返回数字342
 * *  5-6-4   返回数字465
 * *  342+465 = 807  ->708
 **/
public class LinkedListNumberAdd {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int num1 = 0;
        int num2 = 0;
        ListNode root = new ListNode(0);
        ListNode cursor = root;
        Stack<ListNode> stack1 = new Stack<ListNode>();
        Stack<ListNode> stack2 = new Stack<ListNode>();

        while (l1 != null) {
            stack1.push(l1);
            l1 = l1.next;
        }

        while (!stack1.isEmpty()) {
            num1 += stack1.peek().val;
            num1 *= 10;
            stack1.pop();
        }

        while (l2 != null) {
            stack2.push(l2);
            l2 = l2.next;
        }

        while (!stack2.isEmpty()) {
            num2 += stack2.peek().val;
            num2 *= 10;
            stack2.pop();
        }

        num1 = num1 / 10;
        num2 = num2 / 10;
        int temp = num1 + num2;
        while (temp > 0) {
            int temp2 = temp % 10;
            ListNode sumNode = new ListNode(temp2);
            cursor.next = sumNode;
            cursor = sumNode;
            temp = temp / 10;
        }
        return root.next;
    }

    public static void main(String[] args) {

        int[] num1 = {2, 4, 3};
        int[] num2 = {5, 6, 4};
        ListNode node1 = new ListNode(num1);
        ListNode node2 = new ListNode(num2);
        ListNode node3 = addTwoNumbers(node1, node2);
        System.out.println(node3);
    }
}
