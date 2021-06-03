package com.linkedlist.www;

/**
 * @ClassName MergeNode4
 * @Author：Mayuan
 * @Date 2020/10/10 19:37
 * @Description TODO
 * @Version 1.0
 **/
public class MergeNode4 {

    public static ListNode merge(ListNode ha, ListNode hb) {
        ListNode res = null;

        if (ha == null) {
            return hb;
        }

        if (hb == null) {
            return ha;
        }

        if (ha != null || hb != null) {
            if (ha.val < hb.val) {
                res = ha;
                res.next = merge(ha.next, hb);
            } else {
                res = hb;
                res.next = merge(ha, hb.next);
            }
        }
        return res;
    }


    private static ListNode helper(ListNode headA, ListNode headB) {
        if(headA==null) {
            return headB;
        }

        if(headB==null) {
            return headA;
        }

        ListNode res = null;
        if(headA.val<headB.val) {
            res = headA;
            res.next = helper(headA.next, headB);
        }
        else {
            res = headB;
            res.next = helper(headA, headB.next);
        }

        return res;
    }
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {1, 3, 5, 6, 7};
        ListNode node1 = new ListNode(nums1);
        ListNode node2 = new ListNode(nums2);
        ListNode node3 = helper(node1, node2);
        System.out.println(node3);
    }
}
