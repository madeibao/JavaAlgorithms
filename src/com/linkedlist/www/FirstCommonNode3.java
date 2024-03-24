package com.linkedlist.www;


/**
 * @ClassName FirstCommonNode3
 * @Author：Mayuan
 * @Date 2021/1/9/0009 21:32
 * @Description TODO
 * @Version 1.0
 *
 *
 * 两个链表的第一个公共节点。
 **/
public class FirstCommonNode3 {

    private static ListNode commmon2(ListNode ha, ListNode hb) {
        if (ha == null || hb == null) {
            return null;
        }

        ListNode pa = ha;
        ListNode pb = hb;
        while (pa != pb) {

            // 如果跑到了最后的一个位置上，那么久直接的返回另一个链表的值。
            pa = pa == null ? hb : pa.next;
            pb = pb == null ? ha : pb.next;
        }

        return pa;
    }

    public static void main(String[] args) {
        ListNode h1 = new ListNode(4);
        ListNode h2 = new ListNode(1);
        ListNode h3 = new ListNode(8);
        ListNode h4 = new ListNode(4);
        ListNode h5 = new ListNode(5);

        h1.next = h2;
        h2.next = h3;
        h3.next = h4;
        h4.next = h5;

        ListNode n1 = new ListNode(5);
        ListNode n2 = new ListNode(0);
        ListNode n3 = new ListNode(2);

        n1.next = n2;
        n2.next = n3;
        n3.next = h3;


        ListNode res = commmon2(n1, h1);
        System.out.println(res);
    }
}
