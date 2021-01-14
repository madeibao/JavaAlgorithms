package com.linkedlist.www;

/**
 * @program: JavaWorkSpace2->IntegerNumbersAdd
 * @description: 两个链表数字相加
 * @author: MaYuan
 * @create: 2019-12-27 22:05
 * @version: 1.0
 * <p>
 * 两个链表存储的数字，进行求和，
 * 数字逆序存放的。
 **/
public class IntegerNumbersAdd {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode root = new ListNode(0);
        ListNode cursor = root;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int l1Val = l1 != null ? l1.val : 0;
            int l2Val = l2 != null ? l2.val : 0;
            int sumVal = l1Val + l2Val + carry;
            carry = sumVal / 10;

            ListNode sumNode = new ListNode(sumVal % 10);
            cursor.next = sumNode;
            cursor = sumNode;

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        return root.next;
    }

    public static void main(String[] args) {

        int[] nums1 = {7, 2, 4, 3};
        int[] nums2 = {5, 6, 4};

        int[] num3 = {2, 4, 3};
        int[] num4 = {5, 6, 4};

        ListNode node1 = new ListNode(nums1);
        ListNode node2 = new ListNode(nums2);
        ListNode node3 = addTwoNumbers(node1, node2);

        System.out.println(node3);

        ListNode node5 = new ListNode(num3);
        ListNode node6 = new ListNode(num4);
        ListNode node7 = addTwoNumbers(node5, node6);

        System.out.println(node7);
    }
}
