package com.linkedlist.www;

/**
 * @ClassName ReverseListNode2
 * @Author：Mayuan
 * @Date 2020/4/20 17:55
 * @Description TODO
 * @Version 1.0
 * 链表的翻转的操作结果
 * 使用头插法来进行
 **/
public class ReverseListNode2 {
    public static ListNode reverseList(ListNode head) {
        ListNode newHead = new ListNode(-1);
        while (head != null) {
            ListNode next = head.next;
            head.next = newHead.next;
            newHead.next = head;
            head = next;
        }
        return newHead.next;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        ListNode temp = new ListNode(nums);
        ListNode res = reverseList(temp);
        System.out.println(res);
    }
}
