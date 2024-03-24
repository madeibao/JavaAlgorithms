package com.ListNodeTest.www;

/**
 * @ClassName ReverseKth
 * @Author：Mayuan
 * @Date 2021/3/31/0031 14:55
 * @Description TODO
 * @Version 1.0
 *
 * 链表翻转 k 个一组。
 *
 **/
public class ReverseKth {

    public static ListNode reverseKthNode(ListNode head, int k) {
        if(head==null||head.next==null) {
            return head;
        }

        if(k<=0) {
            return head;
        }

        ListNode tail = head;
        for(int i =0;i<k;i++) {
            if(tail==null) {
                return head;
            }
            tail = tail.next;
        }

        ListNode newHead = helper(head,tail);
        head.next = reverseKthNode(tail,k);
        return newHead;
    }

    static ListNode helper(ListNode head, ListNode tail) {
        ListNode pre = null;
        while (head!=tail) {
            ListNode temp = head.next;
            head.next = pre;
            pre = head;
            head = temp;
        }
        return pre;
    }

    public static void main(String[] args) {
        ListNode res =new ListNode(new int[]{1,2,3,4,5,6,7,8,9});
        int k = 3;
        ListNode res2 = reverseKthNode(res, k);
        System.out.println(res2);

    }
}
