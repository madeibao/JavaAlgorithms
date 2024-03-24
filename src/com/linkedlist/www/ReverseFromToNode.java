package com.linkedlist.www;

/**
 * @ClassName ReverseFromToNode
 * @Author：Mayuan
 * @Date 2021/3/15/0015 16:44
 * @Description TODO
 * @Version 1.0
 *
 * 翻转链表区间内的节点。
 *
 **/

public class ReverseFromToNode {
    public static ListNode reverseBetween(ListNode head, int left, int right) {
        // 首先创建一个虚拟节点。
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode p = dummy;
        // q指向的节点更快。
        ListNode q = dummy.next;

        for(int i=0;i<left-1;i++) {
            p = p.next;
            q = q.next;
        }

        for(int i=0;i<right-left;i++) {
            ListNode temp = q.next;
            q.next = temp.next;
            temp.next = p.next;
            p.next = temp;
        }

        return dummy.next;
    }

    public static void main(String[] args) {

        ListNode temp = new ListNode(new int[]{1,2,3,4,5,6,});
        int left =2, right =4;
        ListNode res = reverseBetween(temp, left,right);
        while (res!=null) {
            System.out.print(res.val+" ");
            res= res.next;
        }
    }
}
