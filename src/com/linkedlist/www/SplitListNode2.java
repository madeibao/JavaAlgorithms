package com.linkedlist.www;

/**
 * @ClassName SplitListNode2
 * @Author：Mayuan
 * @Date 2020/11/25/0025 20:51
 * @Description TODO
 * @Version 1.0
 * <p>
 * leetcode 根据一个元素来分割链表。
 **/
public class SplitListNode2 {
    public static ListNode partition(ListNode head, int x) {
        ListNode root = new ListNode(0);
        root.next = head;
        ListNode curr = root;

        ListNode root2 = new ListNode(1);
        ListNode curr2 = root2;

        ListNode p = head;


        while (p != null) {
            if (p.val < x) {
                curr.next = p;
                curr = p;
                p = p.next;
                curr.next = null;
            } else {
                curr2.next = p;
                curr2 = p;
                p = p.next;
                curr2.next = null;
            }
        }
        curr.next = root2.next;
        return root.next;
    }


    public ListNode partition3(ListNode head, int x) {
        ListNode l = new ListNode(0), r = new ListNode(0);
        //l为小于x的链表，r为大于等于x的链表
        l.next = null;
        r.next = null;


        // 首先是生成的两个虚拟的头节点，然后连接到右面的两个部分值。
        ListNode l1 = l, r1 = r;

        while (head != null) {
            if (head.val < x) {
                l.next = head;
                l = l.next;
            } else {
                r.next = head;
                r = r.next;
            }
            head = head.next;
        }
        r.next = null;
        l.next = r1.next;
        return l1.next;
    }

    /**
     * 链表根据一个元素来进行分割。
     * @param head
     * @param x
     * @return
     */
    private static ListNode partition2(ListNode head, int x) {

        ListNode dummy1 = new ListNode(-1);
        ListNode dummy2 = new ListNode(-1);
        ListNode p = dummy1;
        ListNode q = dummy2;

        // 将两个指针来进行指向两个链表。
        while (head != null) {

            if (head.val < x) {
                p.next = head;
                p = p.next;
            } else {
                q.next = head;
                q = q.next;
            }
            head = head.next;
        }

        // p和q 都分别指向了链表的结尾的位置上。
        p.next = dummy2.next;
        q.next = null;
        return dummy1.next;
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(new int[]{1, 4, 3, 2, 5, 2});
        ListNode res = partition2(head, 3);
        while (res != null) {
            System.out.print(res.val + " ");
            res = res.next;
        }
    }
}
