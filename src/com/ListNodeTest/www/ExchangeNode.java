package com.ListNodeTest.www;

/**
 * @ClassName ExchangeNode
 * @Author：Mayuan
 * @Date 2021/3/19/0019 21:21
 * @Description TODO
 * @Version 1.0
 *
 * 两个两个的交换链表节点。
 *
 **/
public class ExchangeNode {

    static ListNode exchange(ListNode head) {
        if(head==null||head.next==null) {
            return head;
        }

        ListNode temp = head.next;
        ListNode tempNode = exchange(temp.next);
        head.next = tempNode;
        temp.next = head;
        return temp;
    }
    public static void main(String[] args) {
        ListNode node = new ListNode(new int[]{1,2,3,4});
        ListNode res =exchange(node);
        System.out.println(res.toString());

    }
}
