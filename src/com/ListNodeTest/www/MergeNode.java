package com.ListNodeTest.www;

/**
 * @ClassName MergeNode
 * @Author：Mayuan
 * @Date 2023/10/19/0019 14:32
 * @Description TODO
 * @Version 1.0
 **/
public class MergeNode {

    private ListNode merge(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        ListNode node = new ListNode(-1);
        ListNode temp = node;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                temp.next = l1;
                l1 = l1.next;
            } else {
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }
        if (l1 != null) {
            temp.next = l1;
        }
        if (l2 != null) {
            temp.next = l2;
        }
        return node.next;
    }
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {1, 3, 5, 6, 7};
        ListNode na = new ListNode(nums1);
        ListNode nb = new ListNode(nums2);

        ListNode res  = new MergeNode().merge(na,nb);
        System.out.println(res);
    }
}
