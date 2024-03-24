package com.linkedlist.www;

/**
 * @program: JavaWorkSpace2->DeleteReverseNode
 * @description: 删除倒数的节点的数量
 * @author: MaYuan
 * @create: 2020-02-06 21:19
 * @version: 1.0
 * <p>
 * 删除链表中的第倒数k个节点内容，然后返回这个链表节点。
 **/
public class DeleteReverseNode {

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        // 创造一个虚拟的节点内容。
        int length = 0;
        ListNode first = head;
        while (first != null) {
            length++;
            first = first.next;
        }
        length -= n;
        first = dummy;
        while (length > 0) {
            length--;
            first = first.next;
        }
        first.next = first.next.next;
        return dummy.next;
    }

    public static ListNode removeNthFromEnd3(ListNode head, int n) {

        // 首先构造一个虚拟的节点内容。
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode start = pre, end = pre;
        while (n != 0) {
            start = start.next;
            n--;
        }
        // 假定的是从倒数第二个节点。
        // start 从链表的第2个节点开始来进行。
        // 012345
        while (start.next != null) {
            start = start.next;
            end = end.next;
        }

        // 最终start和end都指向最后的一个节点。
        end.next = end.next.next;
        return pre.next;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int n = 2;
        ListNode head = new ListNode(nums);
        ListNode head2 = removeNthFromEnd3(head, n);
        System.out.println(head2);

    }
}
