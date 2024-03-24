package com.linkedlist.www;

/**
 * @ClassName InsertSort
 * @Author：Mayuan
 * @Date 2021/8/8/0008 22:27
 * @Description TODO
 * @Version 1.0
 *
 * 链表的插入排序。
 **/
public class InsertSort {

    static ListNode insert(ListNode head) {

        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        while(head!=null&&head.next!=null)  {
            ListNode p = dummy;
            if(head.val>head.next.val) {
                while(p.next.val<head.next.val) {
                    p = p.next;
                }

                ListNode node = head.next;
                head.next = node.next;
                node.next = p.next;
                p.next = node;
            }
            else {
                head = head.next;
            }
        }
        return dummy.next;

    }

    public static void main(String[] args) {

        ListNode temp = new ListNode(new int[]{2, 3, 2, 34, 2, 2, 2, 45, 9, 23, 23,});
        ListNode res = insert(temp);
        System.out.println(res);
    }
}
