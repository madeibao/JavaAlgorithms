package com.linkedlist.www;

/**
 * @ClassName ReorderListNode
 * @Author：Mayuan
 * @Date 2021/4/26/0026 21:31
 * @Description TODO
 * @Version 1.0
 *
 * 链表的重新组合。
 * 原地进行算法

1->2->3->4->5->6->7->NULL
1->7->2->6->3->5->4->NULL

 **/

public class ReorderListNode {

    public static void reorderList(ListNode head) {
        if(head==null||head.next==null||head.next.next==null) {
            return;
        }

        // 首先设置快慢两个指针来找到中间节点。
        ListNode slow= head;
        ListNode fast= head;

        while (fast!=null&&fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode mid = slow;
        ListNode start = head;

        // 后半段的链表的开始节点。
        ListNode endH = mid.next;
        mid.next = null;

        ListNode end = reverse(endH);

        while(start != null && end!=null) {
            ListNode next1 = start.next;
            ListNode next2 = end.next;
            end.next = next1;
            start.next = end;
            start = next1;
            end = next2;
        }
        return;
    }

    static ListNode reverse(ListNode head) {
        ListNode pre= null;
        while (head!=null) {
            ListNode temp = head.next;
            head.next = pre;
            pre = head;
            head= temp;
        }

        return pre;
    }

    public static void main(String[] args) {

        ListNode res =new ListNode(new int[]{1,2,3,4,5,6,7});
        System.out.println(res);
        reorderList(res);
        System.out.println(res);
    }
}
