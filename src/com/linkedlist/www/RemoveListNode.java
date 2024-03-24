package com.linkedlist.www;

/**
 * @ClassName RemoveListNode
 * @Author：Mayuan
 * @Date 2020/12/8/0008 21:41
 * @Description TODO
 * @Version 1.0
 * <p>
 * 删除链表中等于给定值的节点元素。
 **/
public class RemoveListNode {

    public static ListNode removeElements(ListNode head, int val) {
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
        ListNode temp = new ListNode(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        int val = 6;
        ListNode res = removeElements(temp, val);
        while (res != null) {
            System.out.print(res.val + " ");
            res = res.next;
        }
    }
}
