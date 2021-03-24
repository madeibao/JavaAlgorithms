package com.linkedlist.www;

/**
 * @program: JavaWorkSpace2->DeleteOrderNode
 * @description: 删除排序链表中的重复的节点
 * @author: MaYuan
 * @create: 2020-01-02 20:36
 * @version: 1.0
 * <p>
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 1->1->2
 * 输出: 1->2
 * <p>
 * 示例 2:
 * <p>
 * 输入: 1->1->2->3->3
 * 输出: 1->2->3
 **/
public class DeleteOrderNode {

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode cur = head;
        while (cur.next != null) {
            if (cur.next.val == cur.val) {
                // 指针向后进行移动。
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return head;
    }

    public static ListNode deleteDuplicates2(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        if (head.val == head.next.val) {
            head = deleteDuplicates(head.next);
        } else {
            head.next = deleteDuplicates(head.next);
        }
        return head;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 3, 4};
        ListNode node = new ListNode(nums);
        ListNode node2 = deleteDuplicates2(node);
        System.out.println(node2);
    }
}
