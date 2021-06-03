package com.linkedlist.www;

/**
 * @ClassName DeleteNode3
 * @Author：Mayuan
 * @Date 2020/2/25 16:52
 * @Description TODO
 * @Version 1.0
 * <p>
 * 给定一个链表和一个值，
 * 删除链表中的节点等于这个值得内容
 **/
public class DeleteNode3 {

    private static ListNode deleteNode(ListNode head, int val) {
        if (head == null || head.val == val) {
            return head.next;
        }

        // 当前的指针节点。
        ListNode cur = head;
        while (cur.next != null && cur.next.val != val) {
            cur = cur.next;
        }
        ListNode p = cur.next.next;
        cur.next = p;
        return head;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 3, 4, 5, 7, 8, 9, 10};
        ListNode node = new ListNode(nums);
        int k = 3;
        ListNode temp = deleteNode(node, k);
        System.out.print(temp);
    }
}
