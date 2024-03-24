package com.linkedlist.www;

/**
 * @program: JavaWorkSpace2->ListArrayTest
 * @description: 数组创建链表
 * @author: MaYuan
 * @create: 2019-12-26 08:34
 * @version: 1.0
 **/
public class ListArrayTest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ListNode root = new ListNode(arr);
        System.out.println(root);
//        1->2->3->4->5->6->7->8->9->10->NULL
    }
}
