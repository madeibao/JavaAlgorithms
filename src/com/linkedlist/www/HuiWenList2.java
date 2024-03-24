package com.linkedlist.www;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @ClassName HuiWenList2
 * @Author：Mayuan
 * @Date 2020/3/24 22:36
 * @Description TODO
 * @Version 1.0
 * <p>
 * 判断链表是否为回文结构
 **/
public class HuiWenList2 {
    public static boolean isPalindrome(ListNode head) {
        //bad-case
        if (head == null) {
            return true;
        }

        //bad-case
        if (head.next == null) {
            return true;
        }

        //构建栈
        Deque<ListNode> stack = new LinkedList();
        //快慢指针找中间节点

        // 慢指针
        ListNode slow = head;
        // 快指针
        ListNode fast = head;


        //装入栈
        stack.addFirst(slow);

        //循环找中间节点
        while (fast != null) {
            // 奇数
            if (fast.next == null) {
                //出栈
                stack.removeFirst();
                slow = slow.next;
                break;
            } else if (fast.next.next == null) {
                slow = slow.next;
                break;
            }
            //走两步
            fast = fast.next.next;
            //走一步
            slow = slow.next;
            //装入栈
            stack.addFirst(slow);
        }

        //判断是否是回文串
        while (!stack.isEmpty()) {
            //debug

            //System.out.println(slow.val);
            ListNode node = stack.removeFirst();
            //debug

            //System.out.println(node.val);
            if (slow.val != node.val) {
                return false;
            }
            slow = slow.next;
        }

        return true;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        ListNode node = new ListNode(nums);
        System.out.println(isPalindrome(node));
    }
}
