package com.linkedlist.www;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @ClassName CombineList
 * @Author：Mayuan
 * @Date 2020/5/17 19:35
 * @Description TODO
 * @Version 1.0
 * <p>
 * 合并K个排序的链表。
 **/
public class CombineList {
    public static ListNode mergeKLists(ListNode[] lists) {
        Queue<Integer> queue = new PriorityQueue<>((i1, i2) -> Integer.compare(i2, i1));

        // 合并链表元素到队列
        for (ListNode node : lists) {
            while (node != null) {
                queue.offer(node.val);
                node = node.next;
            }
        }
        // 把队列中元素添加到了新的链表
        ListNode ans = null;
        while (!queue.isEmpty()) {
            // 每次拿出最大元素，并删除
            ListNode curr = new ListNode(queue.poll());
            curr.next = ans;
            ans = curr;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] list2 = {1, 2, 3};
        int[] list3 = {2, 3, 4};
        int[] list4 = {3, 4, 5};

        ListNode node2 = new ListNode(list2);
        ListNode node3 = new ListNode(list3);
        ListNode node4 = new ListNode(list4);

        ListNode[] temp = new ListNode[]{node2, node3, node4};

        ListNode res = mergeKLists(temp);
        System.out.println(res);


    }
}
