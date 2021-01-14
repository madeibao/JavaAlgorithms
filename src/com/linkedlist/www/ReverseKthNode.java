package com.linkedlist.www;

/**
 * @ClassName ReverseKthNode
 * @Author：Mayuan
 * @Date 2020/3/4 22:26
 * @Description TODO
 * @Version 1.0
 * <p>
 * 从链表的倒数节点来开始算起
 **/
public class ReverseKthNode {
    public static ListNode getKthFromEnd(ListNode head, int k) {
        ListNode listNode = head;
        int number = 0;
        while (listNode != null) {
            number++;
            listNode = listNode.next;
        }
        number = number - k;
        while (number > 0) {
            number--;
            head = head.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        ListNode node = new ListNode(nums);
        ListNode temp = getKthFromEnd(node, 2);
        System.out.println(temp);
    }
}
