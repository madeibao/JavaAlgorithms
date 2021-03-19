package com.linkedlist.www;

/**
 * @ClassName ReverseListNode
 * @Author：Mayuan
 * @Date 2020/3/30 17:55
 * @Description TODO
 * @Version 1.0
 * <p>
 * 翻转链表内容。
 * 将一个链表之间的元素来进行翻转
 * m 开始和 n 结束之间的元素来进行翻转。
 **/
public class ReverseListNode {
    public static ListNode reverseBetween(ListNode head, int m, int n) {

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
            p.next = p.next.next;
            removed.next = g.next;
            g.next = removed;
        }

        return dummyHead.next;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        ListNode temp = new ListNode(nums);

        int m = 2, n = 4;
        ListNode node2 = reverseBetween(temp, m, n);
        System.out.println(node2);
    }
}
