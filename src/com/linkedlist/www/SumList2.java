package com.linkedlist.www;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName SumList2
 * @Author：Mayuan
 * @Date 2020/11/5 10:02
 * @Description TODO
 * @Version 1.0
 * <p>
 * leetcode 1171
 * 链表的区间内的节点的值为0.
 **/
public class SumList2 {
    public static ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        Map<Integer, ListNode> map = new HashMap<>();

        // 首次遍历建立 节点处链表和<->节点 哈希表
        // 若同一和出现多次会覆盖，即记录该sum出现的最后一次节点
        int sum = 0;
        for (ListNode d = dummy; d != null; d = d.next) {
            sum += d.val;
            map.put(sum, d);
        }


        // 第二遍遍历 若当前节点处sum在下一处出现了则表明两结点之间所有节点和为0 直接删除区间所有节点
        sum = 0;
        for (ListNode d = dummy; d != null; d = d.next) {
            sum += d.val;
            d.next = map.get(sum).next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(new int[]{1, 2, -3, 3, 1});
        ListNode res = removeZeroSumSublists(head);
        while (res != null) {
            System.out.print(res.val + " ");
            res = res.next;
        }
    }
}
