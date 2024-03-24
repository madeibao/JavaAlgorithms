package com.linkedlist.www;

/**
 * @ClassName CombineNode
 * @Author：Mayuan
 * @Date 2021/6/3/0003 9:43
 * @Description TODO
 * @Version 1.0
 **/
public class CombineNode {

    static ListNode merge(ListNode headA, ListNode headB) {
        if(headA==null) {
            return headB;
        }
        if(headB==null) {
            return headA;
        }

        ListNode res =null;
        if(headA.val<headB.val)  {
            res = headA;
            res.next = merge(headA.next, headB);
        }
        else {
            res= headB;
            res.next = merge(headA,headB.next);
        }

        return res;
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
