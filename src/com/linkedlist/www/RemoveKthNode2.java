package com.linkedlist.www;

/**
 * @ClassName RemoveKthNode2
 * @Author：Mayuan
 * @Date 2021/3/15/0015 14:25
 * @Description TODO
 * @Version 1.0
 *
 * 删除链表的倒数的第k个节点。
 **/
public class RemoveKthNode2 {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null||n<1) {
            return head;
        }

        ListNode cur = head;

        // 从头部到尾部的遍历一遍链表节点，得出n和 链表长度的区别。
        while(cur!=null) {
            n--;
            cur =cur.next;
        }

        // 倒数第n个节点就是头节点。
        if(n==0) {
            head= head.next;
        }

        if(n<0) {

            // 重新指定头节点。
            cur= head;

            // 注意是++n
            while(++n!=0) {
                cur = cur.next;
            }
            cur.next = cur.next.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode head =new ListNode(new int[]{1,2,3,4,5});
        int n =2;
        ListNode res = removeNthFromEnd(head, n);
        while (res!=null) {
            System.out.print(res.val);
            res =res.next;
        }
    }
}
