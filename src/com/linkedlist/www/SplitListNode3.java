package com.linkedlist.www;

/**
 * @ClassName SplitListNode3
 * @Author：Mayuan
 * @Date 2021/3/15/0015 17:12
 * @Description TODO
 * @Version 1.0
 *
 * 分割链表。
 * 根据奇偶来分割。
 *
 * 给定一个单链表，请设定一个函数，将链表的奇数位节点和偶数位节点分别放在一起，重排后输出。
 * 注意是节点的编号而非节点的数值。
 **/
public class SplitListNode3 {
    public static ListNode oddEvenList (ListNode head) {
        // write code here

        // 创建两个节点的值。
        ListNode odd = head;
        ListNode even= head.next;
        ListNode evenhead = even;

        while(even!=null&&even.next!=null) {
            odd.next = odd.next.next;
            even.next = even.next.next;
            odd =odd.next;
            even = even.next;
        }

        odd.next = evenhead;
        return head;
    }

    public static void main(String[] args) {

        ListNode temp = new ListNode(new int[]{1,2,3,4,5,6});
        ListNode res = oddEvenList(temp);
        while (res!=null) {
            System.out.print(res.val+" ");
            res =res.next;
        }
    }
}
