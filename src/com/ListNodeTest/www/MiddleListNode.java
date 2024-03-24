package com.ListNodeTest.www;

/**
 * @ClassName MiddleListNode
 * @Author：Mayuan
 * @Date 2021/3/19/0019 10:41
 * @Description TODO
 * @Version 1.0
 *
 * 链表的中间节点。
 * 给出链表的中间节点值。
 *
 **/
public class MiddleListNode {

    public static ListNode middle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast!=null&&fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode res = slow.next;
        slow.next = null;
        return res;
    }
    public static void main(String[] args) {
        ListNode node = new ListNode(new int[]{1,2,3,4,5,6,7});
        ListNode res = middle(node);
        System.out.println(res.toString());
        System.out.println(node.toString());
    }
}
