package com.linkedlist.www;

/**
 * @ClassName SortListNode4
 * @Author：Mayuan
 * @Date 2021/3/16/0016 15:03
 * @Description TODO
 * @Version 1.0
 *
 *
 * 设置链表的排序。
 * 归并排序算法。
 *
 * 基本的思路是归并排序算法。
 * 归并排序加链表节点。
 *
 **/

public class SortListNode4 {

    private static ListNode mergeSort(ListNode head) {
        if(head==null||head.next==null) {
            return head;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast!=null&&fast.next!=null) {
            slow= slow.next;
            fast= fast.next.next;
        }

        // 将链表来左右的断开。
        ListNode temp = slow.next;
        slow.next = null;

        ListNode tempNodea = mergeSort(head);
        ListNode tempNodeb = mergeSort(temp);
        ListNode res = merge(tempNodea,tempNodeb);
        return res;
    }


    public static ListNode merge(ListNode ha, ListNode hb) {
        ListNode res = null;

        if (ha == null) {
            return hb;
        }

        if (hb == null) {
            return ha;
        }

        if (ha != null || hb != null) {
            if (ha.val < hb.val) {
                res = ha;
                res.next = merge(ha.next, hb);
            } else {
                res = hb;
                res.next = merge(ha, hb.next);
            }
        }
        return res;
    }
    public static void main(String[] args) {

        ListNode node = new ListNode(new int[]{2,3,1,3,4,5});
        ListNode res;
        res = mergeSort(node);
        while (res!=null) {
            System.out.print(res.val+" ");
            res= res.next;
        }
    }
}



