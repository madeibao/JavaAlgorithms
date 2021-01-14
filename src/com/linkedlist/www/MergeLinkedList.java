package com.linkedlist.www;

/**
 * @program: JavaWorkSpace2->MergeLinkedList
 * @description: 链表的融合操作
 * @author: MaYuan
 * @create: 2019-12-27 12:29
 * @version: 1.0
 **/
public class MergeLinkedList {
    public static ListNode merge2(ListNode head1, ListNode head2) {
        // 如果第一个链表为空，返回第二个链表头结点
        if (head1 == null) {
            return head2;
        }

        // 如果第二个链表为空，返回第一个链表头结点
        if (head2 == null) {
            return head1;
        }

        // 记录两个链表中头部较小的结点
        ListNode tmp = head1;
        if (tmp.val < head2.val) {
            // 如果第一个链表的头结点小，就递归处理第一个链表的下一个结点和第二个链表的头结点
            tmp.next = merge2(head1.next, head2);
        } else {
            // 如果第二个链表的头结点小，就递归处理第一个链表的头结点和第二个链表的头结点的下一个结点
            tmp = head2;
            tmp.next = merge2(head1, head2.next);
        }

        // 返回处理结果
        return tmp;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {1, 3, 5, 6, 7};
        ListNode node1 = new ListNode(nums1);
        ListNode node2 = new ListNode(nums2);
        ListNode node3 = merge2(node1, node2);
        System.out.println(node3);
    }
}
