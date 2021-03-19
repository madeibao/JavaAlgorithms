package com.linkedlist.www;

import java.util.Stack;

/**
 * @program: JavaWorkSpace2->ReverseLinkedList
 * @description: 翻转链表的操作内容
 * @author: MaYuan
 * @create: 2019-12-29 18:47
 * @version: 1.0
 **/
public class ReverseLinkedList {
    /**
     * 利用栈的结构来实现链表的反转。
     *
     * @param head
     * @return
     */

    private static ListNode reverseList2(ListNode head) {
        //前指针节点
        ListNode prev = null;
        //当前指针节点
        ListNode curr = head;
        //每次循环，都将当前节点指向它前面的节点，然后当前节点和前节点后移
        while (curr != null) {
            //临时节点，暂存当前节点的下一节点，用于后移
            ListNode nextTemp = curr.next;
            //将当前节点指向它前面的节点
            curr.next = prev;
            //前指针后移
            prev = curr;
            //当前指针后移
            curr = nextTemp;
        }
        return prev;
    }

    private static ListNode reverseList(ListNode head) {
        Stack<ListNode> stack1 = new Stack<>();
        while (head != null) {
            stack1.push(head);
            head = head.next;
        }

        if (!stack1.isEmpty()) {
            head = stack1.pop();
        }

        ListNode cur = head;
        while (!stack1.isEmpty()) {
            ListNode node = stack1.pop();
            node.next = null;
            cur.next = node;
            cur = node;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        ListNode head = new ListNode(nums);
        ListNode head2 = reverseList(head);
        System.out.println(head2);
    }
}
