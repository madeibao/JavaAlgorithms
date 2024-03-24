package com.linkedlist.www;

/**
 * @ClassName ReverseListNode3
 * @Author：Mayuan
 * @Date 2020/10/19 22:01
 * @Description TODO
 * @Version 1.0
 * <p>
 * 链表的翻转的操作。
 **/
public class ReverseListNode3 {

    private static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(new int[]{1, 2, 3, 4, 5});
        ListNode res = reverse(head);
        while (res != null) {
            System.out.print(res.val + "->");
            res = res.next;
        }
    }
}
