package com.linkedlist.www;

/**
 * @ClassName SortListNode3
 * @Author：Mayuan
 * @Date 2020/6/7 20:34
 * @Description TODO
 * @Version 1.0
 * <p>
 * 对于链表的排序操作，要求时间和空间的复杂度都要满足一定的要求。
 * 在 O(n log n) 时间复杂度和常数级空间复杂度下，对链表进行排序。
 **/
public class SortListNode3 {
    public static ListNode sortList(ListNode head) {
        if (head == null) {
            return null;
        }
        // 递归结束条件
        if (head.next == null) {
            return head;
        }

        ListNode p1 = head;
        ListNode p2 = head;
        // 快慢指针找到中间节点

        while (p2.next != null && p2.next.next != null) {
            p1 = p1.next;
            p2 = p2.next.next;
        }

        // 通过快慢的指针来找到中间的节点。
        // 把链表从中间断开

        ListNode tail = p1;
        p1 = p1.next;
        tail.next = null;

        // 左边排序后返回左链表的开头
        ListNode L = sortList(head);
        // 右边排序后返回右链表的开头
        ListNode R = sortList(p1);
        return merge(L, R);
    }

    public static ListNode merge(ListNode left, ListNode right) {
        ListNode pre = new ListNode(0);
        ListNode cur = pre;

        // 比较左右链表
        while (left != null && right != null) {
            if (left.val <= right.val) {
                cur.next = left;
                cur = cur.next;
                left = left.next;
            }
            else {
                cur.next = right;
                cur = cur.next;
                right = right.next;
            }
        }
        if (left != null) {
            cur.next = left;
        }
        if (right != null) {
            cur.next = right;
        }

        return pre.next;
    }

    public static void main(String[] args) {
        ListNode node2 = new ListNode(new int[]{2, 3, 1, 4, 5,});
        System.out.println(sortList(node2));
    }
}

