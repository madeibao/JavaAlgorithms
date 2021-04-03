package com.ListNodeTest.www;

/**
 * @ClassName RotateKthNode
 * @Author：Mayuan
 * @Date 2021/4/3/0003 9:29
 * @Description TODO
 * @Version 1.0
 *
 * 链表的循环移动k个节点。
 * 算法的精髓，是形成一个环状的结构，
 **/
public class RotateKthNode {

    static ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null||k==0) {
            return head;
        }

        int len=1;
        ListNode tail = head;
        while (tail.next!=null) {
            tail = tail.next;
            len+=1;
        }
        // 至此，链表行程了一个环状的结构。
        tail.next = head;

        k = k% len;
        for(int i =0;i<len-k;i++) {
            tail= tail.next;
        }
        head = tail.next;
        tail.next = null;
        return head;

    }
    public static void main(String[] args) {
        ListNode res= new ListNode(new int[]{1,2,3,4,5});
        ListNode res2 = rotateRight(res,2);
        System.out.println(res2);

    }
}
