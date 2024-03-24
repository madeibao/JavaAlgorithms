package com.ListNodeTest.www;

/**
 * @ClassName InsertSort
 * @Author：Mayuan
 * @Date 2021/11/27/0027 17:42
 * @Description TODO
 * @Version 1.0
 *
 * 链表的插入排序。
 *
 **/
public class InsertSort {

    static ListNode insert(ListNode head) {

        // 创建虚拟的头节点
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        while (head!=null&&head.next!=null) {

            if(head.val>head.next.val) {
                ListNode p = dummy;
                while (p.next.val<head.next.val) {
                    p = p.next;
                }

                ListNode cur = head.next;
                head.next = cur.next;
                cur.next = p.next;
                p.next = cur;
            }
            else {
                head = head.next;
            }
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(new int[]{1,2,3,10,5,6,7,8});
        ListNode res = insert(head);
        System.out.println(res);
    }
}
