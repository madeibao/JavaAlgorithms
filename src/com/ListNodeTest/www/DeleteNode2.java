package com.ListNodeTest.www;

/**
 * @ClassName KeepNode
 * @Author：Mayuan
 * @Date 2021/3/29/0029 19:37
 * @Description TODO
 * @Version 1.0
 *
 * 删除链表中的重复的元素，
 * 若为多个，保留一个。
 **/
public class DeleteNode2 {

    static ListNode deleteNode(ListNode head) {
        if(head==null||head.next==null) {
            return head;
        }
        ListNode p = head;
        while (p.next != null) {
            if(p.val==p.next.val) {
                p.next= p.next.next;
            }
            else {
                p = p.next;
            }
        }

        return head;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(new int[]{1,2,2,3,4});
        ListNode res = deleteNode(head);
        System.out.println(res);
    }
}
