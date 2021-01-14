package com.linkedlist.www;

/**
 * @ClassName RemoveKthNode
 * @Author：Mayuan
 * @Date 2020/12/12/0012 22:11
 * @Description TODO
 * @Version 1.0
 * <p>
 * 删除链表的倒数的第k个节点的值。
 **/

public class RemoveKthNode {
    public static ListNode removeNthFromEnd(ListNode head, int n) {

        // 删除链表的倒数的第n个节点，首先保证 n 的合法性。
        if (n <= 0) {
            return head;
        }

        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode fast = dummy;
        ListNode slow = dummy;

        while (n-- > 0) {
            fast = fast.next;
        }

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode res = new ListNode(new int[]{1, 2, 3, 4, 5, 6});
        int k = 2;
        ListNode res2 = removeNthFromEnd(res, k);
        while (res2 != null) {
            System.out.print(res2.val + "->");
            res2 = res2.next;
        }
    }
}



