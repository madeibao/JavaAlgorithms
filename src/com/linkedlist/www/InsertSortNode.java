package com.linkedlist.www;

/**
 * @ClassName InsertSortNode
 * @Author：Mayuan
 * @Date 2020/2/25 16:19
 * @Description TODO
 * @Version 1.0
 * <p>
 * 链表的插入排序来实现。
 **/
public class InsertSortNode {
    public static ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode pre = dummy;
        ListNode cur = head;
        while (cur != null) {
            ListNode tmp = cur.next;
            while (pre.next != null && pre.next.val < cur.val) {
                pre = pre.next;
            }
            cur.next = pre.next;
            pre.next = cur;
            pre = dummy;
            cur = tmp;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        int[] nums = {4, 2, 3, 1};
        ListNode node = new ListNode(nums);
        ListNode temp = insertionSortList(node);
        System.out.println(temp);
    }
}
