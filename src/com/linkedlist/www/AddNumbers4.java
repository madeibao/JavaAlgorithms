package com.linkedlist.www;

/**
 * @ClassName AddNumbers4
 * @Author：Mayuan
 * @Date 2021/1/1/0001 11:05
 * @Description TODO
 * @Version 1.0
 *
 * 两个链表的相加。
 * 给定两个用链表表示的整数，每个节点包含一个数位。
 *
 * 这些数位是反向存放的，也就是个位排在链表首部。
 *
 * 编写函数对这两个整数求和，并用链表形式返回结果。
 *
 * 示例：
 *
 * 输入：(7 -> 1 -> 6) + (5 -> 9 -> 2)，即617 + 295
 * 输出：2 -> 1 -> 9，即912
 * 进阶：思考一下，假设这些数位是正向存放的，又该如何解决呢?
 *
 * 示例：
 *
 * 输入：(6 -> 1 -> 7) + (2 -> 9 -> 5)，即617 + 295
 * 输出：9 -> 1 -> 2，即912
 *
 **/
public class AddNumbers4 {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode prev = head;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            //求两个节点相加的值
            int sum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + carry;
            //取进位的值
            carry = sum / 10;

            //sum对10求余后放到节点中
            prev.next = new ListNode(sum % 10);
            prev = prev.next;
            l1 = l1 != null ? l1.next : l1;
            l2 = l2 != null ? l2.next : l2;
        }
        return head.next;
    }


    public static void main(String[] args) {
        int[] nums1 = {7, 1, 6};
        int[] nums2 = {5, 9, 2};
        ListNode node1 = new ListNode(nums1);
        ListNode node2 = new ListNode(nums2);
        ListNode node3 = addTwoNumbers(node1, node2);
        System.out.println(node3);
    }
}
