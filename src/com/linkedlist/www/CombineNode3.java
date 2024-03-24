package com.linkedlist.www;

/**
 * @ClassName CombineNode3
 * @Author：Mayuan
 * @Date 2023/9/3/0003 11:11
 * @Description TODO
 * @Version 1.0
 **/
public class CombineNode3 {


    static ListNode merge(ListNode headA, ListNode headB) {

        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;

        ListNode pa = headA;
        ListNode pb = headB;

        while (pa!=null&&pb!=null) {
            if(pa.val<pb.val) {
                cur.next = pa;
                pa = pa.next;
            }
            else {
                cur.next = pb;
                pb = pb.next;
            }
            cur = cur.next;
        }

        if(pa!=null) {
            cur.next = pa;
        }
        if(pb!=null) {
            cur.next = pb;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode headA = new ListNode(new int[]{2,2,3});
        ListNode headB = new ListNode(new int[]{2,4,5});
        ListNode res =merge(headA,headB);
        while (res!=null) {
            System.out.print(res.val+" ");
            res =res.next;
        }

    }
}