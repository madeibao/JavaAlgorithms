package com.linkedlist.www;

/**
 * @program: JavaWorkSpace2->DeleteNode2
 * @description: 删除链表中的节点
 * @author: MaYuan
 * @create: 2020-01-14 21:20
 * @version: 1.0
 * <p>
 * 示例 1:
 * <p>
 * 输入: head = [4,5,1,9], node = 5
 * 输出: [4,1,9]
 * 解释: 给定你链表中值为 5 的第二个节点，那么在调用了你的函数之后，该链表应变为 4 -> 1 -> 9.
 * <p>
 * <p>
 * 示例 2:
 * <p>
 * 输入: head = [4,5,1,9], node = 1
 * 输出: [4,5,9]
 * 解释: 给定你链表中值为 1 的第三个节点，那么在调用了你的函数之后，该链表应变为 4 -> 5 -> 9.
 **/
public class DeleteNode2 {

    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 1, 9};
        ListNode head2 = new ListNode(nums);
        deleteNode(head2);
        System.out.println(head2);
    }
}
