package com.linkedlist.www;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * @program: JavaWorkSpace2->HuiWenList
 * @description: 判断链表是否为回文链表
 * @author: MaYuan
 * @create: 2019-12-28 19:54
 * @version: 1.0
 **/
public class HuiWenList {
    private static boolean isPalindrome(ListNode head) {
        ListNode p = head;
        List<Integer> list = new ArrayList<>();

        // 首先用链表来存储这个节点的值。
        while (p != null) {
            list.add(p.val);
            p = p.next;
        }
        List<Integer> cmp = new ArrayList<Integer>(list);
        // 首先逆置这个链表的内容。
        Collections.reverse(cmp);
        if (cmp.equals(list)) {
            return true;
        }
        return false;
    }

    private static boolean isPalindrome2(ListNode head) {
        //统计链表的长度数字。
        int count = 0;
        Stack<Integer> stack = new Stack<>();
        ListNode p = head;
        while (p != null) {
            stack.push(p.val);
            p = p.next;
            count += 1;
        }
        for (int i = 1; i <= count / 2; i++) {
            if (head.val != stack.peek()) {
                return false;
            } else {
                // 指针向后移动，
                // 栈中的元素来弹出来。
                head = head.next;
                stack.pop();
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        ListNode node2 = new ListNode(nums);
        System.out.println(isPalindrome2(node2));
    }
}




