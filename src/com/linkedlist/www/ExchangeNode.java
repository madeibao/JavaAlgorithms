package com.linkedlist.www;

import java.util.Stack;

/**
 * @ClassName ExchangeNode
 * @Author：Mayuan
 * @Date 2020/5/12 15:17
 * @Description TODO
 * @Version 1.0
 * <p>
 * 两个，两个来交换链表中的节点
 * 1 2 3 4
 * 2 1 4 3
 * 两两交换，
 * 利用了一个额外的栈来进行辅助，得到最终的结果值。
 **/
public class ExchangeNode {
    public static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        Stack<ListNode> stack = new Stack();
        int count = 0;
        ListNode node = new ListNode(0);
        node.next = null;
        ListNode removeNode = node;
        while (head != null) {
            while (head != null && count < 2) {
                stack.push(head);
                head = head.next;
                count++;
            }
            while (!stack.isEmpty()) {
                ListNode temp = stack.pop();
                temp.next = null;
                removeNode.next = temp;
                removeNode = removeNode.next;
            }
            count = 0;
        }
        return node.next;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4,};
        ListNode head = new ListNode(nums);
        ListNode res = swapPairs(head);
        System.out.println(res);
    }
}
