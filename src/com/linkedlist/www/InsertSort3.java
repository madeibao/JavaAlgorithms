package com.linkedlist.www;

/**
 * @ClassName InsertSort3
 * @Author：Mayuan
 * @Date 2020/6/16 9:36
 * @Description TODO
 * @Version 1.0
 * <p>
 * 对于链表的插入排序的操作。
 **/
public class InsertSort3 {

    public ListNode insertionSortList(ListNode head) {

        ListNode dummy = new ListNode(0);
        ListNode pre = dummy;
        ListNode cur = head;
        while (cur != null) {
            ListNode tmp = cur.next;
            while (pre.next != null && pre.next.val < cur.val) {
                pre = pre.next;
            }
            cur.next = pre.next;
            pre.next = cur;

            // 再次的指向第一个节点值。
            pre = dummy;
            cur = tmp;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode temp = new ListNode(new int[]{2, 3, 2, 34, 2, 2, 2, 45, 9, 23, 23,});
        ListNode res = new InsertSort3().insertionSortList(temp);

        System.out.println(res);
    }
}
