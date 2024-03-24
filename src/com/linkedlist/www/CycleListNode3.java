package com.linkedlist.www;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName CycleListNode3
 * @Author：Mayuan
 * @Date 2020/6/18 20:39
 * @Description TODO
 * @Version 1.0
 * <p>
 * 判断一个链表是否为环状链表，然后输出环状链表的节点。
 * 找到链表的环的入口的地址。
 **/
public class CycleListNode3 {

    private static ListNode cycle(ListNode head) {

        // 设置链表的集合，如果已经存在集合中，说明是环状的链表。
        Set<ListNode> visited = new HashSet<ListNode>();

        ListNode node = head;
        while (node != null) {
            if (visited.contains(node)) {
                return node;
            }
            visited.add(node);
            node = node.next;
        }

        return null;
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(3);
        ListNode h2 = new ListNode(2);
        ListNode h3 = new ListNode(0);
        ListNode h4 = new ListNode(4);

        head.next = h2;
        h2.next = h3;
        h3.next = h4;
        h4.next = h2;
        ListNode temp = cycle(head);

        System.out.println(temp.val);
    }
}
