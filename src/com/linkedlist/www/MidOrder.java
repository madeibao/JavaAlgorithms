package com.linkedlist.www;

/**
 * @ClassName MidOrder
 * @Author：Mayuan
 * @Date 2020/6/20 19:18
 * @Description TODO
 * @Version 1.0
 * <p>
 * 链表的中间的节点值。
 * 一个链表的中间节点。
 **/
public class MidOrder {
    public static ListNode middle(ListNode head) {
        int n = 0;
        ListNode cur = head;
        while (cur != null) {
            ++n;
            cur = cur.next;
        }

        int k = 0;
        cur = head;
        while (k < n / 2) {
            ++k;
            cur = cur.next;
        }
        return cur;
    }

    public static void main(String[] args) {

        ListNode res = new ListNode(new int[]{1, 2, 3, 4, 5, 6});
        ListNode temp = middle(res);
        System.out.println(temp.val);
    }
}
