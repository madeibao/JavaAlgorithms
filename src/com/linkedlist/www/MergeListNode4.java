package com.linkedlist.www;

/**
 * @ClassName MergeListNode4
 * @Author：Mayuan
 * @Date 2021/1/14/0014 20:57
 * @Description TODO
 * @Version 1.0
 *
 * 合并 k 个有序的链表，并且要求链表是有序的。
 *
 **/
public class MergeListNode4 {

    public static ListNode mergeKLists(ListNode[] lists) {

        ListNode res=null;
        for(int i=0;i<lists.length;i++) {
            res = merge(res, lists[i]);
        }

        return res;
    }

    private static ListNode merge(ListNode headA, ListNode headB) {
        if(headA==null||headB==null) {
            return headA!=null?headA:headB;
        }

        // 首先设置一个虚拟的节点值。
        ListNode head = new ListNode(-1);
        ListNode temp = head;
        ListNode a = headA, b = headB;
        while (a!=null&&b!=null) {
            if(a.val<b.val) {
                temp.next = a;
                a = a.next;
            }
            else {
                temp.next = b;
                b = b.next;
            }
            temp = temp.next;
        }

        if(a!=null) {
            temp.next = a;
        }
        if(b!=null) {
            temp.next = b;
        }
        return head.next;

    }
    public static void main(String[] args) {

        ListNode[] temp = new ListNode[3];
        temp[0] = new ListNode(new int[]{1, 2, 3,});
        temp[1] =new ListNode(new int[]{1,2,4});
        temp[2] =new ListNode(new int[]{4,5,6});
        ListNode res = mergeKLists(temp);
        while (res!=null) {
            System.out.print(res.val+"->");
            res =res.next;
        }

    }
}
