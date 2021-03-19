package com.ListNodeTest.www;

/**
 * @ClassName OddEvenNode
 * @Author：Mayuan
 * @Date 2021/3/19/0019 14:07
 * @Description TODO
 * @Version 1.0
 *
 * 链表的重新排序算法。
 *
 * 链表按照奇偶的节点来进行排序。
 **/
public class OddEvenNode {

    public static ListNode sort(ListNode head) {
        ListNode odd = head;
        ListNode even = head.next;

        ListNode evenHead = even;
        while (even!=null&&even.next!=null) {
            odd.next = odd.next.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;
        }

        // 将奇偶的链表节点连接。
        odd.next = evenHead;
        return head;
    }
    public static void main(String[] args) {
        ListNode node =new ListNode(new int[]{1,2,3,4,5,6});
        ListNode res = sort(node);
        System.out.println(res.toString());
    }
}



