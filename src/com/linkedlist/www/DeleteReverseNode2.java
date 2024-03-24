package com.linkedlist.www;

/**
 * @ClassName DeleteReverseNode2
 * @Author：Mayuan
 * @Date 2021/1/5/0005 10:20
 * @Description TODO
 * @Version 1.0
 *
 * 删除链表的倒数第k个节点。
 **/
public class DeleteReverseNode2 {
    public static ListNode removeNthFromEnd3(ListNode head, int n) {

        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode fast, slow;
        fast= dummy;
        slow= dummy;

        while (n>0) {
            fast = fast.next;
            n--;
        }

        while (fast.next!=null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return dummy.next;

    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int n = 2;
        ListNode head = new ListNode(nums);
        ListNode head2 = removeNthFromEnd3(head, n);
        System.out.println(head2);
    }
}
