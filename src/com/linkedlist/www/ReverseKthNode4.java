package com.linkedlist.www;


/**
 * @ClassName ReverseKthNode4
 * @Author：Mayuan
 * @Date 2020/11/15 20:42
 * @Description TODO
 * @Version 1.0
 * <p>
 * 返回的是链表的倒数的第k个节点。
 * 返回倒数的第k个节点返回之后的节点。
 **/
public class ReverseKthNode4 {

    public static ListNode getKthFromEnd(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode slow = head;
        ListNode fast = head;
        while (k-- > 0) {
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        return slow;
    }

    public static void main(String[] args) {

        ListNode res = new ListNode(new int[]{1, 2, 3, 4, 5});
        int k = 2;
        ListNode res2 = getKthFromEnd(res, k);
        while (res2 != null) {
            System.out.print(res2.val + "->");
            res2 = res2.next;
        }
    }
}
