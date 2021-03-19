package com.linkedlist.www;

/**
 * @ClassName MergeLinkedList3
 * @Author：Mayuan
 * @Date 2020/11/9 9:18
 * @Description TODO
 * @Version 1.0
 * <p>
 * 递归的实现有序链表的合并操作。
 **/
public class MergeLinkedList3 {


    public static ListNode combine(ListNode headA, ListNode headB) {

        if (headA == null) {
            return headB;
        }

        if (headB == null) {
            return headA;
        }

        ListNode temp = headA;
        if (headA.val < headB.val) {
            temp.next = combine(headA.next, headB);
        } else {
            temp = headB;
            temp.next = combine(headA, headB.next);
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {1, 3, 5, 6, 7};
        ListNode node1 = new ListNode(nums1);
        ListNode node2 = new ListNode(nums2);
        ListNode node3 = combine(node1, node2);
        System.out.println(node3);
    }
}
