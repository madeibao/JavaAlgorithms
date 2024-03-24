package com.linkedlist.www;

/**
 * @ClassName DeleteKthNode
 * @Author：Mayuan
 * @Date 2021/5/7/0007 15:31
 * @Description TODO
 * @Version 1.0
 *
 * 删除链表的倒数的第k个节点的值。
 *
 **/
public class DeleteKthNode {

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int length  = 0;
        ListNode first = head;
        while (first != null) {
            length++;
            first = first.next;
        }
        length -= n;
        first = dummy;
        while (length > 0) {
            length--;
            first = first.next;
        }
        first.next = first.next.next;
        return dummy.next;
    }
    public static void main(String[] args) {
        ListNode node = new ListNode(new int[]{1,2,3,4,5,6,7,8});
        int n =2;
        ListNode node2 = removeNthFromEnd(node, n);
        System.out.println(node2);
    }
}
