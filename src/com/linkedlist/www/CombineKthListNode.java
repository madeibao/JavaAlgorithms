package com.linkedlist.www;

import java.util.PriorityQueue;

/**
 * @ClassName CombineKthListNode
 * @Author：Mayuan
 * @Date 2020/6/7 19:51
 * @Description TODO
 * @Version 1.0
 * <p>
 * 一共有K个排序的链表，然后求K个链表的归并成一个排序的链表的操作。
 **/
public class CombineKthListNode {

    public static ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> Integer.compare(o2, o1));

        // 首先所有的链表的节点都保存在了队列中。
        for (ListNode t : lists) {
            while (t != null) {
                queue.offer(t.val);
                t = t.next;
            }
        }

        ListNode ans = null;
        while (!queue.isEmpty()) {

            // 弹出一个节点，然后生成一个队列的节点值。
            ListNode cur = new ListNode(queue.poll());
            cur.next = ans;
            ans = cur;
        }
        return ans;

    }

    public static void main(String[] args) {
        ListNode node2 = new ListNode(new int[]{1, 2, 3, 4});
        ListNode node3 = new ListNode(new int[]{2, 3, 4});
        ListNode node4 = new ListNode(new int[]{1, 2, 5});

//        多个链表组成的数组来实现归并
        ListNode[] temp = new ListNode[]{node2, node3, node4};

        ListNode res = mergeKLists(temp);
        System.out.println(res);
    }
}
