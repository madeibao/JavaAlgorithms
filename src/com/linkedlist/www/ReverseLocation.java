package com.linkedlist.www;

/**
 * @ClassName ReverseLocation
 * @Author：Mayuan
 * @Date 2021/8/15/0015 20:14
 * @Description TODO
 * @Version 1.0
 **/
public class ReverseLocation {

    static ListNode reverse(ListNode head, int from, int end) {
        if(head==null||head.next==null) {
            return head;
        }

        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode pre= dummy;
        ListNode p = head;

        for(int i=0;i<from-1;i++) {
            pre= pre.next;
            p = p.next;
        }

        for(int i=0;i<end-from;i++) {
            ListNode node = p.next;
            p.next = node.next;
            node.next = pre.next;
            pre.next = node;
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        ListNode head =new ListNode(new int[]{1,2,3,4,5,6});
        int from =2, end= 4;
        ListNode res;
        res = reverse(head, from,end);
        System.out.println(res);

    }
}
