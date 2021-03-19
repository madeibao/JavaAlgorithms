package com.linkedlist.www;

import java.util.Stack;

/**
 * @ClassName AddTwoNumbers3
 * @Author：Mayuan
 * @Date 2020/10/18 20:20
 * @Description TODO
 * @Version 1.0
 * <p>
 * 两个链表的元素的相加
 **/
public class AddTwoNumbers3 {

    public static ListNode add(ListNode ha, ListNode hb) {

        Stack<Integer> stack2 = new Stack<>();
        Stack<Integer> stack3 = new Stack<>();
        while (ha != null) {
            stack2.push(ha.val);
            ha = ha.next;
        }
        while (hb != null) {
            stack3.push(hb.val);
            hb = hb.next;
        }

        ListNode res = null;
        int carry = 0;

        while ((!stack2.isEmpty()) || (!stack3.isEmpty()) || (carry > 0)) {
            int a = stack2.isEmpty() ? 0 : stack2.pop();
            int b = stack3.isEmpty() ? 0 : stack3.pop();
            int temp = a + b + carry;
            ListNode res2 = new ListNode(temp % 10);
            res2.next = res;
            res = res2;
            carry = temp / 10;
        }

        // 返回结果值。
        return res;
    }

    public static void main(String[] args) {
        int[] nums1 = {9,3,7};
        int[] nums2 = {6,3};
        ListNode node1 = new ListNode(nums1);
        ListNode node2 = new ListNode(nums2);
        ListNode node3 = add(node1, node2);
        System.out.println(node3);
    }
}
