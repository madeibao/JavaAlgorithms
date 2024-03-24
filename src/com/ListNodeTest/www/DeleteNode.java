package com.ListNodeTest.www;

/**
 * @ClassName DeleteNode
 * @Author：Mayuan
 * @Date 2021/6/3/0003 19:38
 * @Description TODO
 * @Version 1.0
 *
 * 删除链表中的节点，
 * 链表中的节点的值等于给定的值，则删除
 *
 **/
public class DeleteNode {

    private static ListNode delete(ListNode head, int val) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode pre = dummy;
        ListNode cur = head;

        while (cur.val!=val) {
            pre= cur;
            cur= cur.next;
        }

        pre.next = cur.next;
        return dummy.next;

    }
    public static void main(String[] args) {

        ListNode head = new ListNode(new int[]{1,2,3,4,5,6,7,8});
        int val = 5;
        ListNode res = delete(head, val);
        System.out.println(res);
    }
}
