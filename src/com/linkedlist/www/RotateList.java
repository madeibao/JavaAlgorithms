package com.linkedlist.www;

/**
 * @ClassName RotateList
 * @Author：Mayuan
 * @Date 2020/4/20 16:33
 * @Description TODO
 * @Version 1.0
 * <p>
 * 链表来旋转一个位置的结果值
 *
 *
 **/
public class RotateList {
    public static ListNode rotateRight(ListNode head, int k) {
        // base cases
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }

        // close the linked list into the ring
        ListNode old_tail = head;
        int n;
        for (n = 1; old_tail.next != null; n++) {
            old_tail = old_tail.next;
        }
        old_tail.next = head;

        // 现在是组成了一个环的形式。
        // find new tail : (n - k % n - 1)th node
        // and new head : (n - k % n)th node
        ListNode new_tail = head;
        for (int i = 0; i < n - k % n - 1; i++) {
            new_tail = new_tail.next;
        }

        ListNode new_head = new_tail.next;

        // break the ring
        new_tail.next = null;
        // 返回新的节点的位置。
        return new_head;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 2;
        ListNode node2 = new ListNode(nums);
        ListNode temp = rotateRight(node2, k);
        System.out.println(temp);
    }
}









