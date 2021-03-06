package com.linkedlist.www;

/**
 * @ClassName ReorderList
 * @Author：Mayuan
 * @Date 2021/3/17/0017 14:05
 * @Description TODO
 * @Version 1.0
 *
 *
 * 链表的重新排列。
 * 给定一个单链表 L：L0→L1→…→Ln-1→Ln，
 * 将其重新排列后变为： L0→Ln→L1→Ln-1→L2→Ln-2→…
 *
 * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 *
 * 示例 1:
 *
 * 给定链表 1->2->3->4, 重新排列为 1->4->2->3.
 * 示例 2:
 *
 * 给定链表 1->2->3->4->5, 重新排列为 1->5->2->4->3.
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reorder-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 **/

public class ReorderList {
    public void reorderList(ListNode head) {
        if(head == null) {
            return;
        }
        //1. 使用快慢指针,找出链表的中心节点。
        // 1->2->3->4->5,中心节点为3
        ListNode middle = middleNode(head);

        //2. 将原始链表按照中心链表分割为两个链表，并将右链表反转
        //2.1 原始链表：1->2->3->4->5 左链表：1->2->3 右链表：4->5
        ListNode left = head;
        ListNode right = middle.next;
        middle.next = null;

        //2.2 反转右链表
        //原始右链表：4->5 反转后：5->4
        right = reverse(right);

        //3. 合并两个链表，将右链表插入到左链表
        //左链表：1->2->3 右链表：4->5 合并后：1->5->2->4->3
        merge(left,right);
    }

    //1. 使用快慢指针,找出链表的中心节点
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    //2. 通过递归反转链表
    public ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode last = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }

    /**
     * 3. 合并两个链表，将右链表插入到左链表
     */

    public void merge(ListNode left, ListNode right) {
        ListNode leftTemp=null;
        ListNode rightTemp=null;

        // 注意此处是 right!=null 
        while (left.next != null && right!= null) {
            //1. 保存next节点
            leftTemp = left.next;
            rightTemp = right.next;

            //2. 将右链表的第一个节点插入到左链表中
            // 左链表：1->2->3 右链表：5->4
            // 合并后的左链表：1->5->2->3
            left.next = right;
            right.next = leftTemp;

            //3. 移动left和right指针
            //左链表变为：2->3 右链表变为：4
            left = leftTemp;
            right = rightTemp;
        }
    }

    public static void main(String[] args) {
        ListNode node =new ListNode(new int[]{1,2,3,4,5,});
        ReorderList rr = new ReorderList();
        rr.reorderList(node);
        while (node!=null) {
            System.out.print(node.val+" ");
            node = node.next;
        }
    }
}
