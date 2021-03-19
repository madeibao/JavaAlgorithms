package com.linkedlist.www;

/**
 * @ClassName ExchangeNode2
 * @Author：Mayuan
 * @Date 2020/10/18 19:37
 * @Description TODO
 * @Version 1.0
 * 链表节点的两个，两个的来进行交换。
 * 1 2 3 4
 * 2 1 4 3
 *
 * 递归写法来两个两个交换链表结构。
 **/
public class ExchangeNode2 {

    public static ListNode exchange(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }

        ListNode temp = head.next;
        ListNode temp2 = exchange(temp.next);
        head.next = temp2;
        temp.next = head;
        return temp;
    }

    public static void main(String[] args) {
        ListNode res = new ListNode(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        ListNode res2 = exchange(res);
        while (res2 != null) {
            System.out.print(res2.val + " ");
            res2 = res2.next;
        }
    }
}
