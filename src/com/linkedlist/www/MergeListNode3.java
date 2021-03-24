package com.linkedlist.www;

/**
 * @ClassName MergeListNode3
 * @Author：Mayuan
 * @Date 2020/12/13/0013 11:13
 * @Description TODO
 * @Version 1.0
 * <p>
 * 合并 k 个排序的链表。
 **/
public class MergeListNode3 {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0)
            return null;
        if (lists.length == 1)
            return lists[0];
        if (lists.length == 2) {
            return mergeTwoLists(lists[0], lists[1]);
        }

        int mid = lists.length / 2;
        ListNode[] l1 = new ListNode[mid];
        for (int i = 0; i < mid; i++) {
            l1[i] = lists[i];
        }

        ListNode[] l2 = new ListNode[lists.length - mid];
        for (int i = mid, j = 0; i < lists.length; i++, j++) {
            l2[j] = lists[i];
        }

        return mergeTwoLists(mergeKLists(l1), mergeKLists(l2));

    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        ListNode head = null;
        if (l1.val <= l2.val) {
            head = l1;
            head.next = mergeTwoLists(l1.next, l2);
        } else {
            head = l2;
            head.next = mergeTwoLists(l1, l2.next);
        }
        return head;
    }

    public static void main(String[] args) {

        ListNode h1= new ListNode(new int[]{1,2,3});
        ListNode h2= new ListNode(new int[]{2,3,4});
        ListNode h3= new ListNode(new int[]{2,5,7});

        ListNode[] temp =new ListNode[]{h1,h2,h3};
        ListNode res;
        MergeListNode3 m3 = new MergeListNode3();
        res =m3.mergeKLists(temp);

        /**
         *         while (res!=null) {
         *             System.out.print(res+" ");
         *             res= res.next;
         *         }
         */
        System.out.println(res);

    }
}
