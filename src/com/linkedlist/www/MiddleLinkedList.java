package com.linkedlist.www;


/**
 * @program: JavaWorkSpace2->MiddleLinkedList
 * @description: 链表的中间的节点内容
 * @author: MaYuan
 * @create: 2020-01-15 21:41
 * @version: 1.0
 **/
public class MiddleLinkedList {
    private static ListNode middleNode(ListNode head) {
        if (head == null) {
            return null;
        }
        // 设置两个快慢指针
        ListNode faster = head;
        ListNode slower = head;
        while (faster != null && faster.next != null) {
            faster = faster.next.next;
            slower = slower.next;
        }

        // 慢的指针的位置，就是最终放回的结果值。
        return slower;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        ListNode head = new ListNode(nums);
        ListNode temp = middleNode(head);
        System.out.println(temp.val);
    }
}
