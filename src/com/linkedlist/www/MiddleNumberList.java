package com.linkedlist.www;

/**
 * @program: JavaWorkSpace2->MiddleNumberList
 * @description: 链表的中间节点内容
 * @author: MaYuan
 * @create: 2020-02-04 17:25
 * @version: 1.0
 * <p>
 * 给定一个链表，然后求出链表的中间的节点内容。
 **/
public class MiddleNumberList {

    private static ListNode middleNode(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public static ListNode middleNode2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        int cnt = 1;
        ListNode list = head;
        while (head.next != null) {
            head = head.next;
            cnt++;
            if (cnt % 2 == 0) {
                list = list.next;
            }
        }
        return list;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4,};
        ListNode head = new ListNode(nums);
        System.out.println(middleNode2(head).val);
    }
}
