package com.linkedlist.www;

/**
 * @ClassName RotateList2
 * @Author：Mayuan
 * @Date 2021/7/24/0024 22:44
 * @Description TODO
 * @Version 1.0
 *
 * 链表的旋转操作2
 *
 **/
public class RotateList2 {

    static ListNode rotate(ListNode head, int k) {

        if(k<=0) {
            return null;
        }
        int n = 0;
        ListNode p= head;
        while (p!=null) {
            p = p.next;
            n++;
        }

        k = k%n;
        ListNode fast=head;
        ListNode slow=head;

        while (k-->0) {
            fast = fast.next;
        }

        while (fast.next!=null) {
            fast= fast.next;
            slow= slow.next;
        }

        fast.next = head;
        head = slow.next;
        slow.next= null;

        return head;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5};
        int k = 2;
        ListNode node2 = new ListNode(nums);
        ListNode temp = rotate(node2, k);
        System.out.println(temp);

    }
}
