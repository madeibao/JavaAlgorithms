package com.linkedlist.www;

/**
 * @ClassName ReverseKthNode7
 * @Author：Mayuan
 * @Date 2021/3/15/0015 22:18
 * @Description TODO
 * @Version 1.0
 * // 从链表的倒数第K个节点来返回。
 **/

public class ReverseKthNode7 {

    public static  ListNode FindKthToTail (ListNode pHead, int k) {
        // write code here
        ListNode slow = pHead;
        ListNode fast = pHead;

        // 快指针不断移动。
        for(int i=1;i<=k;i++) {
            if(fast==null) {
                return null;
            }
            fast= fast.next;
        }

        while (fast!=null) {
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        ListNode res = new ListNode(new int[]{1,2,3,4,5,6});
        int k =2;
        ListNode res2;
        res2 = FindKthToTail(res, k);
        while (res2!=null) {
            System.out.print(res2.val+" ");
            res2= res2.next;
        }
    }
}
