package com.linkedlist.www;

/**
 * @ClassName ReverseListNode4
 * @Author：Mayuan
 * @Date 2020/10/30 14:44
 * @Description TODO
 * @Version 1.0
 * <p>
 * k 个一组来进行翻转链表。
 * k 个一组来进行链表的翻转，每次逆置 k 个链表的节点。
 **/
public class ReverseListNode4 {

    private static ListNode helper(ListNode head, ListNode tail) {

        ListNode pre = null;
        while (head != tail) {
            ListNode next2 = head.next;
            head.next = pre;
            pre = head;
            head = next2;
        }
        return pre;
    }

    private static ListNode reverse(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode tail = head;
        for (int i = 0; i < k; i++) {
            if (tail == null) {
                return head;
            }
            tail = tail.next;
        }

        ListNode newHead = helper(head, tail);
        head.next = reverse(tail, k);
        return newHead;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(new int[]{1, 2, 3, 4, 5,});
        ListNode res = reverse(head, 2);
        while (res != null) {
            System.out.print(res.val + " ");
            res = res.next;
        }
    }
}
