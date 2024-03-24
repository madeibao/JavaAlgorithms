package com.linkedlist.www;

/**
 * @ClassName DeleteNode5
 * @Author：Mayuan
 * @Date 2021/6/3/0003 17:05
 * @Description TODO
 * @Version 1.0
 *
 * 给定一个链表和一个值，
 * 删除链表中的等于给定值的节点，并返回链表的表头
 *
 **/
public class DeleteNode5 {

    private static ListNode deleteNode(ListNode head, int val) {
        ListNode dummy= new ListNode(-1);
        dummy.next = head;

        ListNode pre = dummy;
        ListNode cur = head;

        while (cur.val!=val) {
            pre= cur;
            cur =cur.next;
        }
        pre.next= cur.next;
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(new int[]{1,2,3,4,5,6});
        int val = 4;
        ListNode res= deleteNode(node, val);
        System.out.println(res);
    }
}
