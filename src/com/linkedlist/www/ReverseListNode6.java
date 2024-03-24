package com.linkedlist.www;

/**
 * @ClassName ReverseListNode6
 * @Author：Mayuan
 * @Date 2020/11/2 21:52
 * @Description TODO
 * @Version 1.0
 * <p>
 * 递归来实现链表的反转操作。
 **/
public class ReverseListNode6 {

    private static ListNode reverse(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode tail = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return tail;
    }

    private static ListNode reverse2(ListNode head) {
        if(head==null|| head.next==null) {
            return head;
        }

        ListNode res = reverse2(head.next);
        head.next.next = head;
        head.next= null;
        return res;
    }


    public static void main(String[] args) {
        ListNode head = new ListNode(new int[]{1, 2, 3, 4, 5, 6});
        ListNode res = reverse2(head);
        while (res != null) {
            System.out.print(res.val + "->");
            res = res.next;
        }
    }
}
