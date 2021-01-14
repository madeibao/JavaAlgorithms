package com.linkedlist.www;

/**
 * @ClassName LinkedListNumberAdd2
 * @Author：Mayuan
 * @Date 2020/5/6 22:41
 * @Description TODO
 * @Version 1.0
 * <p>
 * 链表元素来相加
 **/
public class LinkedListNumberAdd2 {

    public static ListNode plusAB(ListNode a, ListNode b) {
        ListNode p = new ListNode(-1);
        ListNode q = p;
        int carry = 0;
        while (a != null || b != null || carry != 0) {
            int aval = a != null ? a.val : 0;
            int bval = b != null ? b.val : 0;
            int sum = aval + bval + carry;
            carry = sum / 10;
            int k = sum % 10;
            q.next = new ListNode(k);
            q = q.next;
            a = a != null ? a.next : null;
            b = b != null ? b.next : null;
        }
        return p.next;
    }

    public static void main(String[] args) {
        int[] num1 = {1, 2, 3};
        int[] num2 = {2, 2, 3};
        ListNode node1 = new ListNode(num1);
        ListNode node2 = new ListNode(num2);

        ListNode temp = plusAB(node1, node2);
        System.out.println(temp);

    }
}
