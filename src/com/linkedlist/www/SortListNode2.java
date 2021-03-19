package com.linkedlist.www;

/**
 * @ClassName SortListNode2
 * @Author：Mayuan
 * @Date 2020/6/6 16:16
 * @Description TODO
 * @Version 1.0
 * <p>
 * 链表的排序操作。
 **/

public class SortListNode2 {
    public ListNode sortList(ListNode head) {
        return head == null ? null : mergeSort(head);
    }

    private ListNode mergeSort(ListNode head) {

        if (head.next == null) {
            return head;
        }

        ListNode p = head, q = head, pre = null;
        while (q != null && q.next != null) {
            pre = p;
            p = p.next;
            q = q.next.next;
        }
        pre.next = null;

        // 递归调用结果值。
        ListNode l = mergeSort(head);
        ListNode r = mergeSort(p);
        return merge(l, r);
    }

    /**
     * 这里是两个链表的排序操作。
     *
     * @param l
     * @param r
     * @return
     */
    ListNode merge(ListNode l, ListNode r) {
        ListNode dummyHead = new ListNode(0);
        ListNode cur = dummyHead;
        while (l != null && r != null) {
            if (l.val <= r.val) {
                cur.next = l;
                cur = cur.next;
                l = l.next;
            } else {
                cur.next = r;
                cur = cur.next;
                r = r.next;
            }
        }
        if (l != null) {
            cur.next = l;
        }
        if (r != null) {
            cur.next = r;
        }
        return dummyHead.next;
    }

    public static void main(String[] args) {
        ListNode temp = new ListNode(new int[]{2, 3, 1, 4});
        ListNode res = new SortListNode2().sortList(temp);
        System.out.println(res);
    }

}
