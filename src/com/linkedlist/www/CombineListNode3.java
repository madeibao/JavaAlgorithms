package com.linkedlist.www;

/**
 * @ClassName CombineListNode3
 * @Author：Mayuan
 * @Date 2020/10/14 19:06
 * @Description TODO
 * @Version 1.0
 * <p>
 * 合并两个链表
 *
 * 合并两个有序的链表结构。
 *
 **/


public class CombineListNode3 {

    public static ListNode combine(ListNode ha, ListNode hb) {
        if (ha == null) {
            return hb;
        }

        if (hb == null) {
            return ha;
        }

        ListNode temp;
        if (ha.val < hb.val) {
            temp = ha;
            temp.next = combine(ha.next, hb);
        } else {
            temp = hb;
            temp.next = combine(ha, hb.next);
        }
        return temp;
    }

    public static void main(String[] args) {
        ListNode r2 = new ListNode(new int[]{1, 3, 4});
        ListNode r3 = new ListNode(new int[]{3, 4, 5});
        ListNode res = combine(r2, r3);
        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }
    }
}
