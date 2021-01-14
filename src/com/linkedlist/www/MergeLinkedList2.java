package com.linkedlist.www;

/**
 * @program: JavaWorkSpace2->MergeLinkedList2
 * @description: 合并两个有序的链表的方法2
 * @author: MaYuan
 * @create: 2020-02-05 15:52
 * @version: 1.0
 **/
public class MergeLinkedList2 {
    private static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        // 创建一个虚拟的节点内容。
        ListNode temp = new ListNode(0);
        ListNode res = temp;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                temp.next = l1;
                l1 = l1.next;
            } else {
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }
        if (l1 != null) {
            temp.next = l1;
        }
        if (l2 != null) {
            temp.next = l2;
        }
        return res.next;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {1, 3, 5, 6, 7};
        ListNode node1 = new ListNode(nums1);
        ListNode node2 = new ListNode(nums2);
        ListNode node3 = mergeTwoLists(node1, node2);
        System.out.println(node3);
    }
}
