package com.linkedlist.www;

/**
 * @ClassName ReverseListNode7
 * @Author：Mayuan
 * @Date 2020/11/12 15:09
 * @Description TODO
 * @Version 1.0
 * <p>
 * 翻转链表的操作。
 * 指定的区间来翻转链表。
 **/
public class ReverseListNode7 {

    private static ListNode reverse(ListNode head, int m, int n) {
        // 创造一个虚拟的节点。
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;

        ListNode g = dummyHead;
        ListNode p = dummyHead.next;

        int step = 0;
        while (step < m - 1) {
            g = g.next;
            p = p.next;
            step++;
        }

        // 首先将 g 指向第一个要翻转的节点的前面，p指向第一个要翻转的节点内容。
        // 然后后面的节点逐个的头插法来实现。

        for (int i = 0; i < n - m; i++) {
            ListNode removed = p.next;
            p.next = removed.next;
            removed.next = g.next;
            g.next = removed;
        }
        return dummyHead.next;

    }

    public static void main(String[] args) {

        ListNode head = new ListNode(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        ListNode res = reverse(head, 2, 6);
        while (res != null) {
            System.out.print(res.val + " ");
            res = res.next;
        }
    }
}




