package com.linkedlist.www;

/**
 * @ClassName DeleteRepeatNode
 * @Author：Mayuan
 * @Date 2020/6/19 21:55
 * @Description TODO
 * @Version 1.0
 * <p>
 * 删除重复的链表重复节点。
 * 只要重复，都删除。
 **/
public class DeleteRepeatNode {
    static private ListNode temp;

    /**
     * 使用递归的写法来实现删除链表中的重复的节点内容。
     */
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode curHead = deleteDuplicates(head.next);
        if (temp == null) {
            temp = curHead;
        }
        if (temp.val == head.val) {
            return temp.next;
        } else {
            head.next = curHead;
            temp = head;
            return head;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3, 3, 4, 5, 6};
        ListNode temp = new ListNode(nums);
        ListNode res = deleteDuplicates(temp);
        System.out.println(res);
    }
}

