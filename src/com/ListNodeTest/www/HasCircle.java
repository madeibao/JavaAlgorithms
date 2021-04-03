package com.ListNodeTest.www;

/**
 * @ClassName HasCircle
 * @Author：Mayuan
 * @Date 2021/3/19/0019 15:55
 * @Description TODO
 * @Version 1.0
 *
 * 判断链表是否有环。
 * 快慢指针来确定链表是否有环状结构。
 *
 * 通过双指针算法来实现。
 **/
public class HasCircle {

    public static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null&&fast.next!=null) {
            fast =fast.next.next;
            slow =slow.next;
            if(fast==slow) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

        ListNode head =new ListNode(1);
        ListNode h2 = new ListNode (2);
        ListNode h3 = new ListNode(3);
        head.next = h2;
        h2.next = h3;
        h3.next = head;

        System.out.println(hasCycle(head));
    }
}
