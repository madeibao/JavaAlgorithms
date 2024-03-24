package com.linkedlist.www;

/**
 * @ClassName AaPrintListNode
 * @Author：Mayuan
 * @Date 2020/10/10 10:07
 * @Description TODO
 * @Version 1.0
 **/
public class AaPrintListNode {

    public static void printNode(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        ListNode temp = new ListNode(new int[]{1, 2, 3, 4, 5,});
        printNode(temp);
    }
}
