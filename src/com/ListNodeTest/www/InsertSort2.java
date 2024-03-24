package com.ListNodeTest.www;

/**
 * @ClassName InsertSort2
 * @Author：Mayuan
 * @Date 2021/11/27/0027 21:53
 * @Description TODO
 * @Version 1.0
 *
 * 链表的插入排序
 **/
public class InsertSort2 {

    static ListNode insert(ListNode head) {
        ListNode dummy = new ListNode(-1);

        // 指向排好序的第一个节点
        ListNode pre = dummy;
        // 排好序的最后一个节点
        ListNode tail = dummy;
        ListNode cur = head;

        while (cur!=null) {
            if(tail.val<cur.val) {
                tail.next = cur;
                tail = cur;
                cur = cur.next;
            }
            else {
                ListNode temp = cur.next;
                tail.next = temp;
                while (pre.next!=null&&pre.next.val<cur.val) {
                    pre = pre.next;
                }

                // 插入节点。
                cur.next = pre.next;
                pre.next = cur;

                // 重新的指向第一个节点
                pre = dummy;

                // 执行临时节点
                cur = temp;
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
