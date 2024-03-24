package com.ListNodeTest.www;

/**
 * @ClassName ReorderListNode
 * @Author：Mayuan
 * @Date 2023/9/21/0021 15:49
 * @Description TODO
 * @Version 1.0
 *
 * 链表重新排序
 **/
public class ReorderListNode {

    public void reorderList(ListNode head) {
        if(head==null) {
            return;
        }

        ListNode left;
        ListNode right;

        ListNode res = midNode(head);

        left = head;

        right = res.next;
        res.next = null;

        ListNode res2 = reverse(right);

        merge(left,res2);
    }

    ListNode reverse(ListNode head) {

        ListNode pre = null;
        while (head!=null) {
            ListNode temp = head.next;
            head.next = pre;
            pre = head;
            head = temp;
        }
        return pre;
    }

    ListNode midNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast!=null&&fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    void merge(ListNode headA, ListNode headB) {

        ListNode left;
        ListNode right;

        while(headA.next!=null&&headB!=null) {

            left = headA.next;
            right = headB.next;

            headA.next = headB;
            headB.next = left;
            headA = left;
            headB = right;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(new int[]{1,2,3,4});
        new ReorderListNode().reorderList(head);

        while (head!=null) {
            System.out.print(head.val+" ");
            head = head.next;
        }
    }
}
