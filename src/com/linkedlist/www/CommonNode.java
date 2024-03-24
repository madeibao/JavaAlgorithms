package com.linkedlist.www;

/**
 * @ClassName CommonNode
 * @Author：Mayuan
 * @Date 2020/10/12 20:25
 * @Description TODO
 * @Version 1.0
 * leetcode 160 笔试题目。
 *
 *  // 两个链表的第一个
 **/
public class CommonNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pA = headA, pB = headB;
        while (pA != pB) {
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }
        return pA;
    }

    public static ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        int len1 = getLength(headA);
        int len2 = getLength(headB);
        int diff = len1 - len2;
        ListNode longListNode = headA;
        ListNode shortListNode = headB;

        // 求出两个链表的差的位置内容。
        if (diff < 0) {
            longListNode = headB;
            shortListNode = headA;
            diff = len2 - len1;
        }
        for (int i = 0; i < diff; i++) {
            longListNode = longListNode.next;
        }
        while (longListNode != null && shortListNode != null && longListNode != shortListNode) {
            longListNode = longListNode.next;
            shortListNode = shortListNode.next;
        }
        return longListNode;
    }

    private static int getLength(ListNode list) {
        int result = 0;
        while (list != null) {
            result += 1;
            list = list.next;
        }
        return result;
    }

    public static void main(String[] args) {


    }
}