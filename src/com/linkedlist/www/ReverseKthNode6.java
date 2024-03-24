package com.linkedlist.www;

/**
 * @ClassName ReverseKthNode6
 * @Author：Mayuan
 * @Date 2020/11/18 20:26
 * @Description TODO
 * @Version 1.0
 * <p>
 * 链表的倒数的第k个节点。
 * 返回的是链表的倒数的第k个节点的开始的值。
 **/
public class ReverseKthNode6 {

    private static ListNode kthNode(ListNode head, int k) {

        ListNode slow = head;
        ListNode fast = head;

        for (int i = 0; i < k; i++) {
            if(fast==null) {
                return null;
            }
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        int k = 3;
        ListNode res = kthNode(head, k);
        while (res != null) {
            System.out.println(res.val + " ");
            res = res.next;
        }

    }
}
