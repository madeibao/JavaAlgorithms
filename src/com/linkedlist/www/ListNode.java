package com.linkedlist.www;

/**
 * @program: Pro1->ListNode
 * @description: 最基本的链表节点
 * @author: MaYuan
 * @create: 2019-12-23 12:29
 * @version: 1.0
 * 基本的Java节点类
 *
ListNode head = new ListNode(0);
ListNode node1 = new ListNode(1);
ListNode node2 = new ListNode(2);
ListNode node3 = new ListNode(3);
ListNode node4 = new ListNode(4);
ListNode node5 = new ListNode(5);

head.next = node1;
node1.next = node2;
node2.next = node3;
node3.next = node4;
node4.next = node5;
node5.next = null;


 **/
public class ListNode {
    int val;
    ListNode next;

    public ListNode() {
    }

    public ListNode(int x) {
        val = x;
    }

    /**
     * 利用给定的数组来创建一个链表节点内容。
     *
     * @param arr
     */
    public ListNode(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("arr can not be empty");
        }
        this.val = arr[0];
        ListNode cur = this;
        for (int i = 1; i < arr.length; i++) {
            // 不断生成新的节点内容。
            cur.next = new ListNode(arr[i]);
            cur = cur.next;
        }
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        ListNode cur = this;
        while (cur != null) {
            res.append(cur.val + "->");
            cur = cur.next;
        }
        res.append("NULL");
        return res.toString();
    }

    private static void printListNode(ListNode root) {
        while (root != null) {
            System.out.println(root.val + " ");
            root = root.next;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = null;
        //0->1->2->3->4->5-NULL

        ListNode temp = new ListNode(new int[]{2, 3, 1, 4});
        System.out.println(temp);

        // 2->3->1->4->null;
    }
}
