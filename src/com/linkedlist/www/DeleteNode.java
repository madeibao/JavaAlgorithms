package com.linkedlist.www;

/**
 * @program: JavaWorkSpace2->DeleteNode
 * @description: 删除链表中的节点内容
 * @author: MaYuan
 * @create: 2019-12-27 19:14
 * @version: 1.0
 * 删除链表中的节点与给定的值相同的节点。
 * 输入: 1->2->6->3->4->5->6, val = 6
 * 输出: 1->2->3->4->5
 * <p>
 * 删除链表中的所有的节点值等于给定值，然后返回链表。
 **/
public class DeleteNode {

    private static ListNode delNode(ListNode head, int val) {

        while (head != null && head.val == val) {
            head = head.next;
        }
        if (head == null) {
            return head;
        }

        ListNode pre = head;
        while (pre.next != null) {
            if (pre.next.val == val) {
                pre.next = pre.next.next;
            } else {
                pre = pre.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        int val = 6;
        int[] nums = {1, 2, 6, 3, 4, 5, 6};
        // 通过数组来创建链表。
        ListNode head = new ListNode(nums);
        System.out.println(head);
        ListNode head2 = delNode(head, val);
        System.out.println(head2);
    }
}





