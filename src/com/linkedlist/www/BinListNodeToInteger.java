package com.linkedlist.www;

/**
 * @program: Pro1->BinListNodeToInteger
 * @description: 链表存储的二进制数字转化为整形
 * @author: MaYuan
 * @create: 2019-12-25 19:47
 * @version: 1.0
 * 给你一个单链表的引用结点 head。链表中每个结点的值不是 0 就是 1。已知此链表是一个整数数字的二进制表示形式。
 * 请你返回该链表所表示数字的 十进制值 。
 * 示例 1：
 * 输入：head = [1,0,1]
 * 输出：5
 * 解释：二进制数 (101) 转化为十进制数 (5)
 **/

public class BinListNodeToInteger {
    private static int BinToInteger(ListNode root) {
        StringBuffer sb = new StringBuffer();
        while (root != null) {
            sb.append(root.val);
            root = root.next;
        }
        return Integer.parseInt(sb.toString(), 2);
    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        ListNode head2 = new ListNode(0);
        ListNode head3 = new ListNode(1);
        head1.next = head2;
        head2.next = head3;
        head3.next = null;
        System.out.println(BinToInteger(head1));
    }
}


