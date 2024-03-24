package com.ListNodeTest.www;

/**
 * @ClassName ReverseNodeFrom
 * @Author：Mayuan
 * @Date 2021/3/19/0019 14:28
 * @Description TODO
 * @Version 1.0
 *
 * 链表的指定的区间来进行翻转。
 **/

public class ReverseNodeFrom {

    public static ListNode reverseBetween (ListNode head, int m, int n) {
        // write code here
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode p = dummy;
        ListNode q = head;

        // 由于是从0开始计数的，所以，循环到m-1
        // 到 m-1后，再有一个指针， p = p.next
        for(int i=0;i<m-1;i++) {
            p = p.next;
            q = q.next;
        }

        // p 指向的是第一个翻转节点的前面节点。
        // q 指向第一个要翻转的节点。
        for(int i=0;i<n-m;i++) {
            ListNode temp = q.next;
            q.next = temp.next;
            temp.next = p.next;
            p.next = temp;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode node =new ListNode(new int[]{1,2,3,4,5,6});
        ListNode res = reverseBetween(node, 2,4);
        System.out.println(res);

    }
}
