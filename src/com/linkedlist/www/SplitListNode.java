package com.linkedlist.www;

/**
 * @ClassName SplitListNode
 * @Author：Mayuan
 * @Date 2020/6/6 16:42
 * @Description TODO
 * @Version 1.0
 **/

public class SplitListNode {
    public static ListNode res(ListNode head) {
        if (head.next == null) {
            return head;
        }
        ListNode p = head, q = head, pre = null;
        while (q != null && q.next != null) {
            pre = p;
            p = p.next;
            q = q.next.next;
        }
        pre.next = null;

        return head;
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(2);
        ListNode h2 = new ListNode(3);
        ListNode h3 = new ListNode(1);
        ListNode h4 = new ListNode(4);
        ListNode h5 = new ListNode(8);
        ListNode h6 = new ListNode(9);

        head.next = h2;
        h2.next = h3;
        h3.next = h4;
        h4.next = h5;
        h5.next = h6;
        h6.next = null;

        ListNode res = res(head);
        while (res != null) {
            System.out.print(res.val + " ");
            res = res.next;
        }
    }
}
