package com.linkedlist.www;

/**
 * @ClassName FirstCommonNode
 * @Author：Mayuan
 * @Date 2020/3/28 14:43
 * @Description TODO
 * @Version 1.0
 * <p>
 * 两个链表的第一个公共的节点
 * 求链表的公共的节点和之后的节点。
 **/
public class FirstCommonNode {

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        // 双指针的解法浪漫的相遇。
        if (headA == null || headB == null) {
            return null;
        }
        ListNode pA = headA, pB = headB;
        while (pA != pB) {
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }
        return pA;
    }

    /**
     * public static ListNode commonNode(ListNode ha, ListNode hb) {
     * <p>
     * if(ha==null||hb==null) {
     * return null;
     * }
     * ListNode na =ha;
     * ListNode nb =hb;
     * while (na!=nb) {
     * na = na==null?nb:na.next;
     * nb = nb==null?na:nb.next;
     * }
     * return na;
     * }
     */

    public static void main(String[] args) {

        ListNode h1 = new ListNode(4);
        ListNode h2 = new ListNode(1);
        ListNode h3 = new ListNode(8);
        ListNode h4 = new ListNode(4);
        ListNode h5 = new ListNode(5);

        h1.next = h2;
        h2.next = h3;
        h3.next = h4;
        h4.next = h5;

        ListNode n1 = new ListNode(5);
        ListNode n2 = new ListNode(0);
        ListNode n3 = new ListNode(2);

        n1.next = n2;
        n2.next = n3;
        n3.next = h3;

        ListNode temp = getIntersectionNode(h1, n1);
        System.out.println(temp);
    }
}
