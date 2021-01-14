package com.linkedlist.www;

import java.util.LinkedList;

/**
 * @program: JavaWorkSpace2->AddTwoNumbers
 * @description: 两个数字相加
 * @author: MaYuan
 * @create: 2019-12-27 12:37
 * @version: 1.0
 * 链表中的两个数字进行相加。
 * 给定两个非空链表来代表两个非负整数。数字最高位位于链表开始位置。
 * 它们的每个节点只存储单个数字。将这两数相加会返回一个新的链表。
 * 你可以假设除了数字 0 之外，这两个数字都不会以零开头。
 * 示例:
 * <p>
 * 输入: (7 -> 2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出: 7 -> 8 -> 0 -> 7
 **/
public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // 栈
        // linkedList的初始化的方法时，不能用List Interface的接口，不然找不到方法addFirst方法和removeFirst方法。
        // 链表来作为栈进行使用。

        LinkedList<Integer> s1 = new LinkedList<Integer>();
        LinkedList<Integer> s2 = new LinkedList<Integer>();
        while (l1 != null) {
            //链表的头插法内容。始终插入头节点内容。
            s1.addFirst(l1.val);
            l1 = l1.next;
        }

        while (l2 != null) {
            s2.addFirst(l2.val);
            l2 = l2.next;
        }

        int carry = 0;
        ListNode lastNode = null;
        while (!s1.isEmpty() || !s2.isEmpty()) {
            int a1 = 0, a2 = 0;
            if (!s1.isEmpty()) {
                a1 = s1.removeFirst();
            }
            if (!s2.isEmpty()) {
                a2 = s2.removeFirst();
            }
            ListNode curNode = new ListNode((a1 + a2 + carry) % 10);
            carry = (a1 + a2 + carry) / 10;
            curNode.next = lastNode;
            lastNode = curNode;
        }
        // 如果最高位仍然有进位。
        if (carry > 0) {
            ListNode curNode = new ListNode(carry);
            curNode.next = lastNode;
            lastNode = curNode;
        }
        return lastNode;
    }

    public static void main(String[] args) {

        int[] nums1 = {7, 2, 4, 3};
        int[] nums2 = {5, 6, 4};
        ListNode node1 = new ListNode(nums1);
        ListNode node2 = new ListNode(nums2);
        ListNode node3 = addTwoNumbers(node1, node2);
        System.out.println(node3);
    }
}









