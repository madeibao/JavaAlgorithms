package com.linkedlist.www;

/**
 * @ClassName CycleListNode2
 * @Author：Mayuan
 * @Date 2020/4/5 17:54
 * @Description TODO
 * @Version 1.0
 * <p>
 * 给定一个链表，判断是否有环，然后返回环的入口地址。
 **/
public class CycleListNode2 {
    public static ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode fast = head.next, slow = head;
        while (fast.next != null && fast.next.next != null && fast != slow) {
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast.next == null || fast.next.next == null) {
            return null;
        }
        fast = head;
        while (fast != slow.next) {
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(3);
        ListNode h2 = new ListNode(2);
        ListNode h3 = new ListNode(0);
        ListNode h4 = new ListNode(4);

        head.next = h2;
        h2.next = h3;
        h3.next = h4;
        h4.next = h2;
        ListNode temp = detectCycle(head);

        // 链表形成环，环的入口的地址为2
        System.out.println(temp.val);
    }

}
