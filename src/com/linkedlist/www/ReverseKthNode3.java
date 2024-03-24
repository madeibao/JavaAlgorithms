package com.linkedlist.www;

/**
 * @ClassName ReverseKthNode3
 * @Author：Mayuan
 * @Date 2020/10/10 10:04
 * @Description TODO
 * @Version 1.0
 * <p>
 * 删除链表的倒数的第k个节点的值。
 **/
public class ReverseKthNode3 {

    public static ListNode FindKthToTail(ListNode head, int k) {
        ListNode slow = head;
        ListNode fast = head;


        // 快慢指针，两个内容同步来进行。
        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }

        while (fast != null && fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return head;
    }

    public static void printNode(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        ListNode temp = new ListNode(new int[]{1, 2, 3, 4, 5,});
        ListNode res = FindKthToTail(temp, 2);
        printNode(res);
    }
}
