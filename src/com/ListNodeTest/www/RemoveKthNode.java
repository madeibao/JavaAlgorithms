package com.ListNodeTest.www;

/**
 * @ClassName RemoveKthNode
 * @Author：Mayuan
 * @Date 2021/4/26/0026 20:35
 * @Description TODO
 * @Version 1.0
 *
 * 移除链表的倒数的第k个节点的值。
 *
 **/
public class RemoveKthNode {

    static ListNode remove(ListNode head, int k) {
        if(head==null||k<0) {
            return head;
        }

        ListNode dummy = new ListNode(-1);
        dummy.next = head;


        ListNode slow = dummy;
        ListNode fast = dummy;

        while (k-->0) {
            fast =fast.next;
        }

        while (fast.next!=null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return head;
    }
    public static void main(String[] args) {
        ListNode res =new ListNode(new int[]{1,2,3,4,5});
        int k =2;

        ListNode res2 = remove(res, k);
        System.out.println(res2);
    }
}
