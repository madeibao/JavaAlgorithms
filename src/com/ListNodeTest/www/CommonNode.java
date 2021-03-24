package com.ListNodeTest.www;

/**
 * @ClassName CommonNode
 * @Author：Mayuan
 * @Date 2021/3/19/0019 15:29
 * @Description TODO
 * @Version 1.0
 *
 * 两个链表的第一个公共节点。
 * 两个链表有交叉，求出第一个公共节点。
 **/
public class CommonNode {

    static ListNode FindFirstCommonNode(ListNode pHead1,ListNode pHead2) {
        ListNode p1 = pHead1;
        ListNode p2 = pHead2;
        while (p1!=p2) {
            p1 = p1==null?pHead2:p1.next;
            p2 = p2==null?pHead1:p2.next;
        }
        return p1;
    }
    public static void main(String[] args) {
        ListNode head =new ListNode(1);
        ListNode h2 = new ListNode(2);

        ListNode m = new ListNode(3);

        ListNode common = new ListNode(2);
        ListNode c2 = new ListNode(4);
        common.next = c2;

        head.next=  h2;
        h2.next = common;

        m.next = common;

        ListNode res = FindFirstCommonNode(head, m);
        System.out.println(res);

    }
}
